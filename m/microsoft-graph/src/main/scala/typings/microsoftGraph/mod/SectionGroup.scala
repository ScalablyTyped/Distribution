package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionGroup extends OnenoteEntityHierarchyModel {
  
  // The notebook that contains the section group. Read-only.
  var parentNotebook: js.UndefOr[NullableOption[Notebook]] = js.native
  
  // The section group that contains the section group. Read-only.
  var parentSectionGroup: js.UndefOr[NullableOption[SectionGroup]] = js.native
  
  // The section groups in the section. Read-only. Nullable.
  var sectionGroups: js.UndefOr[NullableOption[js.Array[SectionGroup]]] = js.native
  
  /**
    * The URL for the sectionGroups navigation property, which returns all the section groups in the section group.
    * Read-only.
    */
  var sectionGroupsUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // The sections in the section group. Read-only. Nullable.
  var sections: js.UndefOr[NullableOption[js.Array[OnenoteSection]]] = js.native
  
  // The URL for the sections navigation property, which returns all the sections in the section group. Read-only.
  var sectionsUrl: js.UndefOr[NullableOption[String]] = js.native
}
object SectionGroup {
  
  @scala.inline
  def apply(): SectionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionGroup]
  }
  
  @scala.inline
  implicit class SectionGroupOps[Self <: SectionGroup] (val x: Self) extends AnyVal {
    
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
    def setParentNotebook(value: NullableOption[Notebook]): Self = this.set("parentNotebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentNotebook: Self = this.set("parentNotebook", js.undefined)
    
    @scala.inline
    def setParentNotebookNull: Self = this.set("parentNotebook", null)
    
    @scala.inline
    def setParentSectionGroup(value: NullableOption[SectionGroup]): Self = this.set("parentSectionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentSectionGroup: Self = this.set("parentSectionGroup", js.undefined)
    
    @scala.inline
    def setParentSectionGroupNull: Self = this.set("parentSectionGroup", null)
    
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
  }
}
