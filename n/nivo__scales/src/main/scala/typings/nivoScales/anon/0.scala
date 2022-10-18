package typings.nivoScales.anon

import typings.nivoScales.distTypesComputeMod.SerieDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[D /* <: SerieDatum */] extends StObject {
  
  var data: js.Array[DataD[D]]
}
object `0` {
  
  inline def apply[D /* <: SerieDatum */](data: js.Array[DataD[D]]): `0`[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[D]]
  }
  
  extension [Self <: `0`[?], D /* <: SerieDatum */](x: Self & `0`[D]) {
    
    inline def setData(value: js.Array[DataD[D]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: DataD[D]*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
