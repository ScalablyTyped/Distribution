package typings.ospec.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var context: String
  var error: Error | Null
  var message: String
  var pass: Boolean | Null
  var testError: Error | Null
}

object Result {
  @scala.inline
  def apply(
    context: String,
    message: String,
    error: Error = null,
    pass: Boolean = null.asInstanceOf[Boolean],
    testError: Error = null
  ): Result = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], testError = testError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

