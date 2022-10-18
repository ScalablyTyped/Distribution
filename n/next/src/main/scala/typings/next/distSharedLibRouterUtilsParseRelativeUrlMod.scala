package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsParseRelativeUrlMod {
  
  @JSImport("next/dist/shared/lib/router/utils/parse-relative-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseRelativeUrl(url: String): ParsedRelativeUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRelativeUrl")(url.asInstanceOf[js.Any]).asInstanceOf[ParsedRelativeUrl]
  inline def parseRelativeUrl(url: String, base: String): ParsedRelativeUrl = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRelativeUrl")(url.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[ParsedRelativeUrl]
  
  trait ParsedRelativeUrl extends StObject {
    
    var hash: String
    
    var href: String
    
    var pathname: String
    
    var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    
    var search: String
  }
  object ParsedRelativeUrl {
    
    inline def apply(
      hash: String,
      href: String,
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      search: String
    ): ParsedRelativeUrl = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedRelativeUrl]
    }
    
    extension [Self <: ParsedRelativeUrl](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setQuery(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
}
