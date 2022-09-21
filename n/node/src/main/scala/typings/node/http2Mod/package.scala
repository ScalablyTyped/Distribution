package typings.node.http2Mod

import typings.node.bufferMod.global.Buffer
import typings.node.http2Mod.^
import typings.node.nodeNetMod.Socket
import typings.node.nodeTlsMod.TLSSocket
import typings.node.nodeUrlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def connect(authority: String): ClientHttp2Session = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any]).asInstanceOf[ClientHttp2Session]
inline def connect(
  authority: String,
  listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
inline def connect(
  authority: String,
  options: Unit,
  listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
inline def connect(authority: String, options: ClientSessionOptions): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
inline def connect(
  authority: String,
  options: ClientSessionOptions,
  listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
inline def connect(authority: String, options: SecureClientSessionOptions): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
inline def connect(
  authority: String,
  options: SecureClientSessionOptions,
  listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
inline def connect(authority: URL): ClientHttp2Session = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any]).asInstanceOf[ClientHttp2Session]
inline def connect(
  authority: URL,
  listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
inline def connect(
  authority: URL,
  options: Unit,
  listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
inline def connect(authority: URL, options: ClientSessionOptions): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
inline def connect(
  authority: URL,
  options: ClientSessionOptions,
  listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
inline def connect(authority: URL, options: SecureClientSessionOptions): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]
inline def connect(
  authority: URL,
  options: SecureClientSessionOptions,
  listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
): ClientHttp2Session = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[ClientHttp2Session]

inline def createSecureServer(): Http2SecureServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")().asInstanceOf[Http2SecureServer]
inline def createSecureServer(
  onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
): Http2SecureServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(onRequestHandler.asInstanceOf[js.Any]).asInstanceOf[Http2SecureServer]
inline def createSecureServer(options: SecureServerOptions): Http2SecureServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any]).asInstanceOf[Http2SecureServer]
inline def createSecureServer(
  options: SecureServerOptions,
  onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
): Http2SecureServer = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any], onRequestHandler.asInstanceOf[js.Any])).asInstanceOf[Http2SecureServer]

inline def createServer(): Http2Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Http2Server]
inline def createServer(
  onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
): Http2Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(onRequestHandler.asInstanceOf[js.Any]).asInstanceOf[Http2Server]
inline def createServer(options: ServerOptions): Http2Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Http2Server]
inline def createServer(
  options: ServerOptions,
  onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
): Http2Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], onRequestHandler.asInstanceOf[js.Any])).asInstanceOf[Http2Server]

inline def getDefaultSettings(): Settings = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultSettings")().asInstanceOf[Settings]

inline def getPackedSettings(settings: Settings): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackedSettings")(settings.asInstanceOf[js.Any]).asInstanceOf[Buffer]

inline def getUnpackedSettings(buf: js.typedarray.Uint8Array): Settings = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnpackedSettings")(buf.asInstanceOf[js.Any]).asInstanceOf[Settings]

inline def sensitiveHeaders: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("sensitiveHeaders").asInstanceOf[js.Symbol]

type ServerOptions = ServerSessionOptions
