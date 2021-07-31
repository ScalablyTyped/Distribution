package typings.oauth2Implicit

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("oauth2-implicit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def finish(): js.UndefOr[AuthResult | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("finish")().asInstanceOf[js.UndefOr[AuthResult | Null]]
  
  @scala.inline
  def parseCredentials(hashString: String): AuthParams = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCredentials")(hashString.asInstanceOf[js.Any]).asInstanceOf[AuthParams]
  
  object run {
    
    @scala.inline
    def apply(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSImport("oauth2-implicit", "run")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def finish(): js.UndefOr[AuthResult | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("finish")().asInstanceOf[js.UndefOr[AuthResult | Null]]
    
    @scala.inline
    def parseCredentials(hashString: String): AuthParams = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCredentials")(hashString.asInstanceOf[js.Any]).asInstanceOf[AuthParams]
    
    @scala.inline
    def start(options: AuthParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @scala.inline
  def start(options: AuthParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait AuthParams extends StObject {
    
    var auth_uri: String
    
    var client_id: String
    
    var redirect_uri: String
    
    var scope: js.UndefOr[js.Array[String]] = js.undefined
    
    var state: AuthState
  }
  object AuthParams {
    
    @scala.inline
    def apply(auth_uri: String, client_id: String, redirect_uri: String, state: AuthState): AuthParams = {
      val __obj = js.Dynamic.literal(auth_uri = auth_uri.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], redirect_uri = redirect_uri.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthParams]
    }
    
    @scala.inline
    implicit class AuthParamsMutableBuilder[Self <: AuthParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth_uri(value: String): Self = StObject.set(x, "auth_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
      
      @scala.inline
      def setState(value: AuthState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthResult extends StObject {
    
    var accessToken: String
    
    var state: AuthState
  }
  object AuthResult {
    
    @scala.inline
    def apply(accessToken: String, state: AuthState): AuthResult = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthResult]
    }
    
    @scala.inline
    implicit class AuthResultMutableBuilder[Self <: AuthResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: AuthState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthState
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var originalUrl: String
  }
  object AuthState {
    
    @scala.inline
    def apply(originalUrl: String): AuthState = {
      val __obj = js.Dynamic.literal(originalUrl = originalUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthState]
    }
    
    @scala.inline
    implicit class AuthStateMutableBuilder[Self <: AuthState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
    }
  }
}
