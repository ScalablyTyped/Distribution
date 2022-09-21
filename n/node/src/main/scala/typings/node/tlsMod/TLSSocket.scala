package typings.node.tlsMod

import typings.node.anon.RejectUnauthorized
import typings.node.bufferMod.global.Buffer
import typings.node.nodeBooleans.`false`
import typings.node.nodeBooleans.`true`
import typings.node.nodeCryptoMod.X509Certificate
import typings.node.nodeNetMod.Socket
import typings.node.nodeStrings.OCSPResponse
import typings.node.nodeStrings.keylog
import typings.node.nodeStrings.secureConnect
import typings.node.nodeStrings.session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Performs transparent encryption of written data and all required TLS
  * negotiation.
  *
  * Instances of `tls.TLSSocket` implement the duplex `Stream` interface.
  *
  * Methods that return TLS connection metadata (e.g.{@link TLSSocket.getPeerCertificate} will only return data while the
  * connection is open.
  * @since v0.11.4
  */
@JSImport("tls", "TLSSocket")
@js.native
open class TLSSocket protected () extends StObject {
  /**
    * Construct a new tls.TLSSocket object from an existing TCP socket.
    */
  def this(socket: Socket) = this()
  def this(socket: Socket, options: TLSSocketOptions) = this()
  
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_OCSPResponse(event: OCSPResponse, listener: js.Function1[/* response */ Buffer, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_keylog(event: keylog, listener: js.Function1[/* line */ Buffer, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_secureConnect(event: secureConnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_session(event: session, listener: js.Function1[/* session */ Buffer, Unit]): this.type = js.native
  
  /**
    * String containing the selected ALPN protocol.
    * Before a handshake has completed, this value is always null.
    * When a handshake is completed but not ALPN protocol was selected, tlsSocket.alpnProtocol equals false.
    */
  var alpnProtocol: String | `false` | Null = js.native
  
  /**
    * Returns the reason why the peer's certificate was not been verified. This
    * property is set only when `tlsSocket.authorized === false`.
    * @since v0.11.4
    */
  var authorizationError: js.Error = js.native
  
  /**
    * This property is `true` if the peer certificate was signed by one of the CAs
    * specified when creating the `tls.TLSSocket` instance, otherwise `false`.
    * @since v0.11.4
    */
  var authorized: Boolean = js.native
  
  /**
    * Disables TLS renegotiation for this `TLSSocket` instance. Once called, attempts
    * to renegotiate will trigger an `'error'` event on the `TLSSocket`.
    * @since v8.4.0
    */
  def disableRenegotiation(): Unit = js.native
  
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  @JSName("emit")
  def emit_OCSPResponse(event: OCSPResponse, response: Buffer): Boolean = js.native
  @JSName("emit")
  def emit_keylog(event: keylog, line: Buffer): Boolean = js.native
  @JSName("emit")
  def emit_secureConnect(event: secureConnect): Boolean = js.native
  @JSName("emit")
  def emit_session(event: session, session: Buffer): Boolean = js.native
  
  /**
    * When enabled, TLS packet trace information is written to `stderr`. This can be
    * used to debug TLS connection problems.
    *
    * The format of the output is identical to the output of`openssl s_client -trace` or `openssl s_server -trace`. While it is produced by
    * OpenSSL's `SSL_trace()` function, the format is undocumented, can change
    * without notice, and should not be relied on.
    * @since v12.2.0
    */
  def enableTrace(): Unit = js.native
  
  /**
    * Always returns `true`. This may be used to distinguish TLS sockets from regular`net.Socket` instances.
    * @since v0.11.4
    */
  var encrypted: `true` = js.native
  
  /**
    * Keying material is used for validations to prevent different kind of attacks in
    * network protocols, for example in the specifications of IEEE 802.1X.
    *
    * Example
    *
    * ```js
    * const keyingMaterial = tlsSocket.exportKeyingMaterial(
    *   128,
    *   'client finished');
    *
    * / *
    *  Example return value of keyingMaterial:
    *  <Buffer 76 26 af 99 c5 56 8e 42 09 91 ef 9f 93 cb ad 6c 7b 65 f8 53 f1 d8 d9
    *     12 5a 33 b8 b5 25 df 7b 37 9f e0 e2 4f b8 67 83 a3 2f cd 5d 41 42 4c 91
    *     74 ef 2c ... 78 more bytes>
    *
    * ```
    *
    * See the OpenSSL [`SSL_export_keying_material`](https://www.openssl.org/docs/man1.1.1/man3/SSL_export_keying_material.html) documentation for more
    * information.
    * @since v13.10.0, v12.17.0
    * @param length number of bytes to retrieve from keying material
    * @param label an application specific label, typically this will be a value from the [IANA Exporter Label
    * Registry](https://www.iana.org/assignments/tls-parameters/tls-parameters.xhtml#exporter-labels).
    * @param context Optionally provide a context.
    * @return requested bytes of the keying material
    */
  def exportKeyingMaterial(length: Double, label: String, context: Buffer): Buffer = js.native
  
  /**
    * Returns an object representing the local certificate. The returned object has
    * some properties corresponding to the fields of the certificate.
    *
    * See {@link TLSSocket.getPeerCertificate} for an example of the certificate
    * structure.
    *
    * If there is no local certificate, an empty object will be returned. If the
    * socket has been destroyed, `null` will be returned.
    * @since v11.2.0
    */
  def getCertificate(): PeerCertificate | js.Object | Null = js.native
  
  /**
    * Returns an object containing information on the negotiated cipher suite.
    *
    * For example:
    *
    * ```json
    * {
    *     "name": "AES128-SHA256",
    *     "standardName": "TLS_RSA_WITH_AES_128_CBC_SHA256",
    *     "version": "TLSv1.2"
    * }
    * ```
    *
    * See [SSL\_CIPHER\_get\_name](https://www.openssl.org/docs/man1.1.1/man3/SSL_CIPHER_get_name.html) for more information.
    * @since v0.11.4
    */
  def getCipher(): CipherNameAndProtocol = js.native
  
  /**
    * Returns an object representing the type, name, and size of parameter of
    * an ephemeral key exchange in `perfect forward secrecy` on a client
    * connection. It returns an empty object when the key exchange is not
    * ephemeral. As this is only supported on a client socket; `null` is returned
    * if called on a server socket. The supported types are `'DH'` and `'ECDH'`. The`name` property is available only when type is `'ECDH'`.
    *
    * For example: `{ type: 'ECDH', name: 'prime256v1', size: 256 }`.
    * @since v5.0.0
    */
  def getEphemeralKeyInfo(): EphemeralKeyInfo | js.Object | Null = js.native
  
  /**
    * As the `Finished` messages are message digests of the complete handshake
    * (with a total of 192 bits for TLS 1.0 and more for SSL 3.0), they can
    * be used for external authentication procedures when the authentication
    * provided by SSL/TLS is not desired or is not enough.
    *
    * Corresponds to the `SSL_get_finished` routine in OpenSSL and may be used
    * to implement the `tls-unique` channel binding from [RFC 5929](https://tools.ietf.org/html/rfc5929).
    * @since v9.9.0
    * @return The latest `Finished` message that has been sent to the socket as part of a SSL/TLS handshake, or `undefined` if no `Finished` message has been sent yet.
    */
  def getFinished(): js.UndefOr[Buffer] = js.native
  
  def getPeerCertificate(): PeerCertificate | DetailedPeerCertificate = js.native
  def getPeerCertificate(detailed: Boolean): PeerCertificate | DetailedPeerCertificate = js.native
  @JSName("getPeerCertificate")
  def getPeerCertificate_PeerCertificate(): PeerCertificate = js.native
  @JSName("getPeerCertificate")
  def getPeerCertificate_false(detailed: `false`): PeerCertificate = js.native
  /**
    * Returns an object representing the peer's certificate. If the peer does not
    * provide a certificate, an empty object will be returned. If the socket has been
    * destroyed, `null` will be returned.
    *
    * If the full certificate chain was requested, each certificate will include an`issuerCertificate` property containing an object representing its issuer's
    * certificate.
    * @since v0.11.4
    * @param detailed Include the full certificate chain if `true`, otherwise include just the peer's certificate.
    * @return A certificate object.
    */
  @JSName("getPeerCertificate")
  def getPeerCertificate_true(detailed: `true`): DetailedPeerCertificate = js.native
  
  /**
    * As the `Finished` messages are message digests of the complete handshake
    * (with a total of 192 bits for TLS 1.0 and more for SSL 3.0), they can
    * be used for external authentication procedures when the authentication
    * provided by SSL/TLS is not desired or is not enough.
    *
    * Corresponds to the `SSL_get_peer_finished` routine in OpenSSL and may be used
    * to implement the `tls-unique` channel binding from [RFC 5929](https://tools.ietf.org/html/rfc5929).
    * @since v9.9.0
    * @return The latest `Finished` message that is expected or has actually been received from the socket as part of a SSL/TLS handshake, or `undefined` if there is no `Finished` message so
    * far.
    */
  def getPeerFinished(): js.UndefOr[Buffer] = js.native
  
  /**
    * Returns the peer certificate as an `X509Certificate` object.
    *
    * If there is no peer certificate, or the socket has been destroyed,`undefined` will be returned.
    * @since v15.9.0
    */
  def getPeerX509Certificate(): js.UndefOr[X509Certificate] = js.native
  
  /**
    * Returns a string containing the negotiated SSL/TLS protocol version of the
    * current connection. The value `'unknown'` will be returned for connected
    * sockets that have not completed the handshaking process. The value `null` will
    * be returned for server sockets or disconnected client sockets.
    *
    * Protocol versions are:
    *
    * * `'SSLv3'`
    * * `'TLSv1'`
    * * `'TLSv1.1'`
    * * `'TLSv1.2'`
    * * `'TLSv1.3'`
    *
    * See the OpenSSL [`SSL_get_version`](https://www.openssl.org/docs/man1.1.1/man3/SSL_get_version.html) documentation for more information.
    * @since v5.7.0
    */
  def getProtocol(): String | Null = js.native
  
  /**
    * Returns the TLS session data or `undefined` if no session was
    * negotiated. On the client, the data can be provided to the `session` option of {@link connect} to resume the connection. On the server, it may be useful
    * for debugging.
    *
    * See `Session Resumption` for more information.
    *
    * Note: `getSession()` works only for TLSv1.2 and below. For TLSv1.3, applications
    * must use the `'session'` event (it also works for TLSv1.2 and below).
    * @since v0.11.4
    */
  def getSession(): js.UndefOr[Buffer] = js.native
  
  /**
    * See [SSL\_get\_shared\_sigalgs](https://www.openssl.org/docs/man1.1.1/man3/SSL_get_shared_sigalgs.html) for more information.
    * @since v12.11.0
    * @return List of signature algorithms shared between the server and the client in the order of decreasing preference.
    */
  def getSharedSigalgs(): js.Array[String] = js.native
  
  /**
    * For a client, returns the TLS session ticket if one is available, or`undefined`. For a server, always returns `undefined`.
    *
    * It may be useful for debugging.
    *
    * See `Session Resumption` for more information.
    * @since v0.11.4
    */
  def getTLSTicket(): js.UndefOr[Buffer] = js.native
  
  /**
    * Returns the local certificate as an `X509Certificate` object.
    *
    * If there is no local certificate, or the socket has been destroyed,`undefined` will be returned.
    * @since v15.9.0
    */
  def getX509Certificate(): js.UndefOr[X509Certificate] = js.native
  
  /**
    * See `Session Resumption` for more information.
    * @since v0.5.6
    * @return `true` if the session was reused, `false` otherwise.
    */
  def isSessionReused(): Boolean = js.native
  
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("on")
  def on_OCSPResponse(event: OCSPResponse, listener: js.Function1[/* response */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_keylog(event: keylog, listener: js.Function1[/* line */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_secureConnect(event: secureConnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_session(event: session, listener: js.Function1[/* session */ Buffer, Unit]): this.type = js.native
  
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("once")
  def once_OCSPResponse(event: OCSPResponse, listener: js.Function1[/* response */ Buffer, Unit]): this.type = js.native
  @JSName("once")
  def once_keylog(event: keylog, listener: js.Function1[/* line */ Buffer, Unit]): this.type = js.native
  @JSName("once")
  def once_secureConnect(event: secureConnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_session(event: session, listener: js.Function1[/* session */ Buffer, Unit]): this.type = js.native
  
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_OCSPResponse(event: OCSPResponse, listener: js.Function1[/* response */ Buffer, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_keylog(event: keylog, listener: js.Function1[/* line */ Buffer, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_secureConnect(event: secureConnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_session(event: session, listener: js.Function1[/* session */ Buffer, Unit]): this.type = js.native
  
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_OCSPResponse(event: OCSPResponse, listener: js.Function1[/* response */ Buffer, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_keylog(event: keylog, listener: js.Function1[/* line */ Buffer, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_secureConnect(event: secureConnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_session(event: session, listener: js.Function1[/* session */ Buffer, Unit]): this.type = js.native
  
  /**
    * The `tlsSocket.renegotiate()` method initiates a TLS renegotiation process.
    * Upon completion, the `callback` function will be passed a single argument
    * that is either an `Error` (if the request failed) or `null`.
    *
    * This method can be used to request a peer's certificate after the secure
    * connection has been established.
    *
    * When running as the server, the socket will be destroyed with an error after`handshakeTimeout` timeout.
    *
    * For TLSv1.3, renegotiation cannot be initiated, it is not supported by the
    * protocol.
    * @since v0.11.8
    * @param callback If `renegotiate()` returned `true`, callback is attached once to the `'secure'` event. If `renegotiate()` returned `false`, `callback` will be called in the next tick with
    * an error, unless the `tlsSocket` has been destroyed, in which case `callback` will not be called at all.
    * @return `true` if renegotiation was initiated, `false` otherwise.
    */
  def renegotiate(options: RejectUnauthorized, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.UndefOr[Boolean] = js.native
  
  /**
    * The `tlsSocket.setMaxSendFragment()` method sets the maximum TLS fragment size.
    * Returns `true` if setting the limit succeeded; `false` otherwise.
    *
    * Smaller fragment sizes decrease the buffering latency on the client: larger
    * fragments are buffered by the TLS layer until the entire fragment is received
    * and its integrity is verified; large fragments can span multiple roundtrips
    * and their processing can be delayed due to packet loss or reordering. However,
    * smaller fragments add extra TLS framing bytes and CPU overhead, which may
    * decrease overall server throughput.
    * @since v0.11.11
    * @param [size=16384] The maximum TLS fragment size. The maximum value is `16384`.
    */
  def setMaxSendFragment(size: Double): Boolean = js.native
}
