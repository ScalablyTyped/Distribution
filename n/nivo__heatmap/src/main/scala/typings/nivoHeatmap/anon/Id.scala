package typings.nivoHeatmap.anon

import typings.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id[Datum /* <: HeatMapDatum */] extends StObject {
  
  var data: js.Array[Datum]
  
  var id: String
}
object Id {
  
  inline def apply[Datum /* <: HeatMapDatum */](data: js.Array[Datum], id: String): Id[Datum] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id[Datum]]
  }
  
  extension [Self <: Id[?], Datum /* <: HeatMapDatum */](x: Self & Id[Datum]) {
    
    inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
