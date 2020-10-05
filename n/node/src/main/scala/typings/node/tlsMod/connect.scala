package typings.node.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tls", "connect")
@js.native
object connect extends js.Object {
  def apply(options: ConnectionOptions): TLSSocket = js.native
  def apply(options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): TLSSocket = js.native
  def apply(port: Double): TLSSocket = js.native
  def apply(
    port: Double,
    host: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    secureConnectListener: js.Function0[Unit]
  ): TLSSocket = js.native
  def apply(port: Double, host: js.UndefOr[scala.Nothing], options: ConnectionOptions): TLSSocket = js.native
  def apply(
    port: Double,
    host: js.UndefOr[scala.Nothing],
    options: ConnectionOptions,
    secureConnectListener: js.Function0[Unit]
  ): TLSSocket = js.native
  def apply(port: Double, host: String): TLSSocket = js.native
  def apply(
    port: Double,
    host: String,
    options: js.UndefOr[scala.Nothing],
    secureConnectListener: js.Function0[Unit]
  ): TLSSocket = js.native
  def apply(port: Double, host: String, options: ConnectionOptions): TLSSocket = js.native
  def apply(port: Double, host: String, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): TLSSocket = js.native
  def apply(port: Double, options: js.UndefOr[scala.Nothing], secureConnectListener: js.Function0[Unit]): TLSSocket = js.native
  def apply(port: Double, options: ConnectionOptions): TLSSocket = js.native
  def apply(port: Double, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): TLSSocket = js.native
}

