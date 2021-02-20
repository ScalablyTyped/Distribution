package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineStateMod {
  
  @JSImport("playable/dist/src/constants/engine-state", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EngineState with String] = js.native
    
    /* "engine-state/ended" */ val ENDED: typings.playable.engineStateMod.EngineState.ENDED with String = js.native
    
    /* "engine-state/load-started" */ val LOAD_STARTED: typings.playable.engineStateMod.EngineState.LOAD_STARTED with String = js.native
    
    /* "engine-state/metadata-loaded" */ val METADATA_LOADED: typings.playable.engineStateMod.EngineState.METADATA_LOADED with String = js.native
    
    /* "engine-state/paused" */ val PAUSED: typings.playable.engineStateMod.EngineState.PAUSED with String = js.native
    
    /* "engine-state/playing" */ val PLAYING: typings.playable.engineStateMod.EngineState.PLAYING with String = js.native
    
    /* "engine-state/play-requested" */ val PLAY_REQUESTED: typings.playable.engineStateMod.EngineState.PLAY_REQUESTED with String = js.native
    
    /* "engine-state/ready-to-play" */ val READY_TO_PLAY: typings.playable.engineStateMod.EngineState.READY_TO_PLAY with String = js.native
    
    /* "engine-state/seek-in-progress" */ val SEEK_IN_PROGRESS: typings.playable.engineStateMod.EngineState.SEEK_IN_PROGRESS with String = js.native
    
    /* "engine-state/src-set" */ val SRC_SET: typings.playable.engineStateMod.EngineState.SRC_SET with String = js.native
    
    /* "engine-state/waiting" */ val WAITING: typings.playable.engineStateMod.EngineState.WAITING with String = js.native
  }
  
  @js.native
  sealed trait EngineState extends StObject
  @JSImport("playable/dist/src/constants/engine-state", "EngineState")
  @js.native
  object EngineState extends StObject {
    
    @js.native
    sealed trait ENDED extends EngineState
    
    @js.native
    sealed trait LOAD_STARTED extends EngineState
    
    @js.native
    sealed trait METADATA_LOADED extends EngineState
    
    @js.native
    sealed trait PAUSED extends EngineState
    
    @js.native
    sealed trait PLAYING extends EngineState
    
    @js.native
    sealed trait PLAY_REQUESTED extends EngineState
    
    @js.native
    sealed trait READY_TO_PLAY extends EngineState
    
    @js.native
    sealed trait SEEK_IN_PROGRESS extends EngineState
    
    @js.native
    sealed trait SRC_SET extends EngineState
    
    @js.native
    sealed trait WAITING extends EngineState
  }
}
