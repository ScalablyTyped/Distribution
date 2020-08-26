package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Address
import typings.paypalRestSdk.mod.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Person extends js.Object {
  var address: js.UndefOr[Address] = js.native
  var business_name: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var first_name: js.UndefOr[String] = js.native
  var last_name: js.UndefOr[String] = js.native
  var phone: js.UndefOr[Phone] = js.native
  var website: js.UndefOr[String] = js.native
}

object Person {
  @scala.inline
  def apply(): Person = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Person]
  }
  @scala.inline
  implicit class PersonOps[Self <: Person] (val x: Self) extends AnyVal {
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
    def setAddress(value: Address): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setBusiness_name(value: String): Self = this.set("business_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusiness_name: Self = this.set("business_name", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst_name: Self = this.set("first_name", js.undefined)
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_name: Self = this.set("last_name", js.undefined)
    @scala.inline
    def setPhone(value: Phone): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setWebsite(value: String): Self = this.set("website", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsite: Self = this.set("website", js.undefined)
  }
  
}

