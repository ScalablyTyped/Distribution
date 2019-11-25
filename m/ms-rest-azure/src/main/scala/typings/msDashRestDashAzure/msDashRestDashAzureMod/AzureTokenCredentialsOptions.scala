package typings.msDashRestDashAzure.msDashRestDashAzureMod

import typings.msDashRestDashAzure.msDashRestDashAzureStrings.batch
import typings.msDashRestDashAzure.msDashRestDashAzureStrings.graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureTokenCredentialsOptions extends js.Object {
  /**
    * The authorization scheme. Default value is 'Bearer'.
    */
  var authorizationScheme: js.UndefOr[String] = js.undefined
  /**
    * The Azure environment to authenticate with.
    */
  var environment: js.UndefOr[AzureEnvironment] = js.undefined
  /**
    * The audience for which the token is requested. Valid values are 'graph', 'batch' or any other resource like 'https://vault.azure.com'.
    * If tokenAudience is 'graph' then domain should also be provided and its value should not be the default 'common' tenant. 
    * It must be a string (preferrably in a guid format).
    */
  var tokenAudience: js.UndefOr[graph | batch | String] = js.undefined
  /**
    * The token cache. Default value is MemoryCache from adal.
    */
  var tokenCache: js.UndefOr[js.Any] = js.undefined
}

object AzureTokenCredentialsOptions {
  @scala.inline
  def apply(
    authorizationScheme: String = null,
    environment: AzureEnvironment = null,
    tokenAudience: graph | batch | String = null,
    tokenCache: js.Any = null
  ): AzureTokenCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (authorizationScheme != null) __obj.updateDynamic("authorizationScheme")(authorizationScheme.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (tokenAudience != null) __obj.updateDynamic("tokenAudience")(tokenAudience.asInstanceOf[js.Any])
    if (tokenCache != null) __obj.updateDynamic("tokenCache")(tokenCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureTokenCredentialsOptions]
  }
}

