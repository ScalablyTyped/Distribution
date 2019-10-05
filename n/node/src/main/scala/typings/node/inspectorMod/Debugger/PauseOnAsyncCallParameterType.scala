package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.StackTraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PauseOnAsyncCallParameterType extends js.Object {
  /**
    * Debugger will pause when async call with given stack trace is started.
    */
  var parentStackTraceId: StackTraceId
}

object PauseOnAsyncCallParameterType {
  @scala.inline
  def apply(parentStackTraceId: StackTraceId): PauseOnAsyncCallParameterType = {
    val __obj = js.Dynamic.literal(parentStackTraceId = parentStackTraceId)
  
    __obj.asInstanceOf[PauseOnAsyncCallParameterType]
  }
}

