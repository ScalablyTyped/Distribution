package typings.pinterestSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pinterest-sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait HttpMethod extends StObject
  @JSImport("pinterest-sdk", "HttpMethod")
  @js.native
  object HttpMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HttpMethod & Double] = js.native
    
    @js.native
    sealed trait delete
      extends StObject
         with HttpMethod
    /* 3 */ val delete: typings.pinterestSdk.mod.HttpMethod.delete & Double = js.native
    
    @js.native
    sealed trait get
      extends StObject
         with HttpMethod
    /* 0 */ val get: typings.pinterestSdk.mod.HttpMethod.get & Double = js.native
    
    @js.native
    sealed trait post
      extends StObject
         with HttpMethod
    /* 2 */ val post: typings.pinterestSdk.mod.HttpMethod.post & Double = js.native
    
    @js.native
    sealed trait put
      extends StObject
         with HttpMethod
    /* 1 */ val put: typings.pinterestSdk.mod.HttpMethod.put & Double = js.native
  }
  
  @js.native
  sealed trait OAuthScopes extends StObject
  @JSImport("pinterest-sdk", "OAuthScopes")
  @js.native
  object OAuthScopes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OAuthScopes & Double] = js.native
    
    @js.native
    sealed trait read_public
      extends StObject
         with OAuthScopes
    /* 0 */ val read_public: typings.pinterestSdk.mod.OAuthScopes.read_public & Double = js.native
    
    @js.native
    sealed trait read_relationships
      extends StObject
         with OAuthScopes
    /* 2 */ val read_relationships: typings.pinterestSdk.mod.OAuthScopes.read_relationships & Double = js.native
    
    @js.native
    sealed trait write_public
      extends StObject
         with OAuthScopes
    /* 1 */ val write_public: typings.pinterestSdk.mod.OAuthScopes.write_public & Double = js.native
    
    @js.native
    sealed trait write_relationships
      extends StObject
         with OAuthScopes
    /* 3 */ val write_relationships: typings.pinterestSdk.mod.OAuthScopes.write_relationships & Double = js.native
  }
  
  inline def getSession(): OauthSession = ^.asInstanceOf[js.Dynamic].applyDynamic("getSession")().asInstanceOf[OauthSession]
  
  inline def init(options: InitOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def login(options: LoginOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("login")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
  inline def logout(callback: js.Function1[/* session */ OauthSession, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def me(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("me")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def me(path: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("me")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def me(path: String, params: js.Object, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("me")(path.asInstanceOf[js.Any], params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pin(imageUrl: String, note: String, url: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pin")(imageUrl.asInstanceOf[js.Any], note.asInstanceOf[js.Any], url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def request(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def request(path: String, httpMethod: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def request(path: String, httpMethod: String, data: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def request(path: String, httpMethod: String, data: PinData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def request(path: String, httpMethod: String, data: PinData, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def request(path: String, httpMethod: Unit, data: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def request(path: String, httpMethod: Unit, data: PinData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def request(path: String, httpMethod: Unit, data: PinData, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def request(path: String, httpMethod: HttpMethod): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def request(path: String, httpMethod: HttpMethod, data: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def request(path: String, httpMethod: HttpMethod, data: PinData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def request(path: String, httpMethod: HttpMethod, data: PinData, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setSession(session: OauthSession): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSession")(session.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setSession(session: OauthSession, callback: js.Function1[/* session */ OauthSession, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSession")(session.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait InitOptions extends StObject {
    
    /** Your application ID from developer.pinterest.com */
    var appId: js.UndefOr[String] = js.undefined
    
    var cookie: js.UndefOr[Boolean] = js.undefined
    
    var logging: js.UndefOr[Boolean] = js.undefined
    
    var session: js.UndefOr[OauthSession] = js.undefined
  }
  object InitOptions {
    
    inline def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    extension [Self <: InitOptions](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      inline def setCookie(value: Boolean): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setSession(value: OauthSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    }
  }
  
  trait LoginOptions extends StObject {
    
    var appId: js.UndefOr[String] = js.undefined
    
    var cookie: js.UndefOr[Boolean] = js.undefined
    
    var logging: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var scope: String | OAuthScopes
    
    var session: js.UndefOr[OauthSession] = js.undefined
  }
  object LoginOptions {
    
    inline def apply(scope: String | OAuthScopes): LoginOptions = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginOptions]
    }
    
    extension [Self <: LoginOptions](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      inline def setCookie(value: Boolean): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setScope(value: String | OAuthScopes): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setSession(value: OauthSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    }
  }
  
  trait OAuthRequestParams extends StObject {
    
    var accessToken: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
  }
  object OAuthRequestParams {
    
    inline def apply(): OAuthRequestParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OAuthRequestParams]
    }
    
    extension [Self <: OAuthRequestParams](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  trait OauthSession extends StObject {
    
    var accessToken: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
  }
  object OauthSession {
    
    inline def apply(): OauthSession = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OauthSession]
    }
    
    extension [Self <: OauthSession](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait PinData extends StObject {
    
    var board: String
    
    var image_url: String
    
    var link: String
    
    var note: String
  }
  object PinData {
    
    inline def apply(board: String, image_url: String, link: String, note: String): PinData = {
      val __obj = js.Dynamic.literal(board = board.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinData]
    }
    
    extension [Self <: PinData](x: Self) {
      
      inline def setBoard(value: String): Self = StObject.set(x, "board", value.asInstanceOf[js.Any])
      
      inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    }
  }
}
