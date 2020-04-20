package typings.nodePushnotifications.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var failure: Double
  var message: js.Array[Message]
  var method: String
  var success: Double
}

object Result {
  @scala.inline
  def apply(failure: Double, message: js.Array[Message], method: String, success: Double): Result = {
    val __obj = js.Dynamic.literal(failure = failure.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

