package typings.nivoScales.anon

import typings.nivoScales.distTypesComputeMod.SerieDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[D /* <: SerieDatum */] extends StObject {
  
  var data: js.Array[D]
}
object `1` {
  
  inline def apply[D /* <: SerieDatum */](data: js.Array[D]): `1`[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`[D]]
  }
  
  extension [Self <: `1`[?], D /* <: SerieDatum */](x: Self & `1`[D]) {
    
    inline def setData(value: js.Array[D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: D*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
