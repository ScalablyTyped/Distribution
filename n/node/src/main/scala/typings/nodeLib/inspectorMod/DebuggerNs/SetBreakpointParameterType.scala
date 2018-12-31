package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBreakpointParameterType extends js.Object {
  /**
    * Expression to use as a breakpoint condition. When specified, debugger will only stop on the
    * breakpoint if this expression evaluates to true.
    */
  var condition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Location to set breakpoint in.
    */
  var location: Location
}

