package typings.nodeValidator.ValidatorOptions

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsNumberOptions extends Options {
  var max: js.UndefOr[Number] = js.undefined
  var min: js.UndefOr[Number] = js.undefined
}

object IsNumberOptions {
  @scala.inline
  def apply(max: Number = null, min: Number = null): IsNumberOptions = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNumberOptions]
  }
}

