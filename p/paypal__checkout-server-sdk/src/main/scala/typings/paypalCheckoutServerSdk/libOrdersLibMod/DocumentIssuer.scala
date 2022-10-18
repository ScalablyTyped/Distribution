package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentIssuer extends StObject {
  
  var authority: js.UndefOr[String] = js.undefined
  
  var country_code: String
  
  var province_code: js.UndefOr[String] = js.undefined
}
object DocumentIssuer {
  
  inline def apply(country_code: String): DocumentIssuer = {
    val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentIssuer]
  }
  
  extension [Self <: DocumentIssuer](x: Self) {
    
    inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    inline def setProvince_code(value: String): Self = StObject.set(x, "province_code", value.asInstanceOf[js.Any])
    
    inline def setProvince_codeUndefined: Self = StObject.set(x, "province_code", js.undefined)
  }
}
