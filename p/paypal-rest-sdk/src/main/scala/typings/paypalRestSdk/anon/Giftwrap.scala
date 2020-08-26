package typings.paypalRestSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Giftwrap extends js.Object {
  var gift_wrap: js.UndefOr[String] = js.native
  var handling_fee: js.UndefOr[String] = js.native
  var insurance: js.UndefOr[String] = js.native
  var shipping: js.UndefOr[String] = js.native
  var shipping_discout: js.UndefOr[String] = js.native
  var subtotal: js.UndefOr[String] = js.native
  var tax: js.UndefOr[String] = js.native
}

object Giftwrap {
  @scala.inline
  def apply(): Giftwrap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Giftwrap]
  }
  @scala.inline
  implicit class GiftwrapOps[Self <: Giftwrap] (val x: Self) extends AnyVal {
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
    def setGift_wrap(value: String): Self = this.set("gift_wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGift_wrap: Self = this.set("gift_wrap", js.undefined)
    @scala.inline
    def setHandling_fee(value: String): Self = this.set("handling_fee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandling_fee: Self = this.set("handling_fee", js.undefined)
    @scala.inline
    def setInsurance(value: String): Self = this.set("insurance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsurance: Self = this.set("insurance", js.undefined)
    @scala.inline
    def setShipping(value: String): Self = this.set("shipping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
    @scala.inline
    def setShipping_discout(value: String): Self = this.set("shipping_discout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping_discout: Self = this.set("shipping_discout", js.undefined)
    @scala.inline
    def setSubtotal(value: String): Self = this.set("subtotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtotal: Self = this.set("subtotal", js.undefined)
    @scala.inline
    def setTax(value: String): Self = this.set("tax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax: Self = this.set("tax", js.undefined)
  }
  
}

