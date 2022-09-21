package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GSSolverOptions
  extends StObject
     with SolverOptions {
  
  var frictionIterations: js.UndefOr[Double] = js.undefined
  
  var iterations: js.UndefOr[Double] = js.undefined
  
  var tolerance: js.UndefOr[Double] = js.undefined
}
object GSSolverOptions {
  
  inline def apply(): GSSolverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GSSolverOptions]
  }
  
  extension [Self <: GSSolverOptions](x: Self) {
    
    inline def setFrictionIterations(value: Double): Self = StObject.set(x, "frictionIterations", value.asInstanceOf[js.Any])
    
    inline def setFrictionIterationsUndefined: Self = StObject.set(x, "frictionIterations", js.undefined)
    
    inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
  }
}
