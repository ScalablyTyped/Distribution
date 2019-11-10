package typings.neffosDotJs.neffosDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("neffos.js", "Conn")
@js.native
class Conn protected () extends js.Object {
  def this(conn: js.Any, namespaces: Namespaces) = this()
  def this(conn: js.Any, namespaces: Namespaces, protocols: js.Array[String]) = this()
  /* ID is the generated connection ID from the server-side, all connected namespaces(`NSConn` instances)
    that belong to that connection have the same ID. It is available immediately after the `dial`. */
  var ID: String = js.native
  /* If > 0 then this connection is the result of a reconnection,
    see `wasReconnected()` too. */
  var reconnectTries: Double = js.native
  /* The ask method writes a message to the server and blocks until a response or an error received. */
  def ask(msg: Message): js.Promise[Message] = js.native
  /* The close method will force-disconnect from all connected namespaces and force-leave from all joined rooms
    and finally will terminate the underline websocket connection. After this method call the `Conn` is not usable anymore, a new `dial` call is required. */
  def close(): Unit = js.native
  /* The connect method returns a new connected to the specific "namespace" `NSConn` instance or an error. */
  def connect(namespace: String): js.Promise[NSConn] = js.native
  /* The isClosed method reports whether this connection is closed. */
  def isClosed(): Boolean = js.native
  /* The namespace method returns an already connected `NSConn`. */
  def namespace(namespace: String): NSConn = js.native
  /* waitServerConnect method blocks until server manually calls the connection's `Connect`
    on the `Server#OnConnected` event. */
  def waitServerConnect(namespace: String): js.Promise[NSConn] = js.native
  /* The wasReconnected method reports whether the current connection is the result of a reconnection.
    To get the numbers of total retries see the `reconnectTries` field. */
  def wasReconnected(): Boolean = js.native
  /* The write method writes a message to the server and reports whether the connection is still available. */
  def write(msg: Message): Boolean = js.native
}

