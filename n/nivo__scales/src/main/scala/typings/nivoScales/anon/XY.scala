package typings.nivoScales.anon

import typings.nivoScales.distTypesTypesMod.ScaleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XY[XValue /* <: ScaleValue */, YValue /* <: ScaleValue */] extends StObject {
  
  var x: XValue | Null
  
  var y: YValue | Null
}
object XY {
  
  inline def apply[XValue /* <: ScaleValue */, YValue /* <: ScaleValue */](): XY[XValue, YValue] = {
    val __obj = js.Dynamic.literal(x = null, y = null)
    __obj.asInstanceOf[XY[XValue, YValue]]
  }
  
  extension [Self <: XY[?, ?], XValue /* <: ScaleValue */, YValue /* <: ScaleValue */](x: Self & (XY[XValue, YValue])) {
    
    inline def setX(value: XValue): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
    
    inline def setY(value: YValue): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
  }
}
