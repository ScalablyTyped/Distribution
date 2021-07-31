package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicalAddress extends StObject {
  
  // The city.
  var city: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The country or region. It's a free-format string value, for example, 'United States'.
  var countryOrRegion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The postal code.
  var postalCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The state.
  var state: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The street.
  var street: js.UndefOr[NullableOption[String]] = js.undefined
}
object PhysicalAddress {
  
  @scala.inline
  def apply(): PhysicalAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicalAddress]
  }
  
  @scala.inline
  implicit class PhysicalAddressMutableBuilder[Self <: PhysicalAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: NullableOption[String]): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityNull: Self = StObject.set(x, "city", null)
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setCountryOrRegion(value: NullableOption[String]): Self = StObject.set(x, "countryOrRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOrRegionNull: Self = StObject.set(x, "countryOrRegion", null)
    
    @scala.inline
    def setCountryOrRegionUndefined: Self = StObject.set(x, "countryOrRegion", js.undefined)
    
    @scala.inline
    def setPostalCode(value: NullableOption[String]): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = StObject.set(x, "state", null)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStreet(value: NullableOption[String]): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetNull: Self = StObject.set(x, "street", null)
    
    @scala.inline
    def setStreetUndefined: Self = StObject.set(x, "street", js.undefined)
  }
}
