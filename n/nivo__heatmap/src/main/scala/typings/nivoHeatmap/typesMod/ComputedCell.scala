package typings.nivoHeatmap.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedCell[Datum /* <: HeatMapDatum */] extends StObject {
  
  var borderColor: String
  
  var color: String
  
  var data: Datum
  
  var formattedValue: String | Null
  
  var height: Double
  
  var id: String
  
  var label: String
  
  var labelTextColor: String
  
  var opacity: Double
  
  var serieId: String
  
  var value: Double | Null
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object ComputedCell {
  
  inline def apply[Datum /* <: HeatMapDatum */](
    borderColor: String,
    color: String,
    data: Datum,
    height: Double,
    id: String,
    label: String,
    labelTextColor: String,
    opacity: Double,
    serieId: String,
    width: Double,
    x: Double,
    y: Double
  ): ComputedCell[Datum] = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelTextColor = labelTextColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], serieId = serieId.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], formattedValue = null, value = null)
    __obj.asInstanceOf[ComputedCell[Datum]]
  }
  
  extension [Self <: ComputedCell[?], Datum /* <: HeatMapDatum */](x: Self & ComputedCell[Datum]) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setData(value: Datum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setFormattedValueNull: Self = StObject.set(x, "formattedValue", null)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelTextColor(value: String): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setSerieId(value: String): Self = StObject.set(x, "serieId", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
