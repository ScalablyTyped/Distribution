package typings.openfin

import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.openfinStrings.channel
import typings.openfin.openfinStrings.connected
import typings.openfin.openfinStrings.disconnected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelMod {
  
  trait ChannelEvent[Type]
    extends StObject
       with ApplicationEvent[channel, Type] {
    
    var channelId: String
    
    var channelName: String
    
    var name: js.UndefOr[String] = js.undefined
  }
  object ChannelEvent {
    
    inline def apply[Type](channelId: String, channelName: String, `type`: Type, uuid: String): ChannelEvent[Type] = {
      val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], channelName = channelName.asInstanceOf[js.Any], topic = "channel", uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelEvent[Type]]
    }
    
    extension [Self <: ChannelEvent[?], Type](x: Self & ChannelEvent[Type]) {
      
      inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
      
      inline def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait ChannelEvents
    extends StObject
       with BaseEventMap {
    
    var connected: ChannelEvent[typings.openfin.openfinStrings.connected]
    
    var disconnected: ChannelEvent[typings.openfin.openfinStrings.disconnected]
  }
  object ChannelEvents {
    
    inline def apply(
      connected: ChannelEvent[connected],
      disconnected: ChannelEvent[disconnected],
      listenerRemoved: String,
      newListener: String
    ): ChannelEvents = {
      val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelEvents]
    }
    
    extension [Self <: ChannelEvents](x: Self) {
      
      inline def setConnected(value: ChannelEvent[connected]): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setDisconnected(value: ChannelEvent[disconnected]): Self = StObject.set(x, "disconnected", value.asInstanceOf[js.Any])
    }
  }
}
