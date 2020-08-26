package typings.paypalCheckoutComponents.callbackDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  /**
    * City or locality.
    */
  var city: String = js.native
  /**
    * 2 character country code (e.g. US).
    */
  var countryCode: String = js.native
  /**
    * Street number and name.
    */
  var line1: String = js.native
  /**
    * Extended address.
    */
  var line2: js.UndefOr[String] = js.native
  /**
    * Phone number.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * Postal code.
    */
  var postalCode: String = js.native
  /**
    * Recipient of postage.
    */
  var recipientName: js.UndefOr[String] = js.native
  /**
    * State or region.
    */
  var state: String = js.native
}

object Address {
  @scala.inline
  def apply(city: String, countryCode: String, line1: String, postalCode: String, state: String): Address = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], line1 = line1.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine1(value: String): Self = this.set("line1", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine2(value: String): Self = this.set("line2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine2: Self = this.set("line2", js.undefined)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setRecipientName(value: String): Self = this.set("recipientName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientName: Self = this.set("recipientName", js.undefined)
  }
  
}

