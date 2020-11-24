package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProofSchemaPredicate extends js.Object {
  
  var name: String = js.native
  
  var p_type: String = js.native
  
  var p_value: Double = js.native
  
  var restrictions: js.Array[Restriction] = js.native
}
object ProofSchemaPredicate {
  
  @scala.inline
  def apply(name: String, p_type: String, p_value: Double, restrictions: js.Array[Restriction]): ProofSchemaPredicate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], p_type = p_type.asInstanceOf[js.Any], p_value = p_value.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofSchemaPredicate]
  }
  
  @scala.inline
  implicit class ProofSchemaPredicateOps[Self <: ProofSchemaPredicate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP_type(value: String): Self = this.set("p_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP_value(value: Double): Self = this.set("p_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionsVarargs(value: Restriction*): Self = this.set("restrictions", js.Array(value :_*))
    
    @scala.inline
    def setRestrictions(value: js.Array[Restriction]): Self = this.set("restrictions", value.asInstanceOf[js.Any])
  }
}
