package typings.memDashFsDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Separator extends js.Object {
  var separator: js.UndefOr[String] = js.undefined
  var trimEnd: js.UndefOr[Boolean] = js.undefined
}

object Anon_Separator {
  @scala.inline
  def apply(separator: String = null, trimEnd: js.UndefOr[Boolean] = js.undefined): Anon_Separator = {
    val __obj = js.Dynamic.literal()
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(trimEnd)) __obj.updateDynamic("trimEnd")(trimEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Separator]
  }
}

