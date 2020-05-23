package typings.nodegit.stashMod

import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StashApplyOptions extends js.Object {
  var checkoutOptions: js.UndefOr[CheckoutOptions] = js.undefined
  var flags: js.UndefOr[Double] = js.undefined
  var progressCb: js.UndefOr[js.Function] = js.undefined
  var progressPayload: js.UndefOr[js.Any] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object StashApplyOptions {
  @scala.inline
  def apply(
    checkoutOptions: CheckoutOptions = null,
    flags: js.UndefOr[Double] = js.undefined,
    progressCb: js.Function = null,
    progressPayload: js.Any = null,
    version: js.UndefOr[Double] = js.undefined
  ): StashApplyOptions = {
    val __obj = js.Dynamic.literal()
    if (checkoutOptions != null) __obj.updateDynamic("checkoutOptions")(checkoutOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(flags)) __obj.updateDynamic("flags")(flags.get.asInstanceOf[js.Any])
    if (progressCb != null) __obj.updateDynamic("progressCb")(progressCb.asInstanceOf[js.Any])
    if (progressPayload != null) __obj.updateDynamic("progressPayload")(progressPayload.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StashApplyOptions]
  }
}

