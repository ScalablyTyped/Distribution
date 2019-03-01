package typings
package nodegitLib.stashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StashApplyOptions extends js.Object {
  var checkoutOptions: js.UndefOr[nodegitLib.checkoutDashOptionsMod.CheckoutOptions] = js.undefined
  var flags: js.UndefOr[scala.Double] = js.undefined
  var progressCb: js.UndefOr[js.Function] = js.undefined
  var progressPayload: js.UndefOr[js.Any] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object StashApplyOptions {
  @scala.inline
  def apply(
    checkoutOptions: nodegitLib.checkoutDashOptionsMod.CheckoutOptions = null,
    flags: scala.Int | scala.Double = null,
    progressCb: js.Function = null,
    progressPayload: js.Any = null,
    version: scala.Int | scala.Double = null
  ): StashApplyOptions = {
    val __obj = js.Dynamic.literal()
    if (checkoutOptions != null) __obj.updateDynamic("checkoutOptions")(checkoutOptions)
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (progressCb != null) __obj.updateDynamic("progressCb")(progressCb)
    if (progressPayload != null) __obj.updateDynamic("progressPayload")(progressPayload)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[StashApplyOptions]
  }
}

