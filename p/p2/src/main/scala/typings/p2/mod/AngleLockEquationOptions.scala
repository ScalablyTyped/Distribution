package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AngleLockEquationOptions extends StObject {
  
  var angle: js.UndefOr[Double] = js.undefined
  
  var ratio: js.UndefOr[Double] = js.undefined
}
object AngleLockEquationOptions {
  
  inline def apply(): AngleLockEquationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AngleLockEquationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AngleLockEquationOptions] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
  }
}
