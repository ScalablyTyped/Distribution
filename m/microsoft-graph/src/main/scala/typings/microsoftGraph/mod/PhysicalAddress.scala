package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicalAddress extends js.Object {
  // The city.
  var city: js.UndefOr[String] = js.native
  // The country or region. It's a free-format string value, for example, 'United States'.
  var countryOrRegion: js.UndefOr[String] = js.native
  // The postal code.
  var postalCode: js.UndefOr[String] = js.native
  // The state.
  var state: js.UndefOr[String] = js.native
  // The street.
  var street: js.UndefOr[String] = js.native
}

object PhysicalAddress {
  @scala.inline
  def apply(): PhysicalAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicalAddress]
  }
  @scala.inline
  implicit class PhysicalAddressOps[Self <: PhysicalAddress] (val x: Self) extends AnyVal {
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
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setCountryOrRegion(value: String): Self = this.set("countryOrRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryOrRegion: Self = this.set("countryOrRegion", js.undefined)
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStreet(value: String): Self = this.set("street", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreet: Self = this.set("street", js.undefined)
  }
  
}

