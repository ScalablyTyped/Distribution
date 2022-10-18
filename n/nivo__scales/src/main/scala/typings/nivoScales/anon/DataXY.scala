package typings.nivoScales.anon

import typings.nivoScales.distTypesTypesMod.ScaleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataXY[XValue /* <: ScaleValue */, YValue /* <: ScaleValue */] extends StObject {
  
  var data: XY[XValue, YValue]
}
object DataXY {
  
  inline def apply[XValue /* <: ScaleValue */, YValue /* <: ScaleValue */](data: XY[XValue, YValue]): DataXY[XValue, YValue] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataXY[XValue, YValue]]
  }
  
  extension [Self <: DataXY[?, ?], XValue /* <: ScaleValue */, YValue /* <: ScaleValue */](x: Self & (DataXY[XValue, YValue])) {
    
    inline def setData(value: XY[XValue, YValue]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
