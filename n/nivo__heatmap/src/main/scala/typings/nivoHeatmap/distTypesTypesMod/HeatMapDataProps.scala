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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeatMapDataProps[?, ?], Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */] (val x: Self & (HeatMapDataProps[Datum, ExtraProps])) extends AnyVal {
    
    inline def setData(value: js.Array[HeatMapSerie[Datum, ExtraProps]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: (HeatMapSerie[Datum, ExtraProps])*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
