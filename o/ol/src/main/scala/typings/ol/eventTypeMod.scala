package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventTypeMod {
  
  @JSImport("ol/events/EventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventType & String] = js.native
    
    /* "blur" */ val BLUR: typings.ol.eventTypeMod.EventType.BLUR & String = js.native
    
    /* "change" */ val CHANGE: typings.ol.eventTypeMod.EventType.CHANGE & String = js.native
    
    /* "clear" */ val CLEAR: typings.ol.eventTypeMod.EventType.CLEAR & String = js.native
    
    /* "click" */ val CLICK: typings.ol.eventTypeMod.EventType.CLICK & String = js.native
    
    /* "contextmenu" */ val CONTEXTMENU: typings.ol.eventTypeMod.EventType.CONTEXTMENU & String = js.native
    
    /* "dblclick" */ val DBLCLICK: typings.ol.eventTypeMod.EventType.DBLCLICK & String = js.native
    
    /* "dragenter" */ val DRAGENTER: typings.ol.eventTypeMod.EventType.DRAGENTER & String = js.native
    
    /* "dragover" */ val DRAGOVER: typings.ol.eventTypeMod.EventType.DRAGOVER & String = js.native
    
    /* "drop" */ val DROP: typings.ol.eventTypeMod.EventType.DROP & String = js.native
    
    /* "error" */ val ERROR: typings.ol.eventTypeMod.EventType.ERROR & String = js.native
    
    /* "focus" */ val FOCUS: typings.ol.eventTypeMod.EventType.FOCUS & String = js.native
    
    /* "keydown" */ val KEYDOWN: typings.ol.eventTypeMod.EventType.KEYDOWN & String = js.native
    
    /* "keypress" */ val KEYPRESS: typings.ol.eventTypeMod.EventType.KEYPRESS & String = js.native
    
    /* "load" */ val LOAD: typings.ol.eventTypeMod.EventType.LOAD & String = js.native
    
    /* "resize" */ val RESIZE: typings.ol.eventTypeMod.EventType.RESIZE & String = js.native
    
    /* "touchmove" */ val TOUCHMOVE: typings.ol.eventTypeMod.EventType.TOUCHMOVE & String = js.native
    
    /* "wheel" */ val WHEEL: typings.ol.eventTypeMod.EventType.WHEEL & String = js.native
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
