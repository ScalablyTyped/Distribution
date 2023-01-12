package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SolverOptions extends StObject {
  
  var equationSortFunction: js.UndefOr[Equation] = js.undefined
}
object SolverOptions {
  
  inline def apply(): SolverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SolverOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SolverOptions] (val x: Self) extends AnyVal {
    
    inline def setEquationSortFunction(value: Equation): Self = StObject.set(x, "equationSortFunction", value.asInstanceOf[js.Any])
    
    inline def setEquationSortFunctionUndefined: Self = StObject.set(x, "equationSortFunction", js.undefined)
  }
}
