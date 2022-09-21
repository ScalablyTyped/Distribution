package typings.nivoHeatmap.anon

import typings.nivoHeatmap.typesMod.DefaultHeatMapDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@nivo/heatmap.@nivo/heatmap/dist/types/types.ComputedCell<@nivo/heatmap.@nivo/heatmap/dist/types/types.DefaultHeatMapDatum>, 'labelTextColor'> */
trait OmitComputedCellDefaultHe extends StObject {
  
  var borderColor: String
  
  var color: String
  
  var data: DefaultHeatMapDatum
  
  var formattedValue: js.UndefOr[String | Null] = js.undefined
  
  var height: Double
  
  var id: String
  
  var label: String
  
  var opacity: Double
  
  var serieId: String
  
  var value: js.UndefOr[Double | Null] = js.undefined
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object OmitComputedCellDefaultHe {
  
  inline def apply(
    borderColor: String,
    color: String,
    data: DefaultHeatMapDatum,
    height: Double,
    id: String,
    label: String,
    opacity: Double,
    serieId: String,
    width: Double,
    x: Double,
    y: Double
  ): OmitComputedCellDefaultHe = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], serieId = serieId.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitComputedCellDefaultHe]
  }
  
  extension [Self <: OmitComputedCellDefaultHe](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setData(value: DefaultHeatMapDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setFormattedValueNull: Self = StObject.set(x, "formattedValue", null)
    
    inline def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setSerieId(value: String): Self = StObject.set(x, "serieId", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
