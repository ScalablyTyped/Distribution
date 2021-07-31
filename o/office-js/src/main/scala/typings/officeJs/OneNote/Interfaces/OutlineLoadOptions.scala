package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a container for Paragraph objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait OutlineLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the ID of the Outline object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the PageContent object that contains the Outline. This object defines the position of the Outline on the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pageContent: js.UndefOr[PageContentLoadOptions] = js.undefined
  
  /**
    *
    * Gets the collection of Paragraph objects in the Outline.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[ParagraphCollectionLoadOptions] = js.undefined
}
object OutlineLoadOptions {
  
  @scala.inline
  def apply(): OutlineLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlineLoadOptions]
  }
  
  @scala.inline
  implicit class OutlineLoadOptionsMutableBuilder[Self <: OutlineLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPageContent(value: PageContentLoadOptions): Self = StObject.set(x, "pageContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageContentUndefined: Self = StObject.set(x, "pageContent", js.undefined)
    
    @scala.inline
    def setParagraphs(value: ParagraphCollectionLoadOptions): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphsUndefined: Self = StObject.set(x, "paragraphs", js.undefined)
  }
}
