package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var addressCountry: String
  
  var addressLocality: String
  
  var addressRegion: js.UndefOr[String] = js.undefined
  
  var postalCode: String
  
  var streetAddress: String
}
object Address {
  
  inline def apply(addressCountry: String, addressLocality: String, postalCode: String, streetAddress: String): Address = {
    val __obj = js.Dynamic.literal(addressCountry = addressCountry.asInstanceOf[js.Any], addressLocality = addressLocality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], streetAddress = streetAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddressCountry(value: String): Self = StObject.set(x, "addressCountry", value.asInstanceOf[js.Any])
    
    inline def setAddressLocality(value: String): Self = StObject.set(x, "addressLocality", value.asInstanceOf[js.Any])
    
    inline def setAddressRegion(value: String): Self = StObject.set(x, "addressRegion", value.asInstanceOf[js.Any])
    
    inline def setAddressRegionUndefined: Self = StObject.set(x, "addressRegion", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
  }
}
