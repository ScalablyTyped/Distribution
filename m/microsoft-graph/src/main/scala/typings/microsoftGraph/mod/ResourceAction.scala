package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceAction extends StObject {
  
  // Allowed Actions
  var allowedResourceActions: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // Not Allowed Actions
  var notAllowedResourceActions: js.UndefOr[NullableOption[js.Array[String]]] = js.native
}
object ResourceAction {
  
  @scala.inline
  def apply(): ResourceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceAction]
  }
  
  @scala.inline
  implicit class ResourceActionMutableBuilder[Self <: ResourceAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedResourceActions(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "allowedResourceActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedResourceActionsNull: Self = StObject.set(x, "allowedResourceActions", null)
    
    @scala.inline
    def setAllowedResourceActionsUndefined: Self = StObject.set(x, "allowedResourceActions", js.undefined)
    
    @scala.inline
    def setAllowedResourceActionsVarargs(value: String*): Self = StObject.set(x, "allowedResourceActions", js.Array(value :_*))
    
    @scala.inline
    def setNotAllowedResourceActions(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "notAllowedResourceActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAllowedResourceActionsNull: Self = StObject.set(x, "notAllowedResourceActions", null)
    
    @scala.inline
    def setNotAllowedResourceActionsUndefined: Self = StObject.set(x, "notAllowedResourceActions", js.undefined)
    
    @scala.inline
    def setNotAllowedResourceActionsVarargs(value: String*): Self = StObject.set(x, "notAllowedResourceActions", js.Array(value :_*))
  }
}
