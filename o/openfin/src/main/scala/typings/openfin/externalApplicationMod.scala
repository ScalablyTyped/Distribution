package typings.openfin

import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.eventsBaseMod.RuntimeEvent
import typings.openfin.openfinStrings.connected
import typings.openfin.openfinStrings.disconnected
import typings.openfin.openfinStrings.externalapplication
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalApplicationMod {
  
  trait ExternalApplicationEvents
    extends StObject
       with BaseEventMap {
    
    var connected: RuntimeEvent[externalapplication, typings.openfin.openfinStrings.connected]
    
    var disconnected: RuntimeEvent[externalapplication, typings.openfin.openfinStrings.disconnected]
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
    implicit class ExternalApplicationEventsMutableBuilder[Self <: ExternalApplicationEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnected(value: RuntimeEvent[externalapplication, connected]): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisconnected(value: RuntimeEvent[externalapplication, disconnected]): Self = StObject.set(x, "disconnected", value.asInstanceOf[js.Any])
    }
  }
}
