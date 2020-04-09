package typings.passportHttpBearer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVerifyOptions extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var scope: String | js.Array[String]
}

object IVerifyOptions {
  @scala.inline
  def apply(scope: String | js.Array[String], message: String = null): IVerifyOptions = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVerifyOptions]
  }
}

