package typings.nivoScales.anon

import typings.nivoScales.distTypesTypesMod.ScaleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`[XValue /* <: ScaleValue */, YValue /* <: ScaleValue */] extends StObject {
  
  var data: js.Array[DataXY[XValue, YValue]]
}
object `3` {
  
  inline def apply[XValue /* <: ScaleValue */, YValue /* <: ScaleValue */](data: js.Array[DataXY[XValue, YValue]]): `3`[XValue, YValue] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`[XValue, YValue]]
  }
  
  extension [Self <: `3`[?, ?], XValue /* <: ScaleValue */, YValue /* <: ScaleValue */](x: Self & (`3`[XValue, YValue])) {
    
    inline def setData(value: js.Array[DataXY[XValue, YValue]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: (DataXY[XValue, YValue])*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
