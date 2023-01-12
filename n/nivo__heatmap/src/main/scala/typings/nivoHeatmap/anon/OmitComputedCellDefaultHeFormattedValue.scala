package typings.nivoHeatmap.anon

import typings.nivoHeatmap.distTypesTypesMod.DefaultHeatMapDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@nivo/heatmap.@nivo/heatmap/dist/types/types.ComputedCell<@nivo/heatmap.@nivo/heatmap/dist/types/types.DefaultHeatMapDatum>, 'borderColor' | 'color' | 'opacity' | 'label' | 'labelTextColor'> */
trait OmitComputedCellDefaultHeFormattedValue extends StObject {
  
  var data: DefaultHeatMapDatum
  
  var formattedValue: js.UndefOr[String | Null] = js.undefined
  
  var height: Double
  
  var id: String
  
  var serieId: String
  
  var value: js.UndefOr[Double | Null] = js.undefined
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object OmitComputedCellDefaultHeFormattedValue {
  
  inline def apply(
    data: DefaultHeatMapDatum,
    height: Double,
    id: String,
    serieId: String,
    width: Double,
    x: Double,
    y: Double
  ): OmitComputedCellDefaultHeFormattedValue = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], serieId = serieId.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitComputedCellDefaultHeFormattedValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitComputedCellDefaultHeFormattedValue] (val x: Self) extends AnyVal {
    
    inline def setData(value: DefaultHeatMapDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setFormattedValueNull: Self = StObject.set(x, "formattedValue", null)
    
    inline def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSerieId(value: String): Self = StObject.set(x, "serieId", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
