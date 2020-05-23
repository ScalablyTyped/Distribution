package typings.prettierPackageJson.mod

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
    tabWidth: js.UndefOr[Double] = js.undefined,
    useTabs: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expandUsers)) __obj.updateDynamic("expandUsers")(expandUsers.get.asInstanceOf[js.Any])
    if (keyOrder != null) __obj.updateDynamic("keyOrder")(keyOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(tabWidth)) __obj.updateDynamic("tabWidth")(tabWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useTabs)) __obj.updateDynamic("useTabs")(useTabs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

