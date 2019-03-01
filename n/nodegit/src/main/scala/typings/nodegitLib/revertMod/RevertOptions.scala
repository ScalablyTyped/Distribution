package typings
package nodegitLib.revertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevertOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var checkoutOpts: js.UndefOr[nodegitLib.checkoutDashOptionsMod.CheckoutOptions] = js.undefined
  var mainline: js.UndefOr[scala.Double] = js.undefined
  var mergeOpts: js.UndefOr[nodegitLib.mergeDashOptionsMod.MergeOptions] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object RevertOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    checkoutOpts: nodegitLib.checkoutDashOptionsMod.CheckoutOptions = null,
    mainline: scala.Int | scala.Double = null,
    mergeOpts: nodegitLib.mergeDashOptionsMod.MergeOptions = null,
    version: scala.Int | scala.Double = null
  ): RevertOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (checkoutOpts != null) __obj.updateDynamic("checkoutOpts")(checkoutOpts)
    if (mainline != null) __obj.updateDynamic("mainline")(mainline.asInstanceOf[js.Any])
    if (mergeOpts != null) __obj.updateDynamic("mergeOpts")(mergeOpts)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevertOptions]
  }
}

