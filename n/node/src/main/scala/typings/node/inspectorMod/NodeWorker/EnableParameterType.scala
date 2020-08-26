package typings.node.inspectorMod.NodeWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableParameterType extends js.Object {
  /**
    * Whether to new workers should be paused until the frontend sends `Runtime.runIfWaitingForDebugger`
    * message to run them.
    */
  var waitForDebuggerOnStart: Boolean = js.native
}

object EnableParameterType {
  @scala.inline
  def apply(waitForDebuggerOnStart: Boolean): EnableParameterType = {
    val __obj = js.Dynamic.literal(waitForDebuggerOnStart = waitForDebuggerOnStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableParameterType]
  }
  @scala.inline
  implicit class EnableParameterTypeOps[Self <: EnableParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWaitForDebuggerOnStart(value: Boolean): Self = this.set("waitForDebuggerOnStart", value.asInstanceOf[js.Any])
  }
  
}

