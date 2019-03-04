package typings
package nodeLib.inspectorMod.NodeWorkerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableParameterType extends js.Object {
  /**
    * Whether to new workers should be paused until the frontend sends `Runtime.runIfWaitingForDebugger`
    * message to run them.
    */
  var waitForDebuggerOnStart: scala.Boolean
}

object EnableParameterType {
  @scala.inline
  def apply(waitForDebuggerOnStart: scala.Boolean): EnableParameterType = {
    val __obj = js.Dynamic.literal(waitForDebuggerOnStart = waitForDebuggerOnStart)
  
    __obj.asInstanceOf[EnableParameterType]
  }
}

