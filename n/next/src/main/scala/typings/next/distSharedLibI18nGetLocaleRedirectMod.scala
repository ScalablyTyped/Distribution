package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.HostnamePathname
import typings.next.anon.I18n
import typings.next.distServerConfigSharedMod.DomainLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibI18nGetLocaleRedirectMod {
  
  @JSImport("next/dist/shared/lib/i18n/get-locale-redirect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLocaleRedirect(param0: Options): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleRedirect")(param0.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  trait Options extends StObject {
    
    var defaultLocale: String
    
    var domainLocale: js.UndefOr[DomainLocale] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[js.UndefOr[String | js.Array[String]]]] = js.undefined
    
    var nextConfig: I18n
    
    var pathLocale: js.UndefOr[String] = js.undefined
    
    var urlParsed: HostnamePathname
  }
  object Options {
    
    inline def apply(defaultLocale: String, nextConfig: I18n, urlParsed: HostnamePathname): Options = {
      val __obj = js.Dynamic.literal(defaultLocale = defaultLocale.asInstanceOf[js.Any], nextConfig = nextConfig.asInstanceOf[js.Any], urlParsed = urlParsed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDomainLocale(value: DomainLocale): Self = StObject.set(x, "domainLocale", value.asInstanceOf[js.Any])
      
      inline def setDomainLocaleUndefined: Self = StObject.set(x, "domainLocale", js.undefined)
      
      inline def setHeaders(value: StringDictionary[js.UndefOr[String | js.Array[String]]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setNextConfig(value: I18n): Self = StObject.set(x, "nextConfig", value.asInstanceOf[js.Any])
      
      inline def setPathLocale(value: String): Self = StObject.set(x, "pathLocale", value.asInstanceOf[js.Any])
      
      inline def setPathLocaleUndefined: Self = StObject.set(x, "pathLocale", js.undefined)
      
      inline def setUrlParsed(value: HostnamePathname): Self = StObject.set(x, "urlParsed", value.asInstanceOf[js.Any])
    }
  }
}
