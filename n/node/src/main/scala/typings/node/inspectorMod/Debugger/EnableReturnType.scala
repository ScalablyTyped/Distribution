package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.UniqueDebuggerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableReturnType extends StObject {
  
  /**
    * Unique identifier of the debugger.
    * @experimental
    */
  var debuggerId: UniqueDebuggerId
}
object EnableReturnType {
  
  @scala.inline
  def apply(debuggerId: UniqueDebuggerId): EnableReturnType = {
    val __obj = js.Dynamic.literal(debuggerId = debuggerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableReturnType]
  }
  
  @scala.inline
  implicit class EnableReturnTypeMutableBuilder[Self <: EnableReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebuggerId(value: UniqueDebuggerId): Self = StObject.set(x, "debuggerId", value.asInstanceOf[js.Any])
  }
}
