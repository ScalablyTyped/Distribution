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
  
  inline def apply(): InkAnalysisUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisUpdateData]
  }
  
  extension [Self <: InkAnalysisUpdateData](x: Self) {
    
    inline def setPage(value: PageUpdateData): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
