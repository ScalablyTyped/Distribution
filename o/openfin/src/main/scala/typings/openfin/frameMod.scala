package typings.openfin

import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.connected
import typings.openfin.openfinStrings.disconnected
import typings.openfin.openfinStrings.frame
import typings.openfin.openfinStrings.iframe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frameMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.openfin.eventsBaseMod.RuntimeEvent because Already inherited */ @js.native
  trait FrameEvent[Type] extends WindowEvent[frame, Type] {
    
    var entityType: iframe = js.native
    
    var frameName: String = js.native
  }
  object FrameEvent {
    
    @scala.inline
    def apply[Type](entityType: iframe, frameName: String, name: String, topic: frame, `type`: Type, uuid: String): FrameEvent[Type] = {
      val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], frameName = frameName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrameEvent[Type]]
    }
    
    @scala.inline
    implicit class FrameEventMutableBuilder[Self <: FrameEvent[_], Type] (val x: Self with FrameEvent[Type]) extends AnyVal {
      
      @scala.inline
      def setEntityType(value: iframe): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameName(value: String): Self = StObject.set(x, "frameName", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class FrameEventsMutableBuilder[Self <: FrameEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnected(value: FrameEvent[connected]): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisconnected(value: FrameEvent[disconnected]): Self = StObject.set(x, "disconnected", value.asInstanceOf[js.Any])
    }
  }
}
