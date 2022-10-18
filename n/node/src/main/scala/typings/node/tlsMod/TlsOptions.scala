package typings.node.tlsMod

import typings.node.NodeJS.TypedArray
import typings.node.netMod.ServerOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TlsOptions
  extends StObject
     with SecureContextOptions
     with CommonConnectionOptions
     with ServerOpts {
  
  /**
    * Abort the connection if the SSL/TLS handshake does not finish in the
    * specified number of milliseconds. A 'tlsClientError' is emitted on
    * the tls.Server object whenever a handshake times out. Default:
    * 120000 (120 seconds).
    */
  var handshakeTimeout: js.UndefOr[Double] = js.undefined
  
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
    js.Function2[
      /* socket */ TLSSocket, 
      /* identity */ String, 
      js.typedarray.DataView | TypedArray | Null
    ]
  ] = js.undefined
  
  /**
    * hint to send to a client to help
    * with selecting the identity during TLS-PSK negotiation. Will be ignored
    * in TLS 1.3. Upon failing to set pskIdentityHint `tlsClientError` will be
    * emitted with `ERR_TLS_PSK_SET_IDENTIY_HINT_FAILED` code.
    */
  var pskIdentityHint: js.UndefOr[String] = js.undefined
}
object TlsOptions {
  
  inline def apply(): TlsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsOptions]
  }
  
  extension [Self <: TlsOptions](x: Self) {
    
    inline def setHandshakeTimeout(value: Double): Self = StObject.set(x, "handshakeTimeout", value.asInstanceOf[js.Any])
    
    inline def setHandshakeTimeoutUndefined: Self = StObject.set(x, "handshakeTimeout", js.undefined)
    
    inline def setPskCallback(
      value: (/* socket */ TLSSocket, /* identity */ String) => js.typedarray.DataView | TypedArray | Null
    ): Self = StObject.set(x, "pskCallback", js.Any.fromFunction2(value))
    
    inline def setPskCallbackUndefined: Self = StObject.set(x, "pskCallback", js.undefined)
    
    inline def setPskIdentityHint(value: String): Self = StObject.set(x, "pskIdentityHint", value.asInstanceOf[js.Any])
    
    inline def setPskIdentityHintUndefined: Self = StObject.set(x, "pskIdentityHint", js.undefined)
  }
}
