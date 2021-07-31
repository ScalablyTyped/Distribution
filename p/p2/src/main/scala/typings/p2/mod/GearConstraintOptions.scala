package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GearConstraintOptions
  extends StObject
     with ConstraintOptions {
  
  var angle: js.UndefOr[Double] = js.undefined
  
  var maxTorque: js.UndefOr[Double] = js.undefined
  
  var ratio: js.UndefOr[Double] = js.undefined
}
object GearConstraintOptions {
  
  @scala.inline
  def apply(): GearConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GearConstraintOptions]
  }
  
  @scala.inline
  implicit class GearConstraintOptionsMutableBuilder[Self <: GearConstraintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setMaxTorque(value: Double): Self = StObject.set(x, "maxTorque", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTorqueUndefined: Self = StObject.set(x, "maxTorque", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
  }
}
