package typings.monacoDashEditor.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPosition extends js.Object {
  /**
    * column (the first character in a line is between column 1 and column 2)
    */
  val column: Double
  /**
    * line number (starts at 1)
    */
  val lineNumber: Double
}

object IPosition {
  @scala.inline
  def apply(column: Double, lineNumber: Double): IPosition = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPosition]
  }
}

