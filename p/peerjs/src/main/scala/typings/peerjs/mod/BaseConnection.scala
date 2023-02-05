package typings.peerjs.mod

import typings.eventemitter3.mod.EventEmitter
import typings.std.RTCPeerConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseConnection[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidEventTypes */ Any */] extends EventEmitter[T & BaseConnectionEvents, Any] {
  
  /* protected */ var _open: Boolean = js.native
  
  def close(): Unit = js.native
  
  var connectionId: String = js.native
  
  def handleMessage(message: ServerMessage): Unit = js.native
  
  val metadata: Any = js.native
  
  def open: Boolean = js.native
  
  val options: Any = js.native
  
  val peer: String = js.native
  
  var peerConnection: RTCPeerConnection = js.native
  
  var provider: Peer = js.native
  
  def `type`: ConnectionType = js.native
}
