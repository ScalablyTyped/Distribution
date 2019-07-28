package typings.node.netMod

import typings.node.Anon_AllowHalfOpen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(options: NetConnectOpts): Socket = js.native
  def connect(options: NetConnectOpts, connectionListener: js.Function0[Unit]): Socket = js.native
  def connect(path: java.lang.String): Socket = js.native
  def connect(path: java.lang.String, connectionListener: js.Function0[Unit]): Socket = js.native
  def connect(port: Double): Socket = js.native
  def connect(port: Double, host: java.lang.String): Socket = js.native
  def connect(port: Double, host: java.lang.String, connectionListener: js.Function0[Unit]): Socket = js.native
  def createConnection(options: NetConnectOpts): Socket = js.native
  def createConnection(options: NetConnectOpts, connectionListener: js.Function0[Unit]): Socket = js.native
  def createConnection(path: java.lang.String): Socket = js.native
  def createConnection(path: java.lang.String, connectionListener: js.Function0[Unit]): Socket = js.native
  def createConnection(port: Double): Socket = js.native
  def createConnection(port: Double, host: java.lang.String): Socket = js.native
  def createConnection(port: Double, host: java.lang.String, connectionListener: js.Function0[Unit]): Socket = js.native
  def createServer(): Server = js.native
  def createServer(connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
  def createServer(options: Anon_AllowHalfOpen): Server = js.native
  def createServer(options: Anon_AllowHalfOpen, connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
  def isIP(input: java.lang.String): Double = js.native
  def isIPv4(input: java.lang.String): Boolean = js.native
  def isIPv6(input: java.lang.String): Boolean = js.native
}

