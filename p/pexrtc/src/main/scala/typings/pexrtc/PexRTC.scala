package typings.pexrtc

import org.scalablytyped.runtime.StringDictionary
import typings.pexrtc.PexRTC.AnyParticipant
import typings.pexrtc.PexRTC.CallTypes
import typings.pexrtc.PexRTC.ChatMessage
import typings.pexrtc.PexRTC.LayoutResponse
import typings.pexrtc.PexRTC.Participant
import typings.pexrtc.PexRTC.ParticipantRole
import typings.pexrtc.PexRTC.PexMediaStream
import typings.pexrtc.PexRTC.PinStatus
import typings.pexrtc.PexRTC.Role
import typings.pexrtc.PexRTC.ServiceType
import typings.pexrtc.PexRTC.Statistics
import typings.pexrtc.anon.Audio
import typings.pexrtc.anon.Calltype
import typings.pexrtc.anon.Credential
import typings.pexrtc.anon.Enableactivespeakerindication
import typings.pexrtc.anon.Guestmuted
import typings.pexrtc.anon.IceServers
import typings.pexrtc.anon.MutedAudio
import typings.pexrtc.anon.Participantuuid
import typings.pexrtc.anon.PickAnyParticipantuuid
import typings.pexrtc.anon.Result
import typings.pexrtc.anon.Status
import typings.pexrtc.pexrtcBooleans.`false`
import typings.pexrtc.pexrtcStrings.allow
import typings.pexrtc.pexrtcStrings.auto
import typings.pexrtc.pexrtcStrings.chair
import typings.pexrtc.pexrtcStrings.continue
import typings.pexrtc.pexrtcStrings.deny
import typings.pexrtc.pexrtcStrings.down
import typings.pexrtc.pexrtcStrings.gateway
import typings.pexrtc.pexrtcStrings.guest_
import typings.pexrtc.pexrtcStrings.h323
import typings.pexrtc.pexrtcStrings.in
import typings.pexrtc.pexrtcStrings.left
import typings.pexrtc.pexrtcStrings.mssip
import typings.pexrtc.pexrtcStrings.out
import typings.pexrtc.pexrtcStrings.pan
import typings.pexrtc.pexrtcStrings.right
import typings.pexrtc.pexrtcStrings.rtmp
import typings.pexrtc.pexrtcStrings.screen
import typings.pexrtc.pexrtcStrings.sip
import typings.pexrtc.pexrtcStrings.standard
import typings.pexrtc.pexrtcStrings.start
import typings.pexrtc.pexrtcStrings.stop
import typings.pexrtc.pexrtcStrings.test_call
import typings.pexrtc.pexrtcStrings.tilt
import typings.pexrtc.pexrtcStrings.up
import typings.pexrtc.pexrtcStrings.zoom
import typings.std.EventSource
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PexRTC extends StObject {
  
  def addCall(): Unit = js.native
  def addCall(call_type: CallTypes): Unit = js.native
  
  /**
    * ## Undocumented fields
    */
  val allow_1080p: Boolean = js.native
  
  val analytics_enabled: Boolean = js.native
  
  /**
    * ## Instance variables
    *
    * A few additional configuration changes can be undertaken via instance
    * variables on the PexRTC object, before calling makeCall:
    */
  /**
    * audio_source, video_source
    * Values can be:
    * null: default sources
    * false: do not request
    * string: a uuid of a media source gathered through device enumeration (Chrome only)
    */
  var audio_source: String | Null | `false` = js.native
  
  var bandwidth_in: Double = js.native
  
  var bandwidth_out: Double = js.native
  
  val basic_password: String = js.native
  
  val basic_username: String = js.native
  
  val call: MutedAudio = js.native
  
  var call_tag: String = js.native
  
  val call_type: Unit = js.native
  
  /**
    * ## Fields
    *
    * The following fields on the PexRTC object are immutable but can be probed
    * after onSetup, and provide useful information about the connection:
    */
  val chat_enabled: Boolean = js.native
  
  val chrome_ver: Double = js.native
  
  def clearAllBuzz(): Unit = js.native
  
  def clearBuzz(uuid: String): Unit = js.native
  
  val conference: String = js.native
  
  val conference_extension: String = js.native
  
  val conference_name: String = js.native
  
  val conference_uri: String = js.native
  
  def connect(): Unit = js.native
  def connect(pin: String): Unit = js.native
  def connect(pin: String, `extension`: String): Unit = js.native
  def connect(pin: Null, `extension`: String): Unit = js.native
  
  val current_service_type: ServiceType = js.native
  
  var default_stun: String = js.native
  
  /**
    * ## Conference control functions
    */
  def dialOut(destination: String): Unit = js.native
  def dialOut(destination: String, protocol: sip | h323 | rtmp | mssip | auto): Unit = js.native
  def dialOut(
    destination: String,
    protocol: sip | h323 | rtmp | mssip | auto,
    role: Unit,
    cb: js.Function1[/* res */ Result, Unit]
  ): Unit = js.native
  def dialOut(
    destination: String,
    protocol: sip | h323 | rtmp | mssip | auto,
    role: Unit,
    cb: js.Function1[/* res */ Result, Unit],
    params: Calltype
  ): Unit = js.native
  def dialOut(
    destination: String,
    protocol: sip | h323 | rtmp | mssip | auto,
    role: Unit,
    cb: Unit,
    params: Calltype
  ): Unit = js.native
  def dialOut(destination: String, protocol: sip | h323 | rtmp | mssip | auto, role: Role): Unit = js.native
  def dialOut(
    destination: String,
    protocol: sip | h323 | rtmp | mssip | auto,
    role: Role,
    cb: js.Function1[/* res */ Result, Unit]
  ): Unit = js.native
  def dialOut(
    destination: String,
    protocol: sip | h323 | rtmp | mssip | auto,
    role: Role,
    cb: js.Function1[/* res */ Result, Unit],
    params: Calltype
  ): Unit = js.native
  def dialOut(
    destination: String,
    protocol: sip | h323 | rtmp | mssip | auto,
    role: Role,
    cb: Unit,
    params: Calltype
  ): Unit = js.native
  def dialOut(destination: String, protocol: Unit, role: Unit, cb: js.Function1[/* res */ Result, Unit]): Unit = js.native
  def dialOut(
    destination: String,
    protocol: Unit,
    role: Unit,
    cb: js.Function1[/* res */ Result, Unit],
    params: Calltype
  ): Unit = js.native
  def dialOut(destination: String, protocol: Unit, role: Unit, cb: Unit, params: Calltype): Unit = js.native
  def dialOut(destination: String, protocol: Unit, role: Role): Unit = js.native
  def dialOut(destination: String, protocol: Unit, role: Role, cb: js.Function1[/* res */ Result, Unit]): Unit = js.native
  def dialOut(
    destination: String,
    protocol: Unit,
    role: Role,
    cb: js.Function1[/* res */ Result, Unit],
    params: Calltype
  ): Unit = js.native
  def dialOut(destination: String, protocol: Unit, role: Role, cb: Unit, params: Calltype): Unit = js.native
  
  def disconnect(): Unit = js.native
  
  def disconnectAll(): Unit = js.native
  
  def disconnectParticipant(uuid: String): Unit = js.native
  
  def disconnectcall(): Unit = js.native
  
  val display_name: String = js.native
  
  val edge_ver: Double = js.native
  
  val error: String = js.native
  
  val event_listener: String = js.native
  
  val event_source: EventSource = js.native
  
  val event_source_timeout: Double = js.native
  
  val fecc_enabled: Boolean = js.native
  
  val firefox_ver: Double = js.native
  
  val flash: Unit = js.native
  
  val force_hd: Double = js.native
  
  def getMediaStatistics(): Statistics = js.native
  
  def getPresentation(): Unit = js.native
  
  val guests_can_present: Boolean = js.native
  
  val h264_enabled: Boolean = js.native
  
  var ice_timeout: Double = js.native
  
  val is_android: Boolean = js.native
  
  val is_electron: Boolean = js.native
  
  val is_mobile: Boolean = js.native
  
  val last_ping: String = js.native
  
  val localStream: String = js.native
  
  /**
    * ## Client control functions
    */
  def makeCall(node: String, conference: String, name: String): Unit = js.native
  def makeCall(node: String, conference: String, name: String, bandwidth: Double): Unit = js.native
  def makeCall(
    node: String,
    conference: String,
    name: String,
    bandwidth: Double,
    call_type: Unit,
    flash: StringDictionary[Any]
  ): Unit = js.native
  def makeCall(node: String, conference: String, name: String, bandwidth: Double, call_type: CallTypes): Unit = js.native
  def makeCall(
    node: String,
    conference: String,
    name: String,
    bandwidth: Double,
    call_type: CallTypes,
    flash: StringDictionary[Any]
  ): Unit = js.native
  def makeCall(
    node: String,
    conference: String,
    name: String,
    bandwidth: Unit,
    call_type: Unit,
    flash: StringDictionary[Any]
  ): Unit = js.native
  def makeCall(node: String, conference: String, name: String, bandwidth: Unit, call_type: CallTypes): Unit = js.native
  def makeCall(
    node: String,
    conference: String,
    name: String,
    bandwidth: Unit,
    call_type: CallTypes,
    flash: StringDictionary[Any]
  ): Unit = js.native
  
  def muteAudio(setting: Boolean): Boolean = js.native
  
  def muteVideo(setting: Boolean): Boolean = js.native
  
  val mutedAudio: Boolean = js.native
  
  val mutedVideo: Boolean = js.native
  
  val node: String = js.native
  
  /**
    * ## Callbacks
    */
  def onCallTransfer(alias: String): Unit = js.native
  
  def onChatMessage(message: ChatMessage): Unit = js.native
  
  def onConferenceUpdate(properties: Guestmuted): Unit = js.native
  
  def onConnect(): Unit = js.native
  def onConnect(stream: PexMediaStream): Unit = js.native
  
  def onDisconnect(reason: String): Unit = js.native
  
  def onError(reason: String): Unit = js.native
  
  def onLayoutUpdate(layout: LayoutResponse): Unit = js.native
  
  def onLog(): js.Object = js.native
  
  def onMicActivity(activity: String): Unit = js.native
  
  def onParticipantCreate(participant: AnyParticipant): Unit = js.native
  
  def onParticipantDelete(participant: PickAnyParticipantuuid): Unit = js.native
  
  def onParticipantUpdate(participant: AnyParticipant): Unit = js.native
  
  def onPresentation(setting: Boolean): Unit = js.native
  def onPresentation(setting: Boolean, presenter: String): Unit = js.native
  def onPresentation(setting: Boolean, presenter: String, uuid: String): Unit = js.native
  def onPresentation(setting: Boolean, presenter: Null, uuid: String): Unit = js.native
  
  def onPresentationConnected(stream: PexMediaStream): Unit = js.native
  
  def onPresentationDisconnected(reason: String): Unit = js.native
  
  def onPresentationReload(url: String): Unit = js.native
  
  /**
    * @deprecated in favor of onParticipantCreate/Update/Delete.
    */
  def onRosterList(roster: js.Array[Any]): Unit = js.native
  
  def onScreenshareConnected(stream: PexMediaStream): Unit = js.native
  
  def onScreenshareStopped(reason: String): Unit = js.native
  
  def onSetup(stream: Null, pin_status: PinStatus): Unit = js.native
  def onSetup(stream: Null, pin_status: PinStatus, conference_extension: standard | mssip): Unit = js.native
  def onSetup(stream: PexMediaStream, pin_status: PinStatus): Unit = js.native
  def onSetup(stream: PexMediaStream, pin_status: PinStatus, conference_extension: standard | mssip): Unit = js.native
  
  def onStageUpdate(stage: js.Array[Participantuuid]): Unit = js.native
  
  val oneTimeToken: String = js.native
  
  val onmessage: String = js.native
  
  def onopen(): js.Object = js.native
  
  val orig_bandwidth_in: Double = js.native
  
  val orig_bandwidth_out: Double = js.native
  
  val pc: String = js.native
  
  val pcConfig: IceServers = js.native
  
  val pin: String = js.native
  
  val pin_status: PinStatus = js.native
  
  var png_presentation: Boolean = js.native
  
  val powerLineFrequency: Double = js.native
  
  def present(): Unit = js.native
  @JSName("present")
  def present_screen(`type`: screen): Unit = js.native
  
  val presentation: String = js.native
  
  val presentation_event_id: String = js.native
  
  val presentation_msg: Status = js.native
  
  val readyState: Double = js.native
  
  var recv_audio: Boolean = js.native
  
  var recv_video: Boolean = js.native
  
  val registration_token: String = js.native
  
  val remote_call_type: String = js.native
  
  def renegotiate(): Unit = js.native
  def renegotiate(resend_sdp: Boolean): Unit = js.native
  
  val return_media_stream: Boolean = js.native
  
  val role: Role = js.native
  
  val rosterList: StringDictionary[Participant] = js.native
  
  val rtmp_enabled: Boolean = js.native
  
  val rtsp_enabled: Boolean = js.native
  
  val safari_ver: Double = js.native
  
  val screenshare: String = js.native
  
  val screenshare_api: String = js.native
  
  var screenshare_fps: Double = js.native
  
  val screenshare_height: Double = js.native
  
  val screenshare_width: Double = js.native
  
  def sendChatMessage(message: String): Unit = js.native
  
  def sendDTMF(digits: String, uuid: String): Unit = js.native
  
  def sendFECC(
    action: start | stop | continue,
    axis: pan | tilt | zoom,
    direction: left | right | up | down | in | out,
    target: String,
    timeout: Double
  ): Unit = js.native
  def sendFECC(
    action: start | stop | continue,
    axis: pan | tilt | zoom,
    direction: left | right | up | down | in | out,
    target: Null,
    timeout: Double
  ): Unit = js.native
  
  val service_type: typings.pexrtc.pexrtcStrings.conference | gateway | test_call = js.native
  
  def setBuzz(): Unit = js.native
  
  def setConferenceLock(setting: Boolean): Unit = js.native
  
  def setMuteAllGuests(setting: Boolean): Unit = js.native
  
  def setParticipantMute(uuid: String, setting: Boolean): Unit = js.native
  
  def setParticipantRxPresentation(uuid: String, setting: Boolean): Unit = js.native
  
  def setParticipantSpotlight(uuid: String, setting: Boolean): Unit = js.native
  
  def setParticipantText(uuid: String, text: String): Unit = js.native
  
  def setRole(uuid: String, role: ParticipantRole): Unit = js.native
  
  val socket: String = js.native
  
  def startConference(): Unit = js.native
  
  val state: String = js.native
  
  val stats_interval: String = js.native
  
  def stopPresentation(): Unit = js.native
  
  val token: String = js.native
  
  val token_refresh: Double = js.native
  
  def transferParticipant(uuid: String, destination: String, role: String): Unit = js.native
  def transferParticipant(uuid: String, destination: String, role: String, pin: String): Unit = js.native
  
  def transformLayout(transforms: Enableactivespeakerindication): Unit = js.native
  
  var turn_server: Null | Credential = js.native
  
  def unlockParticipant(uuid: String): Unit = js.native
  
  val url: String = js.native
  
  val use_trickle_ice: Boolean = js.native
  
  /**
    * A MediaStream object to use instead of PexRTC calling getUserMedia
    */
  var user_media_stream: MediaStream = js.native
  
  /**
    * A MediaStream object to use for presentation instead of
    * PexRTC calling getDisplayMedia
    */
  var user_presentation_stream: MediaStream = js.native
  
  val uuid: String = js.native
  
  val version: String = js.native
  
  def videoMuted(): Unit = js.native
  def videoMuted(uuid: String): Unit = js.native
  
  def videoUnmuted(): Unit = js.native
  def videoUnmuted(uuid: String): Unit = js.native
  
  var video_source: String | Null | `false` = js.native
  
  val vp9_enabled: Boolean = js.native
  
  val withCredentials: Boolean = js.native
  
  val xhr_timeout: Double = js.native
}
object PexRTC {
  
