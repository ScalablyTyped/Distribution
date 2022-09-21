package typings.openidClient.anon

import typings.node.bufferMod.global.Buffer
import typings.node.dnsMod.LookupOneOptions
import typings.node.httpMod.Agent
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.netMod.LookupFunction
import typings.node.nodeNetMod.Socket
import typings.node.tlsMod.KeyObject
import typings.node.tlsMod.PxfObject
import typings.node.tlsMod.SecureVersion
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<node.https.RequestOptions, keyof node.url.URL> */
trait OmitRequestOptionskeyofUR extends StObject {
  
  var _defaultAgent: js.UndefOr[Agent] = js.undefined
  
  var agent: js.UndefOr[Agent | Boolean] = js.undefined
  
  var auth: js.UndefOr[String | Null] = js.undefined
  
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  
  var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  
  var ciphers: js.UndefOr[String] = js.undefined
  
  var clientCertEngine: js.UndefOr[String] = js.undefined
  
  var createConnection: js.UndefOr[
    js.Function2[
      /* options */ this.type, 
      /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit], 
      Socket
    ]
  ] = js.undefined
  
  var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  
  var defaultPort: js.UndefOr[Double | String] = js.undefined
  
  var dhparam: js.UndefOr[String | Buffer] = js.undefined
  
  var ecdhCurve: js.UndefOr[String] = js.undefined
  
  var family: js.UndefOr[Double] = js.undefined
  
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  
  var honorCipherOrder: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[String | Buffer | (js.Array[String | Buffer | KeyObject])] = js.undefined
  
  var localAddress: js.UndefOr[String] = js.undefined
  
  var lookup: js.UndefOr[LookupFunction] = js.undefined
  
  var maxHeaderSize: js.UndefOr[Double] = js.undefined
  
  var maxVersion: js.UndefOr[SecureVersion] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var minVersion: js.UndefOr[SecureVersion] = js.undefined
  
  var passphrase: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String | Null] = js.undefined
  
  var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.undefined
  
  var privateKeyEngine: js.UndefOr[String] = js.undefined
  
  var privateKeyIdentifier: js.UndefOr[String] = js.undefined
  
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  
  var secureOptions: js.UndefOr[Double] = js.undefined
  
  var secureProtocol: js.UndefOr[String] = js.undefined
  
  var servername: js.UndefOr[String] = js.undefined
  
  var sessionIdContext: js.UndefOr[String] = js.undefined
  
  var sessionTimeout: js.UndefOr[Double] = js.undefined
  
  var setHost: js.UndefOr[Boolean] = js.undefined
  
  var sigalgs: js.UndefOr[String] = js.undefined
  
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  var socketPath: js.UndefOr[String] = js.undefined
  
  var ticketKeys: js.UndefOr[Buffer] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object OmitRequestOptionskeyofUR {
  
  inline def apply(): OmitRequestOptionskeyofUR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitRequestOptionskeyofUR]
  }
  
  extension [Self <: OmitRequestOptionskeyofUR](x: Self) {
    
    inline def setAgent(value: Agent | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthNull: Self = StObject.set(x, "auth", null)
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    
    inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value*))
    
    inline def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    inline def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value*))
    
    inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
    
    inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
    
    inline def setClientCertEngine(value: String): Self = StObject.set(x, "clientCertEngine", value.asInstanceOf[js.Any])
    
    inline def setClientCertEngineUndefined: Self = StObject.set(x, "clientCertEngine", js.undefined)
    
    inline def setCreateConnection(
      value: (OmitRequestOptionskeyofUR, /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit]) => Socket
    ): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
    
    inline def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
    
    inline def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
    
    inline def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
    
    inline def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value*))
    
    inline def setDefaultPort(value: Double | String): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
    
    inline def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
    
    inline def setDhparam(value: String | Buffer): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
    
    inline def setDhparamUndefined: Self = StObject.set(x, "dhparam", js.undefined)
    
    inline def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
    
    inline def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
    
    inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
    
    inline def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
    
    inline def setKey(value: String | Buffer | (js.Array[String | Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKeyVarargs(value: (String | Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value*))
    
    inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
    
    inline def setLookup(
      value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[
          /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
          /* address */ String, 
          /* family */ Double, 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "lookup", js.Any.fromFunction3(value))
    
    inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    
    inline def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
    
    inline def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
    
    inline def setMaxVersion(value: SecureVersion): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMinVersion(value: SecureVersion): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
    
    inline def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
    
    inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
    
    inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
    
    inline def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value*))
    
    inline def setPrivateKeyEngine(value: String): Self = StObject.set(x, "privateKeyEngine", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyEngineUndefined: Self = StObject.set(x, "privateKeyEngine", js.undefined)
    
    inline def setPrivateKeyIdentifier(value: String): Self = StObject.set(x, "privateKeyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyIdentifierUndefined: Self = StObject.set(x, "privateKeyIdentifier", js.undefined)
    
    inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
    
    inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    
    inline def setSecureOptions(value: Double): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
    
    inline def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
    
    inline def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
    
    inline def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
    
    inline def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
    
    inline def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
    
    inline def setSessionIdContext(value: String): Self = StObject.set(x, "sessionIdContext", value.asInstanceOf[js.Any])
    
    inline def setSessionIdContextUndefined: Self = StObject.set(x, "sessionIdContext", js.undefined)
    
    inline def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    
    inline def setSetHost(value: Boolean): Self = StObject.set(x, "setHost", value.asInstanceOf[js.Any])
    
    inline def setSetHostUndefined: Self = StObject.set(x, "setHost", js.undefined)
    
    inline def setSigalgs(value: String): Self = StObject.set(x, "sigalgs", value.asInstanceOf[js.Any])
    
    inline def setSigalgsUndefined: Self = StObject.set(x, "sigalgs", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
    
    inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
    
    inline def setTicketKeys(value: Buffer): Self = StObject.set(x, "ticketKeys", value.asInstanceOf[js.Any])
    
    inline def setTicketKeysUndefined: Self = StObject.set(x, "ticketKeys", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def set_defaultAgent(value: Agent): Self = StObject.set(x, "_defaultAgent", value.asInstanceOf[js.Any])
    
    inline def set_defaultAgentUndefined: Self = StObject.set(x, "_defaultAgent", js.undefined)
  }
}
