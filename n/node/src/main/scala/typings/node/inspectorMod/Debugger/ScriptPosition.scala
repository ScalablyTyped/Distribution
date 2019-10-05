package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location in the source code.
  * @experimental
  */
trait ScriptPosition extends js.Object {
  var columnNumber: Double
  var lineNumber: Double
}

object ScriptPosition {
  @scala.inline
  def apply(columnNumber: Double, lineNumber: Double): ScriptPosition = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber, lineNumber = lineNumber)
  
    __obj.asInstanceOf[ScriptPosition]
  }
}

