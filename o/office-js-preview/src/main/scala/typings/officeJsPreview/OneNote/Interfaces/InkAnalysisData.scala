package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `inkAnalysis.toJSON()`. */
trait InkAnalysisData extends StObject {
  
  /**
    * Gets the ID of the InkAnalysis object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the parent page object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var page: js.UndefOr[PageData] = js.undefined
}
object InkAnalysisData {
  
  inline def apply(): InkAnalysisData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InkAnalysisData] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPage(value: PageData): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
