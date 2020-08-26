package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location in the source code.
  * @experimental
  */
@js.native
trait ScriptPosition extends js.Object {
  var columnNumber: Double = js.native
  var lineNumber: Double = js.native
}

object ScriptPosition {
  @scala.inline
  def apply(columnNumber: Double, lineNumber: Double): ScriptPosition = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptPosition]
  }
  @scala.inline
  implicit class ScriptPositionOps[Self <: ScriptPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnNumber(value: Double): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
  }
  
}

