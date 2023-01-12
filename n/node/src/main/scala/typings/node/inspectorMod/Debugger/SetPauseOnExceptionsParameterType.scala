package typings.node.inspectorMod.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetPauseOnExceptionsParameterType extends StObject {
  
  /**
    * Pause on exceptions mode.
    */
  var state: String
}
object SetPauseOnExceptionsParameterType {
  
  inline def apply(state: String): SetPauseOnExceptionsParameterType = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPauseOnExceptionsParameterType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetPauseOnExceptionsParameterType] (val x: Self) extends AnyVal {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
