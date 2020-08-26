package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelatedResources extends js.Object {
  var authorization: js.UndefOr[AuthorizationResource] = js.native
  var capture: js.UndefOr[CaptureResource] = js.native
  var order: js.UndefOr[js.Any] = js.native
  var refund: js.UndefOr[RefundResource] = js.native
  var sale: js.UndefOr[SaleResource] = js.native
}

object RelatedResources {
  @scala.inline
  def apply(): RelatedResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedResources]
  }
  @scala.inline
  implicit class RelatedResourcesOps[Self <: RelatedResources] (val x: Self) extends AnyVal {
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
    def setAuthorization(value: AuthorizationResource): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization: Self = this.set("authorization", js.undefined)
    @scala.inline
    def setCapture(value: CaptureResource): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    @scala.inline
    def setOrder(value: js.Any): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setRefund(value: RefundResource): Self = this.set("refund", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefund: Self = this.set("refund", js.undefined)
    @scala.inline
    def setSale(value: SaleResource): Self = this.set("sale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSale: Self = this.set("sale", js.undefined)
  }
  
}

