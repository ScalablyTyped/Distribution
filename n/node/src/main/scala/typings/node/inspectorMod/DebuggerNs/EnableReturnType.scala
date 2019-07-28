package typings.node.inspectorMod.DebuggerNs

import typings.node.inspectorMod.RuntimeNs.UniqueDebuggerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableReturnType extends js.Object {
  /**
    * Unique identifier of the debugger.
    * @experimental
    */
  var debuggerId: UniqueDebuggerId
}

object EnableReturnType {
  @scala.inline
  def apply(debuggerId: UniqueDebuggerId): EnableReturnType = {
    val __obj = js.Dynamic.literal(debuggerId = debuggerId)
  
    __obj.asInstanceOf[EnableReturnType]
  }
}

