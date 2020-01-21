package typings.node.http2Mod

import typings.node.netMod.Socket
import typings.node.tlsMod.TLSSocket
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", "connect")
@js.native
object connect extends js.Object {
  def apply(authority: String): ClientHttp2Session = js.native
  def apply(
    authority: String,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def apply(authority: String, options: ClientSessionOptions): ClientHttp2Session = js.native
  def apply(
    authority: String,
    options: ClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def apply(authority: String, options: SecureClientSessionOptions): ClientHttp2Session = js.native
  def apply(
    authority: String,
    options: SecureClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def apply(authority: URL_): ClientHttp2Session = js.native
  def apply(
    authority: URL_,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def apply(authority: URL_, options: ClientSessionOptions): ClientHttp2Session = js.native
  def apply(
    authority: URL_,
    options: ClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def apply(authority: URL_, options: SecureClientSessionOptions): ClientHttp2Session = js.native
  def apply(
    authority: URL_,
    options: SecureClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
}

