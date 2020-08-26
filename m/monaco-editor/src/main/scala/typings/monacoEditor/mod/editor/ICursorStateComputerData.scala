package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICursorStateComputerData extends js.Object {
  /**
    * Get the inverse edit operations of the added edit operations.
    */
  def getInverseEditOperations(): js.Array[IIdentifiedSingleEditOperation] = js.native
  /**
    * Get a previously tracked selection.
    * @param id The unique identifier returned by `trackSelection`.
    * @return The selection.
    */
  def getTrackedSelection(id: String): Selection = js.native
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
  @scala.inline
  implicit class ICursorStateComputerDataOps[Self <: ICursorStateComputerData] (val x: Self) extends AnyVal {
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
    def setGetInverseEditOperations(value: () => js.Array[IIdentifiedSingleEditOperation]): Self = this.set("getInverseEditOperations", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTrackedSelection(value: String => Selection): Self = this.set("getTrackedSelection", js.Any.fromFunction1(value))
  }
  
}

