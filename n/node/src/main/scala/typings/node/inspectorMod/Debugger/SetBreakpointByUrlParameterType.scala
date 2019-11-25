package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBreakpointByUrlParameterType extends js.Object {
  /**
    * Offset in the line to set breakpoint at.
    */
  var columnNumber: js.UndefOr[Double] = js.undefined
  /**
    * Expression to use as a breakpoint condition. When specified, debugger will only stop on the breakpoint if this expression evaluates to true.
    */
  var condition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Line number to set breakpoint at.
    */
  var lineNumber: Double
  /**
    * Script hash of the resources to set breakpoint on.
    */
  var scriptHash: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL of the resources to set breakpoint on.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Regex pattern for the URLs of the resources to set breakpoints on. Either <code>url</code> or <code>urlRegex</code> must be specified.
    */
  var urlRegex: js.UndefOr[java.lang.String] = js.undefined
}

object SetBreakpointByUrlParameterType {
  @scala.inline
  def apply(
    lineNumber: Double,
    columnNumber: Int | Double = null,
    condition: java.lang.String = null,
    scriptHash: java.lang.String = null,
    url: java.lang.String = null,
    urlRegex: java.lang.String = null
  ): SetBreakpointByUrlParameterType = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any])
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (scriptHash != null) __obj.updateDynamic("scriptHash")(scriptHash.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urlRegex != null) __obj.updateDynamic("urlRegex")(urlRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointByUrlParameterType]
  }
}

