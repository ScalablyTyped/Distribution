package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WheelConstraintOptions extends StObject {
  
  var localForwardVector: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var localPosition: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var sideFriction: js.UndefOr[Double] = js.undefined
}
object WheelConstraintOptions {
  
  @scala.inline
  def apply(): WheelConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WheelConstraintOptions]
  }
  
  @scala.inline
  implicit class WheelConstraintOptionsMutableBuilder[Self <: WheelConstraintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalForwardVector(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localForwardVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalForwardVectorUndefined: Self = StObject.set(x, "localForwardVector", js.undefined)
    
    @scala.inline
    def setLocalPosition(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPositionUndefined: Self = StObject.set(x, "localPosition", js.undefined)
    
    @scala.inline
    def setSideFriction(value: Double): Self = StObject.set(x, "sideFriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideFrictionUndefined: Self = StObject.set(x, "sideFriction", js.undefined)
  }
}
