package typings.navermaps.naver.maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMEventListener extends js.Object {
  var eventName: String = js.native
  var target: HTMLElement = js.native
  def listener(): js.Any = js.native
}

object DOMEventListener {
  @scala.inline
  def apply(eventName: String, listener: () => js.Any, target: HTMLElement): DOMEventListener = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], listener = js.Any.fromFunction0(listener), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMEventListener]
  }
  @scala.inline
  implicit class DOMEventListenerOps[Self <: DOMEventListener] (val x: Self) extends AnyVal {
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
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    @scala.inline
    def setListener(value: () => js.Any): Self = this.set("listener", js.Any.fromFunction0(value))
    @scala.inline
    def setTarget(value: HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

