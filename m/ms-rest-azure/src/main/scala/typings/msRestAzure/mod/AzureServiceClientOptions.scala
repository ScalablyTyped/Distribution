package typings.msRestAzure.mod

import typings.msRest.mod.ServiceClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureServiceClientOptions
  extends StObject
     with ServiceClientOptions {
  
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
  
  inline def apply(): AzureServiceClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureServiceClientOptions]
  }
  
  extension [Self <: AzureServiceClientOptions](x: Self) {
    
    inline def setAcceptLanguage(value: String): Self = StObject.set(x, "acceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "acceptLanguage", js.undefined)
    
    inline def setGenerateClientRequestId(value: Boolean): Self = StObject.set(x, "generateClientRequestId", value.asInstanceOf[js.Any])
    
    inline def setGenerateClientRequestIdUndefined: Self = StObject.set(x, "generateClientRequestId", js.undefined)
    
    inline def setLongRunningOperationRetryTimeout(value: Double): Self = StObject.set(x, "longRunningOperationRetryTimeout", value.asInstanceOf[js.Any])
    
    inline def setLongRunningOperationRetryTimeoutUndefined: Self = StObject.set(x, "longRunningOperationRetryTimeout", js.undefined)
    
    inline def setRpRegistrationRetryTimeout(value: Double): Self = StObject.set(x, "rpRegistrationRetryTimeout", value.asInstanceOf[js.Any])
    
    inline def setRpRegistrationRetryTimeoutUndefined: Self = StObject.set(x, "rpRegistrationRetryTimeout", js.undefined)
  }
}
