package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryObjectPartnerReference extends DirectoryObject {
  
  // Description of the object returned. Read-only.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Name of directory object being returned, like group or application. Read-only.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The tenant identifier for the partner tenant. Read-only.
  var externalPartnerTenantId: js.UndefOr[NullableOption[String]] = js.native
  
  // The type of the referenced object in the partner tenant. Read-only.
  var objectType: js.UndefOr[NullableOption[String]] = js.native
}
object DirectoryObjectPartnerReference {
  
  @scala.inline
  def apply(): DirectoryObjectPartnerReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryObjectPartnerReference]
  }
  
  @scala.inline
  implicit class DirectoryObjectPartnerReferenceOps[Self <: DirectoryObjectPartnerReference] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setExternalPartnerTenantId(value: NullableOption[String]): Self = this.set("externalPartnerTenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalPartnerTenantId: Self = this.set("externalPartnerTenantId", js.undefined)
    
    @scala.inline
    def setExternalPartnerTenantIdNull: Self = this.set("externalPartnerTenantId", null)
    
    @scala.inline
    def setObjectType(value: NullableOption[String]): Self = this.set("objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    
    @scala.inline
    def setObjectTypeNull: Self = this.set("objectType", null)
  }
}
