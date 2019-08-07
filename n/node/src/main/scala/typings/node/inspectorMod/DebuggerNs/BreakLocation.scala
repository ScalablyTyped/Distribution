package typings.node.inspectorMod.DebuggerNs

import typings.node.inspectorMod.RuntimeNs.ScriptId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakLocation extends js.Object {
  /**
    * Column number in the script (0-based).
    */
  var columnNumber: js.UndefOr[Double] = js.undefined
  /**
    * Line number in the script (0-based).
    */
  var lineNumber: Double
  /**
    * Script identifier as reported in the <code>Debugger.scriptParsed</code>.
    */
  var scriptId: ScriptId
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BreakLocation {
  @scala.inline
  def apply(
    lineNumber: Double,
    scriptId: ScriptId,
    columnNumber: Int | Double = null,
    `type`: java.lang.String = null
  ): BreakLocation = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber, scriptId = scriptId)
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BreakLocation]
  }
}

