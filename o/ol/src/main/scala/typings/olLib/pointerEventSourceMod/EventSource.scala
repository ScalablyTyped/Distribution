package typings
package olLib.pointerEventSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSource extends js.Object {
  def getEvents(): js.Array[java.lang.String]
  def getHandlerForEvent(eventType: java.lang.String): js.Function1[/* p0 */ stdLib.Event, scala.Unit]
}

object EventSource {
  @scala.inline
  def apply(
    getEvents: () => js.Array[java.lang.String],
    getHandlerForEvent: java.lang.String => js.Function1[/* p0 */ stdLib.Event, scala.Unit]
  ): EventSource = {
    val __obj = js.Dynamic.literal(getEvents = js.Any.fromFunction0(getEvents), getHandlerForEvent = js.Any.fromFunction1(getHandlerForEvent))
  
    __obj.asInstanceOf[EventSource]
  }
}

