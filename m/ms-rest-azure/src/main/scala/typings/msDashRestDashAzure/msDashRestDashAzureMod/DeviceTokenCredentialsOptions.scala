package typings.msDashRestDashAzure.msDashRestDashAzureMod

import typings.msDashRestDashAzure.msDashRestDashAzureStrings.batch
import typings.msDashRestDashAzure.msDashRestDashAzureStrings.graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceTokenCredentialsOptions extends LoginWithUsernamePasswordOptions {
  /**
    * The user name for account in the form: 'user@example.com'. Default value is 'user@example.com'.
    */
  var username: js.UndefOr[String] = js.undefined
}

object DeviceTokenCredentialsOptions {
  @scala.inline
  def apply(
    authorizationScheme: String = null,
    clientId: String = null,
    domain: String = null,
    environment: AzureEnvironment = null,
    tokenAudience: graph | batch | String = null,
    tokenCache: js.Any = null,
    username: String = null
  ): DeviceTokenCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (authorizationScheme != null) __obj.updateDynamic("authorizationScheme")(authorizationScheme)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (tokenAudience != null) __obj.updateDynamic("tokenAudience")(tokenAudience.asInstanceOf[js.Any])
    if (tokenCache != null) __obj.updateDynamic("tokenCache")(tokenCache)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[DeviceTokenCredentialsOptions]
  }
}

