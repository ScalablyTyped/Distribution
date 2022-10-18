package typings.node

import typings.node.bufferMod.global.Buffer
import typings.node.http2Mod.ClientHttp2Session
import typings.node.http2Mod.ClientSessionOptions
import typings.node.http2Mod.Http2SecureServer
import typings.node.http2Mod.Http2Server
import typings.node.http2Mod.IncomingHttpHeaders
import typings.node.http2Mod.SecureClientSessionOptions
import typings.node.http2Mod.SecureServerOptions
import typings.node.http2Mod.ServerHttp2Stream
import typings.node.http2Mod.ServerOptions
import typings.node.http2Mod.Settings
import typings.node.nodeColonnetMod.Socket
import typings.node.nodeColontlsMod.TLSSocket
import typings.node.nodeColonurlMod.URL
import typings.node.streamMod.ReadableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonhttp2Mod {
  
  @JSImport("node:http2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node:http2", "Http2ServerRequest")
  @js.native
  open class Http2ServerRequest protected () extends StObject {
    def this(
      stream: ServerHttp2Stream,
      headers: IncomingHttpHeaders,
      options: ReadableOptions,
      rawHeaders: js.Array[String]
    ) = this()
  }
  
  @JSImport("node:http2", "Http2ServerResponse")
  @js.native
  open class Http2ServerResponse protected () extends StObject {
    def this(stream: ServerHttp2Stream) = this()
  }
  
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
  
  object constants {
    
    @JSImport("node:http2", "constants.DEFAULT_SETTINGS_ENABLE_PUSH")
    @js.native
    val DEFAULT_SETTINGS_ENABLE_PUSH: Double = js.native
    
    @JSImport("node:http2", "constants.DEFAULT_SETTINGS_HEADER_TABLE_SIZE")
    @js.native
    val DEFAULT_SETTINGS_HEADER_TABLE_SIZE: Double = js.native
    
    @JSImport("node:http2", "constants.DEFAULT_SETTINGS_INITIAL_WINDOW_SIZE")
    @js.native
    val DEFAULT_SETTINGS_INITIAL_WINDOW_SIZE: Double = js.native
    
    @JSImport("node:http2", "constants.DEFAULT_SETTINGS_MAX_FRAME_SIZE")
    @js.native
    val DEFAULT_SETTINGS_MAX_FRAME_SIZE: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_ACCEPT")
    @js.native
    val HTTP2_HEADER_ACCEPT: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_ACCEPT_CHARSET")
    @js.native
    val HTTP2_HEADER_ACCEPT_CHARSET: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_ACCEPT_ENCODING")
    @js.native
    val HTTP2_HEADER_ACCEPT_ENCODING: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_ACCEPT_LANGUAGE")
    @js.native
    val HTTP2_HEADER_ACCEPT_LANGUAGE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_ACCEPT_RANGES")
    @js.native
    val HTTP2_HEADER_ACCEPT_RANGES: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_ACCESS_CONTROL_ALLOW_ORIGIN")
    @js.native
    val HTTP2_HEADER_ACCESS_CONTROL_ALLOW_ORIGIN: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_AGE")
    @js.native
    val HTTP2_HEADER_AGE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_ALLOW")
    @js.native
    val HTTP2_HEADER_ALLOW: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_AUTHORITY")
    @js.native
    val HTTP2_HEADER_AUTHORITY: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_AUTHORIZATION")
    @js.native
    val HTTP2_HEADER_AUTHORIZATION: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_CACHE_CONTROL")
    @js.native
    val HTTP2_HEADER_CACHE_CONTROL: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_CONNECTION")
    @js.native
    val HTTP2_HEADER_CONNECTION: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_CONTENT_DISPOSITION")
    @js.native
    val HTTP2_HEADER_CONTENT_DISPOSITION: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_CONTENT_ENCODING")
    @js.native
    val HTTP2_HEADER_CONTENT_ENCODING: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_CONTENT_LANGUAGE")
    @js.native
    val HTTP2_HEADER_CONTENT_LANGUAGE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_CONTENT_LENGTH")
    @js.native
    val HTTP2_HEADER_CONTENT_LENGTH: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_CONTENT_LOCATION")
    @js.native
    val HTTP2_HEADER_CONTENT_LOCATION: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_CONTENT_MD5")
    @js.native
    val HTTP2_HEADER_CONTENT_MD5: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_CONTENT_RANGE")
    @js.native
    val HTTP2_HEADER_CONTENT_RANGE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_CONTENT_TYPE")
    @js.native
    val HTTP2_HEADER_CONTENT_TYPE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_COOKIE")
    @js.native
    val HTTP2_HEADER_COOKIE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_DATE")
    @js.native
    val HTTP2_HEADER_DATE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_ETAG")
    @js.native
    val HTTP2_HEADER_ETAG: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_EXPECT")
    @js.native
    val HTTP2_HEADER_EXPECT: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_EXPIRES")
    @js.native
    val HTTP2_HEADER_EXPIRES: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_FROM")
    @js.native
    val HTTP2_HEADER_FROM: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_HOST")
    @js.native
    val HTTP2_HEADER_HOST: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_HTTP2_SETTINGS")
    @js.native
    val HTTP2_HEADER_HTTP2_SETTINGS: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_IF_MATCH")
    @js.native
    val HTTP2_HEADER_IF_MATCH: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_IF_MODIFIED_SINCE")
    @js.native
    val HTTP2_HEADER_IF_MODIFIED_SINCE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_IF_NONE_MATCH")
    @js.native
    val HTTP2_HEADER_IF_NONE_MATCH: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_IF_RANGE")
    @js.native
    val HTTP2_HEADER_IF_RANGE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_IF_UNMODIFIED_SINCE")
    @js.native
    val HTTP2_HEADER_IF_UNMODIFIED_SINCE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_KEEP_ALIVE")
    @js.native
    val HTTP2_HEADER_KEEP_ALIVE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_LAST_MODIFIED")
    @js.native
    val HTTP2_HEADER_LAST_MODIFIED: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_LINK")
    @js.native
    val HTTP2_HEADER_LINK: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_LOCATION")
    @js.native
    val HTTP2_HEADER_LOCATION: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_MAX_FORWARDS")
    @js.native
    val HTTP2_HEADER_MAX_FORWARDS: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_METHOD")
    @js.native
    val HTTP2_HEADER_METHOD: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_PATH")
    @js.native
    val HTTP2_HEADER_PATH: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_PREFER")
    @js.native
    val HTTP2_HEADER_PREFER: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_PROXY_AUTHENTICATE")
    @js.native
    val HTTP2_HEADER_PROXY_AUTHENTICATE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_PROXY_AUTHORIZATION")
    @js.native
    val HTTP2_HEADER_PROXY_AUTHORIZATION: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_PROXY_CONNECTION")
    @js.native
    val HTTP2_HEADER_PROXY_CONNECTION: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_RANGE")
    @js.native
    val HTTP2_HEADER_RANGE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_REFERER")
    @js.native
    val HTTP2_HEADER_REFERER: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_REFRESH")
    @js.native
    val HTTP2_HEADER_REFRESH: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_RETRY_AFTER")
    @js.native
    val HTTP2_HEADER_RETRY_AFTER: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_SCHEME")
    @js.native
    val HTTP2_HEADER_SCHEME: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_SERVER")
    @js.native
    val HTTP2_HEADER_SERVER: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_SET_COOKIE")
    @js.native
    val HTTP2_HEADER_SET_COOKIE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_STATUS")
    @js.native
    val HTTP2_HEADER_STATUS: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_STRICT_TRANSPORT_SECURITY")
    @js.native
    val HTTP2_HEADER_STRICT_TRANSPORT_SECURITY: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_TE")
    @js.native
    val HTTP2_HEADER_TE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_TRANSFER_ENCODING")
    @js.native
    val HTTP2_HEADER_TRANSFER_ENCODING: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_UPGRADE")
    @js.native
    val HTTP2_HEADER_UPGRADE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_USER_AGENT")
    @js.native
    val HTTP2_HEADER_USER_AGENT: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_VARY")
    @js.native
    val HTTP2_HEADER_VARY: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_VIA")
    @js.native
    val HTTP2_HEADER_VIA: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_HEADER_WWW_AUTHENTICATE")
    @js.native
    val HTTP2_HEADER_WWW_AUTHENTICATE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_ACL")
    @js.native
    val HTTP2_METHOD_ACL: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_BASELINE_CONTROL")
    @js.native
    val HTTP2_METHOD_BASELINE_CONTROL: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_BIND")
    @js.native
    val HTTP2_METHOD_BIND: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_CHECKIN")
    @js.native
    val HTTP2_METHOD_CHECKIN: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_CHECKOUT")
    @js.native
    val HTTP2_METHOD_CHECKOUT: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_CONNECT")
    @js.native
    val HTTP2_METHOD_CONNECT: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_COPY")
    @js.native
    val HTTP2_METHOD_COPY: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_DELETE")
    @js.native
    val HTTP2_METHOD_DELETE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_GET")
    @js.native
    val HTTP2_METHOD_GET: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_HEAD")
    @js.native
    val HTTP2_METHOD_HEAD: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_LABEL")
    @js.native
    val HTTP2_METHOD_LABEL: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_LINK")
    @js.native
    val HTTP2_METHOD_LINK: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_LOCK")
    @js.native
    val HTTP2_METHOD_LOCK: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_MERGE")
    @js.native
    val HTTP2_METHOD_MERGE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_MKACTIVITY")
    @js.native
    val HTTP2_METHOD_MKACTIVITY: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_MKCALENDAR")
    @js.native
    val HTTP2_METHOD_MKCALENDAR: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_MKCOL")
    @js.native
    val HTTP2_METHOD_MKCOL: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_MKREDIRECTREF")
    @js.native
    val HTTP2_METHOD_MKREDIRECTREF: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_MKWORKSPACE")
    @js.native
    val HTTP2_METHOD_MKWORKSPACE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_MOVE")
    @js.native
    val HTTP2_METHOD_MOVE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_OPTIONS")
    @js.native
    val HTTP2_METHOD_OPTIONS: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_ORDERPATCH")
    @js.native
    val HTTP2_METHOD_ORDERPATCH: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_PATCH")
    @js.native
    val HTTP2_METHOD_PATCH: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_POST")
    @js.native
    val HTTP2_METHOD_POST: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_PRI")
    @js.native
    val HTTP2_METHOD_PRI: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_PROPFIND")
    @js.native
    val HTTP2_METHOD_PROPFIND: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_PROPPATCH")
    @js.native
    val HTTP2_METHOD_PROPPATCH: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_PUT")
    @js.native
    val HTTP2_METHOD_PUT: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_REBIND")
    @js.native
    val HTTP2_METHOD_REBIND: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_REPORT")
    @js.native
    val HTTP2_METHOD_REPORT: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_SEARCH")
    @js.native
    val HTTP2_METHOD_SEARCH: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_TRACE")
    @js.native
    val HTTP2_METHOD_TRACE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_UNBIND")
    @js.native
    val HTTP2_METHOD_UNBIND: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_UNCHECKOUT")
    @js.native
    val HTTP2_METHOD_UNCHECKOUT: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_UNLINK")
    @js.native
    val HTTP2_METHOD_UNLINK: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_UNLOCK")
    @js.native
    val HTTP2_METHOD_UNLOCK: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_UPDATE")
    @js.native
    val HTTP2_METHOD_UPDATE: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_UPDATEREDIRECTREF")
    @js.native
    val HTTP2_METHOD_UPDATEREDIRECTREF: String = js.native
    
    @JSImport("node:http2", "constants.HTTP2_METHOD_VERSION_CONTROL")
    @js.native
    val HTTP2_METHOD_VERSION_CONTROL: String = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_ACCEPTED")
    @js.native
    val HTTP_STATUS_ACCEPTED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_ALREADY_REPORTED")
    @js.native
    val HTTP_STATUS_ALREADY_REPORTED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_BAD_GATEWAY")
    @js.native
    val HTTP_STATUS_BAD_GATEWAY: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_BAD_REQUEST")
    @js.native
    val HTTP_STATUS_BAD_REQUEST: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_BANDWIDTH_LIMIT_EXCEEDED")
    @js.native
    val HTTP_STATUS_BANDWIDTH_LIMIT_EXCEEDED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_CONFLICT")
    @js.native
    val HTTP_STATUS_CONFLICT: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_CONTINUE")
    @js.native
    val HTTP_STATUS_CONTINUE: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_CREATED")
    @js.native
    val HTTP_STATUS_CREATED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_EXPECTATION_FAILED")
    @js.native
    val HTTP_STATUS_EXPECTATION_FAILED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_FAILED_DEPENDENCY")
    @js.native
    val HTTP_STATUS_FAILED_DEPENDENCY: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_FORBIDDEN")
    @js.native
    val HTTP_STATUS_FORBIDDEN: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_FOUND")
    @js.native
    val HTTP_STATUS_FOUND: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_GATEWAY_TIMEOUT")
    @js.native
    val HTTP_STATUS_GATEWAY_TIMEOUT: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_GONE")
    @js.native
    val HTTP_STATUS_GONE: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_HTTP_VERSION_NOT_SUPPORTED")
    @js.native
    val HTTP_STATUS_HTTP_VERSION_NOT_SUPPORTED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_IM_USED")
    @js.native
    val HTTP_STATUS_IM_USED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_INSUFFICIENT_STORAGE")
    @js.native
    val HTTP_STATUS_INSUFFICIENT_STORAGE: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_INTERNAL_SERVER_ERROR")
    @js.native
    val HTTP_STATUS_INTERNAL_SERVER_ERROR: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_LENGTH_REQUIRED")
    @js.native
    val HTTP_STATUS_LENGTH_REQUIRED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_LOCKED")
    @js.native
    val HTTP_STATUS_LOCKED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_LOOP_DETECTED")
    @js.native
    val HTTP_STATUS_LOOP_DETECTED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_METHOD_NOT_ALLOWED")
    @js.native
    val HTTP_STATUS_METHOD_NOT_ALLOWED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_MISDIRECTED_REQUEST")
    @js.native
    val HTTP_STATUS_MISDIRECTED_REQUEST: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_MOVED_PERMANENTLY")
    @js.native
    val HTTP_STATUS_MOVED_PERMANENTLY: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_MULTIPLE_CHOICES")
    @js.native
    val HTTP_STATUS_MULTIPLE_CHOICES: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_MULTI_STATUS")
    @js.native
    val HTTP_STATUS_MULTI_STATUS: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_NETWORK_AUTHENTICATION_REQUIRED")
    @js.native
    val HTTP_STATUS_NETWORK_AUTHENTICATION_REQUIRED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_NON_AUTHORITATIVE_INFORMATION")
    @js.native
    val HTTP_STATUS_NON_AUTHORITATIVE_INFORMATION: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_NOT_ACCEPTABLE")
    @js.native
    val HTTP_STATUS_NOT_ACCEPTABLE: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_NOT_EXTENDED")
    @js.native
    val HTTP_STATUS_NOT_EXTENDED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_NOT_FOUND")
    @js.native
    val HTTP_STATUS_NOT_FOUND: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_NOT_IMPLEMENTED")
    @js.native
    val HTTP_STATUS_NOT_IMPLEMENTED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_NOT_MODIFIED")
    @js.native
    val HTTP_STATUS_NOT_MODIFIED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_NO_CONTENT")
    @js.native
    val HTTP_STATUS_NO_CONTENT: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_OK")
    @js.native
    val HTTP_STATUS_OK: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_PARTIAL_CONTENT")
    @js.native
    val HTTP_STATUS_PARTIAL_CONTENT: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_PAYLOAD_TOO_LARGE")
    @js.native
    val HTTP_STATUS_PAYLOAD_TOO_LARGE: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_PAYMENT_REQUIRED")
    @js.native
    val HTTP_STATUS_PAYMENT_REQUIRED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_PERMANENT_REDIRECT")
    @js.native
    val HTTP_STATUS_PERMANENT_REDIRECT: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_PRECONDITION_FAILED")
    @js.native
    val HTTP_STATUS_PRECONDITION_FAILED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_PRECONDITION_REQUIRED")
    @js.native
    val HTTP_STATUS_PRECONDITION_REQUIRED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_PROCESSING")
    @js.native
    val HTTP_STATUS_PROCESSING: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_PROXY_AUTHENTICATION_REQUIRED")
    @js.native
    val HTTP_STATUS_PROXY_AUTHENTICATION_REQUIRED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_RANGE_NOT_SATISFIABLE")
    @js.native
    val HTTP_STATUS_RANGE_NOT_SATISFIABLE: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_REQUEST_HEADER_FIELDS_TOO_LARGE")
    @js.native
    val HTTP_STATUS_REQUEST_HEADER_FIELDS_TOO_LARGE: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_REQUEST_TIMEOUT")
    @js.native
    val HTTP_STATUS_REQUEST_TIMEOUT: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_RESET_CONTENT")
    @js.native
    val HTTP_STATUS_RESET_CONTENT: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_SEE_OTHER")
    @js.native
    val HTTP_STATUS_SEE_OTHER: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_SERVICE_UNAVAILABLE")
    @js.native
    val HTTP_STATUS_SERVICE_UNAVAILABLE: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_SWITCHING_PROTOCOLS")
    @js.native
    val HTTP_STATUS_SWITCHING_PROTOCOLS: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_TEAPOT")
    @js.native
    val HTTP_STATUS_TEAPOT: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_TEMPORARY_REDIRECT")
    @js.native
    val HTTP_STATUS_TEMPORARY_REDIRECT: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_TOO_MANY_REQUESTS")
    @js.native
    val HTTP_STATUS_TOO_MANY_REQUESTS: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_UNAUTHORIZED")
    @js.native
    val HTTP_STATUS_UNAUTHORIZED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_UNAVAILABLE_FOR_LEGAL_REASONS")
    @js.native
    val HTTP_STATUS_UNAVAILABLE_FOR_LEGAL_REASONS: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_UNORDERED_COLLECTION")
    @js.native
    val HTTP_STATUS_UNORDERED_COLLECTION: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_UNPROCESSABLE_ENTITY")
    @js.native
    val HTTP_STATUS_UNPROCESSABLE_ENTITY: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_UNSUPPORTED_MEDIA_TYPE")
    @js.native
    val HTTP_STATUS_UNSUPPORTED_MEDIA_TYPE: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_UPGRADE_REQUIRED")
    @js.native
    val HTTP_STATUS_UPGRADE_REQUIRED: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_URI_TOO_LONG")
    @js.native
    val HTTP_STATUS_URI_TOO_LONG: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_USE_PROXY")
    @js.native
    val HTTP_STATUS_USE_PROXY: Double = js.native
    
    @JSImport("node:http2", "constants.HTTP_STATUS_VARIANT_ALSO_NEGOTIATES")
    @js.native
    val HTTP_STATUS_VARIANT_ALSO_NEGOTIATES: Double = js.native
    
    @JSImport("node:http2", "constants.MAX_INITIAL_WINDOW_SIZE")
    @js.native
    val MAX_INITIAL_WINDOW_SIZE: Double = js.native
    
    @JSImport("node:http2", "constants.MAX_MAX_FRAME_SIZE")
    @js.native
    val MAX_MAX_FRAME_SIZE: Double = js.native
    
    @JSImport("node:http2", "constants.MIN_MAX_FRAME_SIZE")
    @js.native
    val MIN_MAX_FRAME_SIZE: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_CANCEL")
    @js.native
    val NGHTTP2_CANCEL: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_COMPRESSION_ERROR")
    @js.native
    val NGHTTP2_COMPRESSION_ERROR: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_CONNECT_ERROR")
    @js.native
    val NGHTTP2_CONNECT_ERROR: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_DEFAULT_WEIGHT")
    @js.native
    val NGHTTP2_DEFAULT_WEIGHT: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_ENHANCE_YOUR_CALM")
    @js.native
    val NGHTTP2_ENHANCE_YOUR_CALM: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_ERR_FRAME_SIZE_ERROR")
    @js.native
    val NGHTTP2_ERR_FRAME_SIZE_ERROR: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_FLAG_ACK")
    @js.native
    val NGHTTP2_FLAG_ACK: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_FLAG_END_HEADERS")
    @js.native
    val NGHTTP2_FLAG_END_HEADERS: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_FLAG_END_STREAM")
    @js.native
    val NGHTTP2_FLAG_END_STREAM: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_FLAG_NONE")
    @js.native
    val NGHTTP2_FLAG_NONE: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_FLAG_PADDED")
    @js.native
    val NGHTTP2_FLAG_PADDED: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_FLAG_PRIORITY")
    @js.native
    val NGHTTP2_FLAG_PRIORITY: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_FLOW_CONTROL_ERROR")
    @js.native
    val NGHTTP2_FLOW_CONTROL_ERROR: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_FRAME_SIZE_ERROR")
    @js.native
    val NGHTTP2_FRAME_SIZE_ERROR: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_HTTP_1_1_REQUIRED")
    @js.native
    val NGHTTP2_HTTP_1_1_REQUIRED: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_INADEQUATE_SECURITY")
    @js.native
    val NGHTTP2_INADEQUATE_SECURITY: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_INTERNAL_ERROR")
    @js.native
    val NGHTTP2_INTERNAL_ERROR: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_NO_ERROR")
    @js.native
    val NGHTTP2_NO_ERROR: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_PROTOCOL_ERROR")
    @js.native
    val NGHTTP2_PROTOCOL_ERROR: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_REFUSED_STREAM")
    @js.native
    val NGHTTP2_REFUSED_STREAM: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_SESSION_CLIENT")
    @js.native
    val NGHTTP2_SESSION_CLIENT: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_SESSION_SERVER")
    @js.native
    val NGHTTP2_SESSION_SERVER: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_SETTINGS_ENABLE_PUSH")
    @js.native
    val NGHTTP2_SETTINGS_ENABLE_PUSH: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_SETTINGS_HEADER_TABLE_SIZE")
    @js.native
    val NGHTTP2_SETTINGS_HEADER_TABLE_SIZE: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_SETTINGS_INITIAL_WINDOW_SIZE")
    @js.native
    val NGHTTP2_SETTINGS_INITIAL_WINDOW_SIZE: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_SETTINGS_MAX_CONCURRENT_STREAMS")
    @js.native
    val NGHTTP2_SETTINGS_MAX_CONCURRENT_STREAMS: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_SETTINGS_MAX_FRAME_SIZE")
    @js.native
    val NGHTTP2_SETTINGS_MAX_FRAME_SIZE: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_SETTINGS_MAX_HEADER_LIST_SIZE")
    @js.native
    val NGHTTP2_SETTINGS_MAX_HEADER_LIST_SIZE: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_SETTINGS_TIMEOUT")
    @js.native
    val NGHTTP2_SETTINGS_TIMEOUT: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_STREAM_CLOSED")
    @js.native
    val NGHTTP2_STREAM_CLOSED: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_STREAM_STATE_CLOSED")
    @js.native
    val NGHTTP2_STREAM_STATE_CLOSED: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_STREAM_STATE_HALF_CLOSED_LOCAL")
    @js.native
    val NGHTTP2_STREAM_STATE_HALF_CLOSED_LOCAL: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_STREAM_STATE_HALF_CLOSED_REMOTE")
    @js.native
    val NGHTTP2_STREAM_STATE_HALF_CLOSED_REMOTE: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_STREAM_STATE_IDLE")
    @js.native
    val NGHTTP2_STREAM_STATE_IDLE: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_STREAM_STATE_OPEN")
    @js.native
    val NGHTTP2_STREAM_STATE_OPEN: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_STREAM_STATE_RESERVED_LOCAL")
    @js.native
    val NGHTTP2_STREAM_STATE_RESERVED_LOCAL: Double = js.native
    
    @JSImport("node:http2", "constants.NGHTTP2_STREAM_STATE_RESERVED_REMOTE")
    @js.native
    val NGHTTP2_STREAM_STATE_RESERVED_REMOTE: Double = js.native
    
    @JSImport("node:http2", "constants.PADDING_STRATEGY_CALLBACK")
    @js.native
    val PADDING_STRATEGY_CALLBACK: Double = js.native
    
    @JSImport("node:http2", "constants.PADDING_STRATEGY_MAX")
    @js.native
    val PADDING_STRATEGY_MAX: Double = js.native
    
    @JSImport("node:http2", "constants.PADDING_STRATEGY_NONE")
    @js.native
    val PADDING_STRATEGY_NONE: Double = js.native
  }
  
  inline def createSecureServer(): Http2SecureServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")().asInstanceOf[Http2SecureServer]
  inline def createSecureServer(
    onRequestHandler: js.Function2[
      /* request */ typings.node.http2Mod.Http2ServerRequest, 
      /* response */ typings.node.http2Mod.Http2ServerResponse, 
      Unit
    ]
  ): Http2SecureServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(onRequestHandler.asInstanceOf[js.Any]).asInstanceOf[Http2SecureServer]
  inline def createSecureServer(options: SecureServerOptions): Http2SecureServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any]).asInstanceOf[Http2SecureServer]
  inline def createSecureServer(
    options: SecureServerOptions,
    onRequestHandler: js.Function2[
      /* request */ typings.node.http2Mod.Http2ServerRequest, 
      /* response */ typings.node.http2Mod.Http2ServerResponse, 
      Unit
    ]
  ): Http2SecureServer = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any], onRequestHandler.asInstanceOf[js.Any])).asInstanceOf[Http2SecureServer]
  
  inline def createServer(): Http2Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Http2Server]
  inline def createServer(
    onRequestHandler: js.Function2[
      /* request */ typings.node.http2Mod.Http2ServerRequest, 
      /* response */ typings.node.http2Mod.Http2ServerResponse, 
      Unit
    ]
  ): Http2Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(onRequestHandler.asInstanceOf[js.Any]).asInstanceOf[Http2Server]
  inline def createServer(options: ServerOptions): Http2Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Http2Server]
  inline def createServer(
    options: ServerOptions,
    onRequestHandler: js.Function2[
      /* request */ typings.node.http2Mod.Http2ServerRequest, 
      /* response */ typings.node.http2Mod.Http2ServerResponse, 
      Unit
    ]
  ): Http2Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], onRequestHandler.asInstanceOf[js.Any])).asInstanceOf[Http2Server]
  
  inline def getDefaultSettings(): Settings = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultSettings")().asInstanceOf[Settings]
  
  inline def getPackedSettings(settings: Settings): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackedSettings")(settings.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def getUnpackedSettings(buf: js.typedarray.Uint8Array): Settings = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnpackedSettings")(buf.asInstanceOf[js.Any]).asInstanceOf[Settings]
  
  @JSImport("node:http2", "sensitiveHeaders")
  @js.native
  val sensitiveHeaders: js.Symbol = js.native
}
