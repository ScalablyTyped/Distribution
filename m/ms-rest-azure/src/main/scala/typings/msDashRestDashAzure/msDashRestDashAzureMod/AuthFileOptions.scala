package typings.msDashRestDashAzure.msDashRestDashAzureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthFileOptions extends js.Object {
  /**
    * @prop {string} [filePath] Absolute file path to the auth file. If not provided 
    * then please set the environment variable 'AZURE_AUTH_LOCATION'.
    */
  var filePath: js.UndefOr[String] = js.undefined
  /**
    * @prop {string} [subscriptionEnvVariableName] The subscriptionId environment variable 
    * name. Default is 'AZURE_SUBSCRIPTION_ID'.
    */
  var subscriptionEnvVariableName: js.UndefOr[String] = js.undefined
}

object AuthFileOptions {
  @scala.inline
  def apply(filePath: String = null, subscriptionEnvVariableName: String = null): AuthFileOptions = {
    val __obj = js.Dynamic.literal()
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (subscriptionEnvVariableName != null) __obj.updateDynamic("subscriptionEnvVariableName")(subscriptionEnvVariableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthFileOptions]
  }
}

