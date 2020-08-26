package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents ink analysis data for an identified text line formed by ink strokes.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait InkAnalysisLineLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the ID of the InkAnalysisLine object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * Reference to the parent InkAnalysisParagraph.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[InkAnalysisParagraphLoadOptions] = js.native
  /**
    *
    * Gets the ink analysis words in this ink analysis line.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var words: js.UndefOr[InkAnalysisWordCollectionLoadOptions] = js.native
}

object InkAnalysisLineLoadOptions {
  @scala.inline
  def apply(): InkAnalysisLineLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisLineLoadOptions]
  }
  @scala.inline
  implicit class InkAnalysisLineLoadOptionsOps[Self <: InkAnalysisLineLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setParagraph(value: InkAnalysisParagraphLoadOptions): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraph: Self = this.set("paragraph", js.undefined)
    @scala.inline
    def setWords(value: InkAnalysisWordCollectionLoadOptions): Self = this.set("words", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
  
}

