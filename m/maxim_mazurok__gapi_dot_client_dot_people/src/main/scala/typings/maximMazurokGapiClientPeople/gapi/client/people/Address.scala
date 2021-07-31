package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  /** The city of the address. */
  var city: js.UndefOr[String] = js.undefined
  
  /** The country of the address. */
  var country: js.UndefOr[String] = js.undefined
  
  /** The [ISO 3166-1 alpha-2](http://www.iso.org/iso/country_codes.htm) country code of the address. */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /** The extended address of the address; for example, the apartment number. */
  var extendedAddress: js.UndefOr[String] = js.undefined
  
  /** Output only. The type of the address translated and formatted in the viewer's account locale or the `Accept-Language` HTTP header locale. */
  var formattedType: js.UndefOr[String] = js.undefined
  
  /** The unstructured value of the address. If this is not set by the user it will be automatically constructed from structured values. */
  var formattedValue: js.UndefOr[String] = js.undefined
  
  /** Metadata about the address. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** The P.O. box of the address. */
  var poBox: js.UndefOr[String] = js.undefined
  
  /** The postal code of the address. */
  var postalCode: js.UndefOr[String] = js.undefined
  
  /** The region of the address; for example, the state or province. */
  var region: js.UndefOr[String] = js.undefined
  
  /** The street address. */
  var streetAddress: js.UndefOr[String] = js.undefined
  
  /** The type of the address. The type can be custom or one of these predefined values: * `home` * `work` * `other` */
  var `type`: js.UndefOr[String] = js.undefined
}
object Address {
  
  @scala.inline
  def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setExtendedAddress(value: String): Self = StObject.set(x, "extendedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedAddressUndefined: Self = StObject.set(x, "extendedAddress", js.undefined)
    
    @scala.inline
    def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
    
    @scala.inline
    def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setPoBox(value: String): Self = StObject.set(x, "poBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoBoxUndefined: Self = StObject.set(x, "poBox", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
