package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "inkAnalysisParagraph.toJSON()". */
@js.native
trait InkAnalysisParagraphData extends StObject {
  
  /**
    *
    * Gets the ID of the InkAnalysisParagraph object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    *
    * Reference to the parent InkAnalysisPage. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysis: js.UndefOr[InkAnalysisData] = js.native
  
  /**
    *
    * Gets the ink analysis lines in this ink analysis paragraph. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var lines: js.UndefOr[js.Array[InkAnalysisLineData]] = js.native
}
object InkAnalysisParagraphData {
  
  @scala.inline
  def apply(): InkAnalysisParagraphData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisParagraphData]
  }
  
  @scala.inline
  implicit class InkAnalysisParagraphDataMutableBuilder[Self <: InkAnalysisParagraphData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInkAnalysis(value: InkAnalysisData): Self = StObject.set(x, "inkAnalysis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInkAnalysisUndefined: Self = StObject.set(x, "inkAnalysis", js.undefined)
    
    @scala.inline
    def setLines(value: js.Array[InkAnalysisLineData]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    @scala.inline
    def setLinesVarargs(value: InkAnalysisLineData*): Self = StObject.set(x, "lines", js.Array(value :_*))
  }
}
