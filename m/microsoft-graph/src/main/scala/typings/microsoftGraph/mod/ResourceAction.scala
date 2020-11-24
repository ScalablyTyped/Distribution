package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceAction extends js.Object {
  
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
  implicit class ResourceActionOps[Self <: ResourceAction] (val x: Self) extends AnyVal {
    
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
    def setAllowedResourceActionsVarargs(value: String*): Self = this.set("allowedResourceActions", js.Array(value :_*))
    
    @scala.inline
    def setAllowedResourceActions(value: NullableOption[js.Array[String]]): Self = this.set("allowedResourceActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedResourceActions: Self = this.set("allowedResourceActions", js.undefined)
    
    @scala.inline
    def setAllowedResourceActionsNull: Self = this.set("allowedResourceActions", null)
    
    @scala.inline
    def setNotAllowedResourceActionsVarargs(value: String*): Self = this.set("notAllowedResourceActions", js.Array(value :_*))
    
    @scala.inline
    def setNotAllowedResourceActions(value: NullableOption[js.Array[String]]): Self = this.set("notAllowedResourceActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotAllowedResourceActions: Self = this.set("notAllowedResourceActions", js.undefined)
    
    @scala.inline
    def setNotAllowedResourceActionsNull: Self = this.set("notAllowedResourceActions", null)
  }
}
