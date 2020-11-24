package typings.openfin.externalApplicationMod

import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.eventsBaseMod.RuntimeEvent
import typings.openfin.openfinStrings.connected
import typings.openfin.openfinStrings.disconnected
import typings.openfin.openfinStrings.externalapplication
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalApplicationEvents extends BaseEventMap {
  
  var connected: RuntimeEvent[externalapplication, typings.openfin.openfinStrings.connected] = js.native
  
  var disconnected: RuntimeEvent[externalapplication, typings.openfin.openfinStrings.disconnected] = js.native
}
object ExternalApplicationEvents {
  
  @scala.inline
  def apply(
    connected: RuntimeEvent[externalapplication, connected],
    disconnected: RuntimeEvent[externalapplication, disconnected],
    listenerRemoved: String,
    newListener: String
  ): ExternalApplicationEvents = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalApplicationEvents]
  }
  
  @scala.inline
  implicit class ExternalApplicationEventsOps[Self <: ExternalApplicationEvents] (val x: Self) extends AnyVal {
    
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
    def setConnected(value: RuntimeEvent[externalapplication, connected]): Self = this.set("connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisconnected(value: RuntimeEvent[externalapplication, disconnected]): Self = this.set("disconnected", value.asInstanceOf[js.Any])
  }
}
