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
  
  inline def apply(): WheelConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WheelConstraintOptions]
  }
  
  extension [Self <: WheelConstraintOptions](x: Self) {
    
    inline def setLocalForwardVector(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localForwardVector", value.asInstanceOf[js.Any])
    
    inline def setLocalForwardVectorUndefined: Self = StObject.set(x, "localForwardVector", js.undefined)
    
    inline def setLocalPosition(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localPosition", value.asInstanceOf[js.Any])
    
    inline def setLocalPositionUndefined: Self = StObject.set(x, "localPosition", js.undefined)
    
    inline def setSideFriction(value: Double): Self = StObject.set(x, "sideFriction", value.asInstanceOf[js.Any])
    
    inline def setSideFrictionUndefined: Self = StObject.set(x, "sideFriction", js.undefined)
  }
}
