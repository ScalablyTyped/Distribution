package typings.meteorTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginStyle extends StObject {
  
  var loginStyle: js.UndefOr[String] = js.undefined
  
  var loginUrlParameters: js.UndefOr[js.Object] = js.undefined
  
  var redirectUrl: js.UndefOr[String] = js.undefined
  
  var requestOfflineToken: js.UndefOr[Boolean] = js.undefined
  
  var requestPermissions: js.UndefOr[js.Array[String]] = js.undefined
  
  var userEmail: js.UndefOr[String] = js.undefined
}
object LoginStyle {
  
  inline def apply(): LoginStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginStyle]
  }
  
  extension [Self <: LoginStyle](x: Self) {
    
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
    
    inline def setRequestPermissionsVarargs(value: String*): Self = StObject.set(x, "requestPermissions", js.Array(value :_*))
    
    inline def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    inline def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
  }
}
