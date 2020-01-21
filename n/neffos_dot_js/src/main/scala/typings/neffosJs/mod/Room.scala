package typings.neffosJs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("neffos.js", "Room")
@js.native
class Room protected () extends js.Object {
  def this(ns: NSConn, roomName: String) = this()
  var name: String = js.native
  var nsConn: NSConn = js.native
  /* The emit method sends a message to the server with its `Message.Room` filled to this specific room
    and `Message.Namespace` to the underline `NSConn`'s namespace. */
  def emit(event: String, body: WSData): Boolean = js.native
  /* The emitBinary method sends a binary message to the server with its `Message.Namespace` filled to this specific namespace
    and `Message.SetBinary` to true. */
  def emitBinary(event: String, body: WSData): Boolean = js.native
  /* The leave method sends a local and server room leave signal `OnRoomLeave`
    and if succeed it fires the OnRoomLeft` event. */
  def leave(): js.Promise[Error] = js.native
}

