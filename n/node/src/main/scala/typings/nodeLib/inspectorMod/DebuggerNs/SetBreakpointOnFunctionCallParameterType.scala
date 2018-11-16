package typings
package nodeLib.inspectorMod.DebuggerNs

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
  var objectId: nodeLib.inspectorMod.RuntimeNs.RemoteObjectId
}

