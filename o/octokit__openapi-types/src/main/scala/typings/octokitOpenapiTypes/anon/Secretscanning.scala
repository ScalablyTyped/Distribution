package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Secretscanning extends StObject {
  
  var advanced_security: js.UndefOr[`497`] = js.undefined
  
  var secret_scanning: js.UndefOr[`497`] = js.undefined
  
  var secret_scanning_push_protection: js.UndefOr[`497`] = js.undefined
}
object Secretscanning {
  
  inline def apply(): Secretscanning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Secretscanning]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Secretscanning] (val x: Self) extends AnyVal {
    
    inline def setAdvanced_security(value: `497`): Self = StObject.set(x, "advanced_security", value.asInstanceOf[js.Any])
    
    inline def setAdvanced_securityUndefined: Self = StObject.set(x, "advanced_security", js.undefined)
    
    inline def setSecret_scanning(value: `497`): Self = StObject.set(x, "secret_scanning", value.asInstanceOf[js.Any])
    
    inline def setSecret_scanningUndefined: Self = StObject.set(x, "secret_scanning", js.undefined)
    
    inline def setSecret_scanning_push_protection(value: `497`): Self = StObject.set(x, "secret_scanning_push_protection", value.asInstanceOf[js.Any])
    
    inline def setSecret_scanning_push_protectionUndefined: Self = StObject.set(x, "secret_scanning_push_protection", js.undefined)
  }
}
