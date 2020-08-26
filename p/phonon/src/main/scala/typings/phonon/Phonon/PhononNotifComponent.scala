package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhononNotifComponent extends js.Object {
  def hide(): PhononNotifComponent = js.native
  def setColor(color: PhononColor): PhononNotifComponent = js.native
  def show(): PhononNotifComponent = js.native
}

object PhononNotifComponent {
  @scala.inline
  def apply(
    hide: () => PhononNotifComponent,
    setColor: PhononColor => PhononNotifComponent,
    show: () => PhononNotifComponent
  ): PhononNotifComponent = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), setColor = js.Any.fromFunction1(setColor), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[PhononNotifComponent]
  }
  @scala.inline
  implicit class PhononNotifComponentOps[Self <: PhononNotifComponent] (val x: Self) extends AnyVal {
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
    def setHide(value: () => PhononNotifComponent): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setSetColor(value: PhononColor => PhononNotifComponent): Self = this.set("setColor", js.Any.fromFunction1(value))
    @scala.inline
    def setShow(value: () => PhononNotifComponent): Self = this.set("show", js.Any.fromFunction0(value))
  }
  
}

