package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStackTraceParameterType extends js.Object {
  var stackTraceId: nodeLib.inspectorMod.RuntimeNs.StackTraceId
}

object GetStackTraceParameterType {
  @scala.inline
  def apply(stackTraceId: nodeLib.inspectorMod.RuntimeNs.StackTraceId): GetStackTraceParameterType = {
    val __obj = js.Dynamic.literal(stackTraceId = stackTraceId)
  
    __obj.asInstanceOf[GetStackTraceParameterType]
  }
}

