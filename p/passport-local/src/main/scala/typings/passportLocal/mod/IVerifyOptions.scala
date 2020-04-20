package typings.passportLocal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVerifyOptions extends js.Object {
  var message: String
}

object IVerifyOptions {
  @scala.inline
  def apply(message: String): IVerifyOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVerifyOptions]
  }
}

