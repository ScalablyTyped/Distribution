package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TLSOptions extends js.Object {
  
  /**
    * Enable TLS connections
    * @default false
    */
  var tls: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether or not the driver should error when the server’s TLS certificate is invalid
    */
  var tlsAllowInvalidCertificates: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether or not the driver should error when there is a mismatch between the server’s hostname
    * and the hostname specified by the TLS certificate
    */
  var tlsAllowInvalidHostnames: js.UndefOr[Boolean] = js.native
  
  /**
    * path to file with either a single or bundle of certificate authorities
    * to be considered trusted when making a TLS connection
    */
  var tlsCAFile: js.UndefOr[String] = js.native
  
  /**
    * path to the client certificate file or the client private key file;
    * in the case that they both are needed, the files should be concatenated
    */
  var tlsCertificateKeyFile: js.UndefOr[String] = js.native
  
  /**
    * The password to decrypt the client private key to be used for TLS connections
    */
  var tlsCertificateKeyFilePassword: js.UndefOr[String] = js.native
  
  /**
    * Relax TLS constraints, disabling validation
    * @default false
    */
  var tlsInsecure: js.UndefOr[Boolean] = js.native
}
object TLSOptions {
  
  @scala.inline
  def apply(): TLSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TLSOptions]
  }
  
  @scala.inline
  implicit class TLSOptionsOps[Self <: TLSOptions] (val x: Self) extends AnyVal {
    
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
    def setTls(value: Boolean): Self = this.set("tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
    
    @scala.inline
    def setTlsAllowInvalidCertificates(value: Boolean): Self = this.set("tlsAllowInvalidCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsAllowInvalidCertificates: Self = this.set("tlsAllowInvalidCertificates", js.undefined)
    
    @scala.inline
    def setTlsAllowInvalidHostnames(value: Boolean): Self = this.set("tlsAllowInvalidHostnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsAllowInvalidHostnames: Self = this.set("tlsAllowInvalidHostnames", js.undefined)
    
    @scala.inline
    def setTlsCAFile(value: String): Self = this.set("tlsCAFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsCAFile: Self = this.set("tlsCAFile", js.undefined)
    
    @scala.inline
    def setTlsCertificateKeyFile(value: String): Self = this.set("tlsCertificateKeyFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsCertificateKeyFile: Self = this.set("tlsCertificateKeyFile", js.undefined)
    
    @scala.inline
    def setTlsCertificateKeyFilePassword(value: String): Self = this.set("tlsCertificateKeyFilePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsCertificateKeyFilePassword: Self = this.set("tlsCertificateKeyFilePassword", js.undefined)
    
    @scala.inline
    def setTlsInsecure(value: Boolean): Self = this.set("tlsInsecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsInsecure: Self = this.set("tlsInsecure", js.undefined)
  }
}
