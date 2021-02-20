package typings.onfleetNodeOnfleet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Apartment extends StObject {
  
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
  implicit class ApartmentMutableBuilder[Self <: Apartment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApartment(value: String): Self = StObject.set(x, "apartment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
  }
}
