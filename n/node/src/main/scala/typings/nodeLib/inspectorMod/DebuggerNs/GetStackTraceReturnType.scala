package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStackTraceReturnType extends js.Object {
  var stackTrace: nodeLib.inspectorMod.RuntimeNs.StackTrace
}

object GetStackTraceReturnType {
  @scala.inline
  def apply(stackTrace: nodeLib.inspectorMod.RuntimeNs.StackTrace): GetStackTraceReturnType = {
    val __obj = js.Dynamic.literal(stackTrace = stackTrace)
  
    __obj.asInstanceOf[GetStackTraceReturnType]
  }
}

