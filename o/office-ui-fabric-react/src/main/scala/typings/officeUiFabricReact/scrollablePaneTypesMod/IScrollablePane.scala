package typings.officeUiFabricReact.scrollablePaneTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScrollablePane extends js.Object {
  
  /** Triggers a layout update for the pane. */
  def forceLayoutUpdate(): Unit = js.native
  
  /** Gets the current scroll position of the scrollable pane */
  def getScrollPosition(): Double = js.native
}
object IScrollablePane {
  
  @scala.inline
  def apply(forceLayoutUpdate: () => Unit, getScrollPosition: () => Double): IScrollablePane = {
    val __obj = js.Dynamic.literal(forceLayoutUpdate = js.Any.fromFunction0(forceLayoutUpdate), getScrollPosition = js.Any.fromFunction0(getScrollPosition))
    __obj.asInstanceOf[IScrollablePane]
  }
  
  @scala.inline
  implicit class IScrollablePaneOps[Self <: IScrollablePane] (val x: Self) extends AnyVal {
    
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
    def setForceLayoutUpdate(value: () => Unit): Self = this.set("forceLayoutUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScrollPosition(value: () => Double): Self = this.set("getScrollPosition", js.Any.fromFunction0(value))
  }
}
