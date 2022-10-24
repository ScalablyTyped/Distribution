package typings.nextAuth

import typings.nextAuth.coreTypesMod.Session
import typings.nextAuth.nextAuthBooleans.`false`
import typings.nextAuth.providersMod.BuiltInProviderType
import typings.nextAuth.providersMod.ProviderType
import typings.react.mod.ReactNode
import typings.std.Record
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactTypesMod {
  
  trait ClientSafeProvider extends StObject {
    
    var callbackUrl: String
    
    var id: LiteralUnion[BuiltInProviderType, String]
    
    var name: String
    
    var signinUrl: String
    
    var `type`: ProviderType
  }
  object ClientSafeProvider {
    
    inline def apply(
      callbackUrl: String,
      id: LiteralUnion[BuiltInProviderType, String],
      name: String,
      signinUrl: String,
      `type`: ProviderType
    ): ClientSafeProvider = {
      val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], signinUrl = signinUrl.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientSafeProvider]
    }
    
    extension [Self <: ClientSafeProvider](x: Self) {
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setId(value: LiteralUnion[BuiltInProviderType, String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSigninUrl(value: String): Self = StObject.set(x, "signinUrl", value.asInstanceOf[js.Any])
      
      inline def setType(value: ProviderType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type LiteralUnion[T /* <: U */, U] = T | (U & (Record[scala.Nothing, scala.Nothing]))
  
  trait SessionProviderProps extends StObject {
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var children: ReactNode
    
    /**
      * A time interval (in seconds) after which the session will be re-fetched.
      * If set to `0` (default), the session is not polled.
      */
    var refetchInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * `SessionProvider` automatically refetches the session when the user switches between windows.
      * This option activates this behaviour if set to `true` (default).
      */
    var refetchOnWindowFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `false` to stop polling when the device has no internet access offline (determined by `navigator.onLine`)
      *
      * [`navigator.onLine` documentation](https://developer.mozilla.org/en-US/docs/Web/API/NavigatorOnLine/onLine)
      */
    var refetchWhenOffline: js.UndefOr[`false`] = js.undefined
    
    var session: js.UndefOr[Session | Null] = js.undefined
  }
  object SessionProviderProps {
    
    inline def apply(): SessionProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionProviderProps]
    }
    
    extension [Self <: SessionProviderProps](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setRefetchInterval(value: Double): Self = StObject.set(x, "refetchInterval", value.asInstanceOf[js.Any])
      
      inline def setRefetchIntervalUndefined: Self = StObject.set(x, "refetchInterval", js.undefined)
      
      inline def setRefetchOnWindowFocus(value: Boolean): Self = StObject.set(x, "refetchOnWindowFocus", value.asInstanceOf[js.Any])
      
      inline def setRefetchOnWindowFocusUndefined: Self = StObject.set(x, "refetchOnWindowFocus", js.undefined)
      
      inline def setRefetchWhenOffline(value: `false`): Self = StObject.set(x, "refetchWhenOffline", value.asInstanceOf[js.Any])
      
      inline def setRefetchWhenOfflineUndefined: Self = StObject.set(x, "refetchWhenOffline", js.undefined)
      
      inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionNull: Self = StObject.set(x, "session", null)
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    }
  }
  
  type SignInAuthorizationParams = String | js.Array[js.Array[String]] | (Record[String, String]) | URLSearchParams
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait SignInOptions extends StObject {
    
    /**
      * Specify to which URL the user will be redirected after signing in. Defaults to the page URL the sign-in is initiated from.
      *
      * [Documentation](https://next-auth.js.org/getting-started/client#specifying-a-callbackurl)
      */
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    /** [Documentation](https://next-auth.js.org/getting-started/client#using-the-redirect-false-option) */
    var redirect: js.UndefOr[Boolean] = js.undefined
  }
  object SignInOptions {
    
    inline def apply(): SignInOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignInOptions]
    }
    
    extension [Self <: SignInOptions](x: Self) {
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    }
  }
  
  trait SignInResponse extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var ok: Boolean
    
    var status: Double
    
    var url: String | Null
  }
  object SignInResponse {
    
    inline def apply(ok: Boolean, status: Double): SignInResponse = {
      val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = null)
      __obj.asInstanceOf[SignInResponse]
    }
    
    extension [Self <: SignInResponse](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlNull: Self = StObject.set(x, "url", null)
    }
  }
  
  trait SignOutParams[R /* <: Boolean */] extends StObject {
    
    /** [Documentation](https://next-auth.js.org/getting-started/client#specifying-a-callbackurl-1) */
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    /** [Documentation](https://next-auth.js.org/getting-started/client#using-the-redirect-false-option-1 */
    var redirect: js.UndefOr[R] = js.undefined
  }
  object SignOutParams {
    
    inline def apply[R /* <: Boolean */](): SignOutParams[R] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignOutParams[R]]
    }
    
    extension [Self <: SignOutParams[?], R /* <: Boolean */](x: Self & SignOutParams[R]) {
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setRedirect(value: R): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    }
  }
  
  trait SignOutResponse extends StObject {
    
    var url: String
  }
  object SignOutResponse {
    
    inline def apply(url: String): SignOutResponse = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignOutResponse]
    }
    
    extension [Self <: SignOutResponse](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseSessionOptions[R /* <: Boolean */] extends StObject {
    
    /** Defaults to `signIn` */
    var onUnauthenticated: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var required: R
  }
  object UseSessionOptions {
    
    inline def apply[R /* <: Boolean */](required: R): UseSessionOptions[R] = {
      val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseSessionOptions[R]]
    }
    
    extension [Self <: UseSessionOptions[?], R /* <: Boolean */](x: Self & UseSessionOptions[R]) {
      
      inline def setOnUnauthenticated(value: () => Unit): Self = StObject.set(x, "onUnauthenticated", js.Any.fromFunction0(value))
      
      inline def setOnUnauthenticatedUndefined: Self = StObject.set(x, "onUnauthenticated", js.undefined)
      
      inline def setRequired(value: R): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    }
  }
}
