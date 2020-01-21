package typings.msRestAzure.mod

import typings.msRestAzure.msRestAzureStrings.batch
import typings.msRestAzure.msRestAzureStrings.graph
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
    if (authorizationScheme != null) __obj.updateDynamic("authorizationScheme")(authorizationScheme.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (tokenAudience != null) __obj.updateDynamic("tokenAudience")(tokenAudience.asInstanceOf[js.Any])
    if (tokenCache != null) __obj.updateDynamic("tokenCache")(tokenCache.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceTokenCredentialsOptions]
  }
}

