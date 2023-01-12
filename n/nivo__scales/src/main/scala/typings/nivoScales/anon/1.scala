package typings.nivoScales.anon

import typings.nivoScales.distTypesTypesMod.ScaleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[XValue /* <: ScaleValue */, YValue /* <: ScaleValue */] extends StObject {
  
  var data: js.Array[DataXY[XValue, YValue]]
}
object `1` {
  
  inline def apply[XValue /* <: ScaleValue */, YValue /* <: ScaleValue */](data: js.Array[DataXY[XValue, YValue]]): `1`[XValue, YValue] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`[XValue, YValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`[?, ?], XValue /* <: ScaleValue */, YValue /* <: ScaleValue */] (val x: Self & (`1`[XValue, YValue])) extends AnyVal {
    
    inline def setData(value: js.Array[DataXY[XValue, YValue]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: (DataXY[XValue, YValue])*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
