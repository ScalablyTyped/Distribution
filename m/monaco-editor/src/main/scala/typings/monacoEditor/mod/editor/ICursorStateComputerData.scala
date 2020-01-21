package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICursorStateComputerData extends js.Object {
  /**
    * Get the inverse edit operations of the added edit operations.
    */
  def getInverseEditOperations(): js.Array[IIdentifiedSingleEditOperation]
  /**
    * Get a previously tracked selection.
    * @param id The unique identifier returned by `trackSelection`.
    * @return The selection.
    */
  def getTrackedSelection(id: String): Selection
}

object ICursorStateComputerData {
  @scala.inline
  def apply(
    getInverseEditOperations: () => js.Array[IIdentifiedSingleEditOperation],
    getTrackedSelection: String => Selection
  ): ICursorStateComputerData = {
    val __obj = js.Dynamic.literal(getInverseEditOperations = js.Any.fromFunction0(getInverseEditOperations), getTrackedSelection = js.Any.fromFunction1(getTrackedSelection))
  
    __obj.asInstanceOf[ICursorStateComputerData]
  }
}

