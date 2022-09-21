package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProofSchemaAttribute extends StObject {
  
  var restrictions: js.UndefOr[js.Array[Restriction]] = js.undefined
}
object ProofSchemaAttribute {
  
  inline def apply(): ProofSchemaAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProofSchemaAttribute]
  }
  
  extension [Self <: ProofSchemaAttribute](x: Self) {
    
    inline def setRestrictions(value: js.Array[Restriction]): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setRestrictionsVarargs(value: Restriction*): Self = StObject.set(x, "restrictions", js.Array(value*))
  }
}
