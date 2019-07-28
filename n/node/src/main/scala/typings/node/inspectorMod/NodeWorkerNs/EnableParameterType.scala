package typings.node.inspectorMod.NodeWorkerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableParameterType extends js.Object {
  /**
    * Whether to new workers should be paused until the frontend sends `Runtime.runIfWaitingForDebugger`
    * message to run them.
    */
  var waitForDebuggerOnStart: Boolean
}

object EnableParameterType {
  @scala.inline
  def apply(waitForDebuggerOnStart: Boolean): EnableParameterType = {
    val __obj = js.Dynamic.literal(waitForDebuggerOnStart = waitForDebuggerOnStart)
  
    __obj.asInstanceOf[EnableParameterType]
  }
}

