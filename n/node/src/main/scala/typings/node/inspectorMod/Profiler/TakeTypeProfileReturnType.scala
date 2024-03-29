package typings.node.inspectorMod.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakeTypeProfileReturnType extends StObject {
  
  /**
    * Type profile for all scripts since startTypeProfile() was turned on.
    */
  var result: js.Array[ScriptTypeProfile]
}
object TakeTypeProfileReturnType {
  
  inline def apply(result: js.Array[ScriptTypeProfile]): TakeTypeProfileReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeTypeProfileReturnType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TakeTypeProfileReturnType] (val x: Self) extends AnyVal {
    
    inline def setResult(value: js.Array[ScriptTypeProfile]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: ScriptTypeProfile*): Self = StObject.set(x, "result", js.Array(value*))
  }
}
