package typings.nivoScales.anon

import typings.nivoScales.distTypesTypesMod.ScaleAxis
import typings.nivoScales.distTypesTypesMod.ScaleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[Axis /* <: ScaleAxis */, Value /* <: ScaleValue */] extends StObject {
  
  var data: js.Array[DataRecord[Axis, Value]]
}
object `2` {
  
  inline def apply[Axis /* <: ScaleAxis */, Value /* <: ScaleValue */](data: js.Array[DataRecord[Axis, Value]]): `2`[Axis, Value] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`[Axis, Value]]
  }
  
  extension [Self <: `2`[?, ?], Axis /* <: ScaleAxis */, Value /* <: ScaleValue */](x: Self & (`2`[Axis, Value])) {
    
    inline def setData(value: js.Array[DataRecord[Axis, Value]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: (DataRecord[Axis, Value])*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
