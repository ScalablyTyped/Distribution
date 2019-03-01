package typings
package nodegitLib.submoduleDashUpdateDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmoduleUpdateOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var checkoutOpts: js.UndefOr[nodegitLib.checkoutDashOptionsMod.CheckoutOptions] = js.undefined
  var cloneCheckoutStrategy: js.UndefOr[scala.Double] = js.undefined
  var fetchOpts: js.UndefOr[nodegitLib.fetchDashOptionsMod.FetchOptions] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object SubmoduleUpdateOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    checkoutOpts: nodegitLib.checkoutDashOptionsMod.CheckoutOptions = null,
    cloneCheckoutStrategy: scala.Int | scala.Double = null,
    fetchOpts: nodegitLib.fetchDashOptionsMod.FetchOptions = null,
    version: scala.Int | scala.Double = null
  ): SubmoduleUpdateOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (checkoutOpts != null) __obj.updateDynamic("checkoutOpts")(checkoutOpts)
    if (cloneCheckoutStrategy != null) __obj.updateDynamic("cloneCheckoutStrategy")(cloneCheckoutStrategy.asInstanceOf[js.Any])
    if (fetchOpts != null) __obj.updateDynamic("fetchOpts")(fetchOpts)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmoduleUpdateOptions]
  }
}

