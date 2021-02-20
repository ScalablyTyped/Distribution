package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerEventTypeMod {
  
  @JSImport("ol/pointer/EventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventType with String] = js.native
    
    /* "pointercancel" */ val POINTERCANCEL: typings.ol.pointerEventTypeMod.EventType.POINTERCANCEL with String = js.native
    
    /* "pointerdown" */ val POINTERDOWN: typings.ol.pointerEventTypeMod.EventType.POINTERDOWN with String = js.native
    
    /* "pointerenter" */ val POINTERENTER: typings.ol.pointerEventTypeMod.EventType.POINTERENTER with String = js.native
    
    /* "pointerleave" */ val POINTERLEAVE: typings.ol.pointerEventTypeMod.EventType.POINTERLEAVE with String = js.native
    
    /* "pointermove" */ val POINTERMOVE: typings.ol.pointerEventTypeMod.EventType.POINTERMOVE with String = js.native
    
    /* "pointerout" */ val POINTEROUT: typings.ol.pointerEventTypeMod.EventType.POINTEROUT with String = js.native
    
    /* "pointerover" */ val POINTEROVER: typings.ol.pointerEventTypeMod.EventType.POINTEROVER with String = js.native
    
    /* "pointerup" */ val POINTERUP: typings.ol.pointerEventTypeMod.EventType.POINTERUP with String = js.native
  }
  
  @js.native
  sealed trait EventType extends StObject
  @JSImport("ol/pointer/EventType", "EventType")
  @js.native
  object EventType extends StObject {
    
    @js.native
    sealed trait POINTERCANCEL extends EventType
    
    @js.native
    sealed trait POINTERDOWN extends EventType
    
    @js.native
    sealed trait POINTERENTER extends EventType
    
    @js.native
    sealed trait POINTERLEAVE extends EventType
    
    @js.native
    sealed trait POINTERMOVE extends EventType
    
    @js.native
    sealed trait POINTEROUT extends EventType
    
    @js.native
    sealed trait POINTEROVER extends EventType
    
    @js.native
    sealed trait POINTERUP extends EventType
  }
}
