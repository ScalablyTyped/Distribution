package typings.pinterestSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait HttpMethod extends StObject
  @JSImport("pinterest-sdk", "HttpMethod")
  @js.native
  object HttpMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HttpMethod with Double] = js.native
    
    @js.native
    sealed trait delete extends HttpMethod
    /* 3 */ val delete: typings.pinterestSdk.mod.HttpMethod.delete with Double = js.native
    
    @js.native
    sealed trait get extends HttpMethod
    /* 0 */ val get: typings.pinterestSdk.mod.HttpMethod.get with Double = js.native
    
    @js.native
    sealed trait post extends HttpMethod
    /* 2 */ val post: typings.pinterestSdk.mod.HttpMethod.post with Double = js.native
    
    @js.native
    sealed trait put extends HttpMethod
    /* 1 */ val put: typings.pinterestSdk.mod.HttpMethod.put with Double = js.native
  }
  
  @js.native
  sealed trait OAuthScopes extends StObject
  @JSImport("pinterest-sdk", "OAuthScopes")
  @js.native
  object OAuthScopes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OAuthScopes with Double] = js.native
    
    @js.native
    sealed trait read_public extends OAuthScopes
    /* 0 */ val read_public: typings.pinterestSdk.mod.OAuthScopes.read_public with Double = js.native
    
    @js.native
    sealed trait read_relationships extends OAuthScopes
    /* 2 */ val read_relationships: typings.pinterestSdk.mod.OAuthScopes.read_relationships with Double = js.native
    
    @js.native
    sealed trait write_public extends OAuthScopes
    /* 1 */ val write_public: typings.pinterestSdk.mod.OAuthScopes.write_public with Double = js.native
    
    @js.native
    sealed trait write_relationships extends OAuthScopes
    /* 3 */ val write_relationships: typings.pinterestSdk.mod.OAuthScopes.write_relationships with Double = js.native
  }
  
  @JSImport("pinterest-sdk", "getSession")
  @js.native
  def getSession(): OauthSession = js.native
  
  @JSImport("pinterest-sdk", "init")
  @js.native
  def init(options: InitOptions): Unit = js.native
  
  @JSImport("pinterest-sdk", "login")
  @js.native
  def login(options: LoginOptions, callback: js.Function): Unit = js.native
  
  @JSImport("pinterest-sdk", "logout")
  @js.native
  def logout(): Unit = js.native
  @JSImport("pinterest-sdk", "logout")
  @js.native
  def logout(callback: js.Function1[/* session */ OauthSession, _]): Unit = js.native
  
  @JSImport("pinterest-sdk", "me")
  @js.native
  def me(callback: js.Function): Unit = js.native
  @JSImport("pinterest-sdk", "me")
  @js.native
  def me(path: String, callback: js.Function): Unit = js.native
  @JSImport("pinterest-sdk", "me")
  @js.native
  def me(path: String, params: js.Object, callback: js.Function): Unit = js.native
  
  @JSImport("pinterest-sdk", "pin")
  @js.native
  def pin(imageUrl: String, note: String, url: String, callback: js.Function): Unit = js.native
  
  @JSImport("pinterest-sdk", "request")
  @js.native
  def request(path: String): Unit = js.native
  @JSImport("pinterest-sdk", "request")
  @js.native
  def request(
    path: String,
    httpMethod: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Unit = js.native
  @JSImport("pinterest-sdk", "request")
  @js.native
  def request(path: String, httpMethod: js.UndefOr[scala.Nothing], data: PinData): Unit = js.native
  @JSImport("pinterest-sdk", "request")
  @js.native
  def request(path: String, httpMethod: js.UndefOr[scala.Nothing], data: PinData, callback: js.Function): Unit = js.native
  @JSImport("pinterest-sdk", "request")
  @js.native
  def request(path: String, httpMethod: String): Unit = js.native
  @JSImport("pinterest-sdk", "request")
  @js.native
  def request(path: String, httpMethod: String, data: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  @JSImport("pinterest-sdk", "request")
  @js.native
  def request(path: String, httpMethod: String, data: PinData): Unit = js.native
  @JSImport("pinterest-sdk", "request")
  @js.native
  def request(path: String, httpMethod: String, data: PinData, callback: js.Function): Unit = js.native
  @JSImport("pinterest-sdk", "request")
  @js.native
  def request(path: String, httpMethod: HttpMethod): Unit = js.native
  @JSImport("pinterest-sdk", "request")
  @js.native
  def request(path: String, httpMethod: HttpMethod, data: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  @JSImport("pinterest-sdk", "request")
  @js.native
  def request(path: String, httpMethod: HttpMethod, data: PinData): Unit = js.native
  @JSImport("pinterest-sdk", "request")
  @js.native
  def request(path: String, httpMethod: HttpMethod, data: PinData, callback: js.Function): Unit = js.native
  
  @JSImport("pinterest-sdk", "setSession")
  @js.native
  def setSession(session: OauthSession): Unit = js.native
  @JSImport("pinterest-sdk", "setSession")
  @js.native
  def setSession(session: OauthSession, callback: js.Function1[/* session */ OauthSession, _]): Unit = js.native
  
  @js.native
  trait InitOptions extends StObject {
    
    /** Your application ID from developer.pinterest.com */
    var appId: js.UndefOr[String] = js.native
    
    var cookie: js.UndefOr[Boolean] = js.native
    
    var logging: js.UndefOr[Boolean] = js.native
    
    var session: js.UndefOr[OauthSession] = js.native
  }
  object InitOptions {
    
    @scala.inline
    def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    @scala.inline
    implicit class InitOptionsMutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      @scala.inline
      def setCookie(value: Boolean): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setSession(value: OauthSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    }
  }
  
  @js.native
  trait LoginOptions extends StObject {
    
    var appId: js.UndefOr[String] = js.native
    
    var cookie: js.UndefOr[Boolean] = js.native
    
    var logging: js.UndefOr[Boolean] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var scope: String | OAuthScopes = js.native
    
    var session: js.UndefOr[OauthSession] = js.native
  }
  object LoginOptions {
    
    @scala.inline
    def apply(scope: String | OAuthScopes): LoginOptions = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginOptions]
    }
    
    @scala.inline
    implicit class LoginOptionsMutableBuilder[Self <: LoginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      @scala.inline
      def setCookie(value: Boolean): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setScope(value: String | OAuthScopes): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: OauthSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    }
  }
  
  @js.native
  trait OAuthRequestParams extends StObject {
    
    var accessToken: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
  }
  object OAuthRequestParams {
    
    @scala.inline
    def apply(): OAuthRequestParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OAuthRequestParams]
    }
    
    @scala.inline
    implicit class OAuthRequestParamsMutableBuilder[Self <: OAuthRequestParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  @js.native
  trait OauthSession extends StObject {
    
    var accessToken: js.UndefOr[String] = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[String] = js.native
  }
  object OauthSession {
    
    @scala.inline
    def apply(): OauthSession = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OauthSession]
    }
    
    @scala.inline
    implicit class OauthSessionMutableBuilder[Self <: OauthSession] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  @js.native
  trait PinData extends StObject {
    
    var board: String = js.native
    
    var image_url: String = js.native
    
    var link: String = js.native
    
    var note: String = js.native
  }
  object PinData {
    
    @scala.inline
    def apply(board: String, image_url: String, link: String, note: String): PinData = {
      val __obj = js.Dynamic.literal(board = board.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinData]
    }
    
    @scala.inline
    implicit class PinDataMutableBuilder[Self <: PinData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoard(value: String): Self = StObject.set(x, "board", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    }
  }
}
