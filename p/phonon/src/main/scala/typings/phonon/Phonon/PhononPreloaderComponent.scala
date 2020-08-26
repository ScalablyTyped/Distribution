package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhononPreloaderComponent extends js.Object {
  def hide(): Unit = js.native
  def show(): Unit = js.native
}

object PhononPreloaderComponent {
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): PhononPreloaderComponent = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[PhononPreloaderComponent]
  }
  @scala.inline
  implicit class PhononPreloaderComponentOps[Self <: PhononPreloaderComponent] (val x: Self) extends AnyVal {
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
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
  
}

