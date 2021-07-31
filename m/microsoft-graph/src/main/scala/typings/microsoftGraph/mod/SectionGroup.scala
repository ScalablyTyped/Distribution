package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionGroup
  extends StObject
     with OnenoteEntityHierarchyModel {
  
  // The notebook that contains the section group. Read-only.
  var parentNotebook: js.UndefOr[NullableOption[Notebook]] = js.undefined
  
  // The section group that contains the section group. Read-only.
  var parentSectionGroup: js.UndefOr[NullableOption[SectionGroup]] = js.undefined
  
  // The section groups in the section. Read-only. Nullable.
  var sectionGroups: js.UndefOr[NullableOption[js.Array[SectionGroup]]] = js.undefined
  
  /**
    * The URL for the sectionGroups navigation property, which returns all the section groups in the section group.
    * Read-only.
    */
  var sectionGroupsUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The sections in the section group. Read-only. Nullable.
  var sections: js.UndefOr[NullableOption[js.Array[OnenoteSection]]] = js.undefined
  
  // The URL for the sections navigation property, which returns all the sections in the section group. Read-only.
  var sectionsUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object SectionGroup {
  
  @scala.inline
  def apply(): SectionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionGroup]
  }
  
  @scala.inline
  implicit class SectionGroupMutableBuilder[Self <: SectionGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParentNotebook(value: NullableOption[Notebook]): Self = StObject.set(x, "parentNotebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNotebookNull: Self = StObject.set(x, "parentNotebook", null)
    
    @scala.inline
    def setParentNotebookUndefined: Self = StObject.set(x, "parentNotebook", js.undefined)
    
    @scala.inline
    def setParentSectionGroup(value: NullableOption[SectionGroup]): Self = StObject.set(x, "parentSectionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSectionGroupNull: Self = StObject.set(x, "parentSectionGroup", null)
    
    @scala.inline
    def setParentSectionGroupUndefined: Self = StObject.set(x, "parentSectionGroup", js.undefined)
    
    @scala.inline
    def setSectionGroups(value: NullableOption[js.Array[SectionGroup]]): Self = StObject.set(x, "sectionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionGroupsNull: Self = StObject.set(x, "sectionGroups", null)
    
    @scala.inline
    def setSectionGroupsUndefined: Self = StObject.set(x, "sectionGroups", js.undefined)
    
    @scala.inline
    def setSectionGroupsUrl(value: NullableOption[String]): Self = StObject.set(x, "sectionGroupsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionGroupsUrlNull: Self = StObject.set(x, "sectionGroupsUrl", null)
    
    @scala.inline
    def setSectionGroupsUrlUndefined: Self = StObject.set(x, "sectionGroupsUrl", js.undefined)
    
    @scala.inline
    def setSectionGroupsVarargs(value: SectionGroup*): Self = StObject.set(x, "sectionGroups", js.Array(value :_*))
    
    @scala.inline
    def setSections(value: NullableOption[js.Array[OnenoteSection]]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsNull: Self = StObject.set(x, "sections", null)
    
    @scala.inline
    def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    @scala.inline
    def setSectionsUrl(value: NullableOption[String]): Self = StObject.set(x, "sectionsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsUrlNull: Self = StObject.set(x, "sectionsUrl", null)
    
    @scala.inline
    def setSectionsUrlUndefined: Self = StObject.set(x, "sectionsUrl", js.undefined)
    
    @scala.inline
    def setSectionsVarargs(value: OnenoteSection*): Self = StObject.set(x, "sections", js.Array(value :_*))
  }
}
