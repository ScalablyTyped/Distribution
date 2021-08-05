package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextElement extends StObject {
  
  /** A TextElement representing a spot in the text that is dynamically replaced with content that can change over time. */
  var autoText: js.UndefOr[AutoText] = js.undefined
  
  /** The zero-based end index of this text element, exclusive, in Unicode code units. */
  var endIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * A marker representing the beginning of a new paragraph. The `start_index` and `end_index` of this TextElement represent the range of the paragraph. Other TextElements with an index
    * range contained inside this paragraph's range are considered to be part of this paragraph. The range of indices of two separate paragraphs will never overlap.
    */
  var paragraphMarker: js.UndefOr[ParagraphMarker] = js.undefined
  
  /** The zero-based start index of this text element, in Unicode code units. */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * A TextElement representing a run of text where all of the characters in the run have the same TextStyle. The `start_index` and `end_index` of TextRuns will always be fully contained
    * in the index range of a single `paragraph_marker` TextElement. In other words, a TextRun will never span multiple paragraphs.
    */
  var textRun: js.UndefOr[TextRun] = js.undefined
}
object TextElement {
  
  inline def apply(): TextElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextElement]
  }
  
  extension [Self <: TextElement](x: Self) {
    
    inline def setAutoText(value: AutoText): Self = StObject.set(x, "autoText", value.asInstanceOf[js.Any])
    
    inline def setAutoTextUndefined: Self = StObject.set(x, "autoText", js.undefined)
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setParagraphMarker(value: ParagraphMarker): Self = StObject.set(x, "paragraphMarker", value.asInstanceOf[js.Any])
    
    inline def setParagraphMarkerUndefined: Self = StObject.set(x, "paragraphMarker", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setTextRun(value: TextRun): Self = StObject.set(x, "textRun", value.asInstanceOf[js.Any])
    
    inline def setTextRunUndefined: Self = StObject.set(x, "textRun", js.undefined)
  }
}
