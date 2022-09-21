package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single stroke of ink.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
trait InkStrokeLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the ID of the InkStroke object.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var floatingInk: js.UndefOr[FloatingInkLoadOptions] = js.undefined
  
  /**
    * Gets the ID of the InkStroke object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
}
object InkStrokeLoadOptions {
  
  inline def apply(): InkStrokeLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkStrokeLoadOptions]
  }
  
  extension [Self <: InkStrokeLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setFloatingInk(value: FloatingInkLoadOptions): Self = StObject.set(x, "floatingInk", value.asInstanceOf[js.Any])
    
    inline def setFloatingInkUndefined: Self = StObject.set(x, "floatingInk", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
