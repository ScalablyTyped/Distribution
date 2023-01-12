package typings.nivoScales.anon

import typings.nivoScales.distTypesComputeMod.SerieDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[D /* <: SerieDatum */] extends StObject {
  
  var data: js.Array[D]
}
object Data {
  
  inline def apply[D /* <: SerieDatum */](data: js.Array[D]): Data[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data[?], D /* <: SerieDatum */] (val x: Self & Data[D]) extends AnyVal {
    
    inline def setData(value: js.Array[D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: D*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
