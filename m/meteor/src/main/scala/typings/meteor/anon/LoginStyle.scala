package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginStyle extends StObject {
  
  var loginStyle: js.UndefOr[String] = js.native
  
  var loginUrlParameters: js.UndefOr[js.Object] = js.native
  
  var redirectUrl: js.UndefOr[String] = js.native
  
  var requestOfflineToken: js.UndefOr[Boolean] = js.native
  
  var requestPermissions: js.UndefOr[js.Array[String]] = js.native
  
  var userEmail: js.UndefOr[String] = js.native
}
object LoginStyle {
  
  @scala.inline
  def apply(): LoginStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginStyle]
  }
  
  @scala.inline
  implicit class LoginStyleMutableBuilder[Self <: LoginStyle] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
  }
}
