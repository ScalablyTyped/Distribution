package typings.neffosJs.mod

import typings.std.Error
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("neffos.js", "NSConn")
@js.native
class NSConn protected () extends js.Object {
  def this(conn: Conn, namespace: String, events: Events) = this()
  
  /* See `Conn.ask`. */
  def ask(event: String, body: WSData): js.Promise[Message] = js.native
  
  /* The conn property refers to the main `Conn` constructed by the `dial` function. */
  var conn: Conn = js.native
  
  /* The disconnect method sends a disconnect signal to the server and fires the `OnNamespaceDisconnect` event. */
  def disconnect(): js.Promise[Error] = js.native
  
  /* The emit method sends a message to the server with its `Message.Namespace` filled to this specific namespace. */
  def emit(event: String, body: WSData): Boolean = js.native
  
  var events: Events = js.native
  
  /* The joinRoom method can be used to join to a specific room, rooms are dynamic.
    Returns a `Room` or an error. */
  def joinRoom(roomName: String): js.Promise[Room] = js.native
  
  /* The leaveAll method sends a leave room signal to all rooms and fires the `OnRoomLeave` and `OnRoomLeft` (if no error occurred) events. */
  def leaveAll(): js.Promise[Error] = js.native
  
  var namespace: String = js.native
  
  /* The room method returns a joined `Room`. */
  def room(roomName: String): Room = js.native
  
  /* The rooms property its the map of the connected namespace's joined rooms. */
  var rooms: Map[String, Room] = js.native
}
