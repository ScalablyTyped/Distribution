package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceOperation extends Entity {
  
  /**
    * Type of action this operation is going to perform. The actionName should be concise and limited to as few words as
    * possible.
    */
  var actionName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Description of the resource operation. The description is used in mouse-over text for the operation when shown in the
    * Azure Portal.
    */
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Name of the Resource this operation is performed on.
  var resourceName: js.UndefOr[NullableOption[String]] = js.native
}
object ResourceOperation {
  
  @scala.inline
  def apply(): ResourceOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceOperation]
  }
  
  @scala.inline
  implicit class ResourceOperationOps[Self <: ResourceOperation] (val x: Self) extends AnyVal {
    
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
    def setActionName(value: NullableOption[String]): Self = this.set("actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionName: Self = this.set("actionName", js.undefined)
    
    @scala.inline
    def setActionNameNull: Self = this.set("actionName", null)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setResourceName(value: NullableOption[String]): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    
    @scala.inline
    def setResourceNameNull: Self = this.set("resourceName", null)
  }
}
