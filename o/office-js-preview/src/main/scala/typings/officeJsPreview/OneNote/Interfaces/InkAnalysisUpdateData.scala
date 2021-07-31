package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the InkAnalysis object, for use in "inkAnalysis.set({ ... })". */
trait InkAnalysisUpdateData extends StObject {
  
  /**
    *
    * Gets the parent page object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var page: js.UndefOr[PageUpdateData] = js.undefined
}
object InkAnalysisUpdateData {
  
  @scala.inline
  def apply(): InkAnalysisUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisUpdateData]
  }
  
  @scala.inline
  implicit class InkAnalysisUpdateDataMutableBuilder[Self <: InkAnalysisUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: PageUpdateData): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
