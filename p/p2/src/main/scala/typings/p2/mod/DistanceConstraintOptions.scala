package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceConstraintOptions extends ConstraintOptions {
  
  var distance: js.UndefOr[Double] = js.native
  
  var localAnchorA: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var localAnchorB: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var maxForce: js.UndefOr[Double] = js.native
}
object DistanceConstraintOptions {
  
  @scala.inline
  def apply(): DistanceConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceConstraintOptions]
  }
  
  @scala.inline
  implicit class DistanceConstraintOptionsMutableBuilder[Self <: DistanceConstraintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setLocalAnchorA(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localAnchorA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAnchorAUndefined: Self = StObject.set(x, "localAnchorA", js.undefined)
    
    @scala.inline
    def setLocalAnchorB(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localAnchorB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAnchorBUndefined: Self = StObject.set(x, "localAnchorB", js.undefined)
    
    @scala.inline
    def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxForceUndefined: Self = StObject.set(x, "maxForce", js.undefined)
  }
}
