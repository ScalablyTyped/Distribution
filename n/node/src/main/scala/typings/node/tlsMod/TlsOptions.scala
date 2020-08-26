package typings.node.tlsMod

import typings.node.Buffer
import typings.node.NodeJS.TypedArray
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TlsOptions
  extends SecureContextOptions
     with CommonConnectionOptions {
  /**
    * Abort the connection if the SSL/TLS handshake does not finish in the
    * specified number of milliseconds. A 'tlsClientError' is emitted on
    * the tls.Server object whenever a handshake times out. Default:
    * 120000 (120 seconds).
    */
  var handshakeTimeout: js.UndefOr[Double] = js.native
  /**
    *
    * @param socket
    * @param identity identity parameter sent from the client.
    * @return pre-shared key that must either be
    * a buffer or `null` to stop the negotiation process. Returned PSK must be
    * compatible with the selected cipher's digest.
    *
    * When negotiating TLS-PSK (pre-shared keys), this function is called
    * with the identity provided by the client.
    * If the return value is `null` the negotiation process will stop and an
    * "unknown_psk_identity" alert message will be sent to the other party.
    * If the server wishes to hide the fact that the PSK identity was not known,
    * the callback must provide some random data as `psk` to make the connection
    * fail with "decrypt_error" before negotiation is finished.
    * PSK ciphers are disabled by default, and using TLS-PSK thus
    * requires explicitly specifying a cipher suite with the `ciphers` option.
    * More information can be found in the RFC 4279.
    */
  var pskCallback: js.UndefOr[
    js.Function2[/* socket */ TLSSocket, /* identity */ String, DataView | TypedArray | Null]
  ] = js.native
  /**
    * hint to send to a client to help
    * with selecting the identity during TLS-PSK negotiation. Will be ignored
    * in TLS 1.3. Upon failing to set pskIdentityHint `tlsClientError` will be
    * emitted with `ERR_TLS_PSK_SET_IDENTIY_HINT_FAILED` code.
    */
  var pskIdentityHint: js.UndefOr[String] = js.native
  /**
    * The number of seconds after which a TLS session created by the
    * server will no longer be resumable. See Session Resumption for more
    * information. Default: 300.
    */
  var sessionTimeout: js.UndefOr[Double] = js.native
  /**
    * 48-bytes of cryptographically strong pseudo-random data.
    */
  var ticketKeys: js.UndefOr[Buffer] = js.native
}

object TlsOptions {
  @scala.inline
  def apply(): TlsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsOptions]
  }
  @scala.inline
  implicit class TlsOptionsOps[Self <: TlsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandshakeTimeout(value: Double): Self = this.set("handshakeTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandshakeTimeout: Self = this.set("handshakeTimeout", js.undefined)
    @scala.inline
    def setPskCallback(value: (/* socket */ TLSSocket, /* identity */ String) => DataView | TypedArray | Null): Self = this.set("pskCallback", js.Any.fromFunction2(value))
    @scala.inline
    def deletePskCallback: Self = this.set("pskCallback", js.undefined)
    @scala.inline
    def setPskIdentityHint(value: String): Self = this.set("pskIdentityHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePskIdentityHint: Self = this.set("pskIdentityHint", js.undefined)
    @scala.inline
    def setSessionTimeout(value: Double): Self = this.set("sessionTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionTimeout: Self = this.set("sessionTimeout", js.undefined)
    @scala.inline
    def setTicketKeys(value: Buffer): Self = this.set("ticketKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicketKeys: Self = this.set("ticketKeys", js.undefined)
  }
  
}

