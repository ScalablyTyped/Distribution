package typings.nivoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartesianMarkersProps[X /* <: DatumValue */, Y /* <: DatumValue */] extends StObject {
  
  var height: Double
  
  var markers: js.Array[CartesianMarkerProps[X | Y]]
  
  var width: Double
  
  def xScale(value: X): Double
  
  def yScale(value: Y): Double
}
object CartesianMarkersProps {
  
  inline def apply[X /* <: DatumValue */, Y /* <: DatumValue */](
    height: Double,
    markers: js.Array[CartesianMarkerProps[X | Y]],
    width: Double,
    xScale: X => Double,
    yScale: Y => Double
  ): CartesianMarkersProps[X, Y] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xScale = js.Any.fromFunction1(xScale), yScale = js.Any.fromFunction1(yScale))
    __obj.asInstanceOf[CartesianMarkersProps[X, Y]]
  }
  
  extension [Self <: CartesianMarkersProps[?, ?], X /* <: DatumValue */, Y /* <: DatumValue */](x: Self & (CartesianMarkersProps[X, Y])) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMarkers(value: js.Array[CartesianMarkerProps[X | Y]]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersVarargs(value: (CartesianMarkerProps[X | Y])*): Self = StObject.set(x, "markers", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setXScale(value: X => Double): Self = StObject.set(x, "xScale", js.Any.fromFunction1(value))
    
    inline def setYScale(value: Y => Double): Self = StObject.set(x, "yScale", js.Any.fromFunction1(value))
  }
}
