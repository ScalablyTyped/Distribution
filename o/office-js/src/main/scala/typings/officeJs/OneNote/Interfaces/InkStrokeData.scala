package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `inkStroke.toJSON()`. */
trait InkStrokeData extends StObject {
  
  /**
    * Gets the ID of the InkStroke object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var floatingInk: js.UndefOr[FloatingInkData] = js.undefined
  
  /**
    * Gets the ID of the InkStroke object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
}
object InkStrokeData {
  
  inline def apply(): InkStrokeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkStrokeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InkStrokeData] (val x: Self) extends AnyVal {
    
    inline def setFloatingInk(value: FloatingInkData): Self = StObject.set(x, "floatingInk", value.asInstanceOf[js.Any])
    
    inline def setFloatingInkUndefined: Self = StObject.set(x, "floatingInk", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
