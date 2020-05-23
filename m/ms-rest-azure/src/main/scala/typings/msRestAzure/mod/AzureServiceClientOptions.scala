package typings.msRestAzure.mod

import typings.msRest.mod.ClientRequestOptions
import typings.msRest.mod.ServiceClientOptions
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
    longRunningOperationRetryTimeout: js.UndefOr[Double] = js.undefined,
    noRetryPolicy: js.UndefOr[Boolean] = js.undefined,
    requestOptions: ClientRequestOptions = null,
    rpRegistrationRetryTimeout: js.UndefOr[Double] = js.undefined
  ): AzureServiceClientOptions = {
    val __obj = js.Dynamic.literal()
    if (acceptLanguage != null) __obj.updateDynamic("acceptLanguage")(acceptLanguage.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(generateClientRequestId)) __obj.updateDynamic("generateClientRequestId")(generateClientRequestId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longRunningOperationRetryTimeout)) __obj.updateDynamic("longRunningOperationRetryTimeout")(longRunningOperationRetryTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noRetryPolicy)) __obj.updateDynamic("noRetryPolicy")(noRetryPolicy.get.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(rpRegistrationRetryTimeout)) __obj.updateDynamic("rpRegistrationRetryTimeout")(rpRegistrationRetryTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureServiceClientOptions]
  }
}

