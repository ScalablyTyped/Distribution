package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LockConstraintOptions
  extends StObject
     with ConstraintOptions {
  
  var localAngleB: js.UndefOr[Double] = js.undefined
  
  var localOffsetB: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var maxForce: js.UndefOr[Double] = js.undefined
}
object LockConstraintOptions {
  
  inline def apply(): LockConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockConstraintOptions]
  }
  
  extension [Self <: LockConstraintOptions](x: Self) {
    
    inline def setLocalAngleB(value: Double): Self = StObject.set(x, "localAngleB", value.asInstanceOf[js.Any])
    
    inline def setLocalAngleBUndefined: Self = StObject.set(x, "localAngleB", js.undefined)
    
    inline def setLocalOffsetB(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localOffsetB", value.asInstanceOf[js.Any])
    
    inline def setLocalOffsetBUndefined: Self = StObject.set(x, "localOffsetB", js.undefined)
    
    inline def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
    
    inline def setMaxForceUndefined: Self = StObject.set(x, "maxForce", js.undefined)
  }
}
