package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GSSolverOptions extends StObject {
  
  var iterations: js.UndefOr[Double] = js.undefined
  
  var tolerance: js.UndefOr[Double] = js.undefined
}
object GSSolverOptions {
  
  @scala.inline
  def apply(): GSSolverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GSSolverOptions]
  }
  
  @scala.inline
  implicit class GSSolverOptionsMutableBuilder[Self <: GSSolverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    @scala.inline
    def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
  }
}
