package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of pages.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
trait PageCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the ClassNotebookPageSource to the page.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var classNotebookPageSource: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: The client url of the page. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: The collection of PageContent objects on the page. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var contents: js.UndefOr[PageContentCollectionLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the ID of the page. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Text interpretation for the ink on the page. Returns null if there is no ink analysis information.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysisOrNull: js.UndefOr[InkAnalysisLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets or sets the indentation level of the page.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var pageLevel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the section that contains the page.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var parentSection: js.UndefOr[SectionLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets or sets the title of the page.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var title: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: The web url of the page. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var webUrl: js.UndefOr[Boolean] = js.undefined
}
object PageCollectionLoadOptions {
  
  inline def apply(): PageCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageCollectionLoadOptions]
  }
  
  extension [Self <: PageCollectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setClassNotebookPageSource(value: Boolean): Self = StObject.set(x, "classNotebookPageSource", value.asInstanceOf[js.Any])
    
    inline def setClassNotebookPageSourceUndefined: Self = StObject.set(x, "classNotebookPageSource", js.undefined)
    
    inline def setClientUrl(value: Boolean): Self = StObject.set(x, "clientUrl", value.asInstanceOf[js.Any])
    
    inline def setClientUrlUndefined: Self = StObject.set(x, "clientUrl", js.undefined)
    
    inline def setContents(value: PageContentCollectionLoadOptions): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInkAnalysisOrNull(value: InkAnalysisLoadOptions): Self = StObject.set(x, "inkAnalysisOrNull", value.asInstanceOf[js.Any])
    
    inline def setInkAnalysisOrNullUndefined: Self = StObject.set(x, "inkAnalysisOrNull", js.undefined)
    
    inline def setPageLevel(value: Boolean): Self = StObject.set(x, "pageLevel", value.asInstanceOf[js.Any])
    
    inline def setPageLevelUndefined: Self = StObject.set(x, "pageLevel", js.undefined)
    
    inline def setParentSection(value: SectionLoadOptions): Self = StObject.set(x, "parentSection", value.asInstanceOf[js.Any])
    
    inline def setParentSectionUndefined: Self = StObject.set(x, "parentSection", js.undefined)
    
    inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWebUrl(value: Boolean): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
