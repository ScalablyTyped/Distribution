package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LockConstraintOptions extends ConstraintOptions {
  
  var localAngleB: js.UndefOr[Double] = js.native
  
  var localOffsetB: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var maxForce: js.UndefOr[Double] = js.native
}
object LockConstraintOptions {
  
  @scala.inline
  def apply(): LockConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockConstraintOptions]
  }
  
  @scala.inline
  implicit class LockConstraintOptionsMutableBuilder[Self <: LockConstraintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalAngleB(value: Double): Self = StObject.set(x, "localAngleB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAngleBUndefined: Self = StObject.set(x, "localAngleB", js.undefined)
    
    @scala.inline
    def setLocalOffsetB(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localOffsetB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalOffsetBUndefined: Self = StObject.set(x, "localOffsetB", js.undefined)
    
    @scala.inline
    def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxForceUndefined: Self = StObject.set(x, "maxForce", js.undefined)
  }
}
