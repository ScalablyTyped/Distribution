package typings.msRestAzure.mod

import typings.msRest.mod.ServiceClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzureServiceClientOptions extends ServiceClientOptions {
  
  /**
    * @property {string} [acceptLanguage] - Gets or sets the preferred language for the response. 
    * Default value is: 'en-US'.
    */
  var acceptLanguage: js.UndefOr[String] = js.native
  
  /**
    * @property {boolean} [generateClientRequestId] - When set to true a unique x-ms-client-request-id value 
    * is generated and included in each request. Default is true.
    */
  var generateClientRequestId: js.UndefOr[Boolean] = js.native
  
  /**
    * @property {number} [longRunningOperationRetryTimeout] - The retry timeout in seconds for 
    * Long Running Operations. Default value is 30 seconds.
    */
  var longRunningOperationRetryTimeout: js.UndefOr[Double] = js.native
  
  /**
    * @property {number} [rpRegistrationRetryTimeout] - Gets or sets the retry timeout in seconds for 
    * AutomaticRPRegistration. Default value is 30 seconds.
    */
  var rpRegistrationRetryTimeout: js.UndefOr[Double] = js.native
}
object AzureServiceClientOptions {
  
  @scala.inline
  def apply(): AzureServiceClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureServiceClientOptions]
  }
  
  @scala.inline
  implicit class AzureServiceClientOptionsOps[Self <: AzureServiceClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcceptLanguage(value: String): Self = this.set("acceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("acceptLanguage", js.undefined)
    
    @scala.inline
    def setGenerateClientRequestId(value: Boolean): Self = this.set("generateClientRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateClientRequestId: Self = this.set("generateClientRequestId", js.undefined)
    
    @scala.inline
    def setLongRunningOperationRetryTimeout(value: Double): Self = this.set("longRunningOperationRetryTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongRunningOperationRetryTimeout: Self = this.set("longRunningOperationRetryTimeout", js.undefined)
    
    @scala.inline
    def setRpRegistrationRetryTimeout(value: Double): Self = this.set("rpRegistrationRetryTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRpRegistrationRetryTimeout: Self = this.set("rpRegistrationRetryTimeout", js.undefined)
  }
}
