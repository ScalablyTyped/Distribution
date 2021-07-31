package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of InkWord objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait InkWordCollectionLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the InkWord object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The id of the recognized language in this ink word. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The parent paragraph containing the ink word.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[ParagraphLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The words that were recognized in this ink word, in order of likelihood. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var wordAlternates: js.UndefOr[Boolean] = js.undefined
}
object InkWordCollectionLoadOptions {
  
  @scala.inline
  def apply(): InkWordCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkWordCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class InkWordCollectionLoadOptionsMutableBuilder[Self <: InkWordCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLanguageId(value: Boolean): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageIdUndefined: Self = StObject.set(x, "languageId", js.undefined)
    
    @scala.inline
    def setParagraph(value: ParagraphLoadOptions): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
    
    @scala.inline
    def setWordAlternates(value: Boolean): Self = StObject.set(x, "wordAlternates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordAlternatesUndefined: Self = StObject.set(x, "wordAlternates", js.undefined)
  }
}
