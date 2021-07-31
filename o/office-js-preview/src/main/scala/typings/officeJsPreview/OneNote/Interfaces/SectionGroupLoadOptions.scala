package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a OneNote section group. Section groups can contain sections and other section groups.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait SectionGroupLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The client url of the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the ID of the section group. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the name of the section group. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the notebook that contains the section group.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var notebook: js.UndefOr[NotebookLoadOptions] = js.undefined
  
  /**
    *
    * Gets the section group that contains the section group. Throws ItemNotFound if the section group is a direct child of the notebook.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSectionGroup: js.UndefOr[SectionGroupLoadOptions] = js.undefined
  
  /**
    *
    * Gets the section group that contains the section group. Returns null if the section group is a direct child of the notebook.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSectionGroupOrNull: js.UndefOr[SectionGroupLoadOptions] = js.undefined
  
  /**
    *
    * The collection of section groups in the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sectionGroups: js.UndefOr[SectionGroupCollectionLoadOptions] = js.undefined
  
  /**
    *
    * The collection of sections in the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sections: js.UndefOr[SectionCollectionLoadOptions] = js.undefined
}
object SectionGroupLoadOptions {
  
  @scala.inline
  def apply(): SectionGroupLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionGroupLoadOptions]
  }
  
  @scala.inline
  implicit class SectionGroupLoadOptionsMutableBuilder[Self <: SectionGroupLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setClientUrl(value: Boolean): Self = StObject.set(x, "clientUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUrlUndefined: Self = StObject.set(x, "clientUrl", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotebook(value: NotebookLoadOptions): Self = StObject.set(x, "notebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookUndefined: Self = StObject.set(x, "notebook", js.undefined)
    
    @scala.inline
    def setParentSectionGroup(value: SectionGroupLoadOptions): Self = StObject.set(x, "parentSectionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSectionGroupOrNull(value: SectionGroupLoadOptions): Self = StObject.set(x, "parentSectionGroupOrNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSectionGroupOrNullUndefined: Self = StObject.set(x, "parentSectionGroupOrNull", js.undefined)
    
    @scala.inline
    def setParentSectionGroupUndefined: Self = StObject.set(x, "parentSectionGroup", js.undefined)
    
    @scala.inline
    def setSectionGroups(value: SectionGroupCollectionLoadOptions): Self = StObject.set(x, "sectionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionGroupsUndefined: Self = StObject.set(x, "sectionGroups", js.undefined)
    
    @scala.inline
    def setSections(value: SectionCollectionLoadOptions): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
  }
}
