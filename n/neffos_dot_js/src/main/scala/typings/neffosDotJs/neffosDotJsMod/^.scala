package typings.neffosDotJs.neffosDotJsMod

import typings.neffosDotJs.neffosDotJsStrings._OnAnyEvent
import typings.neffosDotJs.neffosDotJsStrings._OnNamespaceConnect
import typings.neffosDotJs.neffosDotJsStrings._OnNamespaceConnected
import typings.neffosDotJs.neffosDotJsStrings._OnNamespaceDisconnect
import typings.neffosDotJs.neffosDotJsStrings._OnNativeMessage
import typings.neffosDotJs.neffosDotJsStrings._OnRoomJoin
import typings.neffosDotJs.neffosDotJsStrings._OnRoomJoined
import typings.neffosDotJs.neffosDotJsStrings._OnRoomLeave
import typings.neffosDotJs.neffosDotJsStrings._OnRoomLeft
import typings.neffosDotJs.neffosDotJsStrings.`X-Websocket-Header-`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("neffos.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ErrBadNamespace: Error = js.native
  val ErrBadRoom: Error = js.native
  val ErrClosed: Error = js.native
  val ErrInvalidPayload: Error = js.native
  val ErrWrite: Error = js.native
  val OnAnyEvent: _OnAnyEvent = js.native
  val OnNamespaceConnect: _OnNamespaceConnect = js.native
  val OnNamespaceConnected: _OnNamespaceConnected = js.native
  val OnNamespaceDisconnect: _OnNamespaceDisconnect = js.native
  val OnNativeMessage: _OnNativeMessage = js.native
  val OnRoomJoin: _OnRoomJoin = js.native
  val OnRoomJoined: _OnRoomJoined = js.native
  val OnRoomLeave: _OnRoomLeave = js.native
  val OnRoomLeft: _OnRoomLeft = js.native
  val URLParamAsHeaderPrefix: `X-Websocket-Header-` = js.native
  def dial(endpoint: String, connHandler: js.Any): js.Promise[Conn] = js.native
  def dial(endpoint: String, connHandler: js.Any, options: js.Any): js.Promise[Conn] = js.native
  def dial(endpoint: String, connHandler: js.Any, options: Options): js.Promise[Conn] = js.native
  def isSystemEvent(event: String): Boolean = js.native
  def marshal(obj: js.Any): String = js.native
}

