package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of sections.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait SectionCollectionLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The client url of the section. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the section. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: True if this section is encrypted with a password. Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: True if this section is locked. Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isLocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the name of the section. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the notebook that contains the section.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var notebook: js.UndefOr[NotebookLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The collection of pages in the section. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pages: js.UndefOr[PageCollectionLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the section group that contains the section. Throws ItemNotFound if the section is a direct child of the notebook.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSectionGroup: js.UndefOr[SectionGroupLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the section group that contains the section. Returns null if the section is a direct child of the notebook.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSectionGroupOrNull: js.UndefOr[SectionGroupLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The web url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var webUrl: js.UndefOr[Boolean] = js.undefined
}
object SectionCollectionLoadOptions {
  
  @scala.inline
  def apply(): SectionCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class SectionCollectionLoadOptionsMutableBuilder[Self <: SectionCollectionLoadOptions] (val x: Self) extends AnyVal {
    
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
    def setIsEncrypted(value: Boolean): Self = StObject.set(x, "isEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEncryptedUndefined: Self = StObject.set(x, "isEncrypted", js.undefined)
    
    @scala.inline
    def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotebook(value: NotebookLoadOptions): Self = StObject.set(x, "notebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookUndefined: Self = StObject.set(x, "notebook", js.undefined)
    
    @scala.inline
    def setPages(value: PageCollectionLoadOptions): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    @scala.inline
    def setParentSectionGroup(value: SectionGroupLoadOptions): Self = StObject.set(x, "parentSectionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSectionGroupOrNull(value: SectionGroupLoadOptions): Self = StObject.set(x, "parentSectionGroupOrNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSectionGroupOrNullUndefined: Self = StObject.set(x, "parentSectionGroupOrNull", js.undefined)
    
    @scala.inline
    def setParentSectionGroupUndefined: Self = StObject.set(x, "parentSectionGroup", js.undefined)
    
    @scala.inline
    def setWebUrl(value: Boolean): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
