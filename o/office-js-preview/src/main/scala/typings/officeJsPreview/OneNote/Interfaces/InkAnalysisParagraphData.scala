package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `inkAnalysisParagraph.toJSON()`. */
trait InkAnalysisParagraphData extends StObject {
  
  /**
    * Gets the ID of the InkAnalysisParagraph object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Reference to the parent InkAnalysisPage. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysis: js.UndefOr[InkAnalysisData] = js.undefined
  
  /**
    * Gets the ink analysis lines in this ink analysis paragraph. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var lines: js.UndefOr[js.Array[InkAnalysisLineData]] = js.undefined
}
object InkAnalysisParagraphData {
  
  inline def apply(): InkAnalysisParagraphData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisParagraphData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InkAnalysisParagraphData] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInkAnalysis(value: InkAnalysisData): Self = StObject.set(x, "inkAnalysis", value.asInstanceOf[js.Any])
    
    inline def setInkAnalysisUndefined: Self = StObject.set(x, "inkAnalysis", js.undefined)
    
    inline def setLines(value: js.Array[InkAnalysisLineData]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setLinesVarargs(value: InkAnalysisLineData*): Self = StObject.set(x, "lines", js.Array(value*))
  }
}
