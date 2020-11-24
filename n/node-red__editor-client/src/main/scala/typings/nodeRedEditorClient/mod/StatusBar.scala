package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Align
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusBar extends js.Object {
  
  def add(options: Align): Unit = js.native
  
  def init(): Unit = js.native
}
object StatusBar {
  
  @scala.inline
  def apply(add: Align => Unit, init: () => Unit): StatusBar = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[StatusBar]
  }
  
  @scala.inline
  implicit class StatusBarOps[Self <: StatusBar] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: Align => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
  }
}
