package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a OneNote notebook. Notebooks contain section groups and sections.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait NotebookLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The url of the site that this notebook is located. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var baseUrl: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The client url of the notebook. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the ID of the notebook. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * True if the Notebook is not created by the user (i.e. 'Misplaced Sections'). Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isVirtual: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the name of the notebook. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The section groups in the notebook. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sectionGroups: js.UndefOr[SectionGroupCollectionLoadOptions] = js.undefined
  
  /**
    *
    * The the sections of the notebook. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sections: js.UndefOr[SectionCollectionLoadOptions] = js.undefined
}
object NotebookLoadOptions {
  
  inline def apply(): NotebookLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookLoadOptions]
  }
  
  extension [Self <: NotebookLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setBaseUrl(value: Boolean): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setClientUrl(value: Boolean): Self = StObject.set(x, "clientUrl", value.asInstanceOf[js.Any])
    
    inline def setClientUrlUndefined: Self = StObject.set(x, "clientUrl", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsVirtual(value: Boolean): Self = StObject.set(x, "isVirtual", value.asInstanceOf[js.Any])
    
    inline def setIsVirtualUndefined: Self = StObject.set(x, "isVirtual", js.undefined)
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSectionGroups(value: SectionGroupCollectionLoadOptions): Self = StObject.set(x, "sectionGroups", value.asInstanceOf[js.Any])
    
    inline def setSectionGroupsUndefined: Self = StObject.set(x, "sectionGroups", js.undefined)
    
    inline def setSections(value: SectionCollectionLoadOptions): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
  }
}
