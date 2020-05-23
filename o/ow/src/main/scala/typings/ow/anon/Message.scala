package typings.ow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /**
    The error message which should be shown if the `validator` is `false`. Or a error function which returns the error message and accepts the label as first argument.
    */
  var message: String | (js.Function1[/* label */ String, String])
  /**
    Should be `true` if the validation is correct.
    */
  var validator: Boolean
}

object Message {
  @scala.inline
  def apply(message: String | (js.Function1[/* label */ String, String]), validator: Boolean): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

