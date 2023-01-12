package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceConstraintOptions
  extends StObject
     with ConstraintOptions {
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var localAnchorA: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var localAnchorB: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var maxForce: js.UndefOr[Double] = js.undefined
}
object DistanceConstraintOptions {
  
  inline def apply(): DistanceConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceConstraintOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistanceConstraintOptions] (val x: Self) extends AnyVal {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setLocalAnchorA(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localAnchorA", value.asInstanceOf[js.Any])
    
    inline def setLocalAnchorAUndefined: Self = StObject.set(x, "localAnchorA", js.undefined)
    
    inline def setLocalAnchorB(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localAnchorB", value.asInstanceOf[js.Any])
    
    inline def setLocalAnchorBUndefined: Self = StObject.set(x, "localAnchorB", js.undefined)
    
    inline def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
    
    inline def setMaxForceUndefined: Self = StObject.set(x, "maxForce", js.undefined)
  }
}
