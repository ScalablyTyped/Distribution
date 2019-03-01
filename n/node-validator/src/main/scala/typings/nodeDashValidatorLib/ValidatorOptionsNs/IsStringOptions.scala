package typings
package nodeDashValidatorLib.ValidatorOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsStringOptions extends Options {
  var message: js.UndefOr[java.lang.String] = js.undefined
  var regex: js.UndefOr[stdLib.RegExp] = js.undefined
}

object IsStringOptions {
  @scala.inline
  def apply(message: java.lang.String = null, regex: stdLib.RegExp = null): IsStringOptions = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[IsStringOptions]
  }
}

