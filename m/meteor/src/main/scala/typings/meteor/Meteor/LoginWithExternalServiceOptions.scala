package typings.meteor.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Login **/
@js.native
trait LoginWithExternalServiceOptions extends StObject {
  
  var forceApprovalPrompt: js.UndefOr[Boolean] = js.native
  
  var loginHint: js.UndefOr[String] = js.native
  
  var loginStyle: js.UndefOr[String] = js.native
  
  var loginUrlParameters: js.UndefOr[js.Object] = js.native
  
  var redirectUrl: js.UndefOr[String] = js.native
  
  var requestOfflineToken: js.UndefOr[Boolean] = js.native
  
  var requestPermissions: js.UndefOr[js.Array[String]] = js.native
}
object LoginWithExternalServiceOptions {
  
  @scala.inline
  def apply(): LoginWithExternalServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginWithExternalServiceOptions]
  }
  
  @scala.inline
  implicit class LoginWithExternalServiceOptionsMutableBuilder[Self <: LoginWithExternalServiceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceApprovalPrompt(value: Boolean): Self = StObject.set(x, "forceApprovalPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceApprovalPromptUndefined: Self = StObject.set(x, "forceApprovalPrompt", js.undefined)
    
    @scala.inline
    def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
    
    @scala.inline
    def setLoginStyle(value: String): Self = StObject.set(x, "loginStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginStyleUndefined: Self = StObject.set(x, "loginStyle", js.undefined)
    
    @scala.inline
    def setLoginUrlParameters(value: js.Object): Self = StObject.set(x, "loginUrlParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginUrlParametersUndefined: Self = StObject.set(x, "loginUrlParameters", js.undefined)
    
    @scala.inline
    def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
    
    @scala.inline
    def setRequestOfflineToken(value: Boolean): Self = StObject.set(x, "requestOfflineToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOfflineTokenUndefined: Self = StObject.set(x, "requestOfflineToken", js.undefined)
    
    @scala.inline
    def setRequestPermissions(value: js.Array[String]): Self = StObject.set(x, "requestPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPermissionsUndefined: Self = StObject.set(x, "requestPermissions", js.undefined)
    
    @scala.inline
    def setRequestPermissionsVarargs(value: String*): Self = StObject.set(x, "requestPermissions", js.Array(value :_*))
  }
}
