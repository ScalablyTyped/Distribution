package typings.next

import typings.next.anon.BasePathI18n
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsGetNextPathnameInfoMod {
  
  @JSImport("next/dist/shared/lib/router/utils/get-next-pathname-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNextPathnameInfo(pathname: String, options: Options): NextPathnameInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextPathnameInfo")(pathname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NextPathnameInfo]
  
  trait NextPathnameInfo extends StObject {
    
    /**
      * The base path in case the pathname included it.
      */
    var basePath: js.UndefOr[String] = js.undefined
    
    /**
      * The buildId for when the parsed URL is a data URL. Parsing it can be
      * disabled with the `parseData` option.
      */
    var buildId: js.UndefOr[String] = js.undefined
    
    /**
      * If there was a locale in the pathname, this will hold its value.
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /**
      * The processed pathname without a base path, locale, or data URL elements
      * when parsing it is enabled.
      */
    var pathname: String
    
    /**
      * A boolean telling if the pathname had a trailingSlash. This can be only
      * true if trailingSlash is enabled.
      */
    var trailingSlash: js.UndefOr[Boolean] = js.undefined
  }
  object NextPathnameInfo {
    
    inline def apply(pathname: String): NextPathnameInfo = {
      val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextPathnameInfo]
    }
    
    extension [Self <: NextPathnameInfo](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      inline def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setTrailingSlash(value: Boolean): Self = StObject.set(x, "trailingSlash", value.asInstanceOf[js.Any])
      
      inline def setTrailingSlashUndefined: Self = StObject.set(x, "trailingSlash", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * A partial of the Next.js configuration to parse the URL.
      */
    var nextConfig: js.UndefOr[BasePathI18n] = js.undefined
    
    /**
      * When passed to true, this function will also parse Nextjs data URLs.
      */
    var parseData: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setNextConfig(value: BasePathI18n): Self = StObject.set(x, "nextConfig", value.asInstanceOf[js.Any])
      
      inline def setNextConfigUndefined: Self = StObject.set(x, "nextConfig", js.undefined)
      
      inline def setParseData(value: Boolean): Self = StObject.set(x, "parseData", value.asInstanceOf[js.Any])
      
      inline def setParseDataUndefined: Self = StObject.set(x, "parseData", js.undefined)
    }
  }
}
