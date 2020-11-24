package typings.officeJsPreview.OneNote.Interfaces

import typings.officeJsPreview.OneNote.InkStrokePointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "inkAnalysisWord.toJSON()". */
@js.native
trait InkAnalysisWordData extends js.Object {
  
  /**
    *
    * Gets the ID of the InkAnalysisWord object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    *
    * The id of the recognized language in this inkAnalysisWord. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[String] = js.native
  
  /**
    *
    * Reference to the parent InkAnalysisLine. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var line: js.UndefOr[InkAnalysisLineData] = js.native
  
  /**
    *
    * Weak references to the ink strokes that were recognized as part of this ink analysis word. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var strokePointers: js.UndefOr[js.Array[InkStrokePointer]] = js.native
  
  /**
    *
    * The words that were recognized in this ink word, in order of likelihood. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var wordAlternates: js.UndefOr[js.Array[String]] = js.native
}
object InkAnalysisWordData {
  
  @scala.inline
  def apply(): InkAnalysisWordData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisWordData]
  }
  
  @scala.inline
  implicit class InkAnalysisWordDataOps[Self <: InkAnalysisWordData] (val x: Self) extends AnyVal {
    
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
    def setLanguageId(value: String): Self = this.set("languageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageId: Self = this.set("languageId", js.undefined)
    
    @scala.inline
    def setLine(value: InkAnalysisLineData): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setStrokePointersVarargs(value: InkStrokePointer*): Self = this.set("strokePointers", js.Array(value :_*))
    
    @scala.inline
    def setStrokePointers(value: js.Array[InkStrokePointer]): Self = this.set("strokePointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokePointers: Self = this.set("strokePointers", js.undefined)
    
    @scala.inline
    def setWordAlternatesVarargs(value: String*): Self = this.set("wordAlternates", js.Array(value :_*))
    
    @scala.inline
    def setWordAlternates(value: js.Array[String]): Self = this.set("wordAlternates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordAlternates: Self = this.set("wordAlternates", js.undefined)
  }
}
