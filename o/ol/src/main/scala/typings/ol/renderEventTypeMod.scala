package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/render/EventType", JSImport.Namespace)
@js.native
object renderEventTypeMod extends js.Object {
  
  @js.native
  sealed trait EventType extends js.Object
  @js.native
  object EventType extends js.Object {
    
    @js.native
    sealed trait POSTCOMPOSE extends EventType
    
    @js.native
    sealed trait POSTRENDER extends EventType
    
    @js.native
    sealed trait PRECOMPOSE extends EventType
    
    @js.native
    sealed trait PRERENDER extends EventType
    
    @js.native
    sealed trait RENDERCOMPLETE extends EventType
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventType with String] = js.native
    
    /* "postcompose" */ val POSTCOMPOSE: typings.ol.renderEventTypeMod.EventType.POSTCOMPOSE with String = js.native
    
    /* "postrender" */ val POSTRENDER: typings.ol.renderEventTypeMod.EventType.POSTRENDER with String = js.native
    
    /* "precompose" */ val PRECOMPOSE: typings.ol.renderEventTypeMod.EventType.PRECOMPOSE with String = js.native
    
    /* "prerender" */ val PRERENDER: typings.ol.renderEventTypeMod.EventType.PRERENDER with String = js.native
    
    /* "rendercomplete" */ val RENDERCOMPLETE: typings.ol.renderEventTypeMod.EventType.RENDERCOMPLETE with String = js.native
  }
}
