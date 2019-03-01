package typings
package mitmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mitmMod {
  type Callback = SocketConnectCallback | SocketConnectionCallback | HttpCallback
  type HttpCallback = js.Function2[
    /* request */ nodeLib.httpMod.IncomingMessage, 
    /* response */ nodeLib.httpMod.ServerResponse, 
    scala.Unit
  ]
  type SocketConnectCallback = js.Function2[/* socket */ BypassableSocket, /* opts */ SocketOptions, scala.Unit]
  type SocketConnectionCallback = js.Function2[/* socket */ nodeLib.netMod.Socket, /* opts */ SocketOptions, scala.Unit]
}
