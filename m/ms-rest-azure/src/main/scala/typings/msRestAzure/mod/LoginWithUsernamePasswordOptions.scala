package typings.msRestAzure.mod

import org.scalablytyped.runtime.StObject
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
  implicit class LoginWithUsernamePasswordOptionsMutableBuilder[Self <: LoginWithUsernamePasswordOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
