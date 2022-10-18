package typings.nivoScales.anon

import typings.nivoScales.distTypesTypesMod.ScaleAxis
import typings.nivoScales.distTypesTypesMod.ScaleValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRecord[Axis /* <: ScaleAxis */, Value /* <: ScaleValue */] extends StObject {
  
  var data: Record[Axis, Value | Null]
}
object DataRecord {
  
  inline def apply[Axis /* <: ScaleAxis */, Value /* <: ScaleValue */](data: Record[Axis, Value | Null]): DataRecord[Axis, Value] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRecord[Axis, Value]]
  }
  
  extension [Self <: DataRecord[?, ?], Axis /* <: ScaleAxis */, Value /* <: ScaleValue */](x: Self & (DataRecord[Axis, Value])) {
    
    inline def setData(value: Record[Axis, Value | Null]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
