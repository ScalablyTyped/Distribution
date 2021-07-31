package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a OneNote page.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait PageLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the ClassNotebookPageSource to the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var classNotebookPageSource: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The client url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The collection of PageContent objects on the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var contents: js.UndefOr[PageContentCollectionLoadOptions] = js.undefined
  
  /**
    *
    * Gets the ID of the page. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Text interpretation for the ink on the page. Returns null if there is no ink analysis information. Read only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysisOrNull: js.UndefOr[InkAnalysisLoadOptions] = js.undefined
  
  /**
    *
    * Gets or sets the indentation level of the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pageLevel: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the section that contains the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSection: js.UndefOr[SectionLoadOptions] = js.undefined
  
  /**
    *
    * Gets or sets the title of the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var title: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The web url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var webUrl: js.UndefOr[Boolean] = js.undefined
}
object PageLoadOptions {
  
  @scala.inline
  def apply(): PageLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLoadOptions]
  }
  
  @scala.inline
  implicit class PageLoadOptionsMutableBuilder[Self <: PageLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setClassNotebookPageSource(value: Boolean): Self = StObject.set(x, "classNotebookPageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNotebookPageSourceUndefined: Self = StObject.set(x, "classNotebookPageSource", js.undefined)
    
    @scala.inline
    def setClientUrl(value: Boolean): Self = StObject.set(x, "clientUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUrlUndefined: Self = StObject.set(x, "clientUrl", js.undefined)
    
    @scala.inline
    def setContents(value: PageContentCollectionLoadOptions): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInkAnalysisOrNull(value: InkAnalysisLoadOptions): Self = StObject.set(x, "inkAnalysisOrNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInkAnalysisOrNullUndefined: Self = StObject.set(x, "inkAnalysisOrNull", js.undefined)
    
    @scala.inline
    def setPageLevel(value: Boolean): Self = StObject.set(x, "pageLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLevelUndefined: Self = StObject.set(x, "pageLevel", js.undefined)
    
    @scala.inline
    def setParentSection(value: SectionLoadOptions): Self = StObject.set(x, "parentSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSectionUndefined: Self = StObject.set(x, "parentSection", js.undefined)
    
    @scala.inline
    def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWebUrl(value: Boolean): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
