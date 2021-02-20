package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ConditionalAccessRootMutableBuilder[Self <: ConditionalAccessRoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedLocations(value: NullableOption[js.Array[NamedLocation]]): Self = StObject.set(x, "namedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedLocationsNull: Self = StObject.set(x, "namedLocations", null)
    
    @scala.inline
    def setNamedLocationsUndefined: Self = StObject.set(x, "namedLocations", js.undefined)
    
    @scala.inline
    def setNamedLocationsVarargs(value: NamedLocation*): Self = StObject.set(x, "namedLocations", js.Array(value :_*))
    
    @scala.inline
    def setPolicies(value: NullableOption[js.Array[ConditionalAccessPolicy]]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesNull: Self = StObject.set(x, "policies", null)
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: ConditionalAccessPolicy*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
