package typings
package prettierDashPackageDashJsonLib.prettierDashPackageDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var expandUsers: js.UndefOr[scala.Boolean] = js.undefined
  var keyOrder: js.UndefOr[js.Array[java.lang.String] | CompareFn] = js.undefined
  var tabWidth: js.UndefOr[scala.Double] = js.undefined
  var useTabs: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    expandUsers: js.UndefOr[scala.Boolean] = js.undefined,
    keyOrder: js.Array[java.lang.String] | CompareFn = null,
    tabWidth: scala.Int | scala.Double = null,
    useTabs: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expandUsers)) __obj.updateDynamic("expandUsers")(expandUsers)
    if (keyOrder != null) __obj.updateDynamic("keyOrder")(keyOrder.asInstanceOf[js.Any])
    if (tabWidth != null) __obj.updateDynamic("tabWidth")(tabWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(useTabs)) __obj.updateDynamic("useTabs")(useTabs)
    __obj.asInstanceOf[Options]
  }
}

