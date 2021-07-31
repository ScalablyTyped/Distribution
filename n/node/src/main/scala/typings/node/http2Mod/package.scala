package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def connect(authority: java.lang.String): typings.node.http2Mod.ClientHttp2Session = typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any]).asInstanceOf[typings.node.http2Mod.ClientHttp2Session]
@scala.inline
def connect(
  authority: java.lang.String,
  listener: js.Function2[
  /* session */ typings.node.http2Mod.ClientHttp2Session, 
  /* socket */ typings.node.netMod.Socket | typings.node.tlsMod.TLSSocket, 
  scala.Unit
]
): typings.node.http2Mod.ClientHttp2Session = (typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.http2Mod.ClientHttp2Session]
@scala.inline
def connect(
  authority: java.lang.String,
  options: scala.Unit,
  listener: js.Function2[
  /* session */ typings.node.http2Mod.ClientHttp2Session, 
  /* socket */ typings.node.netMod.Socket | typings.node.tlsMod.TLSSocket, 
  scala.Unit
]
): typings.node.http2Mod.ClientHttp2Session = (typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.http2Mod.ClientHttp2Session]
@scala.inline
def connect(authority: java.lang.String, options: typings.node.http2Mod.ClientSessionOptions): typings.node.http2Mod.ClientHttp2Session = (typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.http2Mod.ClientHttp2Session]
@scala.inline
def connect(
  authority: java.lang.String,
  options: typings.node.http2Mod.ClientSessionOptions,
  listener: js.Function2[
  /* session */ typings.node.http2Mod.ClientHttp2Session, 
  /* socket */ typings.node.netMod.Socket | typings.node.tlsMod.TLSSocket, 
  scala.Unit
]
): typings.node.http2Mod.ClientHttp2Session = (typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.http2Mod.ClientHttp2Session]
@scala.inline
def connect(authority: java.lang.String, options: typings.node.http2Mod.SecureClientSessionOptions): typings.node.http2Mod.ClientHttp2Session = (typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.http2Mod.ClientHttp2Session]
@scala.inline
def connect(
  authority: java.lang.String,
  options: typings.node.http2Mod.SecureClientSessionOptions,
  listener: js.Function2[
  /* session */ typings.node.http2Mod.ClientHttp2Session, 
  /* socket */ typings.node.netMod.Socket | typings.node.tlsMod.TLSSocket, 
  scala.Unit
]
): typings.node.http2Mod.ClientHttp2Session = (typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.http2Mod.ClientHttp2Session]
@scala.inline
def connect(authority: typings.node.urlMod.URL_): typings.node.http2Mod.ClientHttp2Session = typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any]).asInstanceOf[typings.node.http2Mod.ClientHttp2Session]
@scala.inline
def connect(
  authority: typings.node.urlMod.URL_,
  listener: js.Function2[
  /* session */ typings.node.http2Mod.ClientHttp2Session, 
  /* socket */ typings.node.netMod.Socket | typings.node.tlsMod.TLSSocket, 
  scala.Unit
]
): typings.node.http2Mod.ClientHttp2Session = (typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.http2Mod.ClientHttp2Session]
@scala.inline
def connect(
  authority: typings.node.urlMod.URL_,
  options: scala.Unit,
  listener: js.Function2[
  /* session */ typings.node.http2Mod.ClientHttp2Session, 
  /* socket */ typings.node.netMod.Socket | typings.node.tlsMod.TLSSocket, 
  scala.Unit
]
): typings.node.http2Mod.ClientHttp2Session = (typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.http2Mod.ClientHttp2Session]
@scala.inline
def connect(authority: typings.node.urlMod.URL_, options: typings.node.http2Mod.ClientSessionOptions): typings.node.http2Mod.ClientHttp2Session = (typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.http2Mod.ClientHttp2Session]
@scala.inline
def connect(
  authority: typings.node.urlMod.URL_,
  options: typings.node.http2Mod.ClientSessionOptions,
  listener: js.Function2[
  /* session */ typings.node.http2Mod.ClientHttp2Session, 
  /* socket */ typings.node.netMod.Socket | typings.node.tlsMod.TLSSocket, 
  scala.Unit
]
): typings.node.http2Mod.ClientHttp2Session = (typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.http2Mod.ClientHttp2Session]
@scala.inline
def connect(authority: typings.node.urlMod.URL_, options: typings.node.http2Mod.SecureClientSessionOptions): typings.node.http2Mod.ClientHttp2Session = (typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.http2Mod.ClientHttp2Session]
@scala.inline
def connect(
  authority: typings.node.urlMod.URL_,
  options: typings.node.http2Mod.SecureClientSessionOptions,
  listener: js.Function2[
  /* session */ typings.node.http2Mod.ClientHttp2Session, 
  /* socket */ typings.node.netMod.Socket | typings.node.tlsMod.TLSSocket, 
  scala.Unit
]
): typings.node.http2Mod.ClientHttp2Session = (typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[typings.node.http2Mod.ClientHttp2Session]

@scala.inline
def createSecureServer(): typings.node.http2Mod.Http2SecureServer = typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")().asInstanceOf[typings.node.http2Mod.Http2SecureServer]
@scala.inline
def createSecureServer(
  onRequestHandler: js.Function2[
  /* request */ typings.node.http2Mod.Http2ServerRequest, 
  /* response */ typings.node.http2Mod.Http2ServerResponse, 
  scala.Unit
]
): typings.node.http2Mod.Http2SecureServer = typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(onRequestHandler.asInstanceOf[js.Any]).asInstanceOf[typings.node.http2Mod.Http2SecureServer]
@scala.inline
def createSecureServer(options: typings.node.http2Mod.SecureServerOptions): typings.node.http2Mod.Http2SecureServer = typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.node.http2Mod.Http2SecureServer]
@scala.inline
def createSecureServer(
  options: typings.node.http2Mod.SecureServerOptions,
  onRequestHandler: js.Function2[
  /* request */ typings.node.http2Mod.Http2ServerRequest, 
  /* response */ typings.node.http2Mod.Http2ServerResponse, 
  scala.Unit
]
): typings.node.http2Mod.Http2SecureServer = (typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any], onRequestHandler.asInstanceOf[js.Any])).asInstanceOf[typings.node.http2Mod.Http2SecureServer]

