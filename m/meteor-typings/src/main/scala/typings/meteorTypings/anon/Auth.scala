package typings.meteorTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth extends StObject {
  
  var auth: js.UndefOr[String] = js.undefined
  
  var beforeSend: js.UndefOr[js.Function] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[js.Object] = js.undefined
  
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var npmRequestOptions: js.UndefOr[js.Object] = js.undefined
  
  var params: js.UndefOr[js.Object] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object Auth {
  
  @scala.inline
  def apply(): Auth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth]
  }
  
  @scala.inline
  implicit class AuthMutableBuilder[Self <: Auth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBeforeSend(value: js.Function): Self = StObject.set(x, "beforeSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setNpmRequestOptions(value: js.Object): Self = StObject.set(x, "npmRequestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNpmRequestOptionsUndefined: Self = StObject.set(x, "npmRequestOptions", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
