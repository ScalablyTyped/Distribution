package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBreakpointByUrlParameterType extends js.Object {
  /**
    * Offset in the line to set breakpoint at.
    */
  var columnNumber: js.UndefOr[scala.Double] = js.undefined
  /**
    * Expression to use as a breakpoint condition. When specified, debugger will only stop on the
    * breakpoint if this expression evaluates to true.
    */
  var condition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Line number to set breakpoint at.
    */
  var lineNumber: scala.Double
  /**
    * Script hash of the resources to set breakpoint on.
    */
  var scriptHash: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL of the resources to set breakpoint on.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Regex pattern for the URLs of the resources to set breakpoints on. Either `url` or
    * `urlRegex` must be specified.
    */
  var urlRegex: js.UndefOr[java.lang.String] = js.undefined
}

