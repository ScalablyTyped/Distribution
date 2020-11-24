package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Collapsible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackInstance extends js.Object {
  
  def add(entry: Collapsible): StackInstanceEntry = js.native
  
  def hide(): StackInstance = js.native
  
  def resize(): Unit = js.native
  
  def show(): StackInstance = js.native
}
object StackInstance {
  
  @scala.inline
  def apply(
    add: Collapsible => StackInstanceEntry,
    hide: () => StackInstance,
    resize: () => Unit,
    show: () => StackInstance
  ): StackInstance = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), hide = js.Any.fromFunction0(hide), resize = js.Any.fromFunction0(resize), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[StackInstance]
  }
  
  @scala.inline
  implicit class StackInstanceOps[Self <: StackInstance] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: Collapsible => StackInstanceEntry): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHide(value: () => StackInstance): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResize(value: () => Unit): Self = this.set("resize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => StackInstance): Self = this.set("show", js.Any.fromFunction0(value))
  }
}
