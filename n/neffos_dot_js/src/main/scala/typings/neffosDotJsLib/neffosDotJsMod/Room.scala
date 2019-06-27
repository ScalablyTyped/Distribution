package typings
package neffosDotJsLib.neffosDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("neffos.js", "Room")
@js.native
class Room protected () extends js.Object {
  def this(ns: NSConn, roomName: java.lang.String) = this()
  var name: java.lang.String = js.native
  var nsConn: NSConn = js.native
  /* The emit method sends a message to the server with its `Message.Room` filled to this specific room
    and `Message.Namespace` to the underline `NSConn`'s namespace. */
  def emit(event: java.lang.String, body: WSData): scala.Boolean = js.native
  /* The leave method sends a local and server room leave signal `OnRoomLeave`
    and if succeed it fires the OnRoomLeft` event. */
  def leave(): js.Promise[stdLib.Error] = js.native
}

