package typings.pgPromise.pgSubsetMod

import typings.node.Buffer
import typings.node.tlsMod.PeerCertificate
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// SSL configuration;
// For property types and documentation see:
// http://nodejs.org/api/tls.html#tls_tls_connect_options_callback
trait ISSLConfig extends StObject {
  
  var NPNProtocols: js.UndefOr[(js.Array[Buffer | String | Uint8Array]) | Buffer | Uint8Array] = js.undefined
  
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  
  var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  
  var checkServerIdentity: js.UndefOr[js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[Error]]] = js.undefined
  
  var key: js.UndefOr[String | Buffer | (js.Array[Buffer | js.Object])] = js.undefined
  
  var passphrase: js.UndefOr[String] = js.undefined
  
  var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | js.Object])] = js.undefined
  
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  
  var secureOptions: js.UndefOr[Double] = js.undefined
}
object ISSLConfig {
  
  inline def apply(): ISSLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISSLConfig]
  }
  
  extension [Self <: ISSLConfig](x: Self) {
    
    inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    
    inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value :_*))
    
    inline def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    inline def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value :_*))
    
    inline def setCheckServerIdentity(value: (/* host */ String, /* cert */ PeerCertificate) => js.UndefOr[Error]): Self = StObject.set(x, "checkServerIdentity", js.Any.fromFunction2(value))
    
    inline def setCheckServerIdentityUndefined: Self = StObject.set(x, "checkServerIdentity", js.undefined)
    
    inline def setKey(value: String | Buffer | (js.Array[Buffer | js.Object])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKeyVarargs(value: (Buffer | js.Object)*): Self = StObject.set(x, "key", js.Array(value :_*))
    
    inline def setNPNProtocols(value: (js.Array[Buffer | String | Uint8Array]) | Buffer | Uint8Array): Self = StObject.set(x, "NPNProtocols", value.asInstanceOf[js.Any])
    
    inline def setNPNProtocolsUndefined: Self = StObject.set(x, "NPNProtocols", js.undefined)
    
    inline def setNPNProtocolsVarargs(value: (Buffer | String | Uint8Array)*): Self = StObject.set(x, "NPNProtocols", js.Array(value :_*))
    
    inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    inline def setPfx(value: String | Buffer | (js.Array[String | Buffer | js.Object])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
    
    inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
    
    inline def setPfxVarargs(value: (String | Buffer | js.Object)*): Self = StObject.set(x, "pfx", js.Array(value :_*))
    
    inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
    
    inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    
    inline def setSecureOptions(value: Double): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
    
    inline def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
  }
}
