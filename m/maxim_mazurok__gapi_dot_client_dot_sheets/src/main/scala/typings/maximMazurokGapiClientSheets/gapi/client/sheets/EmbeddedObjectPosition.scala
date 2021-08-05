package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbeddedObjectPosition extends StObject {
  
  /** If true, the embedded object is put on a new sheet whose ID is chosen for you. Used only when writing. */
  var newSheet: js.UndefOr[Boolean] = js.undefined
  
  /** The position at which the object is overlaid on top of a grid. */
  var overlayPosition: js.UndefOr[OverlayPosition] = js.undefined
  
  /** The sheet this is on. Set only if the embedded object is on its own sheet. Must be non-negative. */
  var sheetId: js.UndefOr[Double] = js.undefined
}
object EmbeddedObjectPosition {
  
  inline def apply(): EmbeddedObjectPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedObjectPosition]
  }
  
  extension [Self <: EmbeddedObjectPosition](x: Self) {
    
    inline def setNewSheet(value: Boolean): Self = StObject.set(x, "newSheet", value.asInstanceOf[js.Any])
    
    inline def setNewSheetUndefined: Self = StObject.set(x, "newSheet", js.undefined)
    
    inline def setOverlayPosition(value: OverlayPosition): Self = StObject.set(x, "overlayPosition", value.asInstanceOf[js.Any])
    
    inline def setOverlayPositionUndefined: Self = StObject.set(x, "overlayPosition", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
