package typings
package neffosDotJsLib.neffosDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("neffos.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ErrBadNamespace: stdLib.Error = js.native
  val ErrBadRoom: stdLib.Error = js.native
  val ErrClosed: stdLib.Error = js.native
  val ErrInvalidPayload: stdLib.Error = js.native
  val ErrWrite: stdLib.Error = js.native
  val OnAnyEvent: neffosDotJsLib.neffosDotJsLibStrings._OnAnyEvent = js.native
  val OnNamespaceConnect: neffosDotJsLib.neffosDotJsLibStrings._OnNamespaceConnect = js.native
  val OnNamespaceConnected: neffosDotJsLib.neffosDotJsLibStrings._OnNamespaceConnected = js.native
  val OnNamespaceDisconnect: neffosDotJsLib.neffosDotJsLibStrings._OnNamespaceDisconnect = js.native
  val OnNativeMessage: neffosDotJsLib.neffosDotJsLibStrings._OnNativeMessage = js.native
  val OnRoomJoin: neffosDotJsLib.neffosDotJsLibStrings._OnRoomJoin = js.native
  val OnRoomJoined: neffosDotJsLib.neffosDotJsLibStrings._OnRoomJoined = js.native
  val OnRoomLeave: neffosDotJsLib.neffosDotJsLibStrings._OnRoomLeave = js.native
  val OnRoomLeft: neffosDotJsLib.neffosDotJsLibStrings._OnRoomLeft = js.native
  def dial(endpoint: java.lang.String, connHandler: Namespaces): js.Promise[Conn] = js.native
  def dial(endpoint: java.lang.String, connHandler: Namespaces, protocols: js.Array[java.lang.String]): js.Promise[Conn] = js.native
  def isSystemEvent(event: java.lang.String): scala.Boolean = js.native
}

