package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureOptions extends StObject {
  
  /**
    * A relative filename from the screenshot directory to save the capture as.
    * By default, the filename will be automatically generated using the system date and time.
    */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
    * Height of the capture in pixels.
    * Do not set if you would like a giant screenshot.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Map position to centre the view on in map units.
    * Do not set if you would like a giant screenshot.
    */
  var position: js.UndefOr[CoordsXY] = js.undefined
  
  /**
    * Rotation of the camera from 0 to 3.
    */
  var rotation: Double
  
  /**
    * Whether to enable transparency in the screenshot.
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Width of the capture in pixels.
    * Do not set if you would like a giant screenshot.
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * The zoom level, 0 is 1:1, 1 is 2:1, 2 is 4:1 etc.
    */
  var zoom: Double
}
object CaptureOptions {
  
  inline def apply(rotation: Double, zoom: Double): CaptureOptions = {
    val __obj = js.Dynamic.literal(rotation = rotation.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureOptions]
  }
  
  extension [Self <: CaptureOptions](x: Self) {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPosition(value: CoordsXY): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
