package typings.nodeIpc.mod.NodeIPC

import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends Client {
  def emit(socketConfig: Socket): Server = js.native
  def emit(socketConfig: Socket, value: js.Any): Server = js.native
  def emit(socketConfig: SocketConfig): Server = js.native
  def emit(socketConfig: SocketConfig, value: js.Any): Server = js.native
  def emit(socket: Socket, event: String): Server = js.native
  def emit(socket: Socket, event: String, value: js.Any): Server = js.native
  def emit(socket: SocketConfig, event: String): Server = js.native
  def emit(socket: SocketConfig, event: String, value: js.Any): Server = js.native
  def emit(value: js.Any): Client = js.native
  /**
    * start serving need top call serve or serveNet first to set up the server
    */
  def start(): Unit = js.native
  /**
    * close the server and stop serving
    */
  def stop(): Unit = js.native
}

