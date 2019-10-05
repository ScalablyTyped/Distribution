package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononPreloaderComponent extends js.Object {
  def hide(): Unit
  def show(): Unit
}

object PhononPreloaderComponent {
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): PhononPreloaderComponent = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[PhononPreloaderComponent]
  }
}

