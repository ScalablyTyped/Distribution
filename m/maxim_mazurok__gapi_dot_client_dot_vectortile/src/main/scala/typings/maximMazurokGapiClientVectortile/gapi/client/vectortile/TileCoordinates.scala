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
  
  @scala.inline
  def apply(): TileCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileCoordinates]
  }
  
  @scala.inline
  implicit class TileCoordinatesMutableBuilder[Self <: TileCoordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
