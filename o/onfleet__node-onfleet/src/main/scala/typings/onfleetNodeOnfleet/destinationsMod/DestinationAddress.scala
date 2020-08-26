package typings.onfleetNodeOnfleet.destinationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @prop { string } [apartment] - The suite or apartment number, or any additional relevant information.
  * @prop { string } city - The name of the municipality.
  * @prop { string } country - The name of the country.
  * @prop { string } [name] - A name associated with this address, for example, "Transamerica Pyramid".
  * @prop { string } number - The number component of this address, it may also contain letters.
  * @prop { string } [postalCode] - The postal or zip code.
  * @prop { string } [state] - The name of the state, province or jurisdiction.
  * @prop { string } street - The name of the street.
  * @prop { string } [unparsed] - A complete address specified in a single, unparsed string where the various elements are separated by commas.
  * * If present, all other address properties will be ignored (with the exception of name and apartment).
  * * In some countries, you may skip most address details (like city or state) if you provide a valid postalCode:
  *  for example, 325 Front Street W., M5V 3B5, CA will be geocoded correctly.
  */
@js.native
trait DestinationAddress extends js.Object {
  var apartment: js.UndefOr[String] = js.native
  var city: String = js.native
  var country: String = js.native
  var name: js.UndefOr[String] = js.native
  var number: String = js.native
  var postalCode: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var street: String = js.native
  var unparsed: js.UndefOr[String] = js.native
}

object DestinationAddress {
  @scala.inline
  def apply(city: String, country: String, number: String, street: String): DestinationAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationAddress]
  }
  @scala.inline
  implicit class DestinationAddressOps[Self <: DestinationAddress] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreet(value: String): Self = this.set("street", value.asInstanceOf[js.Any])
    @scala.inline
    def setApartment(value: String): Self = this.set("apartment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApartment: Self = this.set("apartment", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setUnparsed(value: String): Self = this.set("unparsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnparsed: Self = this.set("unparsed", js.undefined)
  }
  
}

