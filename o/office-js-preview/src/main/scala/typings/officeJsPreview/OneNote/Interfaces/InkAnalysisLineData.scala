package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "inkAnalysisLine.toJSON()". */
@js.native
trait InkAnalysisLineData extends js.Object {
  
  /**
    *
    * Gets the ID of the InkAnalysisLine object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    *
    * Reference to the parent InkAnalysisParagraph. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[InkAnalysisParagraphData] = js.native
  
  /**
    *
    * Gets the ink analysis words in this ink analysis line. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var words: js.UndefOr[js.Array[InkAnalysisWordData]] = js.native
}
object InkAnalysisLineData {
  
  @scala.inline
  def apply(): InkAnalysisLineData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisLineData]
  }
  
  @scala.inline
  implicit class InkAnalysisLineDataOps[Self <: InkAnalysisLineData] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setParagraph(value: InkAnalysisParagraphData): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParagraph: Self = this.set("paragraph", js.undefined)
    
    @scala.inline
    def setWordsVarargs(value: InkAnalysisWordData*): Self = this.set("words", js.Array(value :_*))
    
    @scala.inline
    def setWords(value: js.Array[InkAnalysisWordData]): Self = this.set("words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
}
