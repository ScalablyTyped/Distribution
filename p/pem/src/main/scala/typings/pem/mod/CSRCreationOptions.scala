package typings.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSRCreationOptions extends js.Object {
  
  /**
    * A list of subjectAltNames in the subjectAltName field
    */
  var altNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    *  Optional client key to use
    */
  var clientKey: js.UndefOr[String] = js.native
  
  var clientKeyPassword: js.UndefOr[String] = js.native
  
  /**
    * CSR common name field, defaults to 'localhost'
    */
  var commonName: js.UndefOr[String] = js.native
  
  /**
    * CSR country field
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * CSR config file
    */
  var csrConfigFile: js.UndefOr[String] = js.native
  
  /**
    * CSR email address field
    */
  var emailAddress: js.UndefOr[String] = js.native
  
  /**
    * Hash function to use, defaults to sha256
    */
  var hash: js.UndefOr[HashFunction] = js.native
  
  /**
    * If clientKey is undefined, bit size to use for generating a new key (defaults to 2048)
    */
  var keyBitsize: js.UndefOr[Double] = js.native
  
  /**
    * CSR locality field
    */
  var locality: js.UndefOr[String] = js.native
  
  /**
    * CSR organization field
    */
  var organization: js.UndefOr[String] = js.native
  
  /**
    * CSR organizational unit field
    */
  var organizationUnit: js.UndefOr[String] = js.native
  
  /**
    * CSR state field
    */
  var state: js.UndefOr[String] = js.native
}
object CSRCreationOptions {
  
  @scala.inline
  def apply(): CSRCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSRCreationOptions]
  }
  
  @scala.inline
  implicit class CSRCreationOptionsOps[Self <: CSRCreationOptions] (val x: Self) extends AnyVal {
    
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
    def setAltNamesVarargs(value: String*): Self = this.set("altNames", js.Array(value :_*))
    
    @scala.inline
    def setAltNames(value: js.Array[String]): Self = this.set("altNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltNames: Self = this.set("altNames", js.undefined)
    
    @scala.inline
    def setClientKey(value: String): Self = this.set("clientKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientKey: Self = this.set("clientKey", js.undefined)
    
    @scala.inline
    def setClientKeyPassword(value: String): Self = this.set("clientKeyPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientKeyPassword: Self = this.set("clientKeyPassword", js.undefined)
    
    @scala.inline
    def setCommonName(value: String): Self = this.set("commonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonName: Self = this.set("commonName", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setCsrConfigFile(value: String): Self = this.set("csrConfigFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsrConfigFile: Self = this.set("csrConfigFile", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    
    @scala.inline
    def setHash(value: HashFunction): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setKeyBitsize(value: Double): Self = this.set("keyBitsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyBitsize: Self = this.set("keyBitsize", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    
    @scala.inline
    def setOrganizationUnit(value: String): Self = this.set("organizationUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationUnit: Self = this.set("organizationUnit", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
