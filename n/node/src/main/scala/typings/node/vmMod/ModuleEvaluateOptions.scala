package typings.node.vmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleEvaluateOptions extends StObject {
  
  var breakOnSigint: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object ModuleEvaluateOptions {
  
  inline def apply(): ModuleEvaluateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleEvaluateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleEvaluateOptions] (val x: Self) extends AnyVal {
    
    inline def setBreakOnSigint(value: Boolean): Self = StObject.set(x, "breakOnSigint", value.asInstanceOf[js.Any])
    
    inline def setBreakOnSigintUndefined: Self = StObject.set(x, "breakOnSigint", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
