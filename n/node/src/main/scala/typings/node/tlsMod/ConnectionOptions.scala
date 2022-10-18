package typings.node.tlsMod

import typings.node.NodeJS.ErrnoException
import typings.node.bufferMod.global.Buffer
import typings.node.dnsMod.LookupOneOptions
import typings.node.netMod.LookupFunction
import typings.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionOptions
  extends StObject
     with SecureContextOptions
     with CommonConnectionOptions {
  
  // Establish secure connection on a given socket rather than creating a new socket
  var checkServerIdentity: js.UndefOr[
    js.Function2[/* hostname */ String, /* cert */ PeerCertificate, js.UndefOr[js.Error]]
  ] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var lookup: js.UndefOr[LookupFunction] = js.undefined
  
  var minDHSize: js.UndefOr[Double] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * When negotiating TLS-PSK (pre-shared keys), this function is called
    * with optional identity `hint` provided by the server or `null`
    * in case of TLS 1.3 where `hint` was removed.
    * It will be necessary to provide a custom `tls.checkServerIdentity()`
    * for the connection as the default one will try to check hostname/IP
    * of the server against the certificate but that's not applicable for PSK
    * because there won't be a certificate present.
    * More information can be found in the RFC 4279.
    *
    * @param hint message sent from the server to help client
    * decide which identity to use during negotiation.
    * Always `null` if TLS 1.3 is used.
    * @returns Return `null` to stop the negotiation process. `psk` must be
    * compatible with the selected cipher's digest.
    * `identity` must use UTF-8 encoding.
    */
  var pskCallback: js.UndefOr[js.Function1[/* hint */ String | Null, PSKCallbackNegotation | Null]] = js.undefined
  
  var servername: js.UndefOr[String] = js.undefined
  
  // SNI TLS Extension
  var session: js.UndefOr[Buffer] = js.undefined
  
  // Creates unix socket connection to path. If this option is specified, `host` and `port` are ignored.
  var socket: js.UndefOr[Duplex] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object ConnectionOptions {
  
  inline def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  extension [Self <: ConnectionOptions](x: Self) {
    
    inline def setCheckServerIdentity(value: (/* hostname */ String, /* cert */ PeerCertificate) => js.UndefOr[js.Error]): Self = StObject.set(x, "checkServerIdentity", js.Any.fromFunction2(value))
    
    inline def setCheckServerIdentityUndefined: Self = StObject.set(x, "checkServerIdentity", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setLookup(
      value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
    ): Self = StObject.set(x, "lookup", js.Any.fromFunction3(value))
    
    inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    
    inline def setMinDHSize(value: Double): Self = StObject.set(x, "minDHSize", value.asInstanceOf[js.Any])
    
    inline def setMinDHSizeUndefined: Self = StObject.set(x, "minDHSize", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPskCallback(value: /* hint */ String | Null => PSKCallbackNegotation | Null): Self = StObject.set(x, "pskCallback", js.Any.fromFunction1(value))
    
    inline def setPskCallbackUndefined: Self = StObject.set(x, "pskCallback", js.undefined)
    
    inline def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
    
    inline def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
    
    inline def setSession(value: Buffer): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSocket(value: Duplex): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
