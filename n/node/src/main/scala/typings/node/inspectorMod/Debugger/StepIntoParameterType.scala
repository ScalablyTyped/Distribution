package typings.node.inspectorMod.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepIntoParameterType extends StObject {
  
  /**
    * Debugger will issue additional Debugger.paused notification if any async task is scheduled before next pause.
    * @experimental
    */
  var breakOnAsyncCall: js.UndefOr[Boolean] = js.undefined
}
object StepIntoParameterType {
  
  inline def apply(): StepIntoParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepIntoParameterType]
  }
  
  extension [Self <: StepIntoParameterType](x: Self) {
    
    inline def setBreakOnAsyncCall(value: Boolean): Self = StObject.set(x, "breakOnAsyncCall", value.asInstanceOf[js.Any])
    
    inline def setBreakOnAsyncCallUndefined: Self = StObject.set(x, "breakOnAsyncCall", js.undefined)
  }
}
