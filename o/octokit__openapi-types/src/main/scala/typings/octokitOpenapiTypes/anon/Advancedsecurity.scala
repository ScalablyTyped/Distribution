package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Advancedsecurity extends StObject {
  
  var advanced_security: js.UndefOr[Status] = js.undefined
  
  var secret_scanning: js.UndefOr[Status] = js.undefined
  
  var secret_scanning_push_protection: js.UndefOr[Status] = js.undefined
}
object Advancedsecurity {
  
  inline def apply(): Advancedsecurity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Advancedsecurity]
  }
  
  extension [Self <: Advancedsecurity](x: Self) {
    
    inline def setAdvanced_security(value: Status): Self = StObject.set(x, "advanced_security", value.asInstanceOf[js.Any])
    
    inline def setAdvanced_securityUndefined: Self = StObject.set(x, "advanced_security", js.undefined)
    
    inline def setSecret_scanning(value: Status): Self = StObject.set(x, "secret_scanning", value.asInstanceOf[js.Any])
    
    inline def setSecret_scanningUndefined: Self = StObject.set(x, "secret_scanning", js.undefined)
    
    inline def setSecret_scanning_push_protection(value: Status): Self = StObject.set(x, "secret_scanning_push_protection", value.asInstanceOf[js.Any])
    
    inline def setSecret_scanning_push_protectionUndefined: Self = StObject.set(x, "secret_scanning_push_protection", js.undefined)
  }
}
