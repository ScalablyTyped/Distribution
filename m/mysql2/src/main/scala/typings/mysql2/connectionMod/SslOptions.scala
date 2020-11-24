package typings.mysql2.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SslOptions extends js.Object {
  
  /**
    * Either a string or list of strings of PEM encoded CA certificates to trust.
    */
  var ca: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * A string holding the PEM encoded certificate
    */
  var cert: js.UndefOr[String] = js.native
  
  /**
    * A string describing the ciphers to use or exclude
    */
  var ciphers: js.UndefOr[String] = js.native
  
  /**
    * Either a string or list of strings of PEM encoded CRLs (Certificate Revocation List)
    */
  var crl: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * A string holding the PEM encoded private key
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * A string of passphrase for the private key or pfx
    */
  var passphrase: js.UndefOr[String] = js.native
  
  /**
    * A string or buffer holding the PFX or PKCS12 encoded private key, certificate and CA certificates
    */
  var pfx: js.UndefOr[String] = js.native
  
  /**
    * You can also connect to a MySQL server without properly providing the appropriate CA to trust. You should not do this.
    */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
}
object SslOptions {
  
  @scala.inline
  def apply(): SslOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslOptions]
  }
  
  @scala.inline
  implicit class SslOptionsOps[Self <: SslOptions] (val x: Self) extends AnyVal {
    
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
    def setCaVarargs(value: String*): Self = this.set("ca", js.Array(value :_*))
    
    @scala.inline
    def setCa(value: String | js.Array[String]): Self = this.set("ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    
    @scala.inline
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    
    @scala.inline
    def setCiphers(value: String): Self = this.set("ciphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCiphers: Self = this.set("ciphers", js.undefined)
    
    @scala.inline
    def setCrlVarargs(value: String*): Self = this.set("crl", js.Array(value :_*))
    
    @scala.inline
    def setCrl(value: String | js.Array[String]): Self = this.set("crl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrl: Self = this.set("crl", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    
    @scala.inline
    def setPfx(value: String): Self = this.set("pfx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePfx: Self = this.set("pfx", js.undefined)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
  }
}
