package typings.nivoHeatmap.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatMapDataProps[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */] extends StObject {
  
  var data: js.Array[HeatMapSerie[Datum, ExtraProps]]
}
object HeatMapDataProps {
  
  inline def apply[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](data: js.Array[HeatMapSerie[Datum, ExtraProps]]): HeatMapDataProps[Datum, ExtraProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapDataProps[Datum, ExtraProps]]
  }
  
  extension [Self <: HeatMapDataProps[?, ?], Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](x: Self & (HeatMapDataProps[Datum, ExtraProps])) {
    
    inline def setData(value: js.Array[HeatMapSerie[Datum, ExtraProps]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: (HeatMapSerie[Datum, ExtraProps])*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
