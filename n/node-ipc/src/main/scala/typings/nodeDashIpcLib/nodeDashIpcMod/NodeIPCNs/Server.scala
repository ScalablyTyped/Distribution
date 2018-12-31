package typings
package nodeDashIpcLib.nodeDashIpcMod.NodeIPCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends Client {
  def emit(socketConfig: SocketConfig): Server = js.native
  def emit(socketConfig: SocketConfig, value: js.Any): Server = js.native
  def emit(socketConfig: nodeLib.netMod.Socket): Server = js.native
  def emit(socketConfig: nodeLib.netMod.Socket, value: js.Any): Server = js.native
  def emit(socket: SocketConfig, event: java.lang.String): Server = js.native
  def emit(socket: SocketConfig, event: java.lang.String, value: js.Any): Server = js.native
  def emit(socket: nodeLib.netMod.Socket, event: java.lang.String): Server = js.native
  def emit(socket: nodeLib.netMod.Socket, event: java.lang.String, value: js.Any): Server = js.native
  def emit(value: js.Any): Client = js.native
  /**
    * start serving need top call serve or serveNet first to set up the server
    */
  def start(): scala.Unit = js.native
  /**
    * close the server and stop serving
    */
  def stop(): scala.Unit = js.native
}

