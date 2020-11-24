package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDiffNavigator extends js.Object {
  
  def canNavigate(): Boolean = js.native
  
  def dispose(): Unit = js.native
  
  def next(): Unit = js.native
  
  def previous(): Unit = js.native
}
object IDiffNavigator {
  
  @scala.inline
  def apply(canNavigate: () => Boolean, dispose: () => Unit, next: () => Unit, previous: () => Unit): IDiffNavigator = {
    val __obj = js.Dynamic.literal(canNavigate = js.Any.fromFunction0(canNavigate), dispose = js.Any.fromFunction0(dispose), next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous))
    __obj.asInstanceOf[IDiffNavigator]
  }
  
  @scala.inline
  implicit class IDiffNavigatorOps[Self <: IDiffNavigator] (val x: Self) extends AnyVal {
    
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
    def setCanNavigate(value: () => Boolean): Self = this.set("canNavigate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNext(value: () => Unit): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrevious(value: () => Unit): Self = this.set("previous", js.Any.fromFunction0(value))
  }
}
