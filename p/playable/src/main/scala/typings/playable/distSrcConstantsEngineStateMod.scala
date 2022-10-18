package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConstantsEngineStateMod {
  
  @JSImport("playable/dist/src/constants/engine-state", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EngineState & String] = js.native
    
    /* "engine-state/ended" */ val ENDED: typings.playable.distSrcConstantsEngineStateMod.EngineState.ENDED & String = js.native
    
    /* "engine-state/load-started" */ val LOAD_STARTED: typings.playable.distSrcConstantsEngineStateMod.EngineState.LOAD_STARTED & String = js.native
    
    /* "engine-state/metadata-loaded" */ val METADATA_LOADED: typings.playable.distSrcConstantsEngineStateMod.EngineState.METADATA_LOADED & String = js.native
    
    /* "engine-state/paused" */ val PAUSED: typings.playable.distSrcConstantsEngineStateMod.EngineState.PAUSED & String = js.native
    
    /* "engine-state/playing" */ val PLAYING: typings.playable.distSrcConstantsEngineStateMod.EngineState.PLAYING & String = js.native
    
    /* "engine-state/play-requested" */ val PLAY_REQUESTED: typings.playable.distSrcConstantsEngineStateMod.EngineState.PLAY_REQUESTED & String = js.native
    
    /* "engine-state/ready-to-play" */ val READY_TO_PLAY: typings.playable.distSrcConstantsEngineStateMod.EngineState.READY_TO_PLAY & String = js.native
    
    /* "engine-state/seek-in-progress" */ val SEEK_IN_PROGRESS: typings.playable.distSrcConstantsEngineStateMod.EngineState.SEEK_IN_PROGRESS & String = js.native
    
    /* "engine-state/src-set" */ val SRC_SET: typings.playable.distSrcConstantsEngineStateMod.EngineState.SRC_SET & String = js.native
    
    /* "engine-state/waiting" */ val WAITING: typings.playable.distSrcConstantsEngineStateMod.EngineState.WAITING & String = js.native
  }
  
  @js.native
  sealed trait EngineState extends StObject
  @JSImport("playable/dist/src/constants/engine-state", "EngineState")
  @js.native
  object EngineState extends StObject {
    
    @js.native
    sealed trait ENDED
      extends StObject
         with EngineState
    
    @js.native
    sealed trait LOAD_STARTED
      extends StObject
         with EngineState
    
    @js.native
    sealed trait METADATA_LOADED
      extends StObject
         with EngineState
    
    @js.native
    sealed trait PAUSED
      extends StObject
         with EngineState
    
    @js.native
    sealed trait PLAYING
      extends StObject
         with EngineState
    
    @js.native
    sealed trait PLAY_REQUESTED
      extends StObject
         with EngineState
    
    @js.native
    sealed trait READY_TO_PLAY
      extends StObject
         with EngineState
    
    @js.native
    sealed trait SEEK_IN_PROGRESS
      extends StObject
         with EngineState
    
    @js.native
    sealed trait SRC_SET
      extends StObject
         with EngineState
    
    @js.native
    sealed trait WAITING
      extends StObject
         with EngineState
  }
}
