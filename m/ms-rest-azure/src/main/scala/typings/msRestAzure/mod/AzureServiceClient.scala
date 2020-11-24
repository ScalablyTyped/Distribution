package typings.msRestAzure.mod

import typings.msRest.mod.HttpOperationResponse
import typings.msRest.mod.RequestOptions
import typings.msRest.mod.ServiceCallback
import typings.msRest.mod.ServiceClient
import typings.msRest.mod.ServiceClientCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure", "AzureServiceClient")
@js.native
class AzureServiceClient protected () extends ServiceClient {
  /**
    * @class
    * Initializes a new instance of the AzureServiceClient class.
    * @constructor
    * @param {ServiceClientCredentials} credentials - ApplicationTokenCredentials or 
    * UserTokenCredentials object used for authentication.  
    * 
    * @param {object} options - The parameter options used by ServiceClient
    * 
    * @param {string} [options.acceptLanguage] - Gets or sets the preferred language for the response. 
    * Default value is: 'en-US'.
    *  
    * @param {boolean} [options.generateClientRequestId] - When set to true a unique x-ms-client-request-id value 
    * is generated and included in each request. Default is true.
    * 
    * @param {number} [options.longRunningOperationRetryTimeout] - Gets or sets the retry timeout in seconds for 
    * Long Running Operations. Default value is 30 seconds.
    * 
    * @param {number} [options.rpRegistrationRetryTimeout] - Gets or sets the retry timeout in seconds for 
    * AutomaticRPRegistration. Default value is 30 seconds.
    */
  def this(credentials: ServiceClientCredentials, options: AzureServiceClientOptions) = this()
  
  def getLongRunningOperationResult[TResult](resultOfInitialRequest: HttpOperationResponse[TResult]): js.Promise[TResult] = js.native
  def getLongRunningOperationResult[TResult](resultOfInitialRequest: HttpOperationResponse[TResult], callback: ServiceCallback[TResult]): Unit = js.native
  def getLongRunningOperationResult[TResult](resultOfInitialRequest: HttpOperationResponse[TResult], options: RequestOptions): js.Promise[TResult] = js.native
  def getLongRunningOperationResult[TResult](
    resultOfInitialRequest: HttpOperationResponse[TResult],
    options: RequestOptions,
    callback: ServiceCallback[TResult]
  ): Unit = js.native
  
  def sendLongRunningRequest[TResult](options: LongRunningPathTemplateBasedRequestPrepareOptions): js.Promise[TResult] = js.native
  def sendLongRunningRequest[TResult](options: LongRunningPathTemplateBasedRequestPrepareOptions, callback: ServiceCallback[TResult]): Unit = js.native
  def sendLongRunningRequest[TResult](options: LongRunningUrlBasedRequestPrepareOptions): js.Promise[TResult] = js.native
  def sendLongRunningRequest[TResult](options: LongRunningUrlBasedRequestPrepareOptions, callback: ServiceCallback[TResult]): Unit = js.native
  
  def sendLongRunningRequestWithHttpOperationResponse[TResult](options: LongRunningPathTemplateBasedRequestPrepareOptions): js.Promise[HttpOperationResponse[TResult]] = js.native
  def sendLongRunningRequestWithHttpOperationResponse[TResult](options: LongRunningUrlBasedRequestPrepareOptions): js.Promise[HttpOperationResponse[TResult]] = js.native
}
