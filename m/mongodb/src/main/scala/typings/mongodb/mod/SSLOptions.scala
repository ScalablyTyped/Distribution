package typings.mongodb.mod

import typings.node.Buffer
import typings.node.tlsMod.PeerCertificate
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSLOptions extends StObject {
  
  /**
    * Default: true; Server identity checking during SSL
    */
  var checkServerIdentity: js.UndefOr[
    Boolean | (js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[Error]])
  ] = js.undefined
  
  /**
    * Passed directly through to tls.createSecureContext. See https://nodejs.org/dist/latest-v9.x/docs/api/tls.html#tls_tls_createsecurecontext_options for more info.
    */
  var ciphers: js.UndefOr[String] = js.undefined
  
  /**
    * Passed directly through to tls.createSecureContext. See https://nodejs.org/dist/latest-v9.x/docs/api/tls.html#tls_tls_createsecurecontext_options for more info.
    */
  var ecdhCurve: js.UndefOr[String] = js.undefined
  
  /**
    * If present, the connection pool will be initialized with minSize connections, and will never dip below minSize connections
    */
  var minSize: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Default:5; Number of connections for each server instance; set to 5 as default for legacy reasons.
    */
  var poolSize: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * String containing the server name requested via TLS SNI.
    */
  var servername: js.UndefOr[String] = js.undefined
  
  /**
    * Use ssl connection (needs to have a mongod server with ssl support)
    */
  var ssl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of valid certificates either as Buffers or Strings
    */
  var sslCA: js.UndefOr[js.Array[Buffer | String]] = js.undefined
  
  /**
    * SSL Certificate revocation list binary buffer
    */
  var sslCRL: js.UndefOr[js.Array[Buffer | String]] = js.undefined
  
  /**
    * SSL Certificate binary buffer
    */
  var sslCert: js.UndefOr[Buffer | String] = js.undefined
  
  /**
    * SSL Key file binary buffer
    */
  var sslKey: js.UndefOr[Buffer | String] = js.undefined
  
  /**
    * SSL Certificate pass phrase
    */
  var sslPass: js.UndefOr[Buffer | String] = js.undefined
  
  /**
    * Default: true; Validate mongod server certificate against ca (mongod server >=2.4 with ssl support required)
    */
  var sslValidate: js.UndefOr[Boolean] = js.undefined
}
object SSLOptions {
  
  @scala.inline
  def apply(): SSLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSLOptions]
  }
  
  @scala.inline
  implicit class SSLOptionsMutableBuilder[Self <: SSLOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckServerIdentity(value: Boolean | (js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[Error]])): Self = StObject.set(x, "checkServerIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckServerIdentityFunction2(value: (/* host */ String, /* cert */ PeerCertificate) => js.UndefOr[Error]): Self = StObject.set(x, "checkServerIdentity", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheckServerIdentityUndefined: Self = StObject.set(x, "checkServerIdentity", js.undefined)
    
    @scala.inline
    def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
    
    @scala.inline
    def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
    
    @scala.inline
    def setMinSize(value: scala.Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    @scala.inline
    def setPoolSize(value: scala.Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
    
    @scala.inline
    def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCA(value: js.Array[Buffer | String]): Self = StObject.set(x, "sslCA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCAUndefined: Self = StObject.set(x, "sslCA", js.undefined)
    
    @scala.inline
    def setSslCAVarargs(value: (Buffer | String)*): Self = StObject.set(x, "sslCA", js.Array(value :_*))
    
    @scala.inline
    def setSslCRL(value: js.Array[Buffer | String]): Self = StObject.set(x, "sslCRL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCRLUndefined: Self = StObject.set(x, "sslCRL", js.undefined)
    
    @scala.inline
    def setSslCRLVarargs(value: (Buffer | String)*): Self = StObject.set(x, "sslCRL", js.Array(value :_*))
    
    @scala.inline
    def setSslCert(value: Buffer | String): Self = StObject.set(x, "sslCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCertUndefined: Self = StObject.set(x, "sslCert", js.undefined)
    
    @scala.inline
    def setSslKey(value: Buffer | String): Self = StObject.set(x, "sslKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslKeyUndefined: Self = StObject.set(x, "sslKey", js.undefined)
    
    @scala.inline
    def setSslPass(value: Buffer | String): Self = StObject.set(x, "sslPass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslPassUndefined: Self = StObject.set(x, "sslPass", js.undefined)
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    @scala.inline
    def setSslValidate(value: Boolean): Self = StObject.set(x, "sslValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslValidateUndefined: Self = StObject.set(x, "sslValidate", js.undefined)
  }
}
