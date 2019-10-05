package typings.node.http2Mod

import typings.node.netMod.Socket
import typings.node.tlsMod.TLSSocket
import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", "connect")
@js.native
object connect extends js.Object {
  def apply(authority: java.lang.String): ClientHttp2Session = js.native
  def apply(
    authority: java.lang.String,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def apply(authority: java.lang.String, options: ClientSessionOptions): ClientHttp2Session = js.native
  def apply(
    authority: java.lang.String,
    options: ClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def apply(authority: java.lang.String, options: SecureClientSessionOptions): ClientHttp2Session = js.native
  def apply(
    authority: java.lang.String,
    options: SecureClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def apply(authority: URL): ClientHttp2Session = js.native
  def apply(
    authority: URL,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def apply(authority: URL, options: ClientSessionOptions): ClientHttp2Session = js.native
  def apply(
    authority: URL,
    options: ClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def apply(authority: URL, options: SecureClientSessionOptions): ClientHttp2Session = js.native
  def apply(
    authority: URL,
    options: SecureClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
}

