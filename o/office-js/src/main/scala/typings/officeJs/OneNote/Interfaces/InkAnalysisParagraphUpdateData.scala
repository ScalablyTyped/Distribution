package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the InkAnalysisParagraph object, for use in "inkAnalysisParagraph.set({ ... })". */
trait InkAnalysisParagraphUpdateData extends StObject {
  
  /**
    *
    * Reference to the parent InkAnalysisPage.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysis: js.UndefOr[InkAnalysisUpdateData] = js.undefined
}
object InkAnalysisParagraphUpdateData {
  
  inline def apply(): InkAnalysisParagraphUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisParagraphUpdateData]
  }
  
  extension [Self <: InkAnalysisParagraphUpdateData](x: Self) {
    
    inline def setInkAnalysis(value: InkAnalysisUpdateData): Self = StObject.set(x, "inkAnalysis", value.asInstanceOf[js.Any])
    
    inline def setInkAnalysisUndefined: Self = StObject.set(x, "inkAnalysis", js.undefined)
  }
}
