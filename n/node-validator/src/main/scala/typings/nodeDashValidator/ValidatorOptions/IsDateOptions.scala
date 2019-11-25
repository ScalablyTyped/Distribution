package typings.nodeDashValidator.ValidatorOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsDateOptions extends Options {
  var format: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object IsDateOptions {
  @scala.inline
  def apply(format: String = null, message: String = null): IsDateOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDateOptions]
  }
}

