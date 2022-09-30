package typings.meteor.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Error **/
/** Method **/
@js.native
trait MethodThisType extends StObject {
  
  /**
    * Access inside a method invocation. The connection that this method was received on. `null` if the method is not associated with a connection, eg. a server initiated method call. Calls
    * to methods made from a server method which was in turn initiated from the client share the same `connection`. */
  var connection: Connection | Null = js.native
  
  /** Access inside a method invocation. Boolean value, true if this invocation is a stub. */
  var isSimulation: Boolean = js.native
  
  /**
    * Set the logged in user.
    * @param userId The value that should be returned by `userId` on this connection.
    */
  def setUserId(): Unit = js.native
  def setUserId(userId: String): Unit = js.native
  
  /** Call inside a method invocation. Allow subsequent method from this client to begin running in a new fiber. */
  def unblock(): Unit = js.native
  
  /** The id of the user that made this method call, or `null` if no user was logged in. */
  var userId: String | Null = js.native
}
