package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileCoordinates extends StObject {
  
  /** Required. The x coordinate. */
  var x: js.UndefOr[Double] = js.undefined
  
  /** Required. The y coordinate. */
  var y: js.UndefOr[Double] = js.undefined
  
  /** Required. The Google Maps API zoom level. */
  var zoom: js.UndefOr[Double] = js.undefined
}
object TileCoordinates {
  
  inline def apply(): TileCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileCoordinates]
  }
  
  extension [Self <: TileCoordinates](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
