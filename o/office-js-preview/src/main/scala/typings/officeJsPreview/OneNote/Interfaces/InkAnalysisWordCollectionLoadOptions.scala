package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of InkAnalysisWord objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait InkAnalysisWordCollectionLoadOptions extends js.Object {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the InkAnalysisWord object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The id of the recognized language in this inkAnalysisWord. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Reference to the parent InkAnalysisLine.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var line: js.UndefOr[InkAnalysisLineLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Weak references to the ink strokes that were recognized as part of this ink analysis word. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var strokePointers: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The words that were recognized in this ink word, in order of likelihood. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var wordAlternates: js.UndefOr[Boolean] = js.native
}
object InkAnalysisWordCollectionLoadOptions {
  
  @scala.inline
  def apply(): InkAnalysisWordCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisWordCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class InkAnalysisWordCollectionLoadOptionsOps[Self <: InkAnalysisWordCollectionLoadOptions] (val x: Self) extends AnyVal {
    
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
    def setLanguageId(value: Boolean): Self = this.set("languageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageId: Self = this.set("languageId", js.undefined)
    
    @scala.inline
    def setLine(value: InkAnalysisLineLoadOptions): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setStrokePointers(value: Boolean): Self = this.set("strokePointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokePointers: Self = this.set("strokePointers", js.undefined)
    
    @scala.inline
    def setWordAlternates(value: Boolean): Self = this.set("wordAlternates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordAlternates: Self = this.set("wordAlternates", js.undefined)
  }
}
