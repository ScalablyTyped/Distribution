package typings.node.tlsMod

import typings.node.AnonRejectUnauthorizedRequestCert
import typings.node.Buffer
import typings.node.netMod.Socket
import typings.node.nodeBooleans.`false`
import typings.node.nodeBooleans.`true`
import typings.node.nodeStrings.OCSPResponse
import typings.node.nodeStrings.keylog
import typings.node.nodeStrings.secureConnect
import typings.node.nodeStrings.session
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", "TLSSocket")
@js.native
class TLSSocket protected () extends Socket {
  /**
    * Construct a new tls.TLSSocket object from an existing TCP socket.
    */
  def this(socket: Socket) = this()
  def this(socket: Socket, options: TLSSocketOptions) = this()
  /**
    * String containing the selected ALPN protocol.
    * When ALPN has no selected protocol, tlsSocket.alpnProtocol equals false.
    */
  var alpnProtocol: js.UndefOr[String] = js.native
  /**
    * The reason why the peer's certificate has not been verified.
    * This property becomes available only when tlsSocket.authorized === false.
    */
  var authorizationError: Error = js.native
  /**
    * A boolean that is true if the peer certificate was signed by one of the specified CAs, otherwise false.
    */
  var authorized: Boolean = js.native
  /**
    * Static boolean value, always true.
    * May be used to distinguish TLS sockets from regular ones.
    */
  var encrypted: Boolean = js.native
  @JSName("addListener")
  def addListener_OCSPResponse(event: OCSPResponse, listener: js.Function1[/* response */ Buffer, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_keylog(event: keylog, listener: js.Function1[/* line */ Buffer, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_secureConnect(event: secureConnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_session(event: session, listener: js.Function1[/* session */ Buffer, Unit]): this.type = js.native
  /**
    * Disables TLS renegotiation for this TLSSocket instance. Once called,
    * attempts to renegotiate will trigger an 'error' event on the
    * TLSSocket.
    */
  def disableRenegotiation(): Unit = js.native
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
    * Note: The format of the output is identical to the output of `openssl s_client
    * -trace` or `openssl s_server -trace`. While it is produced by OpenSSL's
    * `SSL_trace()` function, the format is undocumented, can change without notice,
    * and should not be relied on.
    */
  def enableTrace(): Unit = js.native
  /**
    * Returns an object representing the local certificate. The returned
    * object has some properties corresponding to the fields of the
    * certificate.
    *
    * See tls.TLSSocket.getPeerCertificate() for an example of the
    * certificate structure.
    *
    * If there is no local certificate, an empty object will be returned.
    * If the socket has been destroyed, null will be returned.
    */
  def getCertificate(): PeerCertificate | js.Object | Null = js.native
  /**
    * Returns an object representing the cipher name and the SSL/TLS protocol version of the current connection.
    * @returns Returns an object representing the cipher name
    * and the SSL/TLS protocol version of the current connection.
    */
  def getCipher(): CipherNameAndProtocol = js.native
  /**
    * Returns an object representing the type, name, and size of parameter
    * of an ephemeral key exchange in Perfect Forward Secrecy on a client
    * connection. It returns an empty object when the key exchange is not
    * ephemeral. As this is only supported on a client socket; null is
    * returned if called on a server socket. The supported types are 'DH'
    * and 'ECDH'. The name property is available only when type is 'ECDH'.
    *
    * For example: { type: 'ECDH', name: 'prime256v1', size: 256 }.
    */
  def getEphemeralKeyInfo(): EphemeralKeyInfo | js.Object | Null = js.native
  /**
    * Returns the latest Finished message that has
    * been sent to the socket as part of a SSL/TLS handshake, or undefined
    * if no Finished message has been sent yet.
    *
    * As the Finished messages are message digests of the complete
    * handshake (with a total of 192 bits for TLS 1.0 and more for SSL
    * 3.0), they can be used for external authentication procedures when
    * the authentication provided by SSL/TLS is not desired or is not
    * enough.
    *
    * Corresponds to the SSL_get_finished routine in OpenSSL and may be
    * used to implement the tls-unique channel binding from RFC 5929.
    */
  def getFinished(): js.UndefOr[Buffer] = js.native
  def getPeerCertificate(): PeerCertificate | DetailedPeerCertificate = js.native
  def getPeerCertificate(detailed: Boolean): PeerCertificate | DetailedPeerCertificate = js.native
  @JSName("getPeerCertificate")
  def getPeerCertificate_PeerCertificate(): PeerCertificate = js.native
  @JSName("getPeerCertificate")
  def getPeerCertificate_false(detailed: `false`): PeerCertificate = js.native
  /**
    * Returns an object representing the peer's certificate.
    * The returned object has some properties corresponding to the field of the certificate.
    * If detailed argument is true the full chain with issuer property will be returned,
    * if false only the top certificate without issuer property.
    * If the peer does not provide a certificate, it returns null or an empty object.
    * @param detailed - If true; the full chain with issuer property will be returned.
    * @returns An object representing the peer's certificate.
    */
  @JSName("getPeerCertificate")
  def getPeerCertificate_true(detailed: `true`): DetailedPeerCertificate = js.native
  /**
    * Returns the latest Finished message that is expected or has actually
    * been received from the socket as part of a SSL/TLS handshake, or
    * undefined if there is no Finished message so far.
    *
    * As the Finished messages are message digests of the complete
    * handshake (with a total of 192 bits for TLS 1.0 and more for SSL
    * 3.0), they can be used for external authentication procedures when
    * the authentication provided by SSL/TLS is not desired or is not
    * enough.
    *
    * Corresponds to the SSL_get_peer_finished routine in OpenSSL and may
    * be used to implement the tls-unique channel binding from RFC 5929.
    */
  def getPeerFinished(): js.UndefOr[Buffer] = js.native
  /**
    * Returns a string containing the negotiated SSL/TLS protocol version of the current connection.
    * The value `'unknown'` will be returned for connected sockets that have not completed the handshaking process.
    * The value `null` will be returned for server sockets or disconnected client sockets.
    * See https://www.openssl.org/docs/man1.0.2/ssl/SSL_get_version.html for more information.
    * @returns negotiated SSL/TLS protocol version of the current connection
    */
  def getProtocol(): String | Null = js.native
  /**
    * Could be used to speed up handshake establishment when reconnecting to the server.
    * @returns ASN.1 encoded TLS session or undefined if none was negotiated.
    */
  def getSession(): js.UndefOr[Buffer] = js.native
  /**
    * Returns a list of signature algorithms shared between the server and
    * the client in the order of decreasing preference.
    */
  def getSharedSigalgs(): js.Array[String] = js.native
  /**
    * NOTE: Works only with client TLS sockets.
    * Useful only for debugging, for session reuse provide session option to tls.connect().
    * @returns TLS session ticket or undefined if none was negotiated.
    */
  def getTLSTicket(): js.UndefOr[Buffer] = js.native
  /**
    * Returns true if the session was reused, false otherwise.
    */
  def isSessionReused(): Boolean = js.native
  @JSName("on")
  def on_OCSPResponse(event: OCSPResponse, listener: js.Function1[/* response */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_keylog(event: keylog, listener: js.Function1[/* line */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_secureConnect(event: secureConnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_session(event: session, listener: js.Function1[/* session */ Buffer, Unit]): this.type = js.native
  @JSName("once")
  def once_OCSPResponse(event: OCSPResponse, listener: js.Function1[/* response */ Buffer, Unit]): this.type = js.native
  @JSName("once")
  def once_keylog(event: keylog, listener: js.Function1[/* line */ Buffer, Unit]): this.type = js.native
  @JSName("once")
  def once_secureConnect(event: secureConnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_session(event: session, listener: js.Function1[/* session */ Buffer, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_OCSPResponse(event: OCSPResponse, listener: js.Function1[/* response */ Buffer, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_keylog(event: keylog, listener: js.Function1[/* line */ Buffer, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_secureConnect(event: secureConnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_session(event: session, listener: js.Function1[/* session */ Buffer, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_OCSPResponse(event: OCSPResponse, listener: js.Function1[/* response */ Buffer, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_keylog(event: keylog, listener: js.Function1[/* line */ Buffer, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_secureConnect(event: secureConnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_session(event: session, listener: js.Function1[/* session */ Buffer, Unit]): this.type = js.native
  /**
    * Initiate TLS renegotiation process.
    *
    * NOTE: Can be used to request peer's certificate after the secure connection has been established.
    * ANOTHER NOTE: When running as the server, socket will be destroyed with an error after handshakeTimeout timeout.
    * @param options - The options may contain the following fields: rejectUnauthorized,
    * requestCert (See tls.createServer() for details).
    * @param callback - callback(err) will be executed with null as err, once the renegotiation
    * is successfully completed.
    * @return `undefined` when socket is destroy, `false` if negotiaion can't be initiated.
    */
  def renegotiate(options: AnonRejectUnauthorizedRequestCert, callback: js.Function1[/* err */ Error | Null, Unit]): js.UndefOr[Boolean] = js.native
  /**
    * Set maximum TLS fragment size (default and maximum value is: 16384, minimum is: 512).
    * Smaller fragment size decreases buffering latency on the client: large fragments are buffered by
    * the TLS layer until the entire fragment is received and its integrity is verified;
    * large fragments can span multiple roundtrips, and their processing can be delayed due to packet
    * loss or reordering. However, smaller fragments add extra TLS framing bytes and CPU overhead,
    * which may decrease overall server throughput.
    * @param size - TLS fragment size (default and maximum value is: 16384, minimum is: 512).
    * @returns Returns true on success, false otherwise.
    */
  def setMaxSendFragment(size: Double): Boolean = js.native
}

