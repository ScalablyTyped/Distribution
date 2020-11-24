package typings.maximMazurokGapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextElement extends js.Object {
  
  /** A TextElement representing a spot in the text that is dynamically replaced with content that can change over time. */
  var autoText: js.UndefOr[AutoText] = js.native
  
  /** The zero-based end index of this text element, exclusive, in Unicode code units. */
  var endIndex: js.UndefOr[Double] = js.native
  
  /**
    * A marker representing the beginning of a new paragraph. The `start_index` and `end_index` of this TextElement represent the range of the paragraph. Other TextElements with an index
    * range contained inside this paragraph's range are considered to be part of this paragraph. The range of indices of two separate paragraphs will never overlap.
    */
  var paragraphMarker: js.UndefOr[ParagraphMarker] = js.native
  
  /** The zero-based start index of this text element, in Unicode code units. */
  var startIndex: js.UndefOr[Double] = js.native
  
  /**
    * A TextElement representing a run of text where all of the characters in the run have the same TextStyle. The `start_index` and `end_index` of TextRuns will always be fully contained
    * in the index range of a single `paragraph_marker` TextElement. In other words, a TextRun will never span multiple paragraphs.
    */
  var textRun: js.UndefOr[TextRun] = js.native
}
object TextElement {
  
  @scala.inline
  def apply(): TextElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextElement]
  }
  
  @scala.inline
  implicit class TextElementOps[Self <: TextElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoText(value: AutoText): Self = this.set("autoText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoText: Self = this.set("autoText", js.undefined)
    
    @scala.inline
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
    
    @scala.inline
    def setParagraphMarker(value: ParagraphMarker): Self = this.set("paragraphMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParagraphMarker: Self = this.set("paragraphMarker", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setTextRun(value: TextRun): Self = this.set("textRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextRun: Self = this.set("textRun", js.undefined)
  }
}
