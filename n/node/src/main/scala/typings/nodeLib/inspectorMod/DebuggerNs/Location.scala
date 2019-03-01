package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location in the source code.
  */
trait Location extends js.Object {
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
}

object Location {
  @scala.inline
  def apply(
    lineNumber: scala.Double,
    scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId,
    columnNumber: scala.Int | scala.Double = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lineNumber")(lineNumber)
    __obj.updateDynamic("scriptId")(scriptId)
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

