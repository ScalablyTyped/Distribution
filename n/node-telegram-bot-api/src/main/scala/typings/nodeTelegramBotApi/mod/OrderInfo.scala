package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderInfo extends js.Object {
  var email: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var phone_number: js.UndefOr[String] = js.native
  var shipping_address: js.UndefOr[ShippingAddress] = js.native
}

object OrderInfo {
  @scala.inline
  def apply(): OrderInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderInfo]
  }
  @scala.inline
  implicit class OrderInfoOps[Self <: OrderInfo] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPhone_number(value: String): Self = this.set("phone_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone_number: Self = this.set("phone_number", js.undefined)
    @scala.inline
    def setShipping_address(value: ShippingAddress): Self = this.set("shipping_address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping_address: Self = this.set("shipping_address", js.undefined)
  }
  
}

