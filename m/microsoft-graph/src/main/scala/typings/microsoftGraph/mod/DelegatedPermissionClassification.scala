package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelegatedPermissionClassification extends Entity {
  
  var classification: js.UndefOr[NullableOption[PermissionClassificationType]] = js.native
  
  var permissionId: js.UndefOr[NullableOption[String]] = js.native
  
  var permissionName: js.UndefOr[NullableOption[String]] = js.native
}
object DelegatedPermissionClassification {
  
  @scala.inline
  def apply(): DelegatedPermissionClassification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedPermissionClassification]
  }
  
  @scala.inline
  implicit class DelegatedPermissionClassificationOps[Self <: DelegatedPermissionClassification] (val x: Self) extends AnyVal {
    
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
    def setClassification(value: NullableOption[PermissionClassificationType]): Self = this.set("classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassification: Self = this.set("classification", js.undefined)
    
    @scala.inline
    def setClassificationNull: Self = this.set("classification", null)
    
    @scala.inline
    def setPermissionId(value: NullableOption[String]): Self = this.set("permissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionId: Self = this.set("permissionId", js.undefined)
    
    @scala.inline
    def setPermissionIdNull: Self = this.set("permissionId", null)
    
    @scala.inline
    def setPermissionName(value: NullableOption[String]): Self = this.set("permissionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionName: Self = this.set("permissionName", js.undefined)
    
    @scala.inline
    def setPermissionNameNull: Self = this.set("permissionName", null)
  }
}
