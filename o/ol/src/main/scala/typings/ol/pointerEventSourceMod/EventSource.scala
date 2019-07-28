package typings.ol.pointerEventSourceMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSource extends js.Object {
  def getEvents(): js.Array[String]
  def getHandlerForEvent(eventType: String): js.Function1[/* p0 */ Event, Unit]
}

object EventSource {
  @scala.inline
  def apply(
    getEvents: () => js.Array[String],
    getHandlerForEvent: String => js.Function1[/* p0 */ Event, Unit]
  ): EventSource = {
    val __obj = js.Dynamic.literal(getEvents = js.Any.fromFunction0(getEvents), getHandlerForEvent = js.Any.fromFunction1(getHandlerForEvent))
  
    __obj.asInstanceOf[EventSource]
  }
}

