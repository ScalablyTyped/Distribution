package typings.node.inspectorMod.DebuggerNs

import typings.node.inspectorMod.RuntimeNs.RemoteObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBreakpointOnFunctionCallParameterType extends js.Object {
  /**
    * Expression to use as a breakpoint condition. When specified, debugger will
    * stop on the breakpoint if this expression evaluates to true.
    */
  var condition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Function object id.
    */
  var objectId: RemoteObjectId
}

object SetBreakpointOnFunctionCallParameterType {
  @scala.inline
  def apply(objectId: RemoteObjectId, condition: java.lang.String = null): SetBreakpointOnFunctionCallParameterType = {
    val __obj = js.Dynamic.literal(objectId = objectId)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    __obj.asInstanceOf[SetBreakpointOnFunctionCallParameterType]
  }
}

