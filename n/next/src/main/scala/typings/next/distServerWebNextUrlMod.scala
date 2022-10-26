package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.I18n
import typings.next.distServerConfigSharedMod.DomainLocale
import typings.std.URL
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebNextUrlMod {
  
  @JSImport("next/dist/server/web/next-url", "NextURL")
  @js.native
  open class NextURL protected () extends StObject {
    def this(input: String) = this()
    def this(input: URL) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: URL) = this()
    def this(input: String, opts: Options) = this()
    def this(input: URL, base: String) = this()
    def this(input: URL, base: URL) = this()
    def this(input: URL, opts: Options) = this()
    def this(input: String, base: String, opts: Options) = this()
    def this(input: String, base: Unit, opts: Options) = this()
    def this(input: String, base: URL, opts: Options) = this()
    def this(input: URL, base: String, opts: Options) = this()
    def this(input: URL, base: Unit, opts: Options) = this()
    def this(input: URL, base: URL, opts: Options) = this()
    
    /* private */ var analyzeUrl: Any = js.native
    
    def basePath: String = js.native
    def basePath_=(value: String): Unit = js.native
    
    def buildId: js.UndefOr[String] = js.native
    def buildId_=(buildId: js.UndefOr[String]): Unit = js.native
    
    def defaultLocale: js.UndefOr[String] = js.native
    
    def domainLocale: js.UndefOr[DomainLocale] = js.native
    
    /* private */ var formatPathname: Any = js.native
    
    /* private */ var formatSearch: Any = js.native
    
    def hash: String = js.native
    def hash_=(value: String): Unit = js.native
    
    def host: String = js.native
    def host_=(value: String): Unit = js.native
    
    def hostname: String = js.native
    def hostname_=(value: String): Unit = js.native
    
    def href: String = js.native
    def href_=(url: String): Unit = js.native
    
    def locale: String = js.native
    def locale_=(locale: String): Unit = js.native
    
    def origin: String = js.native
    
    def password: String = js.native
    def password_=(value: String): Unit = js.native
    
    def pathname: String = js.native
    def pathname_=(value: String): Unit = js.native
    
    def port: String = js.native
    def port_=(value: String): Unit = js.native
    
    def protocol: String = js.native
    def protocol_=(value: String): Unit = js.native
    
    def search: String = js.native
    
    def searchParams: URLSearchParams = js.native
    
    def search_=(value: String): Unit = js.native
    
    def toJSON(): String = js.native
    
    def username: String = js.native
    def username_=(value: String): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var base: js.UndefOr[String | URL] = js.undefined
    
    var forceLocale: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[js.UndefOr[String | js.Array[String]]]] = js.undefined
    
    var nextConfig: js.UndefOr[I18n] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBase(value: String | URL): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setForceLocale(value: Boolean): Self = StObject.set(x, "forceLocale", value.asInstanceOf[js.Any])
      
      inline def setForceLocaleUndefined: Self = StObject.set(x, "forceLocale", js.undefined)
      
      inline def setHeaders(value: StringDictionary[js.UndefOr[String | js.Array[String]]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setNextConfig(value: I18n): Self = StObject.set(x, "nextConfig", value.asInstanceOf[js.Any])
      
      inline def setNextConfigUndefined: Self = StObject.set(x, "nextConfig", js.undefined)
    }
  }
}
