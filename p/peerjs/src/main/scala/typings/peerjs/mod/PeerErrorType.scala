package typings.peerjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PeerErrorType extends StObject
@JSImport("peerjs", "PeerErrorType")
@js.native
object PeerErrorType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PeerErrorType & String] = js.native
  
  @js.native
  sealed trait BrowserIncompatible
    extends StObject
       with PeerErrorType
  /* "browser-incompatible" */ val BrowserIncompatible: typings.peerjs.mod.PeerErrorType.BrowserIncompatible & String = js.native
  
  @js.native
  sealed trait Disconnected
    extends StObject
       with PeerErrorType
  /* "disconnected" */ val Disconnected: typings.peerjs.mod.PeerErrorType.Disconnected & String = js.native
  
  @js.native
  sealed trait InvalidID
    extends StObject
       with PeerErrorType
  /* "invalid-id" */ val InvalidID: typings.peerjs.mod.PeerErrorType.InvalidID & String = js.native
  
  @js.native
  sealed trait InvalidKey
    extends StObject
       with PeerErrorType
  /* "invalid-key" */ val InvalidKey: typings.peerjs.mod.PeerErrorType.InvalidKey & String = js.native
  
  @js.native
  sealed trait Network
    extends StObject
       with PeerErrorType
  /* "network" */ val Network: typings.peerjs.mod.PeerErrorType.Network & String = js.native
  
  @js.native
  sealed trait PeerUnavailable
    extends StObject
       with PeerErrorType
  /* "peer-unavailable" */ val PeerUnavailable: typings.peerjs.mod.PeerErrorType.PeerUnavailable & String = js.native
  
  @js.native
  sealed trait ServerError
    extends StObject
       with PeerErrorType
  /* "server-error" */ val ServerError: typings.peerjs.mod.PeerErrorType.ServerError & String = js.native
  
  @js.native
  sealed trait SocketClosed
    extends StObject
       with PeerErrorType
  /* "socket-closed" */ val SocketClosed: typings.peerjs.mod.PeerErrorType.SocketClosed & String = js.native
  
  @js.native
  sealed trait SocketError
    extends StObject
       with PeerErrorType
  /* "socket-error" */ val SocketError: typings.peerjs.mod.PeerErrorType.SocketError & String = js.native
  
  @js.native
  sealed trait SslUnavailable
    extends StObject
       with PeerErrorType
  /* "ssl-unavailable" */ val SslUnavailable: typings.peerjs.mod.PeerErrorType.SslUnavailable & String = js.native
  
  @js.native
  sealed trait UnavailableID
    extends StObject
       with PeerErrorType
  /* "unavailable-id" */ val UnavailableID: typings.peerjs.mod.PeerErrorType.UnavailableID & String = js.native
  
  @js.native
  sealed trait WebRTC
    extends StObject
       with PeerErrorType
  /* "webrtc" */ val WebRTC: typings.peerjs.mod.PeerErrorType.WebRTC & String = js.native
}
