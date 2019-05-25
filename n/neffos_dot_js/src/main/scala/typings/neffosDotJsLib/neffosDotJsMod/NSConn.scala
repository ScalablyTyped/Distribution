package typings
package neffosDotJsLib.neffosDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("neffos.js", "NSConn")
@js.native
class NSConn protected () extends js.Object {
  def this(conn: Conn, namespace: java.lang.String, events: Events) = this()
  /* The conn property refers to the main `Conn` constructed by the `dial` function. */
  var conn: Conn = js.native
  var events: Events = js.native
  var namespace: java.lang.String = js.native
  /* The rooms property its the map of the connected namespace's joined rooms. */
  var rooms: stdLib.Map[java.lang.String, Room] = js.native
  /* See `Conn.ask`. */
  def ask(event: java.lang.String, body: WSData): js.Promise[Message] = js.native
  /* The disconnect method sends a disconnect signal to the server and fires the `OnNamespaceDisconnect` event. */
  def disconnect(): js.Promise[stdLib.Error] = js.native
  /* The emit method sends a message to the server with its `Message.Namespace` filled to this specific namespace. */
  def emit(event: java.lang.String, body: WSData): scala.Boolean = js.native
  /* The joinRoom method can be used to join to a specific room, rooms are dynamic.
    Returns a `Room` or an error. */
  def joinRoom(roomName: java.lang.String): js.Promise[Room] = js.native
  /* The leaveAll method sends a leave room signal to all rooms and fires the `OnRoomLeave` and `OnRoomLeft` (if no error caused) events. */
  def leaveAll(): js.Promise[stdLib.Error] = js.native
  /* The room method returns a joined `Room`. */
  def room(roomName: java.lang.String): Room = js.native
}

