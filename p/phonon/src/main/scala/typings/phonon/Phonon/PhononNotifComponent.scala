package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononNotifComponent extends js.Object {
  def hide(): PhononNotifComponent
  def setColor(color: PhononColor): PhononNotifComponent
  def show(): PhononNotifComponent
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
}

