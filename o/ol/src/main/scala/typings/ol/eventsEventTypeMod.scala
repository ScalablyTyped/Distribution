package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/events/EventType", JSImport.Namespace)
@js.native
object eventsEventTypeMod extends js.Object {
  @js.native
  sealed trait EventType extends js.Object
  
  @js.native
  object EventType extends js.Object {
    @js.native
    sealed trait BLUR extends EventType
    
    @js.native
    sealed trait CHANGE extends EventType
    
    @js.native
    sealed trait CLEAR extends EventType
    
    @js.native
    sealed trait CLICK extends EventType
    
    @js.native
    sealed trait CONTEXTMENU extends EventType
    
    @js.native
    sealed trait DBLCLICK extends EventType
    
    @js.native
    sealed trait DRAGENTER extends EventType
    
    @js.native
    sealed trait DRAGOVER extends EventType
    
    @js.native
    sealed trait DROP extends EventType
    
    @js.native
    sealed trait ERROR extends EventType
    
    @js.native
    sealed trait FOCUS extends EventType
    
    @js.native
    sealed trait KEYDOWN extends EventType
    
    @js.native
    sealed trait KEYPRESS extends EventType
    
    @js.native
    sealed trait LOAD extends EventType
    
    @js.native
    sealed trait RESIZE extends EventType
    
    @js.native
    sealed trait WHEEL extends EventType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "blur" */ val BLUR: typings.ol.eventsEventTypeMod.EventType.BLUR with String = js.native
    /* "change" */ val CHANGE: typings.ol.eventsEventTypeMod.EventType.CHANGE with String = js.native
    /* "clear" */ val CLEAR: typings.ol.eventsEventTypeMod.EventType.CLEAR with String = js.native
    /* "click" */ val CLICK: typings.ol.eventsEventTypeMod.EventType.CLICK with String = js.native
    /* "contextmenu" */ val CONTEXTMENU: typings.ol.eventsEventTypeMod.EventType.CONTEXTMENU with String = js.native
    /* "dblclick" */ val DBLCLICK: typings.ol.eventsEventTypeMod.EventType.DBLCLICK with String = js.native
    /* "dragenter" */ val DRAGENTER: typings.ol.eventsEventTypeMod.EventType.DRAGENTER with String = js.native
    /* "dragover" */ val DRAGOVER: typings.ol.eventsEventTypeMod.EventType.DRAGOVER with String = js.native
    /* "drop" */ val DROP: typings.ol.eventsEventTypeMod.EventType.DROP with String = js.native
    /* "error" */ val ERROR: typings.ol.eventsEventTypeMod.EventType.ERROR with String = js.native
    /* "focus" */ val FOCUS: typings.ol.eventsEventTypeMod.EventType.FOCUS with String = js.native
    /* "keydown" */ val KEYDOWN: typings.ol.eventsEventTypeMod.EventType.KEYDOWN with String = js.native
    /* "keypress" */ val KEYPRESS: typings.ol.eventsEventTypeMod.EventType.KEYPRESS with String = js.native
    /* "load" */ val LOAD: typings.ol.eventsEventTypeMod.EventType.LOAD with String = js.native
    /* "resize" */ val RESIZE: typings.ol.eventsEventTypeMod.EventType.RESIZE with String = js.native
    /* "wheel" */ val WHEEL: typings.ol.eventsEventTypeMod.EventType.WHEEL with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventType with String] = js.native
  }
  
}

