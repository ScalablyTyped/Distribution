package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `page.toJSON()`. */
trait PageData extends StObject {
  
  /**
    * Gets the ClassNotebookPageSource to the page.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var classNotebookPageSource: js.UndefOr[String] = js.undefined
  
  /**
    * The client url of the page. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The collection of PageContent objects on the page. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var contents: js.UndefOr[js.Array[PageContentData]] = js.undefined
  
  /**
    * Gets the ID of the page. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Text interpretation for the ink on the page. Returns null if there is no ink analysis information.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysisOrNull: js.UndefOr[InkAnalysisData] = js.undefined
  
  /**
    * Gets or sets the indentation level of the page.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var pageLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the title of the page.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The web url of the page. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var webUrl: js.UndefOr[String] = js.undefined
}
object PageData {
  
  inline def apply(): PageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageData] (val x: Self) extends AnyVal {
    
    inline def setClassNotebookPageSource(value: String): Self = StObject.set(x, "classNotebookPageSource", value.asInstanceOf[js.Any])
    
    inline def setClassNotebookPageSourceUndefined: Self = StObject.set(x, "classNotebookPageSource", js.undefined)
    
    inline def setClientUrl(value: String): Self = StObject.set(x, "clientUrl", value.asInstanceOf[js.Any])
    
    inline def setClientUrlUndefined: Self = StObject.set(x, "clientUrl", js.undefined)
    
    inline def setContents(value: js.Array[PageContentData]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setContentsVarargs(value: PageContentData*): Self = StObject.set(x, "contents", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInkAnalysisOrNull(value: InkAnalysisData): Self = StObject.set(x, "inkAnalysisOrNull", value.asInstanceOf[js.Any])
    
    inline def setInkAnalysisOrNullUndefined: Self = StObject.set(x, "inkAnalysisOrNull", js.undefined)
    
    inline def setPageLevel(value: Double): Self = StObject.set(x, "pageLevel", value.asInstanceOf[js.Any])
    
    inline def setPageLevelUndefined: Self = StObject.set(x, "pageLevel", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWebUrl(value: String): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
