package typings.mongodb.mod

import typings.node.Buffer
import typings.node.tlsMod.PeerCertificate
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSLOptions extends js.Object {
  
  /**
    * Default: true; Server identity checking during SSL
    */
  var checkServerIdentity: js.UndefOr[
    Boolean | (js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[Error]])
  ] = js.native
  
  /**
    * Passed directly through to tls.createSecureContext. See https://nodejs.org/dist/latest-v9.x/docs/api/tls.html#tls_tls_createsecurecontext_options for more info.
    */
  var ciphers: js.UndefOr[String] = js.native
  
  /**
    * Passed directly through to tls.createSecureContext. See https://nodejs.org/dist/latest-v9.x/docs/api/tls.html#tls_tls_createsecurecontext_options for more info.
    */
  var ecdhCurve: js.UndefOr[String] = js.native
  
  /**
    * If present, the connection pool will be initialized with minSize connections, and will never dip below minSize connections
    */
  var minSize: js.UndefOr[scala.Double] = js.native
  
  /**
    * Default:5; Number of connections for each server instance; set to 5 as default for legacy reasons.
    */
  var poolSize: js.UndefOr[scala.Double] = js.native
  
  /**
    * String containing the server name requested via TLS SNI.
    */
  var servername: js.UndefOr[String] = js.native
  
  /**
    * Use ssl connection (needs to have a mongod server with ssl support)
    */
  var ssl: js.UndefOr[Boolean] = js.native
  
  /**
    * Array of valid certificates either as Buffers or Strings
    */
  var sslCA: js.UndefOr[js.Array[Buffer | String]] = js.native
  
  /**
    * SSL Certificate revocation list binary buffer
    */
  var sslCRL: js.UndefOr[js.Array[Buffer | String]] = js.native
  
  /**
    * SSL Certificate binary buffer
    */
  var sslCert: js.UndefOr[Buffer | String] = js.native
  
  /**
    * SSL Key file binary buffer
    */
  var sslKey: js.UndefOr[Buffer | String] = js.native
  
  /**
    * SSL Certificate pass phrase
    */
  var sslPass: js.UndefOr[Buffer | String] = js.native
  
  /**
    * Default: true; Validate mongod server certificate against ca (mongod server >=2.4 with ssl support required)
    */
  var sslValidate: js.UndefOr[Boolean] = js.native
}
object SSLOptions {
  
  @scala.inline
  def apply(): SSLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSLOptions]
  }
  
  @scala.inline
  implicit class SSLOptionsOps[Self <: SSLOptions] (val x: Self) extends AnyVal {
    
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
    def setCheckServerIdentityFunction2(value: (/* host */ String, /* cert */ PeerCertificate) => js.UndefOr[Error]): Self = this.set("checkServerIdentity", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheckServerIdentity(value: Boolean | (js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[Error]])): Self = this.set("checkServerIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckServerIdentity: Self = this.set("checkServerIdentity", js.undefined)
    
    @scala.inline
    def setCiphers(value: String): Self = this.set("ciphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCiphers: Self = this.set("ciphers", js.undefined)
    
    @scala.inline
    def setEcdhCurve(value: String): Self = this.set("ecdhCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcdhCurve: Self = this.set("ecdhCurve", js.undefined)
    
    @scala.inline
    def setMinSize(value: scala.Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    
    @scala.inline
    def setPoolSize(value: scala.Double): Self = this.set("poolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolSize: Self = this.set("poolSize", js.undefined)
    
    @scala.inline
    def setServername(value: String): Self = this.set("servername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServername: Self = this.set("servername", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setSslCAVarargs(value: (Buffer | String)*): Self = this.set("sslCA", js.Array(value :_*))
    
    @scala.inline
    def setSslCA(value: js.Array[Buffer | String]): Self = this.set("sslCA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCA: Self = this.set("sslCA", js.undefined)
    
    @scala.inline
    def setSslCRLVarargs(value: (Buffer | String)*): Self = this.set("sslCRL", js.Array(value :_*))
    
    @scala.inline
    def setSslCRL(value: js.Array[Buffer | String]): Self = this.set("sslCRL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCRL: Self = this.set("sslCRL", js.undefined)
    
    @scala.inline
    def setSslCert(value: Buffer | String): Self = this.set("sslCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCert: Self = this.set("sslCert", js.undefined)
    
    @scala.inline
    def setSslKey(value: Buffer | String): Self = this.set("sslKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslKey: Self = this.set("sslKey", js.undefined)
    
    @scala.inline
    def setSslPass(value: Buffer | String): Self = this.set("sslPass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslPass: Self = this.set("sslPass", js.undefined)
    
    @scala.inline
    def setSslValidate(value: Boolean): Self = this.set("sslValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslValidate: Self = this.set("sslValidate", js.undefined)
  }
}
