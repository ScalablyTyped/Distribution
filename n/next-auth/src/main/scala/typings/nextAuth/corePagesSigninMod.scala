package typings.nextAuth

import typings.nextAuth.coreTypesMod.Theme
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corePagesSigninMod {
  
  @JSImport("next-auth/core/pages/signin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SignInServerPageParams): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nextAuth.nextAuthStrings.Signin
    - typings.nextAuth.nextAuthStrings.OAuthSignin
    - typings.nextAuth.nextAuthStrings.OAuthCallback
    - typings.nextAuth.nextAuthStrings.OAuthCreateAccount
    - typings.nextAuth.nextAuthStrings.EmailCreateAccount
    - typings.nextAuth.nextAuthStrings.Callback
    - typings.nextAuth.nextAuthStrings.OAuthAccountNotLinked
    - typings.nextAuth.nextAuthStrings.EmailSignin
    - typings.nextAuth.nextAuthStrings.CredentialsSignin
    - typings.nextAuth.nextAuthStrings.SessionRequired
    - typings.nextAuth.nextAuthStrings.default
  */
  trait SignInErrorTypes extends StObject
  object SignInErrorTypes {
    
    inline def default: typings.nextAuth.nextAuthStrings.default = "default".asInstanceOf[typings.nextAuth.nextAuthStrings.default]
    
    inline def Callback: typings.nextAuth.nextAuthStrings.Callback = "Callback".asInstanceOf[typings.nextAuth.nextAuthStrings.Callback]
    
    inline def CredentialsSignin: typings.nextAuth.nextAuthStrings.CredentialsSignin = "CredentialsSignin".asInstanceOf[typings.nextAuth.nextAuthStrings.CredentialsSignin]
    
    inline def EmailCreateAccount: typings.nextAuth.nextAuthStrings.EmailCreateAccount = "EmailCreateAccount".asInstanceOf[typings.nextAuth.nextAuthStrings.EmailCreateAccount]
    
    inline def EmailSignin: typings.nextAuth.nextAuthStrings.EmailSignin = "EmailSignin".asInstanceOf[typings.nextAuth.nextAuthStrings.EmailSignin]
    
    inline def OAuthAccountNotLinked: typings.nextAuth.nextAuthStrings.OAuthAccountNotLinked = "OAuthAccountNotLinked".asInstanceOf[typings.nextAuth.nextAuthStrings.OAuthAccountNotLinked]
    
    inline def OAuthCallback: typings.nextAuth.nextAuthStrings.OAuthCallback = "OAuthCallback".asInstanceOf[typings.nextAuth.nextAuthStrings.OAuthCallback]
    
    inline def OAuthCreateAccount: typings.nextAuth.nextAuthStrings.OAuthCreateAccount = "OAuthCreateAccount".asInstanceOf[typings.nextAuth.nextAuthStrings.OAuthCreateAccount]
    
    inline def OAuthSignin: typings.nextAuth.nextAuthStrings.OAuthSignin = "OAuthSignin".asInstanceOf[typings.nextAuth.nextAuthStrings.OAuthSignin]
    
    inline def SessionRequired: typings.nextAuth.nextAuthStrings.SessionRequired = "SessionRequired".asInstanceOf[typings.nextAuth.nextAuthStrings.SessionRequired]
    
    inline def Signin: typings.nextAuth.nextAuthStrings.Signin = "Signin".asInstanceOf[typings.nextAuth.nextAuthStrings.Signin]
  }
  
  trait SignInServerPageParams extends StObject {
    
    var callbackUrl: String
    
    var csrfToken: String
    
    var email: String
    
    var error: SignInErrorTypes
    
    var providers: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalProvider */ Any
      ]
    
    var theme: Theme
  }
  object SignInServerPageParams {
    
    inline def apply(
      callbackUrl: String,
      csrfToken: String,
      email: String,
      error: SignInErrorTypes,
      providers: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalProvider */ Any
        ],
      theme: Theme
    ): SignInServerPageParams = {
      val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], csrfToken = csrfToken.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignInServerPageParams]
    }
    
    extension [Self <: SignInServerPageParams](x: Self) {
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCsrfToken(value: String): Self = StObject.set(x, "csrfToken", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setError(value: SignInErrorTypes): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setProviders(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalProvider */ Any
            ]
      ): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      inline def setProvidersVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalProvider */ Any)*
      ): Self = StObject.set(x, "providers", js.Array(value*))
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
