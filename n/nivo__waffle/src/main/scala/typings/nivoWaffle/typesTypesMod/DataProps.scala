package typings.nivoWaffle.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProps[RawDatum /* <: Datum */] extends StObject {
  
  var columns: Double
  
  var data: js.Array[RawDatum]
  
  var rows: Double
  
  var total: Double
}
object DataProps {
  
  inline def apply[RawDatum /* <: Datum */](columns: Double, data: js.Array[RawDatum], rows: Double, total: Double): DataProps[RawDatum] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProps[RawDatum]]
  }
  
  extension [Self <: DataProps[?], RawDatum /* <: Datum */](x: Self & DataProps[RawDatum]) {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[RawDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: RawDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
