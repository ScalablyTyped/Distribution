package typings.phonon.Phonon_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononPageEventObject extends js.Object {
  def addEvent(event: String, callback: js.Function1[/* parameter */ js.UndefOr[js.Any], Unit]): Unit
}

object PhononPageEventObject {
  @scala.inline
  def apply(addEvent: (String, js.Function1[/* parameter */ js.UndefOr[js.Any], Unit]) => Unit): PhononPageEventObject = {
    val __obj = js.Dynamic.literal(addEvent = js.Any.fromFunction2(addEvent))
  
    __obj.asInstanceOf[PhononPageEventObject]
  }
}

