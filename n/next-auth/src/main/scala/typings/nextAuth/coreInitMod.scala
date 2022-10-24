package typings.nextAuth

import typings.nextAuth.anon.Cookies
import typings.nextAuth.coreTypesMod.NextAuthOptions
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreInitMod {
  
  @JSImport("next-auth/core/init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(param0: InitParams): js.Promise[Cookies] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cookies]]
  
  trait InitParams extends StObject {
    
    var action: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions * / any['action'] */ js.Any
    
    /** Callback URL value extracted from the incoming request. */
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    var cookies: js.UndefOr[Partial[Record[String, String]]] = js.undefined
    
    /** CSRF token value extracted from the incoming request. From body if POST, from query if GET */
    var csrfToken: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    /** Is the incoming request a POST request? */
    var isPost: Boolean
    
    var providerId: js.UndefOr[String] = js.undefined
    
    var userOptions: NextAuthOptions
  }
  object InitParams {
    
    inline def apply(
      action: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions * / any['action'] */ js.Any,
      isPost: Boolean,
      userOptions: NextAuthOptions
    ): InitParams = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], isPost = isPost.asInstanceOf[js.Any], userOptions = userOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitParams]
    }
    
    extension [Self <: InitParams](x: Self) {
      
      inline def setAction(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions * / any['action'] */ js.Any
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setCookies(value: Partial[Record[String, String]]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setCsrfToken(value: String): Self = StObject.set(x, "csrfToken", value.asInstanceOf[js.Any])
      
      inline def setCsrfTokenUndefined: Self = StObject.set(x, "csrfToken", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIsPost(value: Boolean): Self = StObject.set(x, "isPost", value.asInstanceOf[js.Any])
      
      inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
      
      inline def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
      
      inline def setUserOptions(value: NextAuthOptions): Self = StObject.set(x, "userOptions", value.asInstanceOf[js.Any])
    }
  }
}
