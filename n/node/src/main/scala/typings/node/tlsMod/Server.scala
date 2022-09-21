package typings.node.tlsMod

import typings.node.bufferMod.global.Buffer
import typings.node.nodeStrings.OCSPRequest
import typings.node.nodeStrings.keylog
import typings.node.nodeStrings.newSession
import typings.node.nodeStrings.resumeSession
import typings.node.nodeStrings.secureConnection
import typings.node.nodeStrings.tlsClientError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Accepts encrypted connections using TLS or SSL.
  * @since v0.3.2
  */
@JSImport("tls", "Server")
@js.native
open class Server () extends StObject {
  def this(options: TlsOptions) = this()
  def this(secureConnectionListener: js.Function1[/* socket */ TLSSocket, Unit]) = this()
  def this(options: TlsOptions, secureConnectionListener: js.Function1[/* socket */ TLSSocket, Unit]) = this()
  
  /**
    * The `server.addContext()` method adds a secure context that will be used if
    * the client request's SNI name matches the supplied `hostname` (or wildcard).
    *
    * When there are multiple matching contexts, the most recently added one is
    * used.
    * @since v0.5.3
    * @param hostname A SNI host name or wildcard (e.g. `'*'`)
    * @param context An object containing any of the possible properties from the {@link createSecureContext} `options` arguments (e.g. `key`, `cert`, `ca`, etc).
    */
  def addContext(hostname: String, context: SecureContextOptions): Unit = js.native
  
  /**
    * events.EventEmitter
    * 1. tlsClientError
    * 2. newSession
    * 3. OCSPRequest
    * 4. resumeSession
    * 5. secureConnection
    * 6. keylog
    */
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_OCSPRequest(
    event: OCSPRequest,
    listener: js.Function3[
      /* certificate */ Buffer, 
      /* issuer */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_keylog(event: keylog, listener: js.Function2[/* line */ Buffer, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_newSession(
    event: newSession,
    listener: js.Function3[
      /* sessionId */ Buffer, 
      /* sessionData */ Buffer, 
      /* callback */ js.Function0[Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_resumeSession(
    event: resumeSession,
    listener: js.Function2[
      /* sessionId */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* sessionData */ Buffer | Null, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_secureConnection(event: secureConnection, listener: js.Function1[/* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_tlsClientError(event: tlsClientError, listener: js.Function2[/* err */ js.Error, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  @JSName("emit")
  def emit_OCSPRequest(
    event: OCSPRequest,
    certificate: Buffer,
    issuer: Buffer,
    callback: js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit]
  ): Boolean = js.native
  @JSName("emit")
  def emit_keylog(event: keylog, line: Buffer, tlsSocket: TLSSocket): Boolean = js.native
  @JSName("emit")
  def emit_newSession(event: newSession, sessionId: Buffer, sessionData: Buffer, callback: js.Function0[Unit]): Boolean = js.native
  @JSName("emit")
  def emit_resumeSession(
    event: resumeSession,
    sessionId: Buffer,
    callback: js.Function2[/* err */ js.Error | Null, /* sessionData */ Buffer | Null, Unit]
  ): Boolean = js.native
  @JSName("emit")
  def emit_secureConnection(event: secureConnection, tlsSocket: TLSSocket): Boolean = js.native
  @JSName("emit")
  def emit_tlsClientError(event: tlsClientError, err: js.Error, tlsSocket: TLSSocket): Boolean = js.native
  
  /**
    * Returns the session ticket keys.
    *
    * See `Session Resumption` for more information.
    * @since v3.0.0
    * @return A 48-byte buffer containing the session ticket keys.
    */
  def getTicketKeys(): Buffer = js.native
  
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("on")
  def on_OCSPRequest(
    event: OCSPRequest,
    listener: js.Function3[
      /* certificate */ Buffer, 
      /* issuer */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_keylog(event: keylog, listener: js.Function2[/* line */ Buffer, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("on")
  def on_newSession(
    event: newSession,
    listener: js.Function3[
      /* sessionId */ Buffer, 
      /* sessionData */ Buffer, 
      /* callback */ js.Function0[Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_resumeSession(
    event: resumeSession,
    listener: js.Function2[
      /* sessionId */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* sessionData */ Buffer | Null, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_secureConnection(event: secureConnection, listener: js.Function1[/* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("on")
  def on_tlsClientError(event: tlsClientError, listener: js.Function2[/* err */ js.Error, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("once")
  def once_OCSPRequest(
    event: OCSPRequest,
    listener: js.Function3[
      /* certificate */ Buffer, 
      /* issuer */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_keylog(event: keylog, listener: js.Function2[/* line */ Buffer, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("once")
  def once_newSession(
    event: newSession,
    listener: js.Function3[
      /* sessionId */ Buffer, 
      /* sessionData */ Buffer, 
      /* callback */ js.Function0[Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_resumeSession(
    event: resumeSession,
    listener: js.Function2[
      /* sessionId */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* sessionData */ Buffer | Null, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_secureConnection(event: secureConnection, listener: js.Function1[/* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("once")
  def once_tlsClientError(event: tlsClientError, listener: js.Function2[/* err */ js.Error, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_OCSPRequest(
    event: OCSPRequest,
    listener: js.Function3[
      /* certificate */ Buffer, 
      /* issuer */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_keylog(event: keylog, listener: js.Function2[/* line */ Buffer, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_newSession(
    event: newSession,
    listener: js.Function3[
      /* sessionId */ Buffer, 
      /* sessionData */ Buffer, 
      /* callback */ js.Function0[Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_resumeSession(
    event: resumeSession,
    listener: js.Function2[
      /* sessionId */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* sessionData */ Buffer | Null, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_secureConnection(event: secureConnection, listener: js.Function1[/* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_tlsClientError(event: tlsClientError, listener: js.Function2[/* err */ js.Error, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_OCSPRequest(
    event: OCSPRequest,
    listener: js.Function3[
      /* certificate */ Buffer, 
      /* issuer */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_keylog(event: keylog, listener: js.Function2[/* line */ Buffer, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_newSession(
    event: newSession,
    listener: js.Function3[
      /* sessionId */ Buffer, 
      /* sessionData */ Buffer, 
      /* callback */ js.Function0[Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_resumeSession(
    event: resumeSession,
    listener: js.Function2[
      /* sessionId */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* sessionData */ Buffer | Null, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_secureConnection(event: secureConnection, listener: js.Function1[/* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_tlsClientError(event: tlsClientError, listener: js.Function2[/* err */ js.Error, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  
  /**
    * The `server.setSecureContext()` method replaces the secure context of an
    * existing server. Existing connections to the server are not interrupted.
    * @since v11.0.0
    * @param options An object containing any of the possible properties from the {@link createSecureContext} `options` arguments (e.g. `key`, `cert`, `ca`, etc).
    */
  def setSecureContext(options: SecureContextOptions): Unit = js.native
  
  /**
    * Sets the session ticket keys.
    *
    * Changes to the ticket keys are effective only for future server connections.
    * Existing or currently pending server connections will use the previous keys.
    *
    * See `Session Resumption` for more information.
    * @since v3.0.0
    * @param keys A 48-byte buffer containing the session ticket keys.
    */
  def setTicketKeys(keys: Buffer): Unit = js.native
}
