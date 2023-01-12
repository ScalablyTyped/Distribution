package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a group of ink strokes.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
trait FloatingInkLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the ID of the FloatingInk object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the strokes of the FloatingInk object.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var inkStrokes: js.UndefOr[InkStrokeCollectionLoadOptions] = js.undefined
  
  /**
    * Gets the PageContent parent of the FloatingInk object.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var pageContent: js.UndefOr[PageContentLoadOptions] = js.undefined
}
object FloatingInkLoadOptions {
  
  inline def apply(): FloatingInkLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatingInkLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FloatingInkLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInkStrokes(value: InkStrokeCollectionLoadOptions): Self = StObject.set(x, "inkStrokes", value.asInstanceOf[js.Any])
    
    inline def setInkStrokesUndefined: Self = StObject.set(x, "inkStrokes", js.undefined)
    
    inline def setPageContent(value: PageContentLoadOptions): Self = StObject.set(x, "pageContent", value.asInstanceOf[js.Any])
    
    inline def setPageContentUndefined: Self = StObject.set(x, "pageContent", js.undefined)
  }
}
