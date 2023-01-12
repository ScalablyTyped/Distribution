package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the InkAnalysisParagraph object, for use in `inkAnalysisParagraph.set({ ... })`. */
trait InkAnalysisParagraphUpdateData extends StObject {
  
  /**
    * Reference to the parent InkAnalysisPage.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysis: js.UndefOr[InkAnalysisUpdateData] = js.undefined
}
object InkAnalysisParagraphUpdateData {
  
  inline def apply(): InkAnalysisParagraphUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisParagraphUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InkAnalysisParagraphUpdateData] (val x: Self) extends AnyVal {
    
    inline def setInkAnalysis(value: InkAnalysisUpdateData): Self = StObject.set(x, "inkAnalysis", value.asInstanceOf[js.Any])
    
    inline def setInkAnalysisUndefined: Self = StObject.set(x, "inkAnalysis", js.undefined)
  }
}
