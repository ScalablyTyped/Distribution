package typings.meteor.DDPCommon

import org.scalablytyped.runtime.Instantiable1
import typings.meteor.Meteor.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodInvocation extends Instantiable1[/* options */ MethodInvocationOptions, MethodInvocation] {
  var connection: Connection = js.native
  var isSimulation: Boolean = js.native
  var userId: String | Null = js.native
  def setUserId(userId: String): Unit = js.native
  def unblock(): Unit = js.native
}

