package typings
package nodeDashValidatorLib.ValidatorOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsDateOptions extends Options {
  var format: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object IsDateOptions {
  @scala.inline
  def apply(format: java.lang.String = null, message: java.lang.String = null): IsDateOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[IsDateOptions]
  }
}

