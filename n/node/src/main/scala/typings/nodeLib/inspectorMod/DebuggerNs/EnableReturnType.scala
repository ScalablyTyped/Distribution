package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableReturnType extends js.Object {
  /**
    * Unique identifier of the debugger.
    * @experimental
    */
  var debuggerId: nodeLib.inspectorMod.RuntimeNs.UniqueDebuggerId
}

object EnableReturnType {
  @scala.inline
  def apply(debuggerId: nodeLib.inspectorMod.RuntimeNs.UniqueDebuggerId): EnableReturnType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debuggerId")(debuggerId)
    __obj.asInstanceOf[EnableReturnType]
  }
}

