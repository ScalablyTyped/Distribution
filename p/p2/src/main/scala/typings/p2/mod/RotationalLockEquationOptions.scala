package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationalLockEquationOptions extends StObject {
  
  var angle: js.UndefOr[Double] = js.undefined
}
object RotationalLockEquationOptions {
  
  inline def apply(): RotationalLockEquationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotationalLockEquationOptions]
  }
  
  extension [Self <: RotationalLockEquationOptions](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
  }
}
