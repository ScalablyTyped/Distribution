package typings.msDashRestDashAzure.msDashRestDashAzureMod

import typings.msDashRest.msDashRestMod.ClientRequestOptions
import typings.msDashRest.msDashRestMod.ServiceClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureServiceClientOptions extends ServiceClientOptions {
  /**
    * @property {string} [acceptLanguage] - Gets or sets the preferred language for the response. 
    * Default value is: 'en-US'.
    */
  var acceptLanguage: js.UndefOr[String] = js.undefined
  /**
    * @property {boolean} [generateClientRequestId] - When set to true a unique x-ms-client-request-id value 
    * is generated and included in each request. Default is true.
    */
  var generateClientRequestId: js.UndefOr[Boolean] = js.undefined
  /**
    * @property {number} [longRunningOperationRetryTimeout] - The retry timeout in seconds for 
    * Long Running Operations. Default value is 30 seconds.
    */
  var longRunningOperationRetryTimeout: js.UndefOr[Double] = js.undefined
  /**
    * @property {number} [rpRegistrationRetryTimeout] - Gets or sets the retry timeout in seconds for 
    * AutomaticRPRegistration. Default value is 30 seconds.
    */
  var rpRegistrationRetryTimeout: js.UndefOr[Double] = js.undefined
}

object AzureServiceClientOptions {
  @scala.inline
  def apply(
    acceptLanguage: String = null,
    filters: js.Array[_] = null,
    generateClientRequestId: js.UndefOr[Boolean] = js.undefined,
    longRunningOperationRetryTimeout: Int | Double = null,
    noRetryPolicy: js.UndefOr[Boolean] = js.undefined,
    requestOptions: ClientRequestOptions = null,
    rpRegistrationRetryTimeout: Int | Double = null
  ): AzureServiceClientOptions = {
    val __obj = js.Dynamic.literal()
    if (acceptLanguage != null) __obj.updateDynamic("acceptLanguage")(acceptLanguage.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(generateClientRequestId)) __obj.updateDynamic("generateClientRequestId")(generateClientRequestId.asInstanceOf[js.Any])
    if (longRunningOperationRetryTimeout != null) __obj.updateDynamic("longRunningOperationRetryTimeout")(longRunningOperationRetryTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(noRetryPolicy)) __obj.updateDynamic("noRetryPolicy")(noRetryPolicy.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    if (rpRegistrationRetryTimeout != null) __obj.updateDynamic("rpRegistrationRetryTimeout")(rpRegistrationRetryTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureServiceClientOptions]
  }
}

