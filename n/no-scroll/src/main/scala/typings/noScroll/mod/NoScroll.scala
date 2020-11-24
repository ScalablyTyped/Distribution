package typings.noScroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoScroll extends js.Object {
  
  def off(): Unit = js.native
  
  def on(): Unit = js.native
  
  def toggle(): Unit = js.native
}
object NoScroll {
  
  @scala.inline
  def apply(off: () => Unit, on: () => Unit, toggle: () => Unit): NoScroll = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction0(off), on = js.Any.fromFunction0(on), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[NoScroll]
  }
  
  @scala.inline
  implicit class NoScrollOps[Self <: NoScroll] (val x: Self) extends AnyVal {
    
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
    def setOff(value: () => Unit): Self = this.set("off", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn(value: () => Unit): Self = this.set("on", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
}
