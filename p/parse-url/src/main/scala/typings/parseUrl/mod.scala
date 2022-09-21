package typings.parseUrl

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): ParsedUrl = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[ParsedUrl]
  inline def apply(url: String, normalize: js.Object): ParsedUrl = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any])).asInstanceOf[ParsedUrl]
  inline def apply(url: String, normalize: Boolean): ParsedUrl = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any])).asInstanceOf[ParsedUrl]
  
  @JSImport("parse-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ParsedUrl extends StObject {
    
    var hash: String
    
    var href: String
    
    var pathname: String
    
    var port: js.UndefOr[String] = js.undefined
    
    var protocol: String
    
    var protocols: js.Array[String]
    
    var query: StringDictionary[Any]
    
    var resource: String
    
    var search: String
    
    var user: String
  }
  object ParsedUrl {
    
    inline def apply(
      hash: String,
      href: String,
      pathname: String,
      protocol: String,
      protocols: js.Array[String],
      query: StringDictionary[Any],
      resource: String,
      search: String,
      user: String
    ): ParsedUrl = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedUrl]
    }
    
    extension [Self <: ParsedUrl](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setQuery(value: StringDictionary[Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
