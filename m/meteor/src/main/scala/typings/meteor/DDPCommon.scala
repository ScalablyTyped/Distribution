package typings.meteor

import org.scalablytyped.runtime.Instantiable1
import typings.meteor.Meteor.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DDPCommon {
  
  @js.native
  trait MethodInvocation
    extends StObject
       with Instantiable1[/* options */ MethodInvocationOptions, MethodInvocation] {
    
    var connection: Connection = js.native
    
    var isSimulation: Boolean = js.native
    
    def setUserId(userId: String): Unit = js.native
    
    def unblock(): Unit = js.native
    
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
    
    extension [Self <: MethodInvocationOptions](x: Self) {
      
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
