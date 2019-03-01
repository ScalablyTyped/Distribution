package typings
package memDashFsDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Separator extends js.Object {
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var trimEnd: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Separator {
  @scala.inline
  def apply(separator: java.lang.String = null, trimEnd: js.UndefOr[scala.Boolean] = js.undefined): Anon_Separator = {
    val __obj = js.Dynamic.literal()
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(trimEnd)) __obj.updateDynamic("trimEnd")(trimEnd)
    __obj.asInstanceOf[Anon_Separator]
  }
}

