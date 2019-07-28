package typings.node.http2Mod

import typings.node.Buffer
import typings.node.netMod.Socket
import typings.node.tlsMod.TLSSocket
import typings.node.urlMod.URL
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(authority: java.lang.String): ClientHttp2Session = js.native
  def connect(
    authority: java.lang.String,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def connect(authority: java.lang.String, options: ClientSessionOptions): ClientHttp2Session = js.native
  def connect(
    authority: java.lang.String,
    options: ClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def connect(authority: java.lang.String, options: SecureClientSessionOptions): ClientHttp2Session = js.native
  def connect(
    authority: java.lang.String,
    options: SecureClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def connect(authority: URL): ClientHttp2Session = js.native
  def connect(
    authority: URL,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def connect(authority: URL, options: ClientSessionOptions): ClientHttp2Session = js.native
  def connect(
    authority: URL,
    options: ClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def connect(authority: URL, options: SecureClientSessionOptions): ClientHttp2Session = js.native
  def connect(
    authority: URL,
    options: SecureClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def createSecureServer(): Http2SecureServer = js.native
  def createSecureServer(
    onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): Http2SecureServer = js.native
  def createSecureServer(options: SecureServerOptions): Http2SecureServer = js.native
  def createSecureServer(
    options: SecureServerOptions,
    onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): Http2SecureServer = js.native
  def createServer(): Http2Server = js.native
  def createServer(
    onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): Http2Server = js.native
  def createServer(options: ServerOptions): Http2Server = js.native
  def createServer(
    options: ServerOptions,
    onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): Http2Server = js.native
  def getDefaultSettings(): Settings = js.native
  def getPackedSettings(settings: Settings): Buffer = js.native
  def getUnpackedSettings(buf: Uint8Array): Settings = js.native
}

