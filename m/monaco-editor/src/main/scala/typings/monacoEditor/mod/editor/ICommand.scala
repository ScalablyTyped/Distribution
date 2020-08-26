package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommand extends js.Object {
  /**
    * Compute the cursor state after the edit operations were applied.
    * @param model The model the command has executed on.
    * @param helper A helper to get inverse edit operations and to get previously tracked selections.
    * @return The cursor state after the command executed.
    */
  def computeCursorState(model: ITextModel, helper: ICursorStateComputerData): Selection = js.native
  /**
    * Get the edit operations needed to execute this command.
    * @param model The model the command will execute on.
    * @param builder A helper to collect the needed edit operations and to track selections.
    */
  def getEditOperations(model: ITextModel, builder: IEditOperationBuilder): Unit = js.native
}

object ICommand {
  @scala.inline
  def apply(
    computeCursorState: (ITextModel, ICursorStateComputerData) => Selection,
    getEditOperations: (ITextModel, IEditOperationBuilder) => Unit
  ): ICommand = {
    val __obj = js.Dynamic.literal(computeCursorState = js.Any.fromFunction2(computeCursorState), getEditOperations = js.Any.fromFunction2(getEditOperations))
    __obj.asInstanceOf[ICommand]
  }
  @scala.inline
  implicit class ICommandOps[Self <: ICommand] (val x: Self) extends AnyVal {
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
    def setComputeCursorState(value: (ITextModel, ICursorStateComputerData) => Selection): Self = this.set("computeCursorState", js.Any.fromFunction2(value))
    @scala.inline
    def setGetEditOperations(value: (ITextModel, IEditOperationBuilder) => Unit): Self = this.set("getEditOperations", js.Any.fromFunction2(value))
  }
  
}

