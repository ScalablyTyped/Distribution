package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the InkAnalysisLine object, for use in `inkAnalysisLine.set({ ... })`. */
trait InkAnalysisLineUpdateData extends StObject {
  
  /**
    * Reference to the parent InkAnalysisParagraph.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[InkAnalysisParagraphUpdateData] = js.undefined
}
object InkAnalysisLineUpdateData {
  
  inline def apply(): InkAnalysisLineUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisLineUpdateData]
  }
  
  extension [Self <: InkAnalysisLineUpdateData](x: Self) {
    
    inline def setParagraph(value: InkAnalysisParagraphUpdateData): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
  }
}
