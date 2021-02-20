package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevoluteConstraintOptions extends ConstraintOptions {
  
  var localPivotA: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var localPivotB: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var maxForce: js.UndefOr[Double] = js.native
  
  var worldPivot: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}
object RevoluteConstraintOptions {
  
  @scala.inline
  def apply(): RevoluteConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevoluteConstraintOptions]
  }
  
  @scala.inline
  implicit class RevoluteConstraintOptionsMutableBuilder[Self <: RevoluteConstraintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalPivotA(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localPivotA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPivotAUndefined: Self = StObject.set(x, "localPivotA", js.undefined)
    
    @scala.inline
    def setLocalPivotB(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localPivotB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPivotBUndefined: Self = StObject.set(x, "localPivotB", js.undefined)
    
    @scala.inline
    def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxForceUndefined: Self = StObject.set(x, "maxForce", js.undefined)
    
    @scala.inline
    def setWorldPivot(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "worldPivot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldPivotUndefined: Self = StObject.set(x, "worldPivot", js.undefined)
  }
}
