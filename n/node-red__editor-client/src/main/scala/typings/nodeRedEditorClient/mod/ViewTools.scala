package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewTools extends StObject {
  
  /**
    * Aligns all selected nodes to the current grid
    */
  def alignSelectionToGrid(): Unit = js.native
  
  def init(): Unit = js.native
  
  /**
    * Moves all of the selected nodes by the specified amount
    * @param dx
    * @param dy
    */
  def moveSelection(dx: Double, dy: Double): Unit = js.native
}
object ViewTools {
  
  @scala.inline
  def apply(alignSelectionToGrid: () => Unit, init: () => Unit, moveSelection: (Double, Double) => Unit): ViewTools = {
    val __obj = js.Dynamic.literal(alignSelectionToGrid = js.Any.fromFunction0(alignSelectionToGrid), init = js.Any.fromFunction0(init), moveSelection = js.Any.fromFunction2(moveSelection))
    __obj.asInstanceOf[ViewTools]
  }
  
  @scala.inline
  implicit class ViewToolsMutableBuilder[Self <: ViewTools] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignSelectionToGrid(value: () => Unit): Self = StObject.set(x, "alignSelectionToGrid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveSelection(value: (Double, Double) => Unit): Self = StObject.set(x, "moveSelection", js.Any.fromFunction2(value))
  }
}
