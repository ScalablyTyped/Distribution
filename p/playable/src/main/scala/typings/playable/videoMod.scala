package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoMod {
  
  @JSImport("playable/dist/src/constants/events/video", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VideoEvent with String] = js.native
    
    /* "video-events/chunk-loaded" */ val CHUNK_LOADED: typings.playable.videoMod.VideoEvent.CHUNK_LOADED with String = js.native
    
    /* "video-events/current-time-updated" */ val CURRENT_TIME_UPDATED: typings.playable.videoMod.VideoEvent.CURRENT_TIME_UPDATED with String = js.native
    
    /* "video-events/duration-updated" */ val DURATION_UPDATED: typings.playable.videoMod.VideoEvent.DURATION_UPDATED with String = js.native
    
    /* "video-events/dynamic-content-ended" */ val DYNAMIC_CONTENT_ENDED: typings.playable.videoMod.VideoEvent.DYNAMIC_CONTENT_ENDED with String = js.native
    
    /* "video-events/error" */ val ERROR: typings.playable.videoMod.VideoEvent.ERROR with String = js.native
    
    /* "video-events/live-state-changed" */ val LIVE_STATE_CHANGED: typings.playable.videoMod.VideoEvent.LIVE_STATE_CHANGED with String = js.native
    
    /* "video-events/mute-changed" */ val MUTE_CHANGED: typings.playable.videoMod.VideoEvent.MUTE_CHANGED with String = js.native
    
    /* "video-events/play-aborted" */ val PLAY_ABORTED: typings.playable.videoMod.VideoEvent.PLAY_ABORTED with String = js.native
    
    /* "video-events/play-request" */ val PLAY_REQUEST: typings.playable.videoMod.VideoEvent.PLAY_REQUEST with String = js.native
    
    /* "video-events/reset-playback" */ val RESET: typings.playable.videoMod.VideoEvent.RESET with String = js.native
    
    /* "video-events/seek-in-progress" */ val SEEK_IN_PROGRESS: typings.playable.videoMod.VideoEvent.SEEK_IN_PROGRESS with String = js.native
    
    /* "video-events/sound-state-changed" */ val SOUND_STATE_CHANGED: typings.playable.videoMod.VideoEvent.SOUND_STATE_CHANGED with String = js.native
    
    /* "video-events/state-changed" */ val STATE_CHANGED: typings.playable.videoMod.VideoEvent.STATE_CHANGED with String = js.native
    
    /* "video-events/upload-stalled" */ val UPLOAD_STALLED: typings.playable.videoMod.VideoEvent.UPLOAD_STALLED with String = js.native
    
    /* "video-events/upload-suspend" */ val UPLOAD_SUSPEND: typings.playable.videoMod.VideoEvent.UPLOAD_SUSPEND with String = js.native
    
    /* "video-events/volume-changed" */ val VOLUME_CHANGED: typings.playable.videoMod.VideoEvent.VOLUME_CHANGED with String = js.native
  }
  
  @js.native
  sealed trait VideoEvent extends StObject
  @JSImport("playable/dist/src/constants/events/video", "VideoEvent")
  @js.native
  object VideoEvent extends StObject {
    
    @js.native
    sealed trait CHUNK_LOADED extends VideoEvent
    
    @js.native
    sealed trait CURRENT_TIME_UPDATED extends VideoEvent
    
    @js.native
    sealed trait DURATION_UPDATED extends VideoEvent
    
    @js.native
    sealed trait DYNAMIC_CONTENT_ENDED extends VideoEvent
    
    @js.native
    sealed trait ERROR extends VideoEvent
    
    @js.native
    sealed trait LIVE_STATE_CHANGED extends VideoEvent
    
    @js.native
    sealed trait MUTE_CHANGED extends VideoEvent
    
    @js.native
    sealed trait PLAY_ABORTED extends VideoEvent
    
    @js.native
    sealed trait PLAY_REQUEST extends VideoEvent
    
    @js.native
    sealed trait RESET extends VideoEvent
    
    @js.native
    sealed trait SEEK_IN_PROGRESS extends VideoEvent
    
    @js.native
    sealed trait SOUND_STATE_CHANGED extends VideoEvent
    
    @js.native
    sealed trait STATE_CHANGED extends VideoEvent
    
    @js.native
    sealed trait UPLOAD_STALLED extends VideoEvent
    
    @js.native
    sealed trait UPLOAD_SUSPEND extends VideoEvent
    
    @js.native
    sealed trait VOLUME_CHANGED extends VideoEvent
  }
}
