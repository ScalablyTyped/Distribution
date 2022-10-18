package typings.next.anon

import typings.next.distServerRequestMetaMod.NextParsedUrlQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  var isAppPath: Boolean
  
  var params: typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params | Null
  
  var pathname: String
  
  var query: NextParsedUrlQuery
}
object Query {
  
  inline def apply(isAppPath: Boolean, pathname: String, query: NextParsedUrlQuery): Query = {
    val __obj = js.Dynamic.literal(isAppPath = isAppPath.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], params = null)
    __obj.asInstanceOf[Query]
  }
  
  extension [Self <: Query](x: Self) {
    
    inline def setIsAppPath(value: Boolean): Self = StObject.set(x, "isAppPath", value.asInstanceOf[js.Any])
    
    inline def setParams(value: typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsNull: Self = StObject.set(x, "params", null)
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: NextParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
