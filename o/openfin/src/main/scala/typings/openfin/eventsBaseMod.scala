package typings.openfin

import org.scalablytyped.runtime.StringDictionary
import typings.openfin.openfinStrings.frame
import typings.openfin.openfinStrings.iframe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsBaseMod {
  
  @JSImport("openfin/_v2/api/events/base", "getTopic")
  @js.native
  def getTopic(e: RuntimeEvent[_, String]): String = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.openfin.eventsBaseMod.RuntimeEvent because Already inherited */ @js.native
  trait ApplicationEvent[Topic, Type] extends BaseEvent[Topic, Type] {
    
    var uuid: String = js.native
  }
  object ApplicationEvent {
    
    @scala.inline
    def apply[Topic, Type](topic: Topic, `type`: Type, uuid: String): ApplicationEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationEvent[Topic, Type]]
    }
    
    @scala.inline
    implicit class ApplicationEventMutableBuilder[Self <: ApplicationEvent[_, _], Topic, Type] (val x: Self with (ApplicationEvent[Topic, Type])) extends AnyVal {
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BaseEvent[Topic, Type] extends RuntimeEvent[Topic, Type] {
    
    var topic: Topic = js.native
    
    var `type`: Type = js.native
  }
  object BaseEvent {
    
    @scala.inline
    def apply[Topic, Type](topic: Topic, `type`: Type): BaseEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseEvent[Topic, Type]]
    }
    
    @scala.inline
    implicit class BaseEventMutableBuilder[Self <: BaseEvent[_, _], Topic, Type] (val x: Self with (BaseEvent[Topic, Type])) extends AnyVal {
      
      @scala.inline
      def setTopic(value: Topic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BaseEventMap
    extends /**
    * @hidden
    * Custom properties and metadata. This can be extended in specific context object.
    */
  /* key */ StringDictionary[js.Any] {
    
    var listenerRemoved: String = js.native
    
    var newListener: String = js.native
  }
  object BaseEventMap {
    
    @scala.inline
    def apply(listenerRemoved: String, newListener: String): BaseEventMap = {
      val __obj = js.Dynamic.literal(listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseEventMap]
    }
    
    @scala.inline
    implicit class BaseEventMapMutableBuilder[Self <: BaseEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setListenerRemoved(value: String): Self = StObject.set(x, "listenerRemoved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewListener(value: String): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.openfin.eventsBaseMod.BaseEvent[Topic, Type]
    - typings.openfin.eventsBaseMod.ApplicationEvent[Topic, Type]
    - typings.openfin.frameMod.FrameEvent[Type]
    - typings.openfin.eventsBaseMod.WindowEvent[Topic, Type]
  */
  trait RuntimeEvent[Topic, Type] extends StObject
  object RuntimeEvent {
    
    @scala.inline
    def ApplicationEvent[Topic, Type](topic: Topic, `type`: Type, uuid: String): typings.openfin.eventsBaseMod.ApplicationEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.eventsBaseMod.ApplicationEvent[Topic, Type]]
    }
    
    @scala.inline
    def BaseEvent[Topic, Type](topic: Topic, `type`: Type): typings.openfin.eventsBaseMod.BaseEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.eventsBaseMod.BaseEvent[Topic, Type]]
    }
    
    @scala.inline
    def FrameEvent[Type](entityType: iframe, frameName: String, name: String, topic: frame, `type`: Type, uuid: String): typings.openfin.frameMod.FrameEvent[Type] = {
      val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], frameName = frameName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.frameMod.FrameEvent[Type]]
    }
    
    @scala.inline
    def WindowEvent[Topic, Type](name: String, topic: Topic, `type`: Type, uuid: String): typings.openfin.eventsBaseMod.WindowEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.eventsBaseMod.WindowEvent[Topic, Type]]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.openfin.eventsBaseMod.RuntimeEvent because Already inherited */ @js.native
  trait WindowEvent[Topic, Type] extends ApplicationEvent[Topic, Type] {
    
    var name: String = js.native
  }
  object WindowEvent {
    
    @scala.inline
    def apply[Topic, Type](name: String, topic: Topic, `type`: Type, uuid: String): WindowEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowEvent[Topic, Type]]
    }
    
    @scala.inline
    implicit class WindowEventMutableBuilder[Self <: WindowEvent[_, _], Topic, Type] (val x: Self with (WindowEvent[Topic, Type])) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
