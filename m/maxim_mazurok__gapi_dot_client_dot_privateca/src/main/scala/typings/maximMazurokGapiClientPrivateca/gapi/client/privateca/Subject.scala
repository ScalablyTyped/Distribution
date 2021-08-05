package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subject extends StObject {
  
  /** The country code of the subject. */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /** The locality or city of the subject. */
  var locality: js.UndefOr[String] = js.undefined
  
  /** The organization of the subject. */
  var organization: js.UndefOr[String] = js.undefined
  
  /** The organizational_unit of the subject. */
  var organizationalUnit: js.UndefOr[String] = js.undefined
  
  /** The postal code of the subject. */
  var postalCode: js.UndefOr[String] = js.undefined
  
  /** The province, territory, or regional state of the subject. */
  var province: js.UndefOr[String] = js.undefined
  
  /** The street address of the subject. */
  var streetAddress: js.UndefOr[String] = js.undefined
}
object Subject {
  
  inline def apply(): Subject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subject]
  }
  
  extension [Self <: Subject](x: Self) {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setOrganizationalUnit(value: String): Self = StObject.set(x, "organizationalUnit", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitUndefined: Self = StObject.set(x, "organizationalUnit", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    inline def setProvinceUndefined: Self = StObject.set(x, "province", js.undefined)
    
    inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    inline def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
  }
}
