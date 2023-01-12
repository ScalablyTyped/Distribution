package typings.node.inspectorMod.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakePreciseCoverageReturnType extends StObject {
  
  /**
    * Coverage data for the current isolate.
    */
  var result: js.Array[ScriptCoverage]
}
object TakePreciseCoverageReturnType {
  
  inline def apply(result: js.Array[ScriptCoverage]): TakePreciseCoverageReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakePreciseCoverageReturnType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TakePreciseCoverageReturnType] (val x: Self) extends AnyVal {
    
    inline def setResult(value: js.Array[ScriptCoverage]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: ScriptCoverage*): Self = StObject.set(x, "result", js.Array(value*))
  }
}
