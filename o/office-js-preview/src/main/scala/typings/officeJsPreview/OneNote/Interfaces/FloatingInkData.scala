package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `floatingInk.toJSON()`. */
trait FloatingInkData extends StObject {
  
  /**
    * Gets the ID of the FloatingInk object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the strokes of the FloatingInk object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var inkStrokes: js.UndefOr[js.Array[InkStrokeData]] = js.undefined
}
object FloatingInkData {
  
  inline def apply(): FloatingInkData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatingInkData]
  }
  
  extension [Self <: FloatingInkData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInkStrokes(value: js.Array[InkStrokeData]): Self = StObject.set(x, "inkStrokes", value.asInstanceOf[js.Any])
    
    inline def setInkStrokesUndefined: Self = StObject.set(x, "inkStrokes", js.undefined)
    
    inline def setInkStrokesVarargs(value: InkStrokeData*): Self = StObject.set(x, "inkStrokes", js.Array(value*))
  }
}
