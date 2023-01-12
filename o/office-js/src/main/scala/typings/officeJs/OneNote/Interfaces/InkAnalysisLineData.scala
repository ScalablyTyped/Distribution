package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `inkAnalysisLine.toJSON()`. */
trait InkAnalysisLineData extends StObject {
  
  /**
    * Gets the ID of the InkAnalysisLine object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Reference to the parent InkAnalysisParagraph. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[InkAnalysisParagraphData] = js.undefined
  
  /**
    * Gets the ink analysis words in this ink analysis line. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var words: js.UndefOr[js.Array[InkAnalysisWordData]] = js.undefined
}
object InkAnalysisLineData {
  
  inline def apply(): InkAnalysisLineData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisLineData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InkAnalysisLineData] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setParagraph(value: InkAnalysisParagraphData): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
    
    inline def setWords(value: js.Array[InkAnalysisWordData]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    inline def setWordsVarargs(value: InkAnalysisWordData*): Self = StObject.set(x, "words", js.Array(value*))
  }
}
