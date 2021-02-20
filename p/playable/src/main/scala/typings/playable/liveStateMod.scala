package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveStateMod {
  
  @JSImport("playable/dist/src/constants/live-state", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LiveState with String] = js.native
    
    /* "live-state/ended" */ val ENDED: typings.playable.liveStateMod.LiveState.ENDED with String = js.native
    
    /* "live-state/initial" */ val INITIAL: typings.playable.liveStateMod.LiveState.INITIAL with String = js.native
    
    /* "live-state/none" */ val NONE: typings.playable.liveStateMod.LiveState.NONE with String = js.native
    
    /* "live-state/not-sync" */ val NOT_SYNC: typings.playable.liveStateMod.LiveState.NOT_SYNC with String = js.native
    
    /* "live-state/sync" */ val SYNC: typings.playable.liveStateMod.LiveState.SYNC with String = js.native
  }
  
  @js.native
  sealed trait LiveState extends StObject
  @JSImport("playable/dist/src/constants/live-state", "LiveState")
  @js.native
  object LiveState extends StObject {
    
    @js.native
    sealed trait ENDED extends LiveState
    
    @js.native
    sealed trait INITIAL extends LiveState
    
    @js.native
    sealed trait NONE extends LiveState
    
    @js.native
    sealed trait NOT_SYNC extends LiveState
    
    @js.native
    sealed trait SYNC extends LiveState
  }
}
