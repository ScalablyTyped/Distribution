package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProofSchemaPredicate extends StObject {
  
  var name: String
  
  var p_type: String
  
  var p_value: Double
  
  var restrictions: js.Array[Restriction]
}
object ProofSchemaPredicate {
  
  @scala.inline
  def apply(name: String, p_type: String, p_value: Double, restrictions: js.Array[Restriction]): ProofSchemaPredicate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], p_type = p_type.asInstanceOf[js.Any], p_value = p_value.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofSchemaPredicate]
  }
  
  @scala.inline
  implicit class ProofSchemaPredicateMutableBuilder[Self <: ProofSchemaPredicate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP_type(value: String): Self = StObject.set(x, "p_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP_value(value: Double): Self = StObject.set(x, "p_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictions(value: js.Array[Restriction]): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionsVarargs(value: Restriction*): Self = StObject.set(x, "restrictions", js.Array(value :_*))
  }
}
