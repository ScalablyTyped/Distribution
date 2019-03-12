package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononPageEventObject extends js.Object {
  def addEvent(event: java.lang.String, callback: js.Function1[/* parameter */ js.UndefOr[js.Any], scala.Unit]): scala.Unit
}

object PhononPageEventObject {
  @scala.inline
  def apply(
    addEvent: (java.lang.String, js.Function1[/* parameter */ js.UndefOr[js.Any], scala.Unit]) => scala.Unit
  ): PhononPageEventObject = {
    val __obj = js.Dynamic.literal(addEvent = js.Any.fromFunction2(addEvent))
  
    __obj.asInstanceOf[PhononPageEventObject]
  }
}

