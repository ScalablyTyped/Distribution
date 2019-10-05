package typings.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net", "connect")
@js.native
object connect extends js.Object {
  def apply(options: NetConnectOpts): Socket = js.native
  def apply(options: NetConnectOpts, connectionListener: js.Function0[Unit]): Socket = js.native
  def apply(path: java.lang.String): Socket = js.native
  def apply(path: java.lang.String, connectionListener: js.Function0[Unit]): Socket = js.native
  def apply(port: Double): Socket = js.native
  def apply(port: Double, host: java.lang.String): Socket = js.native
  def apply(port: Double, host: java.lang.String, connectionListener: js.Function0[Unit]): Socket = js.native
}

