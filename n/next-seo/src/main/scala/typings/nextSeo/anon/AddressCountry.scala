package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressCountry extends StObject {
  
  var `@type`: String
  
  var addressCountry: String
  
  var addressLocality: String
  
  var addressRegion: js.UndefOr[String] = js.undefined
  
  var postalCode: String
  
  var streetAddress: String
}
object AddressCountry {
  
  inline def apply(
    `@type`: String,
    addressCountry: String,
    addressLocality: String,
    postalCode: String,
    streetAddress: String
  ): AddressCountry = {
    val __obj = js.Dynamic.literal(addressCountry = addressCountry.asInstanceOf[js.Any], addressLocality = addressLocality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], streetAddress = streetAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressCountry]
  }
  
  extension [Self <: AddressCountry](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setAddressCountry(value: String): Self = StObject.set(x, "addressCountry", value.asInstanceOf[js.Any])
    
    inline def setAddressLocality(value: String): Self = StObject.set(x, "addressLocality", value.asInstanceOf[js.Any])
    
    inline def setAddressRegion(value: String): Self = StObject.set(x, "addressRegion", value.asInstanceOf[js.Any])
    
    inline def setAddressRegionUndefined: Self = StObject.set(x, "addressRegion", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
  }
}
