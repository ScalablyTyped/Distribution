package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICommand extends StObject {
  
  /**
    * Compute the cursor state after the edit operations were applied.
    * @param model The model the command has executed on.
    * @param helper A helper to get inverse edit operations and to get previously tracked selections.
    * @return The cursor state after the command executed.
    */
  def computeCursorState(model: ITextModel, helper: ICursorStateComputerData): Selection
  
  /**
    * Get the edit operations needed to execute this command.
    * @param model The model the command will execute on.
    * @param builder A helper to collect the needed edit operations and to track selections.
    */
  def getEditOperations(model: ITextModel, builder: IEditOperationBuilder): Unit
}
object ICommand {
  
  inline def apply(
    computeCursorState: (ITextModel, ICursorStateComputerData) => Selection,
    getEditOperations: (ITextModel, IEditOperationBuilder) => Unit
  ): ICommand = {
    val __obj = js.Dynamic.literal(computeCursorState = js.Any.fromFunction2(computeCursorState), getEditOperations = js.Any.fromFunction2(getEditOperations))
    __obj.asInstanceOf[ICommand]
  }
  
  extension [Self <: ICommand](x: Self) {
    
    inline def setComputeCursorState(value: (ITextModel, ICursorStateComputerData) => Selection): Self = StObject.set(x, "computeCursorState", js.Any.fromFunction2(value))
    
    inline def setGetEditOperations(value: (ITextModel, IEditOperationBuilder) => Unit): Self = StObject.set(x, "getEditOperations", js.Any.fromFunction2(value))
  }
}
