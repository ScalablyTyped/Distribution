package typings.nodeRedEditorClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewTools extends js.Object {
  
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
  implicit class ViewToolsOps[Self <: ViewTools] (val x: Self) extends AnyVal {
    
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
    def setAlignSelectionToGrid(value: () => Unit): Self = this.set("alignSelectionToGrid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveSelection(value: (Double, Double) => Unit): Self = this.set("moveSelection", js.Any.fromFunction2(value))
  }
}
