package typings.peerjs.peerjsMod

import typings.peerjs.peerjsStrings.call
import typings.peerjs.peerjsStrings.close
import typings.peerjs.peerjsStrings.connection
import typings.peerjs.peerjsStrings.disconnected
import typings.peerjs.peerjsStrings.error
import typings.peerjs.peerjsStrings.open
import typings.std.MediaStream
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
  var destroyed: Boolean = js.native
  /**
    * false if there is an active connection to the PeerServer.
    */
  var disconnected: Boolean = js.native
  /**
    * The brokering ID of this peer
    */
  var id: String = js.native
  /**
    * Connects to the remote peer specified by id and returns a data connection.
    * @param id The brokering ID of the remote peer (their peer.id).
    * @param stream The caller's media stream
    * @param options Metadata associated with the connection, passed in by whoever initiated the connection.
    */
  def call(id: String, stream: MediaStream): MediaConnection = js.native
  def call(id: String, stream: MediaStream, options: CallOption): MediaConnection = js.native
  /**
    *
    * @param id The brokering ID of the remote peer (their peer.id).
    * @param options for specifying details about Peer Connection
    */
  def connect(id: String): DataConnection = js.native
  def connect(id: String, options: PeerConnectOption): DataConnection = js.native
  /**
    * Close the connection to the server and terminate all existing connections.
    */
  def destroy(): Unit = js.native
  /**
    * Close the connection to the server, leaving all existing data and media connections intact.
    */
  def disconnect(): Unit = js.native
  /**
    * Retrieve a data/media connection for this peer.
    * @param peerId
    * @param connectionId
    */
  def getConnection(peerId: String, connectionId: String): MediaConnection | DataConnection | Null = js.native
  /**
    * Get a list of available peer IDs
    * @param callback
    */
  def listAllPeers(callback: js.Function1[/* peerIds */ js.Array[String], Unit]): Unit = js.native
  /**
    * Remove event listeners.(EventEmitter3)
    * @param {String} event The event we want to remove.
    * @param {Function} fn The listener that we need to find.
    * @param {Boolean} once Only remove once listeners.
    */
  def off(event: String, fn: js.Function): Unit = js.native
  def off(event: String, fn: js.Function, once: Boolean): Unit = js.native
  /**
    * Calls the remote peer specified by id and returns a media connection.
    * @param event Event name
    * @param cb Callback Function
    */
  def on(event: String, cb: js.Function0[Unit]): Unit = js.native
  /**
    * Emitted when a remote peer attempts to call you.
    * @param event Event name
    * @param cb Callback Function
    */
  @JSName("on")
  def on_call(event: call, cb: js.Function1[/* mediaConnection */ MediaConnection, Unit]): Unit = js.native
  /**
    * Emitted when the peer is destroyed and can no longer accept or create any new connections.
    * @param event Event name
    * @param cb Callback Function
    */
  @JSName("on")
  def on_close(event: close, cb: js.Function0[Unit]): Unit = js.native
  /**
    * Emitted when a new data connection is established from a remote peer.
    * @param event Event name
    * @param cb Callback Function
    */
  @JSName("on")
  def on_connection(event: connection, cb: js.Function1[/* dataConnection */ DataConnection, Unit]): Unit = js.native
  /**
    * Emitted when the peer is disconnected from the signalling server
    * @param event Event name
    * @param cb Callback Function
    */
  @JSName("on")
  def on_disconnected(event: disconnected, cb: js.Function0[Unit]): Unit = js.native
  /**
    * Errors on the peer are almost always fatal and will destroy the peer.
    * @param event Event name
    * @param cb Callback Function
    */
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  /**
    * Emitted when a connection to the PeerServer is established.
    * @param event Event name
    * @param cb id is the brokering ID of the peer
    */
  @JSName("on")
  def on_open(event: open, cb: js.Function1[/* id */ String, Unit]): Unit = js.native
  /**
    * Attempt to reconnect to the server with the peer's old ID
    */
  def reconnect(): Unit = js.native
}

