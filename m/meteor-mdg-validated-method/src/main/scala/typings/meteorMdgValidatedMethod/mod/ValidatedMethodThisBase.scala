package typings.meteorMdgValidatedMethod.mod

import typings.meteor.Meteor.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatedMethodThisBase extends js.Object {
  
  /**
    * @summary Access inside a method invocation. The [connection](#meteor_onconnection) that this method was received on. `null` if the method is not associated with a connection, eg. a server
    * initiated method call. Calls to methods made from a server method which was in turn initiated from the client share the same `connection`.
    * @locus Server
    */
  var connection: Connection = js.native
  
  /**
    * @summary Access inside a method invocation.  Boolean value, true if this invocation is a stub.
    * @locus Anywhere
    */
  var isSimulation: Boolean = js.native
  
  /**
    * @summary The seed for randomStream value generation
    */
  def randomSeed(): String = js.native
  
  /**
    * @summary Set the logged in user.
    * @locus Server
    * @param userId The value that should be returned by `userId` on this connection.
    */
  def setUserId(): Unit = js.native
  def setUserId(userId: String): Unit = js.native
  
  /**
    * @summary Call inside a method invocation.  Allow subsequent method from this client to begin running in a new fiber.
    * @locus Server
    */
  def unblock(): Unit = js.native
  
  /**
    * @summary The id of the user that made this method call, or `null` if no user was logged in.
    * @locus Anywhere
    */
  var userId: String | Null = js.native
}
