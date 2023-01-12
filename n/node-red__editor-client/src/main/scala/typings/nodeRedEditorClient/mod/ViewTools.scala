package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewTools extends StObject {
  
  /**
    * Aligns all selected nodes to the current grid
    */
  def alignSelectionToGrid(): Unit
  
  def init(): Unit
  
  /**
    * Moves all of the selected nodes by the specified amount
    * @param dx
    * @param dy
    */
  def moveSelection(dx: Double, dy: Double): Unit
}
object ViewTools {
  
  inline def apply(alignSelectionToGrid: () => Unit, init: () => Unit, moveSelection: (Double, Double) => Unit): ViewTools = {
    val __obj = js.Dynamic.literal(alignSelectionToGrid = js.Any.fromFunction0(alignSelectionToGrid), init = js.Any.fromFunction0(init), moveSelection = js.Any.fromFunction2(moveSelection))
    __obj.asInstanceOf[ViewTools]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewTools] (val x: Self) extends AnyVal {
    
    inline def setAlignSelectionToGrid(value: () => Unit): Self = StObject.set(x, "alignSelectionToGrid", js.Any.fromFunction0(value))
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setMoveSelection(value: (Double, Double) => Unit): Self = StObject.set(x, "moveSelection", js.Any.fromFunction2(value))
  }
}
