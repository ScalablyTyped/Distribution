package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsParseUrlMod {
  
  @JSImport("next/dist/shared/lib/router/utils/parse-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseUrl(url: String): ParsedUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[ParsedUrl]
  
  trait ParsedUrl extends StObject {
    
    var hash: String
    
    var hostname: js.UndefOr[String | Null] = js.undefined
    
    var href: String
    
    var pathname: String
    
    var port: js.UndefOr[String | Null] = js.undefined
    
    var protocol: js.UndefOr[String | Null] = js.undefined
    
    var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    
    var search: String
  }
  object ParsedUrl {
    
    inline def apply(
      hash: String,
      href: String,
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      search: String
    ): ParsedUrl = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedUrl]
    }
    
    extension [Self <: ParsedUrl](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortNull: Self = StObject.set(x, "port", null)
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setQuery(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
}
