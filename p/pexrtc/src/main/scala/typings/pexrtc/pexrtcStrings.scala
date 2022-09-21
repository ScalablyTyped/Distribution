package typings.pexrtc

import typings.pexrtc.PexRTC.CallTypes
import typings.pexrtc.PexRTC.LayoutTypes
import typings.pexrtc.PexRTC.ParticipantRole
import typings.pexrtc.PexRTC.PinStatus
import typings.pexrtc.PexRTC.Role
import typings.pexrtc.PexRTC.ServiceType
import typings.pexrtc.PexRTC.YesNo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pexrtcStrings {
  
  @js.native
  sealed trait `1Colon0`
    extends StObject
       with LayoutTypes
  inline def `1Colon0`: `1Colon0` = "1:0".asInstanceOf[`1Colon0`]
  
  @js.native
  sealed trait `1Colon21`
    extends StObject
       with LayoutTypes
  inline def `1Colon21`: `1Colon21` = "1:21".asInstanceOf[`1Colon21`]
  
  @js.native
  sealed trait `1Colon7`
    extends StObject
       with LayoutTypes
  inline def `1Colon7`: `1Colon7` = "1:7".asInstanceOf[`1Colon7`]
  
  @js.native
  sealed trait `2Colon21`
    extends StObject
       with LayoutTypes
  inline def `2Colon21`: `2Colon21` = "2:21".asInstanceOf[`2Colon21`]
  
  @js.native
  sealed trait `4Colon0`
    extends StObject
       with LayoutTypes
  inline def `4Colon0`: `4Colon0` = "4:0".asInstanceOf[`4Colon0`]
  
  @js.native
  sealed trait `5Colon7`
    extends StObject
       with LayoutTypes
  inline def `5Colon7`: `5Colon7` = "5:7".asInstanceOf[`5Colon7`]
  
  @js.native
  sealed trait GUEST
    extends StObject
       with Role
  inline def GUEST: GUEST = "GUEST".asInstanceOf[GUEST]
  
  @js.native
  sealed trait HOST
    extends StObject
       with Role
  inline def HOST: HOST = "HOST".asInstanceOf[HOST]
  
  @js.native
  sealed trait NO
    extends StObject
       with YesNo
  inline def NO: NO = "NO".asInstanceOf[NO]
  
  @js.native
  sealed trait YES
    extends StObject
       with YesNo
  inline def YES: YES = "YES".asInstanceOf[YES]
  
  @js.native
  sealed trait ac
    extends StObject
       with LayoutTypes
  inline def ac: ac = "ac".asInstanceOf[ac]
  
  @js.native
  sealed trait allow extends StObject
  inline def allow: allow = "allow".asInstanceOf[allow]
  
  @js.native
  sealed trait audio extends StObject
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait audioonly
    extends StObject
       with CallTypes
  inline def audioonly: audioonly = "audioonly".asInstanceOf[audioonly]
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait chair
    extends StObject
       with ParticipantRole
  inline def chair: chair = "chair".asInstanceOf[chair]
  
  @js.native
  sealed trait conference
    extends StObject
       with ServiceType
  inline def conference: conference = "conference".asInstanceOf[conference]
  
  @js.native
  sealed trait connecting
    extends StObject
       with ServiceType
  inline def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait continue extends StObject
  inline def continue: continue = "continue".asInstanceOf[continue]
  
  @js.native
  sealed trait deny extends StObject
  inline def deny: deny = "deny".asInstanceOf[deny]
  
  @js.native
  sealed trait down extends StObject
  inline def down: down = "down".asInstanceOf[down]
  
  @js.native
  sealed trait gateway
    extends StObject
       with ServiceType
  inline def gateway: gateway = "gateway".asInstanceOf[gateway]
  
  @js.native
  sealed trait guest_
    extends StObject
       with ParticipantRole
  inline def guest_ : guest_ = "guest".asInstanceOf[guest_]
  
  @js.native
  sealed trait h323 extends StObject
  inline def h323: h323 = "h323".asInstanceOf[h323]
  
  @js.native
  sealed trait in extends StObject
  inline def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait ivr
    extends StObject
       with ServiceType
  inline def ivr: ivr = "ivr".asInstanceOf[ivr]
  
  @js.native
  sealed trait keep_conference_alive extends StObject
  inline def keep_conference_alive: keep_conference_alive = "keep_conference_alive".asInstanceOf[keep_conference_alive]
  
  @js.native
  sealed trait keep_conference_alive_if_multiple extends StObject
  inline def keep_conference_alive_if_multiple: keep_conference_alive_if_multiple = "keep_conference_alive_if_multiple".asInstanceOf[keep_conference_alive_if_multiple]
  
  @js.native
  sealed trait keep_conference_alive_never extends StObject
  inline def keep_conference_alive_never: keep_conference_alive_never = "keep_conference_alive_never".asInstanceOf[keep_conference_alive_never]
  
  @js.native
  sealed trait lecture
    extends StObject
       with ServiceType
  inline def lecture: lecture = "lecture".asInstanceOf[lecture]
  
  @js.native
  sealed trait left extends StObject
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait mssip extends StObject
  inline def mssip: mssip = "mssip".asInstanceOf[mssip]
  
  @js.native
  sealed trait none
    extends StObject
       with CallTypes
       with PinStatus
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait optional
    extends StObject
       with PinStatus
  inline def optional: optional = "optional".asInstanceOf[optional]
  
  @js.native
  sealed trait out extends StObject
  inline def out: out = "out".asInstanceOf[out]
  
  @js.native
  sealed trait pan extends StObject
  inline def pan: pan = "pan".asInstanceOf[pan]
  
  @js.native
  sealed trait presentation
    extends StObject
       with CallTypes
  inline def presentation: presentation = "presentation".asInstanceOf[presentation]
  
  @js.native
  sealed trait recvonly
    extends StObject
       with CallTypes
  inline def recvonly: recvonly = "recvonly".asInstanceOf[recvonly]
  
  @js.native
  sealed trait required
    extends StObject
       with PinStatus
  inline def required: required = "required".asInstanceOf[required]
  
  @js.native
  sealed trait right extends StObject
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait rtmp
    extends StObject
       with CallTypes
  inline def rtmp: rtmp = "rtmp".asInstanceOf[rtmp]
  
  @js.native
  sealed trait screen
    extends StObject
       with CallTypes
  inline def screen: screen = "screen".asInstanceOf[screen]
  
  @js.native
  sealed trait sip extends StObject
  inline def sip: sip = "sip".asInstanceOf[sip]
  
  @js.native
  sealed trait standard extends StObject
  inline def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait start extends StObject
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait stop extends StObject
  inline def stop: stop = "stop".asInstanceOf[stop]
  
  @js.native
  sealed trait stream
    extends StObject
       with CallTypes
  inline def stream: stream = "stream".asInstanceOf[stream]
  
  @js.native
  sealed trait test_call
    extends StObject
       with ServiceType
  inline def test_call: test_call = "test_call".asInstanceOf[test_call]
  
  @js.native
  sealed trait tilt extends StObject
  inline def tilt: tilt = "tilt".asInstanceOf[tilt]
  
  @js.native
  sealed trait up extends StObject
  inline def up: up = "up".asInstanceOf[up]
  
  @js.native
  sealed trait video extends StObject
  inline def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait `video-only` extends StObject
  inline def `video-only`: `video-only` = "video-only".asInstanceOf[`video-only`]
  
  @js.native
  sealed trait waiting_room
    extends StObject
       with ServiceType
  inline def waiting_room: waiting_room = "waiting_room".asInstanceOf[waiting_room]
  
  @js.native
  sealed trait zoom extends StObject
  inline def zoom: zoom = "zoom".asInstanceOf[zoom]
}
