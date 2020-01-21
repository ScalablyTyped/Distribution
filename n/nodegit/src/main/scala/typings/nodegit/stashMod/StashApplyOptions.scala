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
    flags: Int | Double = null,
    progressCb: js.Function = null,
    progressPayload: js.Any = null,
    version: Int | Double = null
  ): StashApplyOptions = {
    val __obj = js.Dynamic.literal()
    if (checkoutOptions != null) __obj.updateDynamic("checkoutOptions")(checkoutOptions.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (progressCb != null) __obj.updateDynamic("progressCb")(progressCb.asInstanceOf[js.Any])
    if (progressPayload != null) __obj.updateDynamic("progressPayload")(progressPayload.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[StashApplyOptions]
  }
}

