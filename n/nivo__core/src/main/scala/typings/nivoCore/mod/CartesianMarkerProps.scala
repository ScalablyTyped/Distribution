package typings.nivoCore.mod

import typings.nivoCore.anon.PartialCSSProperties
import typings.nivoCore.nivoCoreStrings.horizontal
import typings.nivoCore.nivoCoreStrings.vertical
import typings.nivoCore.nivoCoreStrings.x
import typings.nivoCore.nivoCoreStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartesianMarkerProps[V /* <: DatumValue */] extends StObject {
  
  var axis: x | y
  
  var legend: js.UndefOr[String] = js.undefined
  
  var legendOrientation: js.UndefOr[horizontal | vertical] = js.undefined
  
  var legendPosition: js.UndefOr[BoxAlign] = js.undefined
  
  var lineStyle: js.UndefOr[PartialCSSProperties] = js.undefined
  
  var textStyle: js.UndefOr[PartialCSSProperties] = js.undefined
  
  var value: V
}
object CartesianMarkerProps {
  
  inline def apply[V /* <: DatumValue */](axis: x | y, value: V): CartesianMarkerProps[V] = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartesianMarkerProps[V]]
  }
  
  extension [Self <: CartesianMarkerProps[?], V /* <: DatumValue */](x: Self & CartesianMarkerProps[V]) {
    
    inline def setAxis(value: typings.nivoCore.nivoCoreStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setLegend(value: String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendOrientation(value: horizontal | vertical): Self = StObject.set(x, "legendOrientation", value.asInstanceOf[js.Any])
    
    inline def setLegendOrientationUndefined: Self = StObject.set(x, "legendOrientation", js.undefined)
    
    inline def setLegendPosition(value: BoxAlign): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
    
    inline def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setLineStyle(value: PartialCSSProperties): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setTextStyle(value: PartialCSSProperties): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
