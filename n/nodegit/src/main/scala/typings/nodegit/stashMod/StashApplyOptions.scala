package typings.nodegit.stashMod

import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StashApplyOptions extends js.Object {
  var checkoutOptions: js.UndefOr[CheckoutOptions] = js.native
  var flags: js.UndefOr[Double] = js.native
  var progressCb: js.UndefOr[js.Function] = js.native
  var progressPayload: js.UndefOr[js.Any] = js.native
  var version: js.UndefOr[Double] = js.native
}

object StashApplyOptions {
  @scala.inline
  def apply(): StashApplyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StashApplyOptions]
  }
  @scala.inline
  implicit class StashApplyOptionsOps[Self <: StashApplyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCheckoutOptions(value: CheckoutOptions): Self = this.set("checkoutOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckoutOptions: Self = this.set("checkoutOptions", js.undefined)
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setProgressCb(value: js.Function): Self = this.set("progressCb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressCb: Self = this.set("progressCb", js.undefined)
    @scala.inline
    def setProgressPayload(value: js.Any): Self = this.set("progressPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressPayload: Self = this.set("progressPayload", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

