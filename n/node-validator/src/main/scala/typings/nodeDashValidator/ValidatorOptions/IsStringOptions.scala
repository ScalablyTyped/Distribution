package typings.nodeDashValidator.ValidatorOptions

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsStringOptions extends Options {
  var message: js.UndefOr[String] = js.undefined
  var regex: js.UndefOr[RegExp] = js.undefined
}

object IsStringOptions {
  @scala.inline
  def apply(message: String = null, regex: RegExp = null): IsStringOptions = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsStringOptions]
  }
}

