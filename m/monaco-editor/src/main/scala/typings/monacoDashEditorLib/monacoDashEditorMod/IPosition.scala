package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPosition extends js.Object {
  /**
    * column (the first character in a line is between column 1 and column 2)
    */
  val column: scala.Double
  /**
    * line number (starts at 1)
    */
  val lineNumber: scala.Double
}

object IPosition {
  @scala.inline
  def apply(column: scala.Double, lineNumber: scala.Double): IPosition = {
    val __obj = js.Dynamic.literal(column = column, lineNumber = lineNumber)
  
    __obj.asInstanceOf[IPosition]
  }
}

