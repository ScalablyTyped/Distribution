package typings.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPosition extends js.Object {
  /**
    * column (the first character in a line is between column 1 and column 2)
    */
  val column: Double = js.native
  /**
    * line number (starts at 1)
    */
  val lineNumber: Double = js.native
}

object IPosition {
  @scala.inline
  def apply(column: Double, lineNumber: Double): IPosition = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPosition]
  }
  @scala.inline
  implicit class IPositionOps[Self <: IPosition] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
  }
  
}

