package typings.msDashRestDashAzure.msDashRestDashAzureMod

import typings.msDashRestDashAzure.msDashRestDashAzureStrings.batch
import typings.msDashRestDashAzure.msDashRestDashAzureStrings.graph
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
    if (authorizationScheme != null) __obj.updateDynamic("authorizationScheme")(authorizationScheme)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (language != null) __obj.updateDynamic("language")(language)
    if (tokenAudience != null) __obj.updateDynamic("tokenAudience")(tokenAudience.asInstanceOf[js.Any])
    if (tokenCache != null) __obj.updateDynamic("tokenCache")(tokenCache)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[InteractiveLoginOptions]
  }
}

