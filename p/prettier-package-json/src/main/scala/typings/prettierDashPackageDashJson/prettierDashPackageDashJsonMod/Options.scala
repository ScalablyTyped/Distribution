package typings.prettierDashPackageDashJson.prettierDashPackageDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var expandUsers: js.UndefOr[Boolean] = js.undefined
  var keyOrder: js.UndefOr[js.Array[String] | CompareFn] = js.undefined
  var tabWidth: js.UndefOr[Double] = js.undefined
  var useTabs: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    expandUsers: js.UndefOr[Boolean] = js.undefined,
    keyOrder: js.Array[String] | CompareFn = null,
    tabWidth: Int | Double = null,
    useTabs: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expandUsers)) __obj.updateDynamic("expandUsers")(expandUsers)
    if (keyOrder != null) __obj.updateDynamic("keyOrder")(keyOrder.asInstanceOf[js.Any])
    if (tabWidth != null) __obj.updateDynamic("tabWidth")(tabWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(useTabs)) __obj.updateDynamic("useTabs")(useTabs)
    __obj.asInstanceOf[Options]
  }
}

