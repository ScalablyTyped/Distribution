package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fido2KeyRestrictions extends StObject {
  
  // A collection of Authenticator Attestation GUIDs. AADGUIDs define key types and manufacturers.
  var aaGuids: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // Enforcement type. Possible values are: allow, block.
  var enforcementType: js.UndefOr[NullableOption[Fido2RestrictionEnforcementType]] = js.undefined
  
  // Determines if the configured key enforcement is enabled.
  var isEnforced: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object Fido2KeyRestrictions {
  
  inline def apply(): Fido2KeyRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fido2KeyRestrictions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fido2KeyRestrictions] (val x: Self) extends AnyVal {
    
    inline def setAaGuids(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "aaGuids", value.asInstanceOf[js.Any])
    
    inline def setAaGuidsNull: Self = StObject.set(x, "aaGuids", null)
    
    inline def setAaGuidsUndefined: Self = StObject.set(x, "aaGuids", js.undefined)
    
    inline def setAaGuidsVarargs(value: String*): Self = StObject.set(x, "aaGuids", js.Array(value*))
    
    inline def setEnforcementType(value: NullableOption[Fido2RestrictionEnforcementType]): Self = StObject.set(x, "enforcementType", value.asInstanceOf[js.Any])
    
    inline def setEnforcementTypeNull: Self = StObject.set(x, "enforcementType", null)
    
    inline def setEnforcementTypeUndefined: Self = StObject.set(x, "enforcementType", js.undefined)
    
    inline def setIsEnforced(value: NullableOption[Boolean]): Self = StObject.set(x, "isEnforced", value.asInstanceOf[js.Any])
    
    inline def setIsEnforcedNull: Self = StObject.set(x, "isEnforced", null)
    
    inline def setIsEnforcedUndefined: Self = StObject.set(x, "isEnforced", js.undefined)
  }
}
