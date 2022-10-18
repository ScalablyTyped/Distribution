package typings.nivoHeatmap.anon

import typings.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typings.nivoHeatmap.distTypesTypesMod.HeatMapSerie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */] extends StObject {
  
  var data: js.Array[HeatMapSerie[Datum, ExtraProps]]
  
  var height: Double
  
  var width: Double
}
object Data {
  
  inline def apply[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](data: js.Array[HeatMapSerie[Datum, ExtraProps]], height: Double, width: Double): Data[Datum, ExtraProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[Datum, ExtraProps]]
  }
  
  extension [Self <: Data[?, ?], Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](x: Self & (Data[Datum, ExtraProps])) {
    
    inline def setData(value: js.Array[HeatMapSerie[Datum, ExtraProps]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: (HeatMapSerie[Datum, ExtraProps])*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
