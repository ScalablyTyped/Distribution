package typings.msDashRestDashAzure.msDashRestDashAzureMod

import typings.msDashRestDashAzure.msDashRestDashAzureStrings.batch
import typings.msDashRestDashAzure.msDashRestDashAzureStrings.graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginWithUsernamePasswordOptions extends AzureTokenCredentialsOptions {
  /** 
    * The active directory application client id. 
    * See {@link https://azure.microsoft.com/en-us/documentation/articles/active-directory-devquickstarts-dotnet/ Active Directory Quickstart for .Net} 
    * for an example.
    */
  var clientId: js.UndefOr[String] = js.undefined
  /**
    * The domain or tenant id containing this application. Default value is 'common'.
    */
  var domain: js.UndefOr[String] = js.undefined
}

object LoginWithUsernamePasswordOptions {
  @scala.inline
  def apply(
    authorizationScheme: String = null,
    clientId: String = null,
    domain: String = null,
    environment: AzureEnvironment = null,
    tokenAudience: graph | batch | String = null,
    tokenCache: js.Any = null
  ): LoginWithUsernamePasswordOptions = {
    val __obj = js.Dynamic.literal()
    if (authorizationScheme != null) __obj.updateDynamic("authorizationScheme")(authorizationScheme.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (tokenAudience != null) __obj.updateDynamic("tokenAudience")(tokenAudience.asInstanceOf[js.Any])
    if (tokenCache != null) __obj.updateDynamic("tokenCache")(tokenCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginWithUsernamePasswordOptions]
  }
}

