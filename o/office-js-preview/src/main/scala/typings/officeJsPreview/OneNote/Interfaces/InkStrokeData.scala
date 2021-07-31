package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "inkStroke.toJSON()". */
trait InkStrokeData extends StObject {
  
  /**
    *
    * Gets the ID of the InkStroke object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var floatingInk: js.UndefOr[FloatingInkData] = js.undefined
  
  /**
    *
    * Gets the ID of the InkStroke object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
}
object InkStrokeData {
  
  @scala.inline
  def apply(): InkStrokeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkStrokeData]
  }
  
  @scala.inline
  implicit class InkStrokeDataMutableBuilder[Self <: InkStrokeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloatingInk(value: FloatingInkData): Self = StObject.set(x, "floatingInk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingInkUndefined: Self = StObject.set(x, "floatingInk", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
