package typings.node.inspectorMod.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSkipAllPausesParameterType extends StObject {
  
  /**
    * New value for skip pauses state.
    */
  var skip: Boolean
}
object SetSkipAllPausesParameterType {
  
  inline def apply(skip: Boolean): SetSkipAllPausesParameterType = {
    val __obj = js.Dynamic.literal(skip = skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSkipAllPausesParameterType]
  }
  
  extension [Self <: SetSkipAllPausesParameterType](x: Self) {
    
    inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
  }
}
