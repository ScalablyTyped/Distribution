package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProofSchemaAttribute extends StObject {
  
  var restrictions: js.UndefOr[js.Array[Restriction]] = js.native
}
object ProofSchemaAttribute {
  
  @scala.inline
  def apply(): ProofSchemaAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProofSchemaAttribute]
  }
  
  @scala.inline
  implicit class ProofSchemaAttributeMutableBuilder[Self <: ProofSchemaAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestrictions(value: js.Array[Restriction]): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    @scala.inline
    def setRestrictionsVarargs(value: Restriction*): Self = StObject.set(x, "restrictions", js.Array(value :_*))
  }
}
