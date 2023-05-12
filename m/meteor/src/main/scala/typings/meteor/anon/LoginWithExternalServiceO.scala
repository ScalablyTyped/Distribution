package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined meteor.Meteor.LoginWithExternalServiceOptions & {  loginUrlParameters :{  include_granted_scopes :boolean} | undefined} */
trait LoginWithExternalServiceO extends StObject {
  
  var forceApprovalPrompt: js.UndefOr[Boolean] = js.undefined
  
  var loginHint: js.UndefOr[String] = js.undefined
  
  var loginStyle: js.UndefOr[String] = js.undefined
  
  /** Google login accepts additional login parameters based on
    * https://developers.google.com/identity/openid-connect/openid-connect#authenticationuriparameters.
    * However, there's only one parameter that must be set
    * directly; all others can be set using Meteor's standard OAuth
    * login parameters */
  var loginUrlParameters: js.UndefOr[Includegrantedscopes] = js.undefined
  
  var redirectUrl: js.UndefOr[String] = js.undefined
  
  var requestOfflineToken: js.UndefOr[Boolean] = js.undefined
  
  var requestPermissions: js.UndefOr[js.Array[String]] = js.undefined
}
object LoginWithExternalServiceO {
  
  inline def apply(): LoginWithExternalServiceO = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginWithExternalServiceO]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginWithExternalServiceO] (val x: Self) extends AnyVal {
    
    inline def setForceApprovalPrompt(value: Boolean): Self = StObject.set(x, "forceApprovalPrompt", value.asInstanceOf[js.Any])
    
    inline def setForceApprovalPromptUndefined: Self = StObject.set(x, "forceApprovalPrompt", js.undefined)
    
    inline def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
    
    inline def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
    
    inline def setLoginStyle(value: String): Self = StObject.set(x, "loginStyle", value.asInstanceOf[js.Any])
    
    inline def setLoginStyleUndefined: Self = StObject.set(x, "loginStyle", js.undefined)
    
    inline def setLoginUrlParameters(value: Includegrantedscopes): Self = StObject.set(x, "loginUrlParameters", value.asInstanceOf[js.Any])
    
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
