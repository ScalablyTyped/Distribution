package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsEventTypeMod {
  
  @JSImport("ol/events/EventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventType & String] = js.native
    
    /* "blur" */ val BLUR: typings.ol.eventsEventTypeMod.EventType.BLUR & String = js.native
    
    /* "change" */ val CHANGE: typings.ol.eventsEventTypeMod.EventType.CHANGE & String = js.native
    
    /* "clear" */ val CLEAR: typings.ol.eventsEventTypeMod.EventType.CLEAR & String = js.native
    
    /* "click" */ val CLICK: typings.ol.eventsEventTypeMod.EventType.CLICK & String = js.native
    
    /* "contextmenu" */ val CONTEXTMENU: typings.ol.eventsEventTypeMod.EventType.CONTEXTMENU & String = js.native
    
    /* "dblclick" */ val DBLCLICK: typings.ol.eventsEventTypeMod.EventType.DBLCLICK & String = js.native
    
    /* "dragenter" */ val DRAGENTER: typings.ol.eventsEventTypeMod.EventType.DRAGENTER & String = js.native
    
    /* "dragover" */ val DRAGOVER: typings.ol.eventsEventTypeMod.EventType.DRAGOVER & String = js.native
    
    /* "drop" */ val DROP: typings.ol.eventsEventTypeMod.EventType.DROP & String = js.native
    
    /* "error" */ val ERROR: typings.ol.eventsEventTypeMod.EventType.ERROR & String = js.native
    
    /* "focus" */ val FOCUS: typings.ol.eventsEventTypeMod.EventType.FOCUS & String = js.native
    
    /* "keydown" */ val KEYDOWN: typings.ol.eventsEventTypeMod.EventType.KEYDOWN & String = js.native
    
    /* "keypress" */ val KEYPRESS: typings.ol.eventsEventTypeMod.EventType.KEYPRESS & String = js.native
    
    /* "load" */ val LOAD: typings.ol.eventsEventTypeMod.EventType.LOAD & String = js.native
    
    /* "resize" */ val RESIZE: typings.ol.eventsEventTypeMod.EventType.RESIZE & String = js.native
    
    /* "touchmove" */ val TOUCHMOVE: typings.ol.eventsEventTypeMod.EventType.TOUCHMOVE & String = js.native
    
    /* "wheel" */ val WHEEL: typings.ol.eventsEventTypeMod.EventType.WHEEL & String = js.native
  }
  
  @js.native
  sealed trait EventType extends StObject
  @JSImport("ol/events/EventType", "EventType")
  @js.native
  object EventType extends StObject {
    
    @js.native
    sealed trait BLUR
      extends StObject
         with EventType
    
    @js.native
    sealed trait CHANGE
      extends StObject
         with EventType
    
    @js.native
    sealed trait CLEAR
      extends StObject
         with EventType
    
    @js.native
    sealed trait CLICK
      extends StObject
         with EventType
    
    @js.native
    sealed trait CONTEXTMENU
      extends StObject
         with EventType
    
    @js.native
    sealed trait DBLCLICK
      extends StObject
         with EventType
    
    @js.native
    sealed trait DRAGENTER
      extends StObject
         with EventType
    
    @js.native
    sealed trait DRAGOVER
      extends StObject
         with EventType
    
    @js.native
    sealed trait DROP
      extends StObject
         with EventType
    
    @js.native
    sealed trait ERROR
      extends StObject
         with EventType
    
    @js.native
    sealed trait FOCUS
      extends StObject
         with EventType
    
    @js.native
    sealed trait KEYDOWN
      extends StObject
         with EventType
    
    @js.native
    sealed trait KEYPRESS
      extends StObject
         with EventType
    
    @js.native
    sealed trait LOAD
      extends StObject
         with EventType
    
    @js.native
    sealed trait RESIZE
      extends StObject
         with EventType
    
    @js.native
    sealed trait TOUCHMOVE
      extends StObject
         with EventType
    
    @js.native
    sealed trait WHEEL
      extends StObject
         with EventType
  }
}
