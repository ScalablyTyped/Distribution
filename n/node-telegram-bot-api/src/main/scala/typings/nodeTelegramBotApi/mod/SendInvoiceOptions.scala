package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendInvoiceOptions extends SendBasicOptions {
  var is_flexible: js.UndefOr[Boolean] = js.native
  var need_email: js.UndefOr[Boolean] = js.native
  var need_name: js.UndefOr[Boolean] = js.native
  var need_phone_number: js.UndefOr[Boolean] = js.native
  var need_shipping_address: js.UndefOr[Boolean] = js.native
  var photo_height: js.UndefOr[Double] = js.native
  var photo_size: js.UndefOr[Double] = js.native
  var photo_url: js.UndefOr[String] = js.native
  var photo_width: js.UndefOr[Double] = js.native
  var provider_data: js.UndefOr[String] = js.native
}

object SendInvoiceOptions {
  @scala.inline
  def apply(): SendInvoiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendInvoiceOptions]
  }
  @scala.inline
  implicit class SendInvoiceOptionsOps[Self <: SendInvoiceOptions] (val x: Self) extends AnyVal {
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
    def setIs_flexible(value: Boolean): Self = this.set("is_flexible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs_flexible: Self = this.set("is_flexible", js.undefined)
    @scala.inline
    def setNeed_email(value: Boolean): Self = this.set("need_email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeed_email: Self = this.set("need_email", js.undefined)
    @scala.inline
    def setNeed_name(value: Boolean): Self = this.set("need_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeed_name: Self = this.set("need_name", js.undefined)
    @scala.inline
    def setNeed_phone_number(value: Boolean): Self = this.set("need_phone_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeed_phone_number: Self = this.set("need_phone_number", js.undefined)
    @scala.inline
    def setNeed_shipping_address(value: Boolean): Self = this.set("need_shipping_address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeed_shipping_address: Self = this.set("need_shipping_address", js.undefined)
    @scala.inline
    def setPhoto_height(value: Double): Self = this.set("photo_height", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoto_height: Self = this.set("photo_height", js.undefined)
    @scala.inline
    def setPhoto_size(value: Double): Self = this.set("photo_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoto_size: Self = this.set("photo_size", js.undefined)
    @scala.inline
    def setPhoto_url(value: String): Self = this.set("photo_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoto_url: Self = this.set("photo_url", js.undefined)
    @scala.inline
    def setPhoto_width(value: Double): Self = this.set("photo_width", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoto_width: Self = this.set("photo_width", js.undefined)
    @scala.inline
    def setProvider_data(value: String): Self = this.set("provider_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider_data: Self = this.set("provider_data", js.undefined)
  }
  
}

