package typings.openfin.frameMod

import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.openfinStrings.connected
import typings.openfin.openfinStrings.disconnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameEvents extends BaseEventMap {
  var connected: FrameEvent[typings.openfin.openfinStrings.connected]
  var disconnected: FrameEvent[typings.openfin.openfinStrings.disconnected]
}

object FrameEvents {
  @scala.inline
  def apply(
    connected: FrameEvent[connected],
    disconnected: FrameEvent[disconnected],
    listenerRemoved: String,
    newListener: String
  ): FrameEvents = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FrameEvents]
  }
}

