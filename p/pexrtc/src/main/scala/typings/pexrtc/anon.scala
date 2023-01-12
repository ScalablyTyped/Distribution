package typings.pexrtc

import typings.pexrtc.PexRTC.AudioStatistics
import typings.pexrtc.PexRTC.LayoutTypes
import typings.pexrtc.PexRTC.VideoStatistics
import typings.pexrtc.pexrtcStrings.`video-only`
import typings.pexrtc.pexrtcStrings.audio
import typings.pexrtc.pexrtcStrings.keep_conference_alive
import typings.pexrtc.pexrtcStrings.keep_conference_alive_if_multiple
import typings.pexrtc.pexrtcStrings.keep_conference_alive_never
import typings.pexrtc.pexrtcStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Audio extends StObject {
    
    var audio: AudioStatistics
    
    var video: VideoStatistics
  }
  object Audio {
    
    inline def apply(audio: AudioStatistics, video: VideoStatistics): Audio = {
      val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[Audio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Audio] (val x: Self) extends AnyVal {
      
      inline def setAudio(value: AudioStatistics): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setVideo(value: VideoStatistics): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
  
  trait Calltype extends StObject {
    
    var call_type: js.UndefOr[video | `video-only` | audio] = js.undefined
    
    var dtmf_sequence: js.UndefOr[String] = js.undefined
    
    var keep_conference_alive: js.UndefOr[
        typings.pexrtc.pexrtcStrings.keep_conference_alive | keep_conference_alive_if_multiple | keep_conference_alive_never
      ] = js.undefined
    
    var overlay_text: js.UndefOr[String] = js.undefined
    
    var presentation_uri: js.UndefOr[String] = js.undefined
    
    var remote_display_name: js.UndefOr[String] = js.undefined
    
    var streaming: js.UndefOr[Boolean] = js.undefined
  }
  object Calltype {
    
    inline def apply(): Calltype = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Calltype]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Calltype] (val x: Self) extends AnyVal {
      
      inline def setCall_type(value: video | `video-only` | audio): Self = StObject.set(x, "call_type", value.asInstanceOf[js.Any])
      
      inline def setCall_typeUndefined: Self = StObject.set(x, "call_type", js.undefined)
      
      inline def setDtmf_sequence(value: String): Self = StObject.set(x, "dtmf_sequence", value.asInstanceOf[js.Any])
      
      inline def setDtmf_sequenceUndefined: Self = StObject.set(x, "dtmf_sequence", js.undefined)
      
      inline def setKeep_conference_alive(value: keep_conference_alive | keep_conference_alive_if_multiple | keep_conference_alive_never): Self = StObject.set(x, "keep_conference_alive", value.asInstanceOf[js.Any])
      
      inline def setKeep_conference_aliveUndefined: Self = StObject.set(x, "keep_conference_alive", js.undefined)
      
      inline def setOverlay_text(value: String): Self = StObject.set(x, "overlay_text", value.asInstanceOf[js.Any])
      
      inline def setOverlay_textUndefined: Self = StObject.set(x, "overlay_text", js.undefined)
      
      inline def setPresentation_uri(value: String): Self = StObject.set(x, "presentation_uri", value.asInstanceOf[js.Any])
      
      inline def setPresentation_uriUndefined: Self = StObject.set(x, "presentation_uri", js.undefined)
      
      inline def setRemote_display_name(value: String): Self = StObject.set(x, "remote_display_name", value.asInstanceOf[js.Any])
      
      inline def setRemote_display_nameUndefined: Self = StObject.set(x, "remote_display_name", js.undefined)
      
      inline def setStreaming(value: Boolean): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
      
      inline def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
    }
  }
  
  trait Credential extends StObject {
    
    var credential: String
    
    var url: String
    
    var username: String
  }
  object Credential {
    
    inline def apply(credential: String, url: String, username: String): Credential = {
      val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credential]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Credential] (val x: Self) extends AnyVal {
      
      inline def setCredential(value: String): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait Enableactivespeakerindication extends StObject {
    
    var enable_active_speaker_indication: Boolean
    
    var enable_overlay_text: Boolean
    
    var free_form_overlay_text: String
    
    var guest_layout: LayoutTypes
    
    var host_layout: LayoutTypes
    
    var layout: LayoutTypes
    
    var recording_indicator: Boolean
    
    var streaming: Indicatorsenabled
    
    var streaming_indicator: Boolean
  }
  object Enableactivespeakerindication {
    
    inline def apply(
      enable_active_speaker_indication: Boolean,
      enable_overlay_text: Boolean,
      free_form_overlay_text: String,
      guest_layout: LayoutTypes,
      host_layout: LayoutTypes,
      layout: LayoutTypes,
      recording_indicator: Boolean,
      streaming: Indicatorsenabled,
      streaming_indicator: Boolean
    ): Enableactivespeakerindication = {
      val __obj = js.Dynamic.literal(enable_active_speaker_indication = enable_active_speaker_indication.asInstanceOf[js.Any], enable_overlay_text = enable_overlay_text.asInstanceOf[js.Any], free_form_overlay_text = free_form_overlay_text.asInstanceOf[js.Any], guest_layout = guest_layout.asInstanceOf[js.Any], host_layout = host_layout.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], recording_indicator = recording_indicator.asInstanceOf[js.Any], streaming = streaming.asInstanceOf[js.Any], streaming_indicator = streaming_indicator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enableactivespeakerindication]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Enableactivespeakerindication] (val x: Self) extends AnyVal {
      
      inline def setEnable_active_speaker_indication(value: Boolean): Self = StObject.set(x, "enable_active_speaker_indication", value.asInstanceOf[js.Any])
      
      inline def setEnable_overlay_text(value: Boolean): Self = StObject.set(x, "enable_overlay_text", value.asInstanceOf[js.Any])
      
      inline def setFree_form_overlay_text(value: String): Self = StObject.set(x, "free_form_overlay_text", value.asInstanceOf[js.Any])
      
      inline def setGuest_layout(value: LayoutTypes): Self = StObject.set(x, "guest_layout", value.asInstanceOf[js.Any])
      
      inline def setHost_layout(value: LayoutTypes): Self = StObject.set(x, "host_layout", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: LayoutTypes): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setRecording_indicator(value: Boolean): Self = StObject.set(x, "recording_indicator", value.asInstanceOf[js.Any])
      
      inline def setStreaming(value: Indicatorsenabled): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
      
      inline def setStreaming_indicator(value: Boolean): Self = StObject.set(x, "streaming_indicator", value.asInstanceOf[js.Any])
    }
  }
  
  trait Guestmuted extends StObject {
    
    var guest_muted: Boolean
    
    var locked: Boolean
    
    var started: Boolean
  }
  object Guestmuted {
    
    inline def apply(guest_muted: Boolean, locked: Boolean, started: Boolean): Guestmuted = {
      val __obj = js.Dynamic.literal(guest_muted = guest_muted.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
      __obj.asInstanceOf[Guestmuted]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Guestmuted] (val x: Self) extends AnyVal {
      
      inline def setGuest_muted(value: Boolean): Self = StObject.set(x, "guest_muted", value.asInstanceOf[js.Any])
      
      inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      inline def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    }
  }
  
  trait IceServers extends StObject {
    
    val iceServers: js.Array[Double]
  }
  object IceServers {
    
    inline def apply(iceServers: js.Array[Double]): IceServers = {
      val __obj = js.Dynamic.literal(iceServers = iceServers.asInstanceOf[js.Any])
      __obj.asInstanceOf[IceServers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IceServers] (val x: Self) extends AnyVal {
      
      inline def setIceServers(value: js.Array[Double]): Self = StObject.set(x, "iceServers", value.asInstanceOf[js.Any])
      
      inline def setIceServersVarargs(value: Double*): Self = StObject.set(x, "iceServers", js.Array(value*))
    }
  }
  
  trait Indicatorsenabled extends StObject {
    
    var indicators_enabled: Boolean
    
    var layout: LayoutTypes
    
    var plus_n_pip_enabled: Boolean
    
    var waiting_screen_enabled: Boolean
  }
  object Indicatorsenabled {
    
    inline def apply(
      indicators_enabled: Boolean,
      layout: LayoutTypes,
      plus_n_pip_enabled: Boolean,
      waiting_screen_enabled: Boolean
    ): Indicatorsenabled = {
      val __obj = js.Dynamic.literal(indicators_enabled = indicators_enabled.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], plus_n_pip_enabled = plus_n_pip_enabled.asInstanceOf[js.Any], waiting_screen_enabled = waiting_screen_enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Indicatorsenabled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Indicatorsenabled] (val x: Self) extends AnyVal {
      
      inline def setIndicators_enabled(value: Boolean): Self = StObject.set(x, "indicators_enabled", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: LayoutTypes): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setPlus_n_pip_enabled(value: Boolean): Self = StObject.set(x, "plus_n_pip_enabled", value.asInstanceOf[js.Any])
      
      inline def setWaiting_screen_enabled(value: Boolean): Self = StObject.set(x, "waiting_screen_enabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait MutedAudio extends StObject {
    
    val mutedAudio: Boolean
    
    val mutedVideo: Boolean
  }
  object MutedAudio {
    
    inline def apply(mutedAudio: Boolean, mutedVideo: Boolean): MutedAudio = {
      val __obj = js.Dynamic.literal(mutedAudio = mutedAudio.asInstanceOf[js.Any], mutedVideo = mutedVideo.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutedAudio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MutedAudio] (val x: Self) extends AnyVal {
      
      inline def setMutedAudio(value: Boolean): Self = StObject.set(x, "mutedAudio", value.asInstanceOf[js.Any])
      
      inline def setMutedVideo(value: Boolean): Self = StObject.set(x, "mutedVideo", value.asInstanceOf[js.Any])
    }
  }
  
  trait Participantuuid extends StObject {
    
    var participant_uuid: String
    
    var stage_index: Double
    
    var vad: Double
  }
  object Participantuuid {
    
    inline def apply(participant_uuid: String, stage_index: Double, vad: Double): Participantuuid = {
      val __obj = js.Dynamic.literal(participant_uuid = participant_uuid.asInstanceOf[js.Any], stage_index = stage_index.asInstanceOf[js.Any], vad = vad.asInstanceOf[js.Any])
      __obj.asInstanceOf[Participantuuid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Participantuuid] (val x: Self) extends AnyVal {
      
      inline def setParticipant_uuid(value: String): Self = StObject.set(x, "participant_uuid", value.asInstanceOf[js.Any])
      
      inline def setStage_index(value: Double): Self = StObject.set(x, "stage_index", value.asInstanceOf[js.Any])
      
      inline def setVad(value: Double): Self = StObject.set(x, "vad", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<pexrtc.PexRTC.AnyParticipant, 'uuid'> */
  trait PickAnyParticipantuuid extends StObject {
    
    var uuid: js.UndefOr[Any] = js.undefined
  }
  object PickAnyParticipantuuid {
    
    inline def apply(): PickAnyParticipantuuid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickAnyParticipantuuid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickAnyParticipantuuid] (val x: Self) extends AnyVal {
      
      inline def setUuid(value: Any): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var result: js.Array[String]
  }
  object Result {
    
    inline def apply(result: js.Array[String]): Result = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setResult(value: js.Array[String]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultVarargs(value: String*): Self = StObject.set(x, "result", js.Array(value*))
    }
  }
  
  trait Status extends StObject {
    
    var status: String
  }
  object Status {
    
    inline def apply(status: String): Status = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
