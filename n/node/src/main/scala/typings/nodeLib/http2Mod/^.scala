package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(authority: java.lang.String): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(
    authority: java.lang.String,
    listener: js.Function2[
      /* session */ nodeLib.http2Mod.ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(authority: java.lang.String, options: nodeLib.http2Mod.ClientSessionOptions): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(
    authority: java.lang.String,
    options: nodeLib.http2Mod.ClientSessionOptions,
    listener: js.Function2[
      /* session */ nodeLib.http2Mod.ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(authority: java.lang.String, options: nodeLib.http2Mod.SecureClientSessionOptions): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(
    authority: java.lang.String,
    options: nodeLib.http2Mod.SecureClientSessionOptions,
    listener: js.Function2[
      /* session */ nodeLib.http2Mod.ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(authority: nodeLib.urlMod.URL): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(
    authority: nodeLib.urlMod.URL,
    listener: js.Function2[
      /* session */ nodeLib.http2Mod.ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(authority: nodeLib.urlMod.URL, options: nodeLib.http2Mod.ClientSessionOptions): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(
    authority: nodeLib.urlMod.URL,
    options: nodeLib.http2Mod.ClientSessionOptions,
    listener: js.Function2[
      /* session */ nodeLib.http2Mod.ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(authority: nodeLib.urlMod.URL, options: nodeLib.http2Mod.SecureClientSessionOptions): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(
    authority: nodeLib.urlMod.URL,
    options: nodeLib.http2Mod.SecureClientSessionOptions,
    listener: js.Function2[
      /* session */ nodeLib.http2Mod.ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.ClientHttp2Session = js.native
  def createSecureServer(): nodeLib.http2Mod.Http2SecureServer = js.native
  def createSecureServer(
    onRequestHandler: js.Function2[
      /* request */ nodeLib.http2Mod.Http2ServerRequest, 
      /* response */ nodeLib.http2Mod.Http2ServerResponse, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.Http2SecureServer = js.native
  def createSecureServer(options: nodeLib.http2Mod.SecureServerOptions): nodeLib.http2Mod.Http2SecureServer = js.native
  def createSecureServer(
    options: nodeLib.http2Mod.SecureServerOptions,
    onRequestHandler: js.Function2[
      /* request */ nodeLib.http2Mod.Http2ServerRequest, 
      /* response */ nodeLib.http2Mod.Http2ServerResponse, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.Http2SecureServer = js.native
  def createServer(): nodeLib.http2Mod.Http2Server = js.native
  def createServer(
    onRequestHandler: js.Function2[
      /* request */ nodeLib.http2Mod.Http2ServerRequest, 
      /* response */ nodeLib.http2Mod.Http2ServerResponse, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.Http2Server = js.native
  def createServer(options: nodeLib.http2Mod.ServerOptions): nodeLib.http2Mod.Http2Server = js.native
  def createServer(
    options: nodeLib.http2Mod.ServerOptions,
    onRequestHandler: js.Function2[
      /* request */ nodeLib.http2Mod.Http2ServerRequest, 
      /* response */ nodeLib.http2Mod.Http2ServerResponse, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.Http2Server = js.native
  def getDefaultSettings(): nodeLib.http2Mod.Settings = js.native
  def getPackedSettings(settings: nodeLib.http2Mod.Settings): nodeLib.http2Mod.Settings = js.native
  def getUnpackedSettings(buf: nodeLib.Buffer): nodeLib.http2Mod.Settings = js.native
  def getUnpackedSettings(buf: stdLib.Uint8Array): nodeLib.http2Mod.Settings = js.native
}

