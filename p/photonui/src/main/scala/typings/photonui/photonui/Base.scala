package typings.photonui.photonui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  def destroy(): Unit = js.native
  def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: js.Any): Unit = js.native
  def removeCallback(id: String): Unit = js.native
}

object Base {
  @scala.inline
  def apply(
    destroy: () => Unit,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit
  ): Base = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback))
    __obj.asInstanceOf[Base]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
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
    def setRegisterCallback(value: (String, String, js.Function, js.Any) => Unit): Self = this.set("registerCallback", js.Any.fromFunction4(value))
    @scala.inline
    def setRemoveCallback(value: String => Unit): Self = this.set("removeCallback", js.Any.fromFunction1(value))
  }
  
}

