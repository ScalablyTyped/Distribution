package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "floatingInk.toJSON()". */
trait FloatingInkData extends StObject {
  
  /**
    *
    * Gets the ID of the FloatingInk object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the strokes of the FloatingInk object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkStrokes: js.UndefOr[js.Array[InkStrokeData]] = js.undefined
}
object FloatingInkData {
  
  @scala.inline
  def apply(): FloatingInkData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatingInkData]
  }
  
  @scala.inline
  implicit class FloatingInkDataMutableBuilder[Self <: FloatingInkData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInkStrokes(value: js.Array[InkStrokeData]): Self = StObject.set(x, "inkStrokes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInkStrokesUndefined: Self = StObject.set(x, "inkStrokes", js.undefined)
    
    @scala.inline
    def setInkStrokesVarargs(value: InkStrokeData*): Self = StObject.set(x, "inkStrokes", js.Array(value :_*))
  }
}
