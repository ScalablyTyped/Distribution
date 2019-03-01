package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakLocation extends js.Object {
  /**
    * Column number in the script (0-based).
    */
  var columnNumber: js.UndefOr[scala.Double] = js.undefined
  /**
    * Line number in the script (0-based).
    */
  var lineNumber: scala.Double
  /**
    * Script identifier as reported in the `Debugger.scriptParsed`.
    */
  var scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BreakLocation {
  @scala.inline
  def apply(
    lineNumber: scala.Double,
    scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId,
    columnNumber: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): BreakLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lineNumber")(lineNumber)
    __obj.updateDynamic("scriptId")(scriptId)
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BreakLocation]
  }
}

