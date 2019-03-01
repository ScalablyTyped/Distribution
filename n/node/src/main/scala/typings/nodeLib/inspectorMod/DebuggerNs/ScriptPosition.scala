package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location in the source code.
  * @experimental
  */
trait ScriptPosition extends js.Object {
  var columnNumber: scala.Double
  var lineNumber: scala.Double
}

object ScriptPosition {
  @scala.inline
  def apply(columnNumber: scala.Double, lineNumber: scala.Double): ScriptPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columnNumber")(columnNumber)
    __obj.updateDynamic("lineNumber")(lineNumber)
    __obj.asInstanceOf[ScriptPosition]
  }
}

