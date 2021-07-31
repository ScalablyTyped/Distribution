package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrismaticConstraintOptions
  extends StObject
     with ConstraintOptions {
  
  var disableRotationalLock: js.UndefOr[Boolean] = js.undefined
  
  var localAnchorA: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var localAnchorB: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var localAxisA: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var lowerLimit: js.UndefOr[Double] = js.undefined
  
  var maxForce: js.UndefOr[Double] = js.undefined
  
  var upperLimit: js.UndefOr[Double] = js.undefined
}
object PrismaticConstraintOptions {
  
  @scala.inline
  def apply(): PrismaticConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrismaticConstraintOptions]
  }
  
  @scala.inline
  implicit class PrismaticConstraintOptionsMutableBuilder[Self <: PrismaticConstraintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableRotationalLock(value: Boolean): Self = StObject.set(x, "disableRotationalLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableRotationalLockUndefined: Self = StObject.set(x, "disableRotationalLock", js.undefined)
    
    @scala.inline
    def setLocalAnchorA(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localAnchorA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAnchorAUndefined: Self = StObject.set(x, "localAnchorA", js.undefined)
    
    @scala.inline
    def setLocalAnchorB(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localAnchorB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAnchorBUndefined: Self = StObject.set(x, "localAnchorB", js.undefined)
    
    @scala.inline
    def setLocalAxisA(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localAxisA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAxisAUndefined: Self = StObject.set(x, "localAxisA", js.undefined)
    
    @scala.inline
    def setLowerLimit(value: Double): Self = StObject.set(x, "lowerLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerLimitUndefined: Self = StObject.set(x, "lowerLimit", js.undefined)
    
    @scala.inline
    def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxForceUndefined: Self = StObject.set(x, "maxForce", js.undefined)
    
    @scala.inline
    def setUpperLimit(value: Double): Self = StObject.set(x, "upperLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperLimitUndefined: Self = StObject.set(x, "upperLimit", js.undefined)
  }
}
