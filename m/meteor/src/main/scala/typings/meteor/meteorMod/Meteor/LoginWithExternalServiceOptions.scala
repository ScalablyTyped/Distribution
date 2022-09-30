package typings.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Login **/
trait LoginWithExternalServiceOptions extends StObject {
  
  var forceApprovalPrompt: js.UndefOr[Boolean] = js.undefined
  
  var loginHint: js.UndefOr[String] = js.undefined
  
  var loginStyle: js.UndefOr[String] = js.undefined
  
  var loginUrlParameters: js.UndefOr[js.Object] = js.undefined
  
  var redirectUrl: js.UndefOr[String] = js.undefined
  
  var requestOfflineToken: js.UndefOr[Boolean] = js.undefined
  
  var requestPermissions: js.UndefOr[js.Array[String]] = js.undefined
}
object LoginWithExternalServiceOptions {
  
  inline def apply(): LoginWithExternalServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginWithExternalServiceOptions]
  }
  
  extension [Self <: LoginWithExternalServiceOptions](x: Self) {
    
    inline def setForceApprovalPrompt(value: Boolean): Self = StObject.set(x, "forceApprovalPrompt", value.asInstanceOf[js.Any])
    
    inline def setForceApprovalPromptUndefined: Self = StObject.set(x, "forceApprovalPrompt", js.undefined)
    
    inline def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
    
    inline def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
    
    inline def setLoginStyle(value: String): Self = StObject.set(x, "loginStyle", value.asInstanceOf[js.Any])
    
    inline def setLoginStyleUndefined: Self = StObject.set(x, "loginStyle", js.undefined)
    
    inline def setLoginUrlParameters(value: js.Object): Self = StObject.set(x, "loginUrlParameters", value.asInstanceOf[js.Any])
    
    inline def setLoginUrlParametersUndefined: Self = StObject.set(x, "loginUrlParameters", js.undefined)
    
    inline def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
    
    inline def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
    
    inline def setRequestOfflineToken(value: Boolean): Self = StObject.set(x, "requestOfflineToken", value.asInstanceOf[js.Any])
    
    inline def setRequestOfflineTokenUndefined: Self = StObject.set(x, "requestOfflineToken", js.undefined)
    
    inline def setRequestPermissions(value: js.Array[String]): Self = StObject.set(x, "requestPermissions", value.asInstanceOf[js.Any])
    
    inline def setRequestPermissionsUndefined: Self = StObject.set(x, "requestPermissions", js.undefined)
    
    inline def setRequestPermissionsVarargs(value: String*): Self = StObject.set(x, "requestPermissions", js.Array(value*))
  }
}
