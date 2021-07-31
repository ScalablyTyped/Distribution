package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the InkAnalysisLine object, for use in "inkAnalysisLine.set({ ... })". */
trait InkAnalysisLineUpdateData extends StObject {
  
  /**
    *
    * Reference to the parent InkAnalysisParagraph.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[InkAnalysisParagraphUpdateData] = js.undefined
}
object InkAnalysisLineUpdateData {
  
  @scala.inline
  def apply(): InkAnalysisLineUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisLineUpdateData]
  }
  
  @scala.inline
  implicit class InkAnalysisLineUpdateDataMutableBuilder[Self <: InkAnalysisLineUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParagraph(value: InkAnalysisParagraphUpdateData): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
  }
}
