package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICursorStateComputerData extends StObject {
  
  /**
    * Get the inverse edit operations of the added edit operations.
    */
  def getInverseEditOperations(): js.Array[IValidEditOperation]
  
  /**
    * Get a previously tracked selection.
    * @param id The unique identifier returned by `trackSelection`.
    * @return The selection.
    */
  def getTrackedSelection(id: String): Selection
}
object ICursorStateComputerData {
  
  inline def apply(
    getInverseEditOperations: () => js.Array[IValidEditOperation],
    getTrackedSelection: String => Selection
  ): ICursorStateComputerData = {
    val __obj = js.Dynamic.literal(getInverseEditOperations = js.Any.fromFunction0(getInverseEditOperations), getTrackedSelection = js.Any.fromFunction1(getTrackedSelection))
    __obj.asInstanceOf[ICursorStateComputerData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICursorStateComputerData] (val x: Self) extends AnyVal {
    
    inline def setGetInverseEditOperations(value: () => js.Array[IValidEditOperation]): Self = StObject.set(x, "getInverseEditOperations", js.Any.fromFunction0(value))
    
    inline def setGetTrackedSelection(value: String => Selection): Self = StObject.set(x, "getTrackedSelection", js.Any.fromFunction1(value))
  }
}
