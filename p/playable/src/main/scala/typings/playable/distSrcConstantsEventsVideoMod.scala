package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConstantsEventsVideoMod {
  
  @JSImport("playable/dist/src/constants/events/video", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VideoEvent & String] = js.native
    
    /* "video-events/chunk-loaded" */ val CHUNK_LOADED: typings.playable.distSrcConstantsEventsVideoMod.VideoEvent.CHUNK_LOADED & String = js.native
    
    /* "video-events/current-time-updated" */ val CURRENT_TIME_UPDATED: typings.playable.distSrcConstantsEventsVideoMod.VideoEvent.CURRENT_TIME_UPDATED & String = js.native
    
    /* "video-events/duration-updated" */ val DURATION_UPDATED: typings.playable.distSrcConstantsEventsVideoMod.VideoEvent.DURATION_UPDATED & String = js.native
    
    /* "video-events/dynamic-content-ended" */ val DYNAMIC_CONTENT_ENDED: typings.playable.distSrcConstantsEventsVideoMod.VideoEvent.DYNAMIC_CONTENT_ENDED & String = js.native
    
    /* "video-events/error" */ val ERROR: typings.playable.distSrcConstantsEventsVideoMod.VideoEvent.ERROR & String = js.native
    
    /* "video-events/live-state-changed" */ val LIVE_STATE_CHANGED: typings.playable.distSrcConstantsEventsVideoMod.VideoEvent.LIVE_STATE_CHANGED & String = js.native
    
    /* "video-events/mute-changed" */ val MUTE_CHANGED: typings.playable.distSrcConstantsEventsVideoMod.VideoEvent.MUTE_CHANGED & String = js.native
    
    /* "video-events/play-aborted" */ val PLAY_ABORTED: typings.playable.distSrcConstantsEventsVideoMod.VideoEvent.PLAY_ABORTED & String = js.native
    
    /* "video-events/play-request" */ val PLAY_REQUEST: typings.playable.distSrcConstantsEventsVideoMod.VideoEvent.PLAY_REQUEST & String = js.native
    
    /* "video-events/reset-playback" */ val RESET: typings.playable.distSrcConstantsEventsVideoMod.VideoEvent.RESET & String = js.native
    
    /* "video-events/seek-in-progress" */ val SEEK_IN_PROGRESS: typings.playable.distSrcConstantsEventsVideoMod.VideoEvent.SEEK_IN_PROGRESS & String = js.native
    
    /* "video-events/sound-state-changed" */ val SOUND_STATE_CHANGED: typings.playable.distSrcConstantsEventsVideoMod.VideoEvent.SOUND_STATE_CHANGED & String = js.native
    
    /* "video-events/state-changed" */ val STATE_CHANGED: typings.playable.distSrcConstantsEventsVideoMod.VideoEvent.STATE_CHANGED & String = js.native
    
    /* "video-events/upload-stalled" */ val UPLOAD_STALLED: typings.playable.distSrcConstantsEventsVideoMod.VideoEvent.UPLOAD_STALLED & String = js.native
    
    /* "video-events/upload-suspend" */ val UPLOAD_SUSPEND: typings.playable.distSrcConstantsEventsVideoMod.VideoEvent.UPLOAD_SUSPEND & String = js.native
    
    /* "video-events/volume-changed" */ val VOLUME_CHANGED: typings.playable.distSrcConstantsEventsVideoMod.VideoEvent.VOLUME_CHANGED & String = js.native
  }
  
  @js.native
  sealed trait VideoEvent extends StObject
  @JSImport("playable/dist/src/constants/events/video", "VideoEvent")
  @js.native
  object VideoEvent extends StObject {
    
    @js.native
    sealed trait CHUNK_LOADED
      extends StObject
         with VideoEvent
    
    @js.native
    sealed trait CURRENT_TIME_UPDATED
      extends StObject
         with VideoEvent
    
    @js.native
    sealed trait DURATION_UPDATED
      extends StObject
         with VideoEvent
    
    @js.native
    sealed trait DYNAMIC_CONTENT_ENDED
      extends StObject
         with VideoEvent
    
    @js.native
    sealed trait ERROR
      extends StObject
         with VideoEvent
    
    @js.native
    sealed trait LIVE_STATE_CHANGED
      extends StObject
         with VideoEvent
    
    @js.native
    sealed trait MUTE_CHANGED
      extends StObject
         with VideoEvent
    
    @js.native
    sealed trait PLAY_ABORTED
      extends StObject
         with VideoEvent
    
    @js.native
    sealed trait PLAY_REQUEST
      extends StObject
         with VideoEvent
    
    @js.native
    sealed trait RESET
      extends StObject
         with VideoEvent
    
    @js.native
    sealed trait SEEK_IN_PROGRESS
      extends StObject
         with VideoEvent
    
    @js.native
    sealed trait SOUND_STATE_CHANGED
      extends StObject
         with VideoEvent
    
    @js.native
    sealed trait STATE_CHANGED
      extends StObject
         with VideoEvent
    
    @js.native
    sealed trait UPLOAD_STALLED
      extends StObject
         with VideoEvent
    
    @js.native
    sealed trait UPLOAD_SUSPEND
      extends StObject
         with VideoEvent
    
    @js.native
    sealed trait VOLUME_CHANGED
      extends StObject
         with VideoEvent
  }
}
