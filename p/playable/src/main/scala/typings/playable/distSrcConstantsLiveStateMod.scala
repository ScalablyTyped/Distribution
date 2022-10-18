package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConstantsLiveStateMod {
  
  @JSImport("playable/dist/src/constants/live-state", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LiveState & String] = js.native
    
    /* "live-state/ended" */ val ENDED: typings.playable.distSrcConstantsLiveStateMod.LiveState.ENDED & String = js.native
    
    /* "live-state/initial" */ val INITIAL: typings.playable.distSrcConstantsLiveStateMod.LiveState.INITIAL & String = js.native
    
    /* "live-state/none" */ val NONE: typings.playable.distSrcConstantsLiveStateMod.LiveState.NONE & String = js.native
    
    /* "live-state/not-sync" */ val NOT_SYNC: typings.playable.distSrcConstantsLiveStateMod.LiveState.NOT_SYNC & String = js.native
    
    /* "live-state/sync" */ val SYNC: typings.playable.distSrcConstantsLiveStateMod.LiveState.SYNC & String = js.native
  }
  
  @js.native
  sealed trait LiveState extends StObject
  @JSImport("playable/dist/src/constants/live-state", "LiveState")
  @js.native
  object LiveState extends StObject {
    
    @js.native
    sealed trait ENDED
      extends StObject
         with LiveState
    
    @js.native
    sealed trait INITIAL
      extends StObject
         with LiveState
    
    @js.native
    sealed trait NONE
      extends StObject
         with LiveState
    
    @js.native
    sealed trait NOT_SYNC
      extends StObject
         with LiveState
    
    @js.native
    sealed trait SYNC
      extends StObject
         with LiveState
  }
}
