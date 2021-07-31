package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a group of ink strokes.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait FloatingInkLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the ID of the FloatingInk object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the strokes of the FloatingInk object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkStrokes: js.UndefOr[InkStrokeCollectionLoadOptions] = js.undefined
  
  /**
    *
    * Gets the PageContent parent of the FloatingInk object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pageContent: js.UndefOr[PageContentLoadOptions] = js.undefined
}
object FloatingInkLoadOptions {
  
  @scala.inline
  def apply(): FloatingInkLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatingInkLoadOptions]
  }
  
  @scala.inline
  implicit class FloatingInkLoadOptionsMutableBuilder[Self <: FloatingInkLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInkStrokes(value: InkStrokeCollectionLoadOptions): Self = StObject.set(x, "inkStrokes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInkStrokesUndefined: Self = StObject.set(x, "inkStrokes", js.undefined)
    
    @scala.inline
    def setPageContent(value: PageContentLoadOptions): Self = StObject.set(x, "pageContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageContentUndefined: Self = StObject.set(x, "pageContent", js.undefined)
  }
}
