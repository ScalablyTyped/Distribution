package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PauseOnAsyncCallParameterType extends js.Object {
  /**
    * Debugger will pause when async call with given stack trace is started.
    */
  var parentStackTraceId: nodeLib.inspectorMod.RuntimeNs.StackTraceId
}

object PauseOnAsyncCallParameterType {
  @scala.inline
  def apply(parentStackTraceId: nodeLib.inspectorMod.RuntimeNs.StackTraceId): PauseOnAsyncCallParameterType = {
    val __obj = js.Dynamic.literal(parentStackTraceId = parentStackTraceId)
  
    __obj.asInstanceOf[PauseOnAsyncCallParameterType]
  }
}

