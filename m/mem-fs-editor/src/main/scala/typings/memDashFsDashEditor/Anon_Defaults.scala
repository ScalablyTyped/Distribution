package typings.memDashFsDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Defaults extends js.Object {
  var defaults: String
  var raw: js.UndefOr[Boolean] = js.undefined
}

object Anon_Defaults {
  @scala.inline
  def apply(defaults: String, raw: js.UndefOr[Boolean] = js.undefined): Anon_Defaults = {
    val __obj = js.Dynamic.literal(defaults = defaults)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[Anon_Defaults]
  }
}

