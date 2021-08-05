package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayPosition extends StObject {
  
  /** The cell the object is anchored to. */
  var anchorCell: js.UndefOr[GridCoordinate] = js.undefined
  
  /** The height of the object, in pixels. Defaults to 371. */
  var heightPixels: js.UndefOr[Double] = js.undefined
  
  /** The horizontal offset, in pixels, that the object is offset from the anchor cell. */
  var offsetXPixels: js.UndefOr[Double] = js.undefined
  
  /** The vertical offset, in pixels, that the object is offset from the anchor cell. */
  var offsetYPixels: js.UndefOr[Double] = js.undefined
  
  /** The width of the object, in pixels. Defaults to 600. */
  var widthPixels: js.UndefOr[Double] = js.undefined
}
object OverlayPosition {
  
  inline def apply(): OverlayPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayPosition]
  }
  
  extension [Self <: OverlayPosition](x: Self) {
    
    inline def setAnchorCell(value: GridCoordinate): Self = StObject.set(x, "anchorCell", value.asInstanceOf[js.Any])
    
    inline def setAnchorCellUndefined: Self = StObject.set(x, "anchorCell", js.undefined)
    
    inline def setHeightPixels(value: Double): Self = StObject.set(x, "heightPixels", value.asInstanceOf[js.Any])
    
    inline def setHeightPixelsUndefined: Self = StObject.set(x, "heightPixels", js.undefined)
    
    inline def setOffsetXPixels(value: Double): Self = StObject.set(x, "offsetXPixels", value.asInstanceOf[js.Any])
    
    inline def setOffsetXPixelsUndefined: Self = StObject.set(x, "offsetXPixels", js.undefined)
    
    inline def setOffsetYPixels(value: Double): Self = StObject.set(x, "offsetYPixels", value.asInstanceOf[js.Any])
    
    inline def setOffsetYPixelsUndefined: Self = StObject.set(x, "offsetYPixels", js.undefined)
    
    inline def setWidthPixels(value: Double): Self = StObject.set(x, "widthPixels", value.asInstanceOf[js.Any])
    
    inline def setWidthPixelsUndefined: Self = StObject.set(x, "widthPixels", js.undefined)
  }
}
