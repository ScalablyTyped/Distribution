package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of InkWord objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait InkWordCollectionLoadOptions extends js.Object {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the InkWord object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The id of the recognized language in this ink word. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The parent paragraph containing the ink word.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[ParagraphLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The words that were recognized in this ink word, in order of likelihood. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var wordAlternates: js.UndefOr[Boolean] = js.native
}
object InkWordCollectionLoadOptions {
  
  @scala.inline
  def apply(): InkWordCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkWordCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class InkWordCollectionLoadOptionsOps[Self <: InkWordCollectionLoadOptions] (val x: Self) extends AnyVal {
    
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
    def setParagraph(value: ParagraphLoadOptions): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParagraph: Self = this.set("paragraph", js.undefined)
    
    @scala.inline
    def setWordAlternates(value: Boolean): Self = this.set("wordAlternates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordAlternates: Self = this.set("wordAlternates", js.undefined)
  }
}