  /* Rewritten from type alias, can be one of: 
    - typings.pexrtc.PexRTC.GuestParticipant
    - typings.pexrtc.PexRTC.HostParticipant
  */
  trait AnyParticipant extends StObject
  object AnyParticipant {
    
    inline def GuestParticipant(
      api_url: String,
      buzz_time: Double,
      call_direction: in | out,
      call_tag: String,
      disconnect_supported: YesNo,
      display_name: String,
      encryption: String,
      external_node_uuid: String,
      fecc_supported: YesNo,
      has_media: Boolean,
      is_audio_only_call: YesNo,
      is_external: Boolean,
      is_muted: YesNo,
      is_presenting: YesNo,
      is_streaming_conference: Boolean,
      is_video_call: YesNo,
      local_alias: String,
      mute_supported: YesNo,
      overlay_text: String,
      presentation_supported: YesNo,
      protocol: String,
      rx_presentation_policy: allow | deny,
      service_type: ServiceType,
      spotlight: Double,
      start_time: Double,
      transfer_supported: YesNo,
      uri: String,
      uuid: String,
      vendor: String
    ): typings.pexrtc.PexRTC.GuestParticipant = {
      val __obj = js.Dynamic.literal(api_url = api_url.asInstanceOf[js.Any], buzz_time = buzz_time.asInstanceOf[js.Any], call_direction = call_direction.asInstanceOf[js.Any], call_tag = call_tag.asInstanceOf[js.Any], disconnect_supported = disconnect_supported.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], encryption = encryption.asInstanceOf[js.Any], external_node_uuid = external_node_uuid.asInstanceOf[js.Any], fecc_supported = fecc_supported.asInstanceOf[js.Any], has_media = has_media.asInstanceOf[js.Any], is_audio_only_call = is_audio_only_call.asInstanceOf[js.Any], is_external = is_external.asInstanceOf[js.Any], is_muted = is_muted.asInstanceOf[js.Any], is_presenting = is_presenting.asInstanceOf[js.Any], is_streaming_conference = is_streaming_conference.asInstanceOf[js.Any], is_video_call = is_video_call.asInstanceOf[js.Any], local_alias = local_alias.asInstanceOf[js.Any], mute_supported = mute_supported.asInstanceOf[js.Any], overlay_text = overlay_text.asInstanceOf[js.Any], presentation_supported = presentation_supported.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], role = "guest", rx_presentation_policy = rx_presentation_policy.asInstanceOf[js.Any], service_type = service_type.asInstanceOf[js.Any], spotlight = spotlight.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], transfer_supported = transfer_supported.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pexrtc.PexRTC.GuestParticipant]
    }
    
    inline def HostParticipant(
      api_url: String,
      buzz_time: Double,
      call_direction: in | out,
      call_tag: String,
      disconnect_supported: YesNo,
      display_name: String,
      encryption: String,
      external_node_uuid: String,
      fecc_supported: YesNo,
      has_media: Boolean,
      is_audio_only_call: YesNo,
      is_external: Boolean,
      is_muted: YesNo,
      is_presenting: YesNo,
      is_streaming_conference: Boolean,
      is_video_call: YesNo,
      local_alias: String,
      mute_supported: YesNo,
      overlay_text: String,
      presentation_supported: YesNo,
      protocol: String,
      rx_presentation_policy: allow | deny,
      service_type: ServiceType,
      spotlight: Double,
      start_time: Double,
      transfer_supported: YesNo,
      uri: String,
      uuid: String,
      vendor: String
    ): typings.pexrtc.PexRTC.HostParticipant = {
      val __obj = js.Dynamic.literal(api_url = api_url.asInstanceOf[js.Any], buzz_time = buzz_time.asInstanceOf[js.Any], call_direction = call_direction.asInstanceOf[js.Any], call_tag = call_tag.asInstanceOf[js.Any], disconnect_supported = disconnect_supported.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], encryption = encryption.asInstanceOf[js.Any], external_node_uuid = external_node_uuid.asInstanceOf[js.Any], fecc_supported = fecc_supported.asInstanceOf[js.Any], has_media = has_media.asInstanceOf[js.Any], is_audio_only_call = is_audio_only_call.asInstanceOf[js.Any], is_external = is_external.asInstanceOf[js.Any], is_muted = is_muted.asInstanceOf[js.Any], is_presenting = is_presenting.asInstanceOf[js.Any], is_streaming_conference = is_streaming_conference.asInstanceOf[js.Any], is_video_call = is_video_call.asInstanceOf[js.Any], local_alias = local_alias.asInstanceOf[js.Any], mute_supported = mute_supported.asInstanceOf[js.Any], overlay_text = overlay_text.asInstanceOf[js.Any], presentation_supported = presentation_supported.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], role = "chair", rx_presentation_policy = rx_presentation_policy.asInstanceOf[js.Any], service_type = service_type.asInstanceOf[js.Any], spotlight = spotlight.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], transfer_supported = transfer_supported.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pexrtc.PexRTC.HostParticipant]
    }
  }
  
  trait AudioStatistics extends StObject {
    
    val bitrate: String
    
    val codec: String
    
    val `packets-lost`: Double
    
    val `packets-sent`: Double
    
    val `percentage-lost`: String
    
    val `percentage-lost-recent`: String
  }
  object AudioStatistics {
    
    inline def apply(
      bitrate: String,
      codec: String,
      `packets-lost`: Double,
      `packets-sent`: Double,
      `percentage-lost`: String,
      `percentage-lost-recent`: String
    ): AudioStatistics = {
      val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any])
      __obj.updateDynamic("packets-lost")(`packets-lost`.asInstanceOf[js.Any])
      __obj.updateDynamic("packets-sent")(`packets-sent`.asInstanceOf[js.Any])
      __obj.updateDynamic("percentage-lost")(`percentage-lost`.asInstanceOf[js.Any])
      __obj.updateDynamic("percentage-lost-recent")(`percentage-lost-recent`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AudioStatistics]
    }
    
    extension [Self <: AudioStatistics](x: Self) {
      
      inline def setBitrate(value: String): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
      
      inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      inline def `setPackets-lost`(value: Double): Self = StObject.set(x, "packets-lost", value.asInstanceOf[js.Any])
      
      inline def `setPackets-sent`(value: Double): Self = StObject.set(x, "packets-sent", value.asInstanceOf[js.Any])
      
      inline def `setPercentage-lost`(value: String): Self = StObject.set(x, "percentage-lost", value.asInstanceOf[js.Any])
      
      inline def `setPercentage-lost-recent`(value: String): Self = StObject.set(x, "percentage-lost-recent", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pexrtc.pexrtcStrings.presentation
    - typings.pexrtc.pexrtcStrings.screen
    - typings.pexrtc.pexrtcStrings.audioonly
    - typings.pexrtc.pexrtcStrings.recvonly
    - typings.pexrtc.pexrtcStrings.rtmp
    - typings.pexrtc.pexrtcStrings.stream
    - typings.pexrtc.pexrtcStrings.none
  */
  trait CallTypes extends StObject
  object CallTypes {
    
    inline def audioonly: typings.pexrtc.pexrtcStrings.audioonly = "audioonly".asInstanceOf[typings.pexrtc.pexrtcStrings.audioonly]
    
    inline def none: typings.pexrtc.pexrtcStrings.none = "none".asInstanceOf[typings.pexrtc.pexrtcStrings.none]
    
    inline def presentation: typings.pexrtc.pexrtcStrings.presentation = "presentation".asInstanceOf[typings.pexrtc.pexrtcStrings.presentation]
    
    inline def recvonly: typings.pexrtc.pexrtcStrings.recvonly = "recvonly".asInstanceOf[typings.pexrtc.pexrtcStrings.recvonly]
    
    inline def rtmp: typings.pexrtc.pexrtcStrings.rtmp = "rtmp".asInstanceOf[typings.pexrtc.pexrtcStrings.rtmp]
    
    inline def screen: typings.pexrtc.pexrtcStrings.screen = "screen".asInstanceOf[typings.pexrtc.pexrtcStrings.screen]
    
    inline def stream: typings.pexrtc.pexrtcStrings.stream = "stream".asInstanceOf[typings.pexrtc.pexrtcStrings.stream]
  }
  
  trait ChatMessage extends StObject {
    
    val origin: String
    
    val payload: String
    
    val `type`: String
    
    val uuid: String
  }
  object ChatMessage {
    
    inline def apply(origin: String, payload: String, `type`: String, uuid: String): ChatMessage = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChatMessage]
    }
    
    extension [Self <: ChatMessage](x: Self) {
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  trait GuestParticipant
    extends StObject
       with Participant
       with AnyParticipant {
    
    @JSName("role")
    val role_GuestParticipant: guest_
  }
  object GuestParticipant {
    
    inline def apply(
      api_url: String,
      buzz_time: Double,
      call_direction: in | out,
      call_tag: String,
      disconnect_supported: YesNo,
      display_name: String,
      encryption: String,
      external_node_uuid: String,
      fecc_supported: YesNo,
      has_media: Boolean,
      is_audio_only_call: YesNo,
      is_external: Boolean,
      is_muted: YesNo,
      is_presenting: YesNo,
      is_streaming_conference: Boolean,
      is_video_call: YesNo,
      local_alias: String,
      mute_supported: YesNo,
      overlay_text: String,
      presentation_supported: YesNo,
      protocol: String,
      rx_presentation_policy: allow | deny,
      service_type: ServiceType,
      spotlight: Double,
      start_time: Double,
      transfer_supported: YesNo,
      uri: String,
      uuid: String,
      vendor: String
    ): GuestParticipant = {
      val __obj = js.Dynamic.literal(api_url = api_url.asInstanceOf[js.Any], buzz_time = buzz_time.asInstanceOf[js.Any], call_direction = call_direction.asInstanceOf[js.Any], call_tag = call_tag.asInstanceOf[js.Any], disconnect_supported = disconnect_supported.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], encryption = encryption.asInstanceOf[js.Any], external_node_uuid = external_node_uuid.asInstanceOf[js.Any], fecc_supported = fecc_supported.asInstanceOf[js.Any], has_media = has_media.asInstanceOf[js.Any], is_audio_only_call = is_audio_only_call.asInstanceOf[js.Any], is_external = is_external.asInstanceOf[js.Any], is_muted = is_muted.asInstanceOf[js.Any], is_presenting = is_presenting.asInstanceOf[js.Any], is_streaming_conference = is_streaming_conference.asInstanceOf[js.Any], is_video_call = is_video_call.asInstanceOf[js.Any], local_alias = local_alias.asInstanceOf[js.Any], mute_supported = mute_supported.asInstanceOf[js.Any], overlay_text = overlay_text.asInstanceOf[js.Any], presentation_supported = presentation_supported.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], role = "guest", rx_presentation_policy = rx_presentation_policy.asInstanceOf[js.Any], service_type = service_type.asInstanceOf[js.Any], spotlight = spotlight.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], transfer_supported = transfer_supported.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
      __obj.asInstanceOf[GuestParticipant]
    }
    
    extension [Self <: GuestParticipant](x: Self) {
      
      inline def setRole(value: guest_): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostParticipant
    extends StObject
       with Participant
       with AnyParticipant {
    
    @JSName("role")
    val role_HostParticipant: chair
  }
  object HostParticipant {
    
    inline def apply(
      api_url: String,
      buzz_time: Double,
      call_direction: in | out,
      call_tag: String,
      disconnect_supported: YesNo,
      display_name: String,
      encryption: String,
      external_node_uuid: String,
      fecc_supported: YesNo,
      has_media: Boolean,
      is_audio_only_call: YesNo,
      is_external: Boolean,
      is_muted: YesNo,
      is_presenting: YesNo,
      is_streaming_conference: Boolean,
      is_video_call: YesNo,
      local_alias: String,
      mute_supported: YesNo,
      overlay_text: String,
      presentation_supported: YesNo,
      protocol: String,
      rx_presentation_policy: allow | deny,
      service_type: ServiceType,
      spotlight: Double,
      start_time: Double,
      transfer_supported: YesNo,
      uri: String,
      uuid: String,
      vendor: String
    ): HostParticipant = {
      val __obj = js.Dynamic.literal(api_url = api_url.asInstanceOf[js.Any], buzz_time = buzz_time.asInstanceOf[js.Any], call_direction = call_direction.asInstanceOf[js.Any], call_tag = call_tag.asInstanceOf[js.Any], disconnect_supported = disconnect_supported.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], encryption = encryption.asInstanceOf[js.Any], external_node_uuid = external_node_uuid.asInstanceOf[js.Any], fecc_supported = fecc_supported.asInstanceOf[js.Any], has_media = has_media.asInstanceOf[js.Any], is_audio_only_call = is_audio_only_call.asInstanceOf[js.Any], is_external = is_external.asInstanceOf[js.Any], is_muted = is_muted.asInstanceOf[js.Any], is_presenting = is_presenting.asInstanceOf[js.Any], is_streaming_conference = is_streaming_conference.asInstanceOf[js.Any], is_video_call = is_video_call.asInstanceOf[js.Any], local_alias = local_alias.asInstanceOf[js.Any], mute_supported = mute_supported.asInstanceOf[js.Any], overlay_text = overlay_text.asInstanceOf[js.Any], presentation_supported = presentation_supported.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], role = "chair", rx_presentation_policy = rx_presentation_policy.asInstanceOf[js.Any], service_type = service_type.asInstanceOf[js.Any], spotlight = spotlight.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], transfer_supported = transfer_supported.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostParticipant]
    }
    
    extension [Self <: HostParticipant](x: Self) {
      
      inline def setRole(value: chair): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutResponse extends StObject {
    
    var participants: js.Array[String]
    
    var view: LayoutTypes
  }
  object LayoutResponse {
    
    inline def apply(participants: js.Array[String], view: LayoutTypes): LayoutResponse = {
      val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutResponse]
    }
    
    extension [Self <: LayoutResponse](x: Self) {
      
      inline def setParticipants(value: js.Array[String]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
      
      inline def setParticipantsVarargs(value: String*): Self = StObject.set(x, "participants", js.Array(value*))
      
      inline def setView(value: LayoutTypes): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pexrtc.pexrtcStrings.`1Colon0`
    - typings.pexrtc.pexrtcStrings.`1Colon7`
    - typings.pexrtc.pexrtcStrings.`1Colon21`
    - typings.pexrtc.pexrtcStrings.`2Colon21`
    - typings.pexrtc.pexrtcStrings.`4Colon0`
    - typings.pexrtc.pexrtcStrings.`5Colon7`
    - typings.pexrtc.pexrtcStrings.ac
  */
  trait LayoutTypes extends StObject
  object LayoutTypes {
    
    inline def `1Colon0`: typings.pexrtc.pexrtcStrings.`1Colon0` = "1:0".asInstanceOf[typings.pexrtc.pexrtcStrings.`1Colon0`]
    
    inline def `1Colon21`: typings.pexrtc.pexrtcStrings.`1Colon21` = "1:21".asInstanceOf[typings.pexrtc.pexrtcStrings.`1Colon21`]
    
    inline def `1Colon7`: typings.pexrtc.pexrtcStrings.`1Colon7` = "1:7".asInstanceOf[typings.pexrtc.pexrtcStrings.`1Colon7`]
    
    inline def `2Colon21`: typings.pexrtc.pexrtcStrings.`2Colon21` = "2:21".asInstanceOf[typings.pexrtc.pexrtcStrings.`2Colon21`]
    
    inline def `4Colon0`: typings.pexrtc.pexrtcStrings.`4Colon0` = "4:0".asInstanceOf[typings.pexrtc.pexrtcStrings.`4Colon0`]
    
    inline def `5Colon7`: typings.pexrtc.pexrtcStrings.`5Colon7` = "5:7".asInstanceOf[typings.pexrtc.pexrtcStrings.`5Colon7`]
    
    inline def ac: typings.pexrtc.pexrtcStrings.ac = "ac".asInstanceOf[typings.pexrtc.pexrtcStrings.ac]
  }
  
  trait Participant extends StObject {
    
    val api_url: String
    
    val buzz_time: Double
    
    val call_direction: in | out
    
    val call_tag: String
    
    val disconnect_supported: YesNo
    
    val display_name: String
    
    val encryption: String
    
    val external_node_uuid: String
    
    val fecc_supported: YesNo
    
    val has_media: Boolean
    
    val is_audio_only_call: YesNo
    
    val is_external: Boolean
    
    val is_muted: YesNo
    
    val is_presenting: YesNo
    
    val is_streaming_conference: Boolean
    
    val is_video_call: YesNo
    
    val local_alias: String
    
    val mute_supported: YesNo
    
    val overlay_text: String
    
    val presentation_supported: YesNo
    
    val protocol: String
    
    val role: ParticipantRole
    
    val rx_presentation_policy: allow | deny
    
    val service_type: ServiceType
    
    val spotlight: Double
    
    val start_time: Double
    
    val transfer_supported: YesNo
    
    val uri: String
    
    val uuid: String
    
    val vendor: String
  }
  object Participant {
    
    inline def apply(
      api_url: String,
      buzz_time: Double,
      call_direction: in | out,
      call_tag: String,
      disconnect_supported: YesNo,
      display_name: String,
      encryption: String,
      external_node_uuid: String,
      fecc_supported: YesNo,
      has_media: Boolean,
      is_audio_only_call: YesNo,
      is_external: Boolean,
      is_muted: YesNo,
      is_presenting: YesNo,
      is_streaming_conference: Boolean,
      is_video_call: YesNo,
      local_alias: String,
      mute_supported: YesNo,
      overlay_text: String,
      presentation_supported: YesNo,
      protocol: String,
      role: ParticipantRole,
      rx_presentation_policy: allow | deny,
      service_type: ServiceType,
      spotlight: Double,
      start_time: Double,
      transfer_supported: YesNo,
      uri: String,
      uuid: String,
      vendor: String
    ): Participant = {
      val __obj = js.Dynamic.literal(api_url = api_url.asInstanceOf[js.Any], buzz_time = buzz_time.asInstanceOf[js.Any], call_direction = call_direction.asInstanceOf[js.Any], call_tag = call_tag.asInstanceOf[js.Any], disconnect_supported = disconnect_supported.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], encryption = encryption.asInstanceOf[js.Any], external_node_uuid = external_node_uuid.asInstanceOf[js.Any], fecc_supported = fecc_supported.asInstanceOf[js.Any], has_media = has_media.asInstanceOf[js.Any], is_audio_only_call = is_audio_only_call.asInstanceOf[js.Any], is_external = is_external.asInstanceOf[js.Any], is_muted = is_muted.asInstanceOf[js.Any], is_presenting = is_presenting.asInstanceOf[js.Any], is_streaming_conference = is_streaming_conference.asInstanceOf[js.Any], is_video_call = is_video_call.asInstanceOf[js.Any], local_alias = local_alias.asInstanceOf[js.Any], mute_supported = mute_supported.asInstanceOf[js.Any], overlay_text = overlay_text.asInstanceOf[js.Any], presentation_supported = presentation_supported.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], rx_presentation_policy = rx_presentation_policy.asInstanceOf[js.Any], service_type = service_type.asInstanceOf[js.Any], spotlight = spotlight.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], transfer_supported = transfer_supported.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Participant]
    }
    
    extension [Self <: Participant](x: Self) {
      
      inline def setApi_url(value: String): Self = StObject.set(x, "api_url", value.asInstanceOf[js.Any])
      
      inline def setBuzz_time(value: Double): Self = StObject.set(x, "buzz_time", value.asInstanceOf[js.Any])
      
      inline def setCall_direction(value: in | out): Self = StObject.set(x, "call_direction", value.asInstanceOf[js.Any])
      
      inline def setCall_tag(value: String): Self = StObject.set(x, "call_tag", value.asInstanceOf[js.Any])
      
      inline def setDisconnect_supported(value: YesNo): Self = StObject.set(x, "disconnect_supported", value.asInstanceOf[js.Any])
      
      inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      inline def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      inline def setExternal_node_uuid(value: String): Self = StObject.set(x, "external_node_uuid", value.asInstanceOf[js.Any])
      
      inline def setFecc_supported(value: YesNo): Self = StObject.set(x, "fecc_supported", value.asInstanceOf[js.Any])
      
      inline def setHas_media(value: Boolean): Self = StObject.set(x, "has_media", value.asInstanceOf[js.Any])
      
      inline def setIs_audio_only_call(value: YesNo): Self = StObject.set(x, "is_audio_only_call", value.asInstanceOf[js.Any])
      
      inline def setIs_external(value: Boolean): Self = StObject.set(x, "is_external", value.asInstanceOf[js.Any])
      
      inline def setIs_muted(value: YesNo): Self = StObject.set(x, "is_muted", value.asInstanceOf[js.Any])
      
      inline def setIs_presenting(value: YesNo): Self = StObject.set(x, "is_presenting", value.asInstanceOf[js.Any])
      
      inline def setIs_streaming_conference(value: Boolean): Self = StObject.set(x, "is_streaming_conference", value.asInstanceOf[js.Any])
      
      inline def setIs_video_call(value: YesNo): Self = StObject.set(x, "is_video_call", value.asInstanceOf[js.Any])
      
      inline def setLocal_alias(value: String): Self = StObject.set(x, "local_alias", value.asInstanceOf[js.Any])
      
      inline def setMute_supported(value: YesNo): Self = StObject.set(x, "mute_supported", value.asInstanceOf[js.Any])
      
      inline def setOverlay_text(value: String): Self = StObject.set(x, "overlay_text", value.asInstanceOf[js.Any])
      
      inline def setPresentation_supported(value: YesNo): Self = StObject.set(x, "presentation_supported", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setRole(value: ParticipantRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRx_presentation_policy(value: allow | deny): Self = StObject.set(x, "rx_presentation_policy", value.asInstanceOf[js.Any])
      
      inline def setService_type(value: ServiceType): Self = StObject.set(x, "service_type", value.asInstanceOf[js.Any])
      
      inline def setSpotlight(value: Double): Self = StObject.set(x, "spotlight", value.asInstanceOf[js.Any])
      
      inline def setStart_time(value: Double): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      inline def setTransfer_supported(value: YesNo): Self = StObject.set(x, "transfer_supported", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pexrtc.pexrtcStrings.chair
    - typings.pexrtc.pexrtcStrings.guest_
  */
  trait ParticipantRole extends StObject
  object ParticipantRole {
    
    inline def chair: typings.pexrtc.pexrtcStrings.chair = "chair".asInstanceOf[typings.pexrtc.pexrtcStrings.chair]
    
    inline def guest: guest_ = "guest".asInstanceOf[guest_]
  }
  
  type PexMediaStream = MediaStream | String
  
  /* Rewritten from type alias, can be one of: 
    - typings.pexrtc.pexrtcStrings.none
    - typings.pexrtc.pexrtcStrings.required
    - typings.pexrtc.pexrtcStrings.optional
  */
  trait PinStatus extends StObject
  object PinStatus {
    
    inline def none: typings.pexrtc.pexrtcStrings.none = "none".asInstanceOf[typings.pexrtc.pexrtcStrings.none]
    
    inline def optional: typings.pexrtc.pexrtcStrings.optional = "optional".asInstanceOf[typings.pexrtc.pexrtcStrings.optional]
    
    inline def required: typings.pexrtc.pexrtcStrings.required = "required".asInstanceOf[typings.pexrtc.pexrtcStrings.required]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pexrtc.pexrtcStrings.HOST
    - typings.pexrtc.pexrtcStrings.GUEST
  */
  trait Role extends StObject
  object Role {
    
    inline def GUEST: typings.pexrtc.pexrtcStrings.GUEST = "GUEST".asInstanceOf[typings.pexrtc.pexrtcStrings.GUEST]
    
    inline def HOST: typings.pexrtc.pexrtcStrings.HOST = "HOST".asInstanceOf[typings.pexrtc.pexrtcStrings.HOST]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pexrtc.pexrtcStrings.connecting
    - typings.pexrtc.pexrtcStrings.waiting_room
    - typings.pexrtc.pexrtcStrings.ivr
    - typings.pexrtc.pexrtcStrings.conference
    - typings.pexrtc.pexrtcStrings.lecture
    - typings.pexrtc.pexrtcStrings.gateway
    - typings.pexrtc.pexrtcStrings.test_call
  */
  trait ServiceType extends StObject
  object ServiceType {
    
    inline def conference: typings.pexrtc.pexrtcStrings.conference = "conference".asInstanceOf[typings.pexrtc.pexrtcStrings.conference]
    
    inline def connecting: typings.pexrtc.pexrtcStrings.connecting = "connecting".asInstanceOf[typings.pexrtc.pexrtcStrings.connecting]
    
    inline def gateway: typings.pexrtc.pexrtcStrings.gateway = "gateway".asInstanceOf[typings.pexrtc.pexrtcStrings.gateway]
    
    inline def ivr: typings.pexrtc.pexrtcStrings.ivr = "ivr".asInstanceOf[typings.pexrtc.pexrtcStrings.ivr]
    
    inline def lecture: typings.pexrtc.pexrtcStrings.lecture = "lecture".asInstanceOf[typings.pexrtc.pexrtcStrings.lecture]
    
    inline def test_call: typings.pexrtc.pexrtcStrings.test_call = "test_call".asInstanceOf[typings.pexrtc.pexrtcStrings.test_call]
    
    inline def waiting_room: typings.pexrtc.pexrtcStrings.waiting_room = "waiting_room".asInstanceOf[typings.pexrtc.pexrtcStrings.waiting_room]
  }
  
  trait Statistics extends StObject {
    
    val incoming: Audio
    
    val outgoing: Audio
  }
  object Statistics {
    
    inline def apply(incoming: Audio, outgoing: Audio): Statistics = {
      val __obj = js.Dynamic.literal(incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Statistics]
    }
    
    extension [Self <: Statistics](x: Self) {
      
      inline def setIncoming(value: Audio): Self = StObject.set(x, "incoming", value.asInstanceOf[js.Any])
      
      inline def setOutgoing(value: Audio): Self = StObject.set(x, "outgoing", value.asInstanceOf[js.Any])
    }
  }
  
  trait VideoStatistics
    extends StObject
       with AudioStatistics {
    
    val framerate: Double
    
    val resolution: String
  }
  object VideoStatistics {
    
    inline def apply(
      bitrate: String,
      codec: String,
      framerate: Double,
      `packets-lost`: Double,
      `packets-sent`: Double,
      `percentage-lost`: String,
      `percentage-lost-recent`: String,
      resolution: String
    ): VideoStatistics = {
      val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], framerate = framerate.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any])
      __obj.updateDynamic("packets-lost")(`packets-lost`.asInstanceOf[js.Any])
      __obj.updateDynamic("packets-sent")(`packets-sent`.asInstanceOf[js.Any])
      __obj.updateDynamic("percentage-lost")(`percentage-lost`.asInstanceOf[js.Any])
      __obj.updateDynamic("percentage-lost-recent")(`percentage-lost-recent`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoStatistics]
    }
    
    extension [Self <: VideoStatistics](x: Self) {
      
      inline def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pexrtc.pexrtcStrings.YES
    - typings.pexrtc.pexrtcStrings.NO
  */
  trait YesNo extends StObject
  object YesNo {
    
    inline def NO: typings.pexrtc.pexrtcStrings.NO = "NO".asInstanceOf[typings.pexrtc.pexrtcStrings.NO]
    
    inline def YES: typings.pexrtc.pexrtcStrings.YES = "YES".asInstanceOf[typings.pexrtc.pexrtcStrings.YES]
  }
}
