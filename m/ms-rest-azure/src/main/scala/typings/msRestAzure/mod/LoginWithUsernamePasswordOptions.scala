package typings.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginWithUsernamePasswordOptions extends AzureTokenCredentialsOptions {
  
  /** 
    * The active directory application client id. 
    * See {@link https://azure.microsoft.com/en-us/documentation/articles/active-directory-devquickstarts-dotnet/ Active Directory Quickstart for .Net} 
    * for an example.
    */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * The domain or tenant id containing this application. Default value is 'common'.
    */
  var domain: js.UndefOr[String] = js.native
}
object LoginWithUsernamePasswordOptions {
  
  @scala.inline
  def apply(): LoginWithUsernamePasswordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginWithUsernamePasswordOptions]
  }
  
  @scala.inline
  implicit class LoginWithUsernamePasswordOptionsOps[Self <: LoginWithUsernamePasswordOptions] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
  }
}
