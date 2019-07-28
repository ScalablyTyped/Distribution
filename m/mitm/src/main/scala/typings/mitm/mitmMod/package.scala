package typings.mitm

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mitmMod {
  type Callback = SocketConnectCallback | SocketConnectionCallback | HttpCallback
  type HttpCallback = js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit]
  type SocketConnectCallback = js.Function2[/* socket */ BypassableSocket, /* opts */ SocketOptions, Unit]
  type SocketConnectionCallback = js.Function2[/* socket */ Socket, /* opts */ SocketOptions, Unit]
}
