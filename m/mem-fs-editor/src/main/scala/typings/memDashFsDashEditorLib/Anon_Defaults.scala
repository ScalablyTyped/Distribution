package typings
package memDashFsDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Defaults extends js.Object {
  var defaults: java.lang.String
  var raw: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Defaults {
  @scala.inline
  def apply(defaults: java.lang.String, raw: js.UndefOr[scala.Boolean] = js.undefined): Anon_Defaults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaults")(defaults)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[Anon_Defaults]
  }
}

