package typings.mpesaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigOptions extends js.Object {
  
  var certPath: js.UndefOr[String] = js.native
  
  var consumerKey: String = js.native
  
  var consumerSecret: String = js.native
  
  var enviroment: js.UndefOr[String] = js.native
  
  var initiatorName: js.UndefOr[String] = js.native
  
  var lipaNaMpesaShortCode: js.UndefOr[String] = js.native
  
  var lipaNaMpesaShortPass: js.UndefOr[String] = js.native
  
  var securityCredential: js.UndefOr[String] = js.native
  
  var shortCode: js.UndefOr[String] = js.native
}
object ConfigOptions {
  
  @scala.inline
  def apply(consumerKey: String, consumerSecret: String): ConfigOptions = {
    val __obj = js.Dynamic.literal(consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
  
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setConsumerKey(value: String): Self = this.set("consumerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerSecret(value: String): Self = this.set("consumerSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertPath(value: String): Self = this.set("certPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertPath: Self = this.set("certPath", js.undefined)
    
    @scala.inline
    def setEnviroment(value: String): Self = this.set("enviroment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnviroment: Self = this.set("enviroment", js.undefined)
    
    @scala.inline
    def setInitiatorName(value: String): Self = this.set("initiatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitiatorName: Self = this.set("initiatorName", js.undefined)
    
    @scala.inline
    def setLipaNaMpesaShortCode(value: String): Self = this.set("lipaNaMpesaShortCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLipaNaMpesaShortCode: Self = this.set("lipaNaMpesaShortCode", js.undefined)
    
    @scala.inline
    def setLipaNaMpesaShortPass(value: String): Self = this.set("lipaNaMpesaShortPass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLipaNaMpesaShortPass: Self = this.set("lipaNaMpesaShortPass", js.undefined)
    
    @scala.inline
    def setSecurityCredential(value: String): Self = this.set("securityCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityCredential: Self = this.set("securityCredential", js.undefined)
    
    @scala.inline
    def setShortCode(value: String): Self = this.set("shortCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortCode: Self = this.set("shortCode", js.undefined)
  }
}
