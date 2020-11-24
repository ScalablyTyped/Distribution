package typings.nodeRedEditorClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewNavigator extends js.Object {
  
  def init(): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def resize(): Unit = js.native
  
  def toggle(): Unit = js.native
}
object ViewNavigator {
  
  @scala.inline
  def apply(init: () => Unit, refresh: () => Unit, resize: () => Unit, toggle: () => Unit): ViewNavigator = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), refresh = js.Any.fromFunction0(refresh), resize = js.Any.fromFunction0(resize), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[ViewNavigator]
  }
  
  @scala.inline
  implicit class ViewNavigatorOps[Self <: ViewNavigator] (val x: Self) extends AnyVal {
    
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
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResize(value: () => Unit): Self = this.set("resize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
}
