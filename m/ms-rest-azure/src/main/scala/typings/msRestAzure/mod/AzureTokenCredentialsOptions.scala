package typings.msRestAzure.mod

import typings.msRestAzure.msRestAzureStrings.batch
import typings.msRestAzure.msRestAzureStrings.graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzureTokenCredentialsOptions extends js.Object {
  
  /**
    * The authorization scheme. Default value is 'Bearer'.
    */
  var authorizationScheme: js.UndefOr[String] = js.native
  
  /**
    * The Azure environment to authenticate with.
    */
  var environment: js.UndefOr[AzureEnvironment] = js.native
  
  /**
    * The audience for which the token is requested. Valid values are 'graph', 'batch' or any other resource like 'https://vault.azure.com'.
    * If tokenAudience is 'graph' then domain should also be provided and its value should not be the default 'common' tenant. 
    * It must be a string (preferrably in a guid format).
    */
  var tokenAudience: js.UndefOr[graph | batch | String] = js.native
  
  /**
    * The token cache. Default value is MemoryCache from adal.
    */
  var tokenCache: js.UndefOr[js.Any] = js.native
}
object AzureTokenCredentialsOptions {
  
  @scala.inline
  def apply(): AzureTokenCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureTokenCredentialsOptions]
  }
  
  @scala.inline
  implicit class AzureTokenCredentialsOptionsOps[Self <: AzureTokenCredentialsOptions] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationScheme(value: String): Self = this.set("authorizationScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationScheme: Self = this.set("authorizationScheme", js.undefined)
    
    @scala.inline
    def setEnvironment(value: AzureEnvironment): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setTokenAudience(value: graph | batch | String): Self = this.set("tokenAudience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenAudience: Self = this.set("tokenAudience", js.undefined)
    
    @scala.inline
    def setTokenCache(value: js.Any): Self = this.set("tokenCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenCache: Self = this.set("tokenCache", js.undefined)
  }
}
