package typings
package nodeDashPushnotificationsLib.nodeDashPushnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var failure: scala.Double
  var message: js.Array[Message]
  var method: java.lang.String
  var success: scala.Double
}

object Result {
  @scala.inline
  def apply(failure: scala.Double, message: js.Array[Message], method: java.lang.String, success: scala.Double): Result = {
    val __obj = js.Dynamic.literal(failure = failure, message = message, method = method, success = success)
  
    __obj.asInstanceOf[Result]
  }
}

