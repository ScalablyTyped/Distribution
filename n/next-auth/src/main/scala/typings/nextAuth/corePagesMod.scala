package typings.nextAuth

import typings.nextAuth.anon.Signin
import typings.nextAuth.coreLibCookieMod.Cookie
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corePagesMod {
  
  @JSImport("next-auth/core/pages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: RenderPageParams): Signin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[Signin]
  
  /* Inlined {  query :next-auth.next-auth/core.RequestInternal['query'] | undefined,   cookies :std.Array<next-auth.next-auth/core/lib/cookie.Cookie> | undefined} & std.Partial<std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions * / any, 'url' | 'callbackUrl' | 'csrfToken' | 'providers' | 'theme'>> */
  trait RenderPageParams extends StObject {
    
    var callbackUrl: js.UndefOr[Any] = js.undefined
    
    var cookies: js.UndefOr[js.Array[Cookie]] = js.undefined
    
    var csrfToken: js.UndefOr[Any] = js.undefined
    
    var providers: js.UndefOr[Any] = js.undefined
    
    var query: js.UndefOr[Record[String, Any]] = js.undefined
    
    var theme: js.UndefOr[Any] = js.undefined
    
    var url: js.UndefOr[Any] = js.undefined
  }
  object RenderPageParams {
    
    inline def apply(): RenderPageParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderPageParams]
    }
    
    extension [Self <: RenderPageParams](x: Self) {
      
      inline def setCallbackUrl(value: Any): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setCookies(value: js.Array[Cookie]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setCookiesVarargs(value: Cookie*): Self = StObject.set(x, "cookies", js.Array(value*))
      
      inline def setCsrfToken(value: Any): Self = StObject.set(x, "csrfToken", value.asInstanceOf[js.Any])
      
      inline def setCsrfTokenUndefined: Self = StObject.set(x, "csrfToken", js.undefined)
      
      inline def setProviders(value: Any): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
      
      inline def setQuery(value: Record[String, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setTheme(value: Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUrl(value: Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
