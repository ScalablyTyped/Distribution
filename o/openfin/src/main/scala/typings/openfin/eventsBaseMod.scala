package typings.openfin

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsBaseMod {
  
  @JSImport("openfin/_v2/api/events/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTopic(e: RuntimeEvent[js.Any, String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopic")(e.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.openfin.eventsBaseMod.RuntimeEvent because Already inherited */ trait ApplicationEvent[Topic, Type]
    extends StObject
       with BaseEvent[Topic, Type] {
    
    var uuid: String
  }
  object ApplicationEvent {
    
    inline def apply[Topic, Type](topic: Topic, `type`: Type, uuid: String): ApplicationEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationEvent[Topic, Type]]
    }
    
    extension [Self <: ApplicationEvent[?, ?], Topic, Type](x: Self & (ApplicationEvent[Topic, Type])) {
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseEvent[Topic, Type]
    extends StObject
       with RuntimeEvent[Topic, Type] {
    
    var topic: Topic
    
    var `type`: Type
  }
  object BaseEvent {
    
    inline def apply[Topic, Type](topic: Topic, `type`: Type): BaseEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseEvent[Topic, Type]]
    }
    
    extension [Self <: BaseEvent[?, ?], Topic, Type](x: Self & (BaseEvent[Topic, Type])) {
      
      inline def setTopic(value: Topic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseEventMap
    extends StObject
       with /**
    * @hidden
    * Custom properties and metadata. This can be extended in specific context object.
    */
  /* key */ StringDictionary[js.Any] {
    
    var listenerRemoved: String
    
    var newListener: String
  }
  object BaseEventMap {
    
    inline def apply(listenerRemoved: String, newListener: String): BaseEventMap = {
      val __obj = js.Dynamic.literal(listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseEventMap]
    }
    
    extension [Self <: BaseEventMap](x: Self) {
      
      inline def setListenerRemoved(value: String): Self = StObject.set(x, "listenerRemoved", value.asInstanceOf[js.Any])
      
      inline def setNewListener(value: String): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
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
    
    inline def ApplicationEvent[Topic, Type](topic: Topic, `type`: Type, uuid: String): typings.openfin.eventsBaseMod.ApplicationEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.eventsBaseMod.ApplicationEvent[Topic, Type]]
    }
    
    inline def BaseEvent[Topic, Type](topic: Topic, `type`: Type): typings.openfin.eventsBaseMod.BaseEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.eventsBaseMod.BaseEvent[Topic, Type]]
    }
    
    inline def FrameEvent[Type](frameName: String, name: String, `type`: Type, uuid: String): typings.openfin.frameMod.FrameEvent[Type] = {
      val __obj = js.Dynamic.literal(entityType = "iframe", frameName = frameName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = "frame", uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.frameMod.FrameEvent[Type]]
    }
    
    inline def WindowEvent[Topic, Type](name: String, topic: Topic, `type`: Type, uuid: String): typings.openfin.eventsBaseMod.WindowEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.eventsBaseMod.WindowEvent[Topic, Type]]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.openfin.eventsBaseMod.RuntimeEvent because Already inherited */ trait WindowEvent[Topic, Type]
    extends StObject
       with ApplicationEvent[Topic, Type] {
    
    var name: String
  }
  object WindowEvent {
    
    inline def apply[Topic, Type](name: String, topic: Topic, `type`: Type, uuid: String): WindowEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowEvent[Topic, Type]]
    }
    
    extension [Self <: WindowEvent[?, ?], Topic, Type](x: Self & (WindowEvent[Topic, Type])) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
