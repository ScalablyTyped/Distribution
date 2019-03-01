package typings
package nodegitLib.cherryDashPickDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CherrypickOptions extends js.Object {
  var checkoutOpts: js.UndefOr[nodegitLib.checkoutDashOptionsMod.CheckoutOptions] = js.undefined
  var mainline: js.UndefOr[scala.Double] = js.undefined
  var mergeOpts: js.UndefOr[nodegitLib.mergeDashOptionsMod.MergeOptions] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object CherrypickOptions {
  @scala.inline
  def apply(
    checkoutOpts: nodegitLib.checkoutDashOptionsMod.CheckoutOptions = null,
    mainline: scala.Int | scala.Double = null,
    mergeOpts: nodegitLib.mergeDashOptionsMod.MergeOptions = null,
    version: scala.Int | scala.Double = null
  ): CherrypickOptions = {
    val __obj = js.Dynamic.literal()
    if (checkoutOpts != null) __obj.updateDynamic("checkoutOpts")(checkoutOpts)
    if (mainline != null) __obj.updateDynamic("mainline")(mainline.asInstanceOf[js.Any])
    if (mergeOpts != null) __obj.updateDynamic("mergeOpts")(mergeOpts)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CherrypickOptions]
  }
}

