package typings.node.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", "connect")
@js.native
object connect extends js.Object {
  def apply(options: ConnectionOptions): TLSSocket = js.native
  def apply(options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): TLSSocket = js.native
  def apply(port: Double): TLSSocket = js.native
  def apply(port: Double, host: java.lang.String): TLSSocket = js.native
  def apply(port: Double, host: java.lang.String, options: ConnectionOptions): TLSSocket = js.native
  def apply(
    port: Double,
    host: java.lang.String,
    options: ConnectionOptions,
    secureConnectListener: js.Function0[Unit]
  ): TLSSocket = js.native
  def apply(port: Double, options: ConnectionOptions): TLSSocket = js.native
  def apply(port: Double, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): TLSSocket = js.native
}

