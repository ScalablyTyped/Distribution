package typings.memFsEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaults extends js.Object {
  var defaults: String
  var raw: js.UndefOr[Boolean] = js.undefined
}

object AnonDefaults {
  @scala.inline
  def apply(defaults: String, raw: js.UndefOr[Boolean] = js.undefined): AnonDefaults = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaults]
  }
}

