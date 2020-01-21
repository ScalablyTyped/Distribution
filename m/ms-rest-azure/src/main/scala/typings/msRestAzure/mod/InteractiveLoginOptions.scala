package typings.msRestAzure.mod

import typings.msRestAzure.msRestAzureStrings.batch
import typings.msRestAzure.msRestAzureStrings.graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractiveLoginOptions extends DeviceTokenCredentialsOptions {
  /**
    * The language code specifying how the message should be localized to. Default value 'en-us'.
    */
  var language: js.UndefOr[String] = js.undefined
}

object InteractiveLoginOptions {
  @scala.inline
  def apply(
    authorizationScheme: String = null,
    clientId: String = null,
    domain: String = null,
    environment: AzureEnvironment = null,
    language: String = null,
    tokenAudience: graph | batch | String = null,
    tokenCache: js.Any = null,
    username: String = null
  ): InteractiveLoginOptions = {
    val __obj = js.Dynamic.literal()
    if (authorizationScheme != null) __obj.updateDynamic("authorizationScheme")(authorizationScheme.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (tokenAudience != null) __obj.updateDynamic("tokenAudience")(tokenAudience.asInstanceOf[js.Any])
    if (tokenCache != null) __obj.updateDynamic("tokenCache")(tokenCache.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveLoginOptions]
  }
}

