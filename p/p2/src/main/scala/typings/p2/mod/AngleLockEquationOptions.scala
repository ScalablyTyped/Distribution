package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AngleLockEquationOptions extends StObject {
  
  var angle: js.UndefOr[Double] = js.native
  
  var ratio: js.UndefOr[Double] = js.native
}
object AngleLockEquationOptions {
  
  @scala.inline
  def apply(): AngleLockEquationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AngleLockEquationOptions]
  }
  
  @scala.inline
  implicit class AngleLockEquationOptionsMutableBuilder[Self <: AngleLockEquationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
  }
}
