package typings.nodeRedEditorClient.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchRadialMenu extends js.Object {
  
  def active(): Boolean = js.native
  
  def show(obj: HTMLElement, pos: js.Array[Double], options: js.Object): Unit = js.native
}
object TouchRadialMenu {
  
  @scala.inline
  def apply(active: () => Boolean, show: (HTMLElement, js.Array[Double], js.Object) => Unit): TouchRadialMenu = {
    val __obj = js.Dynamic.literal(active = js.Any.fromFunction0(active), show = js.Any.fromFunction3(show))
    __obj.asInstanceOf[TouchRadialMenu]
  }
  
  @scala.inline
  implicit class TouchRadialMenuOps[Self <: TouchRadialMenu] (val x: Self) extends AnyVal {
    
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
    def setActive(value: () => Boolean): Self = this.set("active", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: (HTMLElement, js.Array[Double], js.Object) => Unit): Self = this.set("show", js.Any.fromFunction3(value))
  }
}
