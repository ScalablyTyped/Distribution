package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Page object, for use in "page.set({ ... })". */
@js.native
trait PageUpdateData extends StObject {
  
  /**
    *
    * Text interpretation for the ink on the page. Returns null if there is no ink analysis information. Read only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysisOrNull: js.UndefOr[InkAnalysisUpdateData] = js.native
  
  /**
    *
    * Gets or sets the indentation level of the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pageLevel: js.UndefOr[Double] = js.native
  
  /**
    *
    * Gets or sets the title of the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var title: js.UndefOr[String] = js.native
}
object PageUpdateData {
  
  @scala.inline
  def apply(): PageUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageUpdateData]
  }
  
  @scala.inline
  implicit class PageUpdateDataMutableBuilder[Self <: PageUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInkAnalysisOrNull(value: InkAnalysisUpdateData): Self = StObject.set(x, "inkAnalysisOrNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInkAnalysisOrNullUndefined: Self = StObject.set(x, "inkAnalysisOrNull", js.undefined)
    
    @scala.inline
    def setPageLevel(value: Double): Self = StObject.set(x, "pageLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLevelUndefined: Self = StObject.set(x, "pageLevel", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
