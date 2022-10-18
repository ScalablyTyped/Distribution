package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var `@type`: String
  
  var address: js.UndefOr[AddressCountry] = js.undefined
  
  var name: String
  
  var sameAs: js.UndefOr[String] = js.undefined
}
object Address {
  
  inline def apply(`@type`: String, name: String): Address = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setAddress(value: AddressCountry): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSameAs(value: String): Self = StObject.set(x, "sameAs", value.asInstanceOf[js.Any])
    
    inline def setSameAsUndefined: Self = StObject.set(x, "sameAs", js.undefined)
  }
}