@scala.inline
def createServer(): typings.node.http2Mod.Http2Server = typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[typings.node.http2Mod.Http2Server]
@scala.inline
def createServer(
  onRequestHandler: js.Function2[
  /* request */ typings.node.http2Mod.Http2ServerRequest, 
  /* response */ typings.node.http2Mod.Http2ServerResponse, 
  scala.Unit
]
): typings.node.http2Mod.Http2Server = typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(onRequestHandler.asInstanceOf[js.Any]).asInstanceOf[typings.node.http2Mod.Http2Server]
@scala.inline
def createServer(options: typings.node.http2Mod.ServerOptions): typings.node.http2Mod.Http2Server = typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.node.http2Mod.Http2Server]
@scala.inline
def createServer(
  options: typings.node.http2Mod.ServerOptions,
  onRequestHandler: js.Function2[
  /* request */ typings.node.http2Mod.Http2ServerRequest, 
  /* response */ typings.node.http2Mod.Http2ServerResponse, 
  scala.Unit
]
): typings.node.http2Mod.Http2Server = (typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], onRequestHandler.asInstanceOf[js.Any])).asInstanceOf[typings.node.http2Mod.Http2Server]

@scala.inline
def getDefaultSettings(): typings.node.http2Mod.Settings = typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultSettings")().asInstanceOf[typings.node.http2Mod.Settings]

@scala.inline
def getPackedSettings(settings: typings.node.http2Mod.Settings): typings.node.Buffer = typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("getPackedSettings")(settings.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]

@scala.inline
def getUnpackedSettings(buf: typings.std.Uint8Array): typings.node.http2Mod.Settings = typings.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("getUnpackedSettings")(buf.asInstanceOf[js.Any]).asInstanceOf[typings.node.http2Mod.Settings]

type ServerOptions = typings.node.http2Mod.ServerSessionOptions
