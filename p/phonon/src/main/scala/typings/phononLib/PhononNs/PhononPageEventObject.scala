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
    addEvent: js.Function2[
      java.lang.String, 
      js.Function1[/* parameter */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): PhononPageEventObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEvent")(addEvent)
    __obj.asInstanceOf[PhononPageEventObject]
  }
}

