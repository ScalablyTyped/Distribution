package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.ScriptId
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
  var `type`: js.UndefOr[String] = js.undefined
}

object BreakLocation {
  @scala.inline
  def apply(lineNumber: Double, scriptId: ScriptId, columnNumber: Int | Double = null, `type`: String = null): BreakLocation = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any])
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakLocation]
  }
}

