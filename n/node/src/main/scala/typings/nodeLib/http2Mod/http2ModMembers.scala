package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", JSImport.Namespace)
@js.native
object http2ModMembers extends js.Object {
  def connect(authority: java.lang.String): ClientHttp2Session = js.native
  def connect(
    authority: java.lang.String,
    listener: js.Function2[
      /* session */ ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): ClientHttp2Session = js.native
  def connect(authority: java.lang.String, options: ClientSessionOptions): ClientHttp2Session = js.native
  def connect(
    authority: java.lang.String,
    options: ClientSessionOptions,
    listener: js.Function2[
      /* session */ ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): ClientHttp2Session = js.native
  def connect(authority: java.lang.String, options: SecureClientSessionOptions): ClientHttp2Session = js.native
  def connect(
    authority: java.lang.String,
    options: SecureClientSessionOptions,
    listener: js.Function2[
      /* session */ ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): ClientHttp2Session = js.native
  def connect(authority: nodeLib.urlMod.URL): ClientHttp2Session = js.native
  def connect(
    authority: nodeLib.urlMod.URL,
    listener: js.Function2[
      /* session */ ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): ClientHttp2Session = js.native
  def connect(authority: nodeLib.urlMod.URL, options: ClientSessionOptions): ClientHttp2Session = js.native
  def connect(
    authority: nodeLib.urlMod.URL,
    options: ClientSessionOptions,
    listener: js.Function2[
      /* session */ ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): ClientHttp2Session = js.native
  def connect(authority: nodeLib.urlMod.URL, options: SecureClientSessionOptions): ClientHttp2Session = js.native
  def connect(
    authority: nodeLib.urlMod.URL,
    options: SecureClientSessionOptions,
    listener: js.Function2[
      /* session */ ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): ClientHttp2Session = js.native
  def createSecureServer(): Http2SecureServer = js.native
  def createSecureServer(
    onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, scala.Unit]
  ): Http2SecureServer = js.native
  def createSecureServer(options: SecureServerOptions): Http2SecureServer = js.native
  def createSecureServer(
    options: SecureServerOptions,
    onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, scala.Unit]
  ): Http2SecureServer = js.native
  def createServer(): Http2Server = js.native
  def createServer(
    onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, scala.Unit]
  ): Http2Server = js.native
  def createServer(options: ServerOptions): Http2Server = js.native
  def createServer(
    options: ServerOptions,
    onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, scala.Unit]
  ): Http2Server = js.native
  def getDefaultSettings(): Settings = js.native
  def getPackedSettings(settings: Settings): Settings = js.native
  def getUnpackedSettings(buf: nodeLib.Buffer): Settings = js.native
  def getUnpackedSettings(buf: stdLib.Uint8Array): Settings = js.native
}

