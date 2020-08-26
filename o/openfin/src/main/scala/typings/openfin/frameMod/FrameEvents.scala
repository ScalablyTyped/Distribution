package typings.openfin.frameMod

import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.openfinStrings.connected
import typings.openfin.openfinStrings.disconnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameEvents extends BaseEventMap {
  var connected: FrameEvent[typings.openfin.openfinStrings.connected] = js.native
  var disconnected: FrameEvent[typings.openfin.openfinStrings.disconnected] = js.native
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
  @scala.inline
  implicit class FrameEventsOps[Self <: FrameEvents] (val x: Self) extends AnyVal {
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
    def setConnected(value: FrameEvent[connected]): Self = this.set("connected", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisconnected(value: FrameEvent[disconnected]): Self = this.set("disconnected", value.asInstanceOf[js.Any])
  }
  
}

