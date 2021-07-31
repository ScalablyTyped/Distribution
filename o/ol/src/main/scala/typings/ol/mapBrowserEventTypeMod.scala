package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapBrowserEventTypeMod {
  
  @JSImport("ol/MapBrowserEventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MapBrowserEventType & String] = js.native
    
    /* "click" */ val CLICK: typings.ol.mapBrowserEventTypeMod.MapBrowserEventType.CLICK & String = js.native
    
    /* "dblclick" */ val DBLCLICK: typings.ol.mapBrowserEventTypeMod.MapBrowserEventType.DBLCLICK & String = js.native
    
    /* "pointercancel" */ val POINTERCANCEL: typings.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERCANCEL & String = js.native
    
    /* "pointerdown" */ val POINTERDOWN: typings.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERDOWN & String = js.native
    
    /* "pointerdrag" */ val POINTERDRAG: typings.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERDRAG & String = js.native
    
    /* "pointerenter" */ val POINTERENTER: typings.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERENTER & String = js.native
    
    /* "pointerleave" */ val POINTERLEAVE: typings.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERLEAVE & String = js.native
    
    /* "pointermove" */ val POINTERMOVE: typings.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERMOVE & String = js.native
    
    /* "pointerout" */ val POINTEROUT: typings.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTEROUT & String = js.native
    
    /* "pointerover" */ val POINTEROVER: typings.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTEROVER & String = js.native
    
    /* "pointerup" */ val POINTERUP: typings.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERUP & String = js.native
    
    /* "singleclick" */ val SINGLECLICK: typings.ol.mapBrowserEventTypeMod.MapBrowserEventType.SINGLECLICK & String = js.native
  }
  
  @js.native
  sealed trait MapBrowserEventType extends StObject
  @JSImport("ol/MapBrowserEventType", "MapBrowserEventType")
  @js.native
  object MapBrowserEventType extends StObject {
    
    @js.native
    sealed trait CLICK
      extends StObject
         with MapBrowserEventType
    
    @js.native
    sealed trait DBLCLICK
      extends StObject
         with MapBrowserEventType
    
    @js.native
    sealed trait POINTERCANCEL
      extends StObject
         with MapBrowserEventType
    
    @js.native
    sealed trait POINTERDOWN
      extends StObject
         with MapBrowserEventType
    
    @js.native
    sealed trait POINTERDRAG
      extends StObject
         with MapBrowserEventType
    
    @js.native
    sealed trait POINTERENTER
      extends StObject
         with MapBrowserEventType
    
    @js.native
    sealed trait POINTERLEAVE
      extends StObject
         with MapBrowserEventType
    
    @js.native
    sealed trait POINTERMOVE
      extends StObject
         with MapBrowserEventType
    
    @js.native
    sealed trait POINTEROUT
      extends StObject
         with MapBrowserEventType
    
    @js.native
    sealed trait POINTEROVER
      extends StObject
         with MapBrowserEventType
    
    @js.native
    sealed trait POINTERUP
      extends StObject
         with MapBrowserEventType
    
    @js.native
    sealed trait SINGLECLICK
      extends StObject
         with MapBrowserEventType
  }
}
