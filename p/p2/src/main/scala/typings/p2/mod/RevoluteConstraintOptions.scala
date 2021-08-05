package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevoluteConstraintOptions
  extends StObject
     with ConstraintOptions {
  
  var localPivotA: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var localPivotB: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var maxForce: js.UndefOr[Double] = js.undefined
  
  var worldPivot: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}
object RevoluteConstraintOptions {
  
  inline def apply(): RevoluteConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevoluteConstraintOptions]
  }
  
  extension [Self <: RevoluteConstraintOptions](x: Self) {
    
    inline def setLocalPivotA(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localPivotA", value.asInstanceOf[js.Any])
    
    inline def setLocalPivotAUndefined: Self = StObject.set(x, "localPivotA", js.undefined)
    
    inline def setLocalPivotB(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localPivotB", value.asInstanceOf[js.Any])
    
    inline def setLocalPivotBUndefined: Self = StObject.set(x, "localPivotB", js.undefined)
    
    inline def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
    
    inline def setMaxForceUndefined: Self = StObject.set(x, "maxForce", js.undefined)
    
    inline def setWorldPivot(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "worldPivot", value.asInstanceOf[js.Any])
    
    inline def setWorldPivotUndefined: Self = StObject.set(x, "worldPivot", js.undefined)
  }
}
