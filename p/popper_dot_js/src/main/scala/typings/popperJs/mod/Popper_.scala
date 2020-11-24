package typings.popperJs.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popper_ extends js.Object {
  
  def destroy(): Unit = js.native
  
  def disableEventListeners(): Unit = js.native
  
  def enableEventListeners(): Unit = js.native
  
  var options: PopperOptions = js.native
  
  var popper: Element = js.native
  
  var reference: Element | ReferenceObject = js.native
  
  def scheduleUpdate(): Unit = js.native
  
  def update(): Unit = js.native
}
object Popper_ {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    disableEventListeners: () => Unit,
    enableEventListeners: () => Unit,
    options: PopperOptions,
    popper: Element,
    reference: Element | ReferenceObject,
    scheduleUpdate: () => Unit,
    update: () => Unit
  ): Popper_ = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disableEventListeners = js.Any.fromFunction0(disableEventListeners), enableEventListeners = js.Any.fromFunction0(enableEventListeners), options = options.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Popper_]
  }
  
  @scala.inline
  implicit class Popper_Ops[Self <: Popper_] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableEventListeners(value: () => Unit): Self = this.set("disableEventListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableEventListeners(value: () => Unit): Self = this.set("enableEventListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptions(value: PopperOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopper(value: Element): Self = this.set("popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: Element | ReferenceObject): Self = this.set("reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUpdate(value: () => Unit): Self = this.set("scheduleUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
