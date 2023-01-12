package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the InkAnalysis object, for use in `inkAnalysis.set({ ... })`. */
trait InkAnalysisUpdateData extends StObject {
  
  /**
    * Gets the parent page object.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var page: js.UndefOr[PageUpdateData] = js.undefined
}
object InkAnalysisUpdateData {
  
  inline def apply(): InkAnalysisUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InkAnalysisUpdateData] (val x: Self) extends AnyVal {
    
    inline def setPage(value: PageUpdateData): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
