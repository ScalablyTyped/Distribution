package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyNotebookModel extends js.Object {
  var createdBy: js.UndefOr[String] = js.native
  var createdByIdentity: js.UndefOr[IdentitySet] = js.native
  var createdTime: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var isDefault: js.UndefOr[Boolean] = js.native
  var isShared: js.UndefOr[Boolean] = js.native
  var lastModifiedBy: js.UndefOr[String] = js.native
  var lastModifiedByIdentity: js.UndefOr[IdentitySet] = js.native
  var lastModifiedTime: js.UndefOr[String] = js.native
  var links: js.UndefOr[NotebookLinks] = js.native
  var name: js.UndefOr[String] = js.native
  var sectionGroupsUrl: js.UndefOr[String] = js.native
  var sectionsUrl: js.UndefOr[String] = js.native
  var self: js.UndefOr[String] = js.native
  var userRole: js.UndefOr[OnenoteUserRole] = js.native
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
    def setCreatedBy(value: String): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    @scala.inline
    def setCreatedByIdentity(value: IdentitySet): Self = this.set("createdByIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedByIdentity: Self = this.set("createdByIdentity", js.undefined)
    @scala.inline
    def setCreatedTime(value: String): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("createdTime", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    @scala.inline
    def setIsShared(value: Boolean): Self = this.set("isShared", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsShared: Self = this.set("isShared", js.undefined)
    @scala.inline
    def setLastModifiedBy(value: String): Self = this.set("lastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("lastModifiedBy", js.undefined)
    @scala.inline
    def setLastModifiedByIdentity(value: IdentitySet): Self = this.set("lastModifiedByIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedByIdentity: Self = this.set("lastModifiedByIdentity", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: String): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("lastModifiedTime", js.undefined)
    @scala.inline
    def setLinks(value: NotebookLinks): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSectionGroupsUrl(value: String): Self = this.set("sectionGroupsUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSectionGroupsUrl: Self = this.set("sectionGroupsUrl", js.undefined)
    @scala.inline
    def setSectionsUrl(value: String): Self = this.set("sectionsUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSectionsUrl: Self = this.set("sectionsUrl", js.undefined)
    @scala.inline
    def setSelf(value: String): Self = this.set("self", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelf: Self = this.set("self", js.undefined)
    @scala.inline
    def setUserRole(value: OnenoteUserRole): Self = this.set("userRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserRole: Self = this.set("userRole", js.undefined)
  }
  
}

