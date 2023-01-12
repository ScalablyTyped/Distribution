package typings.peerjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerEvents extends StObject {
  
  /**
    * Emitted when a remote peer attempts to call you.
    */
  def call(mediaConnection: MediaConnection): Unit
  
  /**
    * Emitted when the peer is destroyed and can no longer accept or create any new connections.
    */
  def close(): Unit
  
  /**
    * Emitted when a new data connection is established from a remote peer.
    */
  def connection(dataConnection: DataConnection): Unit
  
  /**
    * Emitted when the peer is disconnected from the signalling server
    */
  def disconnected(currentId: String): Unit
  
  /**
    * Errors on the peer are almost always fatal and will destroy the peer.
    */
  def error(error: js.Error): Unit
  
  /**
    * Emitted when a connection to the PeerServer is established.
    */
  def open(id: String): Unit
}
object PeerEvents {
  
  inline def apply(
    call: MediaConnection => Unit,
    close: () => Unit,
    connection: DataConnection => Unit,
    disconnected: String => Unit,
    error: js.Error => Unit,
    open: String => Unit
  ): PeerEvents = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction1(call), close = js.Any.fromFunction0(close), connection = js.Any.fromFunction1(connection), disconnected = js.Any.fromFunction1(disconnected), error = js.Any.fromFunction1(error), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[PeerEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeerEvents] (val x: Self) extends AnyVal {
    
    inline def setCall(value: MediaConnection => Unit): Self = StObject.set(x, "call", js.Any.fromFunction1(value))
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setConnection(value: DataConnection => Unit): Self = StObject.set(x, "connection", js.Any.fromFunction1(value))
    
    inline def setDisconnected(value: String => Unit): Self = StObject.set(x, "disconnected", js.Any.fromFunction1(value))
    
    inline def setError(value: js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setOpen(value: String => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
  }
}
