package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyNotebookModel extends js.Object {
  
  var createdBy: js.UndefOr[NullableOption[String]] = js.native
  
  var createdByIdentity: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  var createdTime: js.UndefOr[NullableOption[String]] = js.native
  
  var id: js.UndefOr[NullableOption[String]] = js.native
  
  var isDefault: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var isShared: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var lastModifiedBy: js.UndefOr[NullableOption[String]] = js.native
  
  var lastModifiedByIdentity: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  var lastModifiedTime: js.UndefOr[NullableOption[String]] = js.native
  
  var links: js.UndefOr[NullableOption[NotebookLinks]] = js.native
  
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  var sectionGroupsUrl: js.UndefOr[NullableOption[String]] = js.native
  
  var sectionsUrl: js.UndefOr[NullableOption[String]] = js.native
  
  var self: js.UndefOr[NullableOption[String]] = js.native
  
  var userRole: js.UndefOr[NullableOption[OnenoteUserRole]] = js.native
}
object CopyNotebookModel {
  
  @scala.inline
  def apply(): CopyNotebookModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyNotebookModel]
  }
  
  @scala.inline
  implicit class CopyNotebookModelOps[Self <: CopyNotebookModel] (val x: Self) extends AnyVal {
    
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
    def setCreatedBy(value: NullableOption[String]): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    
    @scala.inline
    def setCreatedByNull: Self = this.set("createdBy", null)
    
    @scala.inline
    def setCreatedByIdentity(value: NullableOption[IdentitySet]): Self = this.set("createdByIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedByIdentity: Self = this.set("createdByIdentity", js.undefined)
    
    @scala.inline
    def setCreatedByIdentityNull: Self = this.set("createdByIdentity", null)
    
    @scala.inline
    def setCreatedTime(value: NullableOption[String]): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("createdTime", js.undefined)
    
    @scala.inline
    def setCreatedTimeNull: Self = this.set("createdTime", null)
    
    @scala.inline
    def setId(value: NullableOption[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setIsDefault(value: NullableOption[Boolean]): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    
    @scala.inline
    def setIsDefaultNull: Self = this.set("isDefault", null)
    
    @scala.inline
    def setIsShared(value: NullableOption[Boolean]): Self = this.set("isShared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsShared: Self = this.set("isShared", js.undefined)
    
    @scala.inline
    def setIsSharedNull: Self = this.set("isShared", null)
    
    @scala.inline
    def setLastModifiedBy(value: NullableOption[String]): Self = this.set("lastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("lastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedByNull: Self = this.set("lastModifiedBy", null)
    
    @scala.inline
    def setLastModifiedByIdentity(value: NullableOption[IdentitySet]): Self = this.set("lastModifiedByIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedByIdentity: Self = this.set("lastModifiedByIdentity", js.undefined)
    
    @scala.inline
    def setLastModifiedByIdentityNull: Self = this.set("lastModifiedByIdentity", null)
    
    @scala.inline
    def setLastModifiedTime(value: NullableOption[String]): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("lastModifiedTime", js.undefined)
    
    @scala.inline
    def setLastModifiedTimeNull: Self = this.set("lastModifiedTime", null)
    
    @scala.inline
    def setLinks(value: NullableOption[NotebookLinks]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setLinksNull: Self = this.set("links", null)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setSectionGroupsUrl(value: NullableOption[String]): Self = this.set("sectionGroupsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionGroupsUrl: Self = this.set("sectionGroupsUrl", js.undefined)
    
    @scala.inline
    def setSectionGroupsUrlNull: Self = this.set("sectionGroupsUrl", null)
    
    @scala.inline
    def setSectionsUrl(value: NullableOption[String]): Self = this.set("sectionsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionsUrl: Self = this.set("sectionsUrl", js.undefined)
    
    @scala.inline
    def setSectionsUrlNull: Self = this.set("sectionsUrl", null)
    
    @scala.inline
    def setSelf(value: NullableOption[String]): Self = this.set("self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelf: Self = this.set("self", js.undefined)
    
    @scala.inline
    def setSelfNull: Self = this.set("self", null)
    
    @scala.inline
    def setUserRole(value: NullableOption[OnenoteUserRole]): Self = this.set("userRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserRole: Self = this.set("userRole", js.undefined)
    
    @scala.inline
    def setUserRoleNull: Self = this.set("userRole", null)
  }
}
