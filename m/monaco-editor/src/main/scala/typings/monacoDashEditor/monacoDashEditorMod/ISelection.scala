package typings.monacoDashEditor.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelection extends js.Object {
  /**
    * The column on `positionLineNumber` where the selection has ended.
    */
  val positionColumn: Double
  /**
    * The line number on which the selection has ended.
    */
  val positionLineNumber: Double
  /**
    * The column on `selectionStartLineNumber` where the selection has started.
    */
  val selectionStartColumn: Double
  /**
    * The line number on which the selection has started.
    */
  val selectionStartLineNumber: Double
}

object ISelection {
  @scala.inline
  def apply(
    positionColumn: Double,
    positionLineNumber: Double,
    selectionStartColumn: Double,
    selectionStartLineNumber: Double
  ): ISelection = {
    val __obj = js.Dynamic.literal(positionColumn = positionColumn, positionLineNumber = positionLineNumber, selectionStartColumn = selectionStartColumn, selectionStartLineNumber = selectionStartLineNumber)
  
    __obj.asInstanceOf[ISelection]
  }
}

