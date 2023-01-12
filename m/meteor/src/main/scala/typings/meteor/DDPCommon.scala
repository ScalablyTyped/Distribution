package typings.meteor

import org.scalablytyped.runtime.Instantiable1
import typings.meteor.Meteor.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DDPCommon {
  
  /** The state for a single invocation of a method, referenced by this inside a method definition. */
  @js.native
  trait MethodInvocation
    extends StObject
       with Instantiable1[/* options */ MethodInvocationOptions, MethodInvocation] {
    
    /**
      * Access inside a method invocation. The [connection](#meteor_onconnection) that this method was received on. `null` if the method is not associated with a connection, eg. a server
      * initiated method call. Calls to methods made from a server method which was in turn initiated from the client share the same `connection`.
      */
    var connection: Connection = js.native
    
    /**
      * Access inside a method invocation.  Boolean value, true if this invocation is a stub.
      */
    var isSimulation: Boolean = js.native
    
    /**
      * Set the logged in user.
      * @param userId The value that should be returned by `userId` on this connection.
      */
    def setUserId(): Unit = js.native
    def setUserId(userId: String): Unit = js.native
    
    /**
      * Call inside a method invocation.  Allow subsequent method from this client to begin running in a new fiber.
      */
    def unblock(): Unit = js.native
    
    /**
      * The id of the user that made this method call, or `null` if no user was logged in.
      */
    var userId: String | Null = js.native
  }
  
  trait MethodInvocationOptions extends StObject {
    
    var connection: Connection
    
    var isSimulation: Boolean
    
    var randomSeed: String
    
    var setUserId: js.UndefOr[js.Function1[/* newUserId */ String, Unit]] = js.undefined
    
    var userId: String | Null
  }
  object MethodInvocationOptions {
    
    inline def apply(connection: Connection, isSimulation: Boolean, randomSeed: String): MethodInvocationOptions = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], isSimulation = isSimulation.asInstanceOf[js.Any], randomSeed = randomSeed.asInstanceOf[js.Any], userId = null)
      __obj.asInstanceOf[MethodInvocationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MethodInvocationOptions] (val x: Self) extends AnyVal {
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setIsSimulation(value: Boolean): Self = StObject.set(x, "isSimulation", value.asInstanceOf[js.Any])
      
      inline def setRandomSeed(value: String): Self = StObject.set(x, "randomSeed", value.asInstanceOf[js.Any])
      
      inline def setSetUserId(value: /* newUserId */ String => Unit): Self = StObject.set(x, "setUserId", js.Any.fromFunction1(value))
      
      inline def setSetUserIdUndefined: Self = StObject.set(x, "setUserId", js.undefined)
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    }
  }
}
