package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationalLockEquationOptions extends StObject {
  
  var angle: js.UndefOr[Double] = js.undefined
}
object RotationalLockEquationOptions {
  
  @scala.inline
  def apply(): RotationalLockEquationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotationalLockEquationOptions]
  }
  
  @scala.inline
  implicit class RotationalLockEquationOptionsMutableBuilder[Self <: RotationalLockEquationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
  }
}
