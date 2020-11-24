package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalAccessRoot extends Entity {
  
  var namedLocations: js.UndefOr[NullableOption[js.Array[NamedLocation]]] = js.native
  
  var policies: js.UndefOr[NullableOption[js.Array[ConditionalAccessPolicy]]] = js.native
}
object ConditionalAccessRoot {
  
  @scala.inline
  def apply(): ConditionalAccessRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessRoot]
  }
  
  @scala.inline
  implicit class ConditionalAccessRootOps[Self <: ConditionalAccessRoot] (val x: Self) extends AnyVal {
    
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
    def setNamedLocationsVarargs(value: NamedLocation*): Self = this.set("namedLocations", js.Array(value :_*))
    
    @scala.inline
    def setNamedLocations(value: NullableOption[js.Array[NamedLocation]]): Self = this.set("namedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedLocations: Self = this.set("namedLocations", js.undefined)
    
    @scala.inline
    def setNamedLocationsNull: Self = this.set("namedLocations", null)
    
    @scala.inline
    def setPoliciesVarargs(value: ConditionalAccessPolicy*): Self = this.set("policies", js.Array(value :_*))
    
    @scala.inline
    def setPolicies(value: NullableOption[js.Array[ConditionalAccessPolicy]]): Self = this.set("policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
    
    @scala.inline
    def setPoliciesNull: Self = this.set("policies", null)
  }
}
