package typings.ospec.ospecMod

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
    pass: js.UndefOr[Boolean] = js.undefined,
    testError: Error = null
  ): Result = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(pass)) __obj.updateDynamic("pass")(pass.asInstanceOf[js.Any])
    if (testError != null) __obj.updateDynamic("testError")(testError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

