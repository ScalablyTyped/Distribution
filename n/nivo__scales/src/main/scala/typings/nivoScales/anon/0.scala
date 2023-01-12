package typings.nivoScales.anon

import typings.nivoScales.distTypesComputeMod.SerieDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[D /* <: SerieDatum */] extends StObject {
  
  var data: js.Array[Position[D]]
}
object `0` {
  
  inline def apply[D /* <: SerieDatum */](data: js.Array[Position[D]]): `0`[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`[?], D /* <: SerieDatum */] (val x: Self & `0`[D]) extends AnyVal {
    
    inline def setData(value: js.Array[Position[D]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Position[D]*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
