package typings.paypalRestSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  var address: typings.paypalRestSdk.mod.Address = js.native
  var business_name: js.UndefOr[String] = js.native
  var first_name: String = js.native
  var last_name: String = js.native
}

object Address {
  @scala.inline
  def apply(address: typings.paypalRestSdk.mod.Address, first_name: String, last_name: String): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
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
    def setAddress(value: typings.paypalRestSdk.mod.Address): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setBusiness_name(value: String): Self = this.set("business_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusiness_name: Self = this.set("business_name", js.undefined)
  }
  
}

