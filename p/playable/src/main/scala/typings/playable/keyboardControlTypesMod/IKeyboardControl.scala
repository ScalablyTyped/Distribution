package typings.playable.keyboardControlTypesMod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeyboardControl extends js.Object {
  
  def addKeyControl(key: Double, callback: EventListener): Unit = js.native
  
  def destroy(): Unit = js.native
}
object IKeyboardControl {
  
  @scala.inline
  def apply(addKeyControl: (Double, EventListener) => Unit, destroy: () => Unit): IKeyboardControl = {
    val __obj = js.Dynamic.literal(addKeyControl = js.Any.fromFunction2(addKeyControl), destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[IKeyboardControl]
  }
  
  @scala.inline
  implicit class IKeyboardControlOps[Self <: IKeyboardControl] (val x: Self) extends AnyVal {
    
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
    def setAddKeyControl(value: (Double, EventListener) => Unit): Self = this.set("addKeyControl", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
  }
}
