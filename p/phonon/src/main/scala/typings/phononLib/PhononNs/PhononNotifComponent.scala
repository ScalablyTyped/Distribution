package typings
package phononLib.PhononNs

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
    hide: js.Function0[PhononNotifComponent],
    setColor: js.Function1[PhononColor, PhononNotifComponent],
    show: js.Function0[PhononNotifComponent]
  ): PhononNotifComponent = {
    val __obj = js.Dynamic.literal(hide = hide, setColor = setColor, show = show)
  
    __obj.asInstanceOf[PhononNotifComponent]
  }
}

