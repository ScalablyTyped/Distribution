package typings.node.inspectorMod.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetPauseOnExceptionsParameterType extends StObject {
  
  /**
    * Pause on exceptions mode.
    */
  var state: String = js.native
}
object SetPauseOnExceptionsParameterType {
  
  @scala.inline
  def apply(state: String): SetPauseOnExceptionsParameterType = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPauseOnExceptionsParameterType]
  }
  
  @scala.inline
  implicit class SetPauseOnExceptionsParameterTypeMutableBuilder[Self <: SetPauseOnExceptionsParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
