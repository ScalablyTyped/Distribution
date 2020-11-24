package typings.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthFileOptions extends js.Object {
  
  /**
    * @prop {string} [filePath] Absolute file path to the auth file. If not provided 
    * then please set the environment variable 'AZURE_AUTH_LOCATION'.
    */
  var filePath: js.UndefOr[String] = js.native
  
  /**
    * @prop {string} [subscriptionEnvVariableName] The subscriptionId environment variable 
    * name. Default is 'AZURE_SUBSCRIPTION_ID'.
    */
  var subscriptionEnvVariableName: js.UndefOr[String] = js.native
}
object AuthFileOptions {
  
  @scala.inline
  def apply(): AuthFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthFileOptions]
  }
  
  @scala.inline
  implicit class AuthFileOptionsOps[Self <: AuthFileOptions] (val x: Self) extends AnyVal {
    
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
    
    @scala.inline
    def setSubscriptionEnvVariableName(value: String): Self = this.set("subscriptionEnvVariableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionEnvVariableName: Self = this.set("subscriptionEnvVariableName", js.undefined)
  }
}
