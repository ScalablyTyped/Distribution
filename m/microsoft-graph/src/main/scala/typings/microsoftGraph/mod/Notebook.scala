package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notebook extends OnenoteEntityHierarchyModel {
  
  // Indicates whether this is the user's default notebook. Read-only.
  var isDefault: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Indicates whether the notebook is shared. If true, the contents of the notebook can be seen by people other than the
    * owner. Read-only.
    */
  var isShared: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote native client if it's
    * installed. The oneNoteWebURL link opens the notebook in OneNote on the web.
    */
  var links: js.UndefOr[NullableOption[NotebookLinks]] = js.native
  
  // The section groups in the notebook. Read-only. Nullable.
  var sectionGroups: js.UndefOr[NullableOption[js.Array[SectionGroup]]] = js.native
  
  // The URL for the sectionGroups navigation property, which returns all the section groups in the notebook. Read-only.
  var sectionGroupsUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // The sections in the notebook. Read-only. Nullable.
  var sections: js.UndefOr[NullableOption[js.Array[OnenoteSection]]] = js.native
  
  // The URL for the sections navigation property, which returns all the sections in the notebook. Read-only.
  var sectionsUrl: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Possible values are: Owner, Contributor, Reader, None. Owner represents owner-level access to the notebook. Contributor
    * represents read/write access to the notebook. Reader represents read-only access to the notebook. Read-only.
    */
  var userRole: js.UndefOr[NullableOption[OnenoteUserRole]] = js.native
}
object Notebook {
  
  @scala.inline
  def apply(): Notebook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notebook]
  }
  
  @scala.inline
  implicit class NotebookOps[Self <: Notebook] (val x: Self) extends AnyVal {
    
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
    def setLinks(value: NullableOption[NotebookLinks]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setLinksNull: Self = this.set("links", null)
    
    @scala.inline
    def setSectionGroupsVarargs(value: SectionGroup*): Self = this.set("sectionGroups", js.Array(value :_*))
    
    @scala.inline
    def setSectionGroups(value: NullableOption[js.Array[SectionGroup]]): Self = this.set("sectionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionGroups: Self = this.set("sectionGroups", js.undefined)
    
    @scala.inline
    def setSectionGroupsNull: Self = this.set("sectionGroups", null)
    
    @scala.inline
    def setSectionGroupsUrl(value: NullableOption[String]): Self = this.set("sectionGroupsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionGroupsUrl: Self = this.set("sectionGroupsUrl", js.undefined)
    
    @scala.inline
    def setSectionGroupsUrlNull: Self = this.set("sectionGroupsUrl", null)
    
    @scala.inline
    def setSectionsVarargs(value: OnenoteSection*): Self = this.set("sections", js.Array(value :_*))
    
    @scala.inline
    def setSections(value: NullableOption[js.Array[OnenoteSection]]): Self = this.set("sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSections: Self = this.set("sections", js.undefined)
    
    @scala.inline
    def setSectionsNull: Self = this.set("sections", null)
    
    @scala.inline
    def setSectionsUrl(value: NullableOption[String]): Self = this.set("sectionsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionsUrl: Self = this.set("sectionsUrl", js.undefined)
    
    @scala.inline
    def setSectionsUrlNull: Self = this.set("sectionsUrl", null)
    
    @scala.inline
    def setUserRole(value: NullableOption[OnenoteUserRole]): Self = this.set("userRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserRole: Self = this.set("userRole", js.undefined)
    
    @scala.inline
    def setUserRoleNull: Self = this.set("userRole", null)
  }
}
