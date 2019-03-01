package typings
package nodeDashValidatorLib.ValidatorOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsNumberOptions extends Options {
  var max: js.UndefOr[stdLib.Number] = js.undefined
  var min: js.UndefOr[stdLib.Number] = js.undefined
}

object IsNumberOptions {
  @scala.inline
  def apply(max: stdLib.Number = null, min: stdLib.Number = null): IsNumberOptions = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    __obj.asInstanceOf[IsNumberOptions]
  }
}

