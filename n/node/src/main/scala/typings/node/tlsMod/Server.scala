package typings.node.tlsMod

import typings.node.bufferMod.global.Buffer
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
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_secureConnection")
  def addListener(event: "secureConnection", listener: js.Function1[/* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_tlsClientError")
  def addListener(
    event: "tlsClientError",
    listener: js.Function2[/* err */ js.Error, /* tlsSocket */ TLSSocket, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_keylog")
  def addListener(event: "keylog", listener: js.Function2[/* line */ Buffer, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_resumeSession")
  def addListener(
    event: "resumeSession",
    listener: js.Function2[
      /* sessionId */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* sessionData */ Buffer | Null, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_OCSPRequest")
  def addListener(
    event: "OCSPRequest",
    listener: js.Function3[
      /* certificate */ Buffer, 
      /* issuer */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_newSession")
  def addListener(
    event: "newSession",
    listener: js.Function3[
      /* sessionId */ Buffer, 
      /* sessionData */ Buffer, 
      /* callback */ js.Function0[Unit], 
      Unit
    ]
  ): this.type = js.native
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
  
  @JSName("emit")
  @scala.annotation.targetName("emit_OCSPRequest")
  def emit(
    event: "OCSPRequest",
    certificate: Buffer,
    issuer: Buffer,
    callback: js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit]
  ): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_tlsClientError")
  def emit(event: "tlsClientError", err: js.Error, tlsSocket: TLSSocket): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_keylog")
  def emit(event: "keylog", line: Buffer, tlsSocket: TLSSocket): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_resumeSession")
  def emit(
    event: "resumeSession",
    sessionId: Buffer,
    callback: js.Function2[/* err */ js.Error | Null, /* sessionData */ Buffer | Null, Unit]
  ): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_newSession")
  def emit(event: "newSession", sessionId: Buffer, sessionData: Buffer, callback: js.Function0[Unit]): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_secureConnection")
  def emit(event: "secureConnection", tlsSocket: TLSSocket): Boolean = js.native
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  
  /**
    * Returns the session ticket keys.
    *
    * See `Session Resumption` for more information.
    * @since v3.0.0
    * @return A 48-byte buffer containing the session ticket keys.
    */
  def getTicketKeys(): Buffer = js.native
  
  @JSName("on")
  @scala.annotation.targetName("on_secureConnection")
  def on(event: "secureConnection", listener: js.Function1[/* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_resumeSession")
  def on(
    event: "resumeSession",
    listener: js.Function2[
      /* sessionId */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* sessionData */ Buffer | Null, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_tlsClientError")
  def on(
    event: "tlsClientError",
    listener: js.Function2[/* err */ js.Error, /* tlsSocket */ TLSSocket, Unit]
  ): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_keylog")
  def on(event: "keylog", listener: js.Function2[/* line */ Buffer, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_OCSPRequest")
  def on(
    event: "OCSPRequest",
    listener: js.Function3[
      /* certificate */ Buffer, 
      /* issuer */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_newSession")
  def on(
    event: "newSession",
    listener: js.Function3[
      /* sessionId */ Buffer, 
      /* sessionData */ Buffer, 
      /* callback */ js.Function0[Unit], 
      Unit
    ]
  ): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_secureConnection")
  def once(event: "secureConnection", listener: js.Function1[/* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_resumeSession")
  def once(
    event: "resumeSession",
    listener: js.Function2[
      /* sessionId */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* sessionData */ Buffer | Null, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_keylog")
  def once(event: "keylog", listener: js.Function2[/* line */ Buffer, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_tlsClientError")
  def once(
    event: "tlsClientError",
    listener: js.Function2[/* err */ js.Error, /* tlsSocket */ TLSSocket, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_newSession")
  def once(
    event: "newSession",
    listener: js.Function3[
      /* sessionId */ Buffer, 
      /* sessionData */ Buffer, 
      /* callback */ js.Function0[Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_OCSPRequest")
  def once(
    event: "OCSPRequest",
    listener: js.Function3[
      /* certificate */ Buffer, 
      /* issuer */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_secureConnection")
  def prependListener(event: "secureConnection", listener: js.Function1[/* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_tlsClientError")
  def prependListener(
    event: "tlsClientError",
    listener: js.Function2[/* err */ js.Error, /* tlsSocket */ TLSSocket, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_resumeSession")
  def prependListener(
    event: "resumeSession",
    listener: js.Function2[
      /* sessionId */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* sessionData */ Buffer | Null, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_keylog")
  def prependListener(event: "keylog", listener: js.Function2[/* line */ Buffer, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_OCSPRequest")
  def prependListener(
    event: "OCSPRequest",
    listener: js.Function3[
      /* certificate */ Buffer, 
      /* issuer */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_newSession")
  def prependListener(
    event: "newSession",
    listener: js.Function3[
      /* sessionId */ Buffer, 
      /* sessionData */ Buffer, 
      /* callback */ js.Function0[Unit], 
      Unit
    ]
  ): this.type = js.native
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_secureConnection")
  def prependOnceListener(event: "secureConnection", listener: js.Function1[/* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_keylog")
  def prependOnceListener(event: "keylog", listener: js.Function2[/* line */ Buffer, /* tlsSocket */ TLSSocket, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_resumeSession")
  def prependOnceListener(
    event: "resumeSession",
    listener: js.Function2[
      /* sessionId */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* sessionData */ Buffer | Null, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_tlsClientError")
  def prependOnceListener(
    event: "tlsClientError",
    listener: js.Function2[/* err */ js.Error, /* tlsSocket */ TLSSocket, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_OCSPRequest")
  def prependOnceListener(
    event: "OCSPRequest",
    listener: js.Function3[
      /* certificate */ Buffer, 
      /* issuer */ Buffer, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* resp */ Buffer, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_newSession")
  def prependOnceListener(
    event: "newSession",
    listener: js.Function3[
      /* sessionId */ Buffer, 
      /* sessionData */ Buffer, 
      /* callback */ js.Function0[Unit], 
      Unit
    ]
  ): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
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
