package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.ScriptId
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
  var columnNumber: js.UndefOr[Double] = js.undefined
  /**
    * Line number in the script (0-based).
    */
  var lineNumber: Double
  /**
    * Script identifier as reported in the <code>Debugger.scriptParsed</code>.
    */
  var scriptId: ScriptId
}

object Location {
  @scala.inline
  def apply(lineNumber: Double, scriptId: ScriptId, columnNumber: Int | Double = null): Location = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber, scriptId = scriptId)
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

