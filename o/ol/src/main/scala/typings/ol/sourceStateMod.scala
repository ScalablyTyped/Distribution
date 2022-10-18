package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceStateMod {
  
  @JSImport("ol/source/State", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[State & String] = js.native
    
    /* "error" */ val ERROR: typings.ol.sourceStateMod.State.ERROR & String = js.native
    
    /* "loading" */ val LOADING: typings.ol.sourceStateMod.State.LOADING & String = js.native
    
    /* "ready" */ val READY: typings.ol.sourceStateMod.State.READY & String = js.native
    
    /* "undefined" */ val UNDEFINED: typings.ol.sourceStateMod.State.UNDEFINED & String = js.native
  }
  
  @js.native
  sealed trait State extends StObject
  @JSImport("ol/source/State", "State")
  @js.native
  object State extends StObject {
    
    @js.native
    sealed trait ERROR
      extends StObject
         with State
    
    @js.native
    sealed trait LOADING
      extends StObject
         with State
    
    @js.native
    sealed trait READY
      extends StObject
         with State
    
    @js.native
    sealed trait UNDEFINED
      extends StObject
         with State
  }
}
