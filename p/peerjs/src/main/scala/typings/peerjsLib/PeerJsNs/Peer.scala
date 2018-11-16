package typings
package peerjsLib.PeerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Peer extends js.Object {
  /**
           * A hash of all connections associated with this peer, keyed by the remote peer's ID.
           */
  var connections: js.Any = js.native
  /**
           * true if this peer and all of its connections can no longer be used.
           */
  var destroyed: scala.Boolean = js.native
  /**
           * false if there is an active connection to the PeerServer.
           */
  var disconnected: scala.Boolean = js.native
  /**
           * The brokering ID of this peer
           */
  var id: java.lang.String = js.native
  /**
           * Connects to the remote peer specified by id and returns a data connection.
           * @param id The brokering ID of the remote peer (their peer.id).
           * @param stream The caller's media stream
           * @param options Metadata associated with the connection, passed in by whoever initiated the connection.
           */
  def call(id: java.lang.String, stream: js.Any): MediaConnection = js.native
  /**
           * Connects to the remote peer specified by id and returns a data connection.
           * @param id The brokering ID of the remote peer (their peer.id).
           * @param stream The caller's media stream
           * @param options Metadata associated with the connection, passed in by whoever initiated the connection.
           */
  def call(id: java.lang.String, stream: js.Any, options: js.Any): MediaConnection = js.native
  /**
           *
           * @param id The brokering ID of the remote peer (their peer.id).
           * @param options for specifying details about Peer Connection
           */
  def connect(id: java.lang.String): DataConnection = js.native
  /**
           *
           * @param id The brokering ID of the remote peer (their peer.id).
           * @param options for specifying details about Peer Connection
           */
  def connect(id: java.lang.String, options: PeerConnectOption): DataConnection = js.native
  /**
           * Close the connection to the server and terminate all existing connections.
           */
  def destroy(): scala.Unit = js.native
  /**
           * Close the connection to the server, leaving all existing data and media connections intact.
           */
  def disconnect(): scala.Unit = js.native
  /**
           * Retrieve a data/media connection for this peer.
           * @param peer
           * @param id
           */
  def getConnection(peer: Peer, id: java.lang.String): js.Any = js.native
  /**
           * Get a list of available peer IDs
           * @param callback
           */
  def listAllPeers(callback: js.Function1[/* peerIds */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  /**
           * Remove event listeners.(EventEmitter3)
           * @param {String} event The event we want to remove.
           * @param {Function} fn The listener that we need to find.
           * @param {Boolean} once Only remove once listeners.
           */
  def off(event: java.lang.String, fn: js.Function): scala.Unit = js.native
  /**
           * Remove event listeners.(EventEmitter3)
           * @param {String} event The event we want to remove.
           * @param {Function} fn The listener that we need to find.
           * @param {Boolean} once Only remove once listeners.
           */
  def off(event: java.lang.String, fn: js.Function, once: scala.Boolean): scala.Unit = js.native
  /**
           * Calls the remote peer specified by id and returns a media connection.
           * @param event Event name
           * @param cb Callback Function
           */
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Emitted when a remote peer attempts to call you.
           * @param event Event name
           * @param cb Callback Function
           */
  @JSName("on")
  def on_call(
    event: peerjsLib.peerjsLibStrings.call,
    cb: js.Function1[/* mediaConnection */ MediaConnection, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Emitted when the peer is destroyed and can no longer accept or create any new connections.
           * @param event Event name
           * @param cb Callback Function
           */
  @JSName("on")
  def on_close(event: peerjsLib.peerjsLibStrings.close, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Emitted when a new data connection is established from a remote peer.
           * @param event Event name
           * @param cb Callback Function
           */
  @JSName("on")
  def on_connection(
    event: peerjsLib.peerjsLibStrings.connection,
    cb: js.Function1[/* dataConnection */ DataConnection, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Emitted when the peer is disconnected from the signalling server
           * @param event Event name
           * @param cb Callback Function
           */
  @JSName("on")
  def on_disconnected(event: peerjsLib.peerjsLibStrings.disconnected, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Errors on the peer are almost always fatal and will destroy the peer.
           * @param event Event name
           * @param cb Callback Function
           */
  @JSName("on")
  def on_error(event: peerjsLib.peerjsLibStrings.error, cb: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
           * Emitted when a connection to the PeerServer is established.
           * @param event Event name
           * @param cb id is the brokering ID of the peer
           */
  @JSName("on")
  def on_open(event: peerjsLib.peerjsLibStrings.open, cb: js.Function1[/* id */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
           * Attempt to reconnect to the server with the peer's old ID
           */
  def reconnect(): scala.Unit = js.native
}

