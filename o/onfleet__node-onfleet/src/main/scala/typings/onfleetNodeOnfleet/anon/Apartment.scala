package typings.onfleetNodeOnfleet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Apartment extends js.Object {
  var apartment: String = js.native
  var city: String = js.native
  var country: String = js.native
  var number: String = js.native
  var postalCode: String = js.native
  var state: String = js.native
  var street: String = js.native
}

object Apartment {
  @scala.inline
  def apply(
    apartment: String,
    city: String,
    country: String,
    number: String,
    postalCode: String,
    state: String,
    street: String
  ): Apartment = {
    val __obj = js.Dynamic.literal(apartment = apartment.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apartment]
  }
  @scala.inline
  implicit class ApartmentOps[Self <: Apartment] (val x: Self) extends AnyVal {
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
    def setApartment(value: String): Self = this.set("apartment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreet(value: String): Self = this.set("street", value.asInstanceOf[js.Any])
  }
  
}

