package typings.next.anon

import typings.next.distServerRequestMetaMod.NextParsedUrlQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsAppPath extends StObject {
  
  var appPaths: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var isAppPath: Boolean
  
  var params: typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params
  
  var pathname: String
  
  var query: NextParsedUrlQuery
  
  var sriEnabled: js.UndefOr[Boolean] = js.undefined
}
object IsAppPath {
  
  inline def apply(
    isAppPath: Boolean,
    params: typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params,
    pathname: String,
    query: NextParsedUrlQuery
  ): IsAppPath = {
    val __obj = js.Dynamic.literal(isAppPath = isAppPath.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAppPath]
  }
  
  extension [Self <: IsAppPath](x: Self) {
    
    inline def setAppPaths(value: js.Array[String]): Self = StObject.set(x, "appPaths", value.asInstanceOf[js.Any])
    
    inline def setAppPathsNull: Self = StObject.set(x, "appPaths", null)
    
    inline def setAppPathsUndefined: Self = StObject.set(x, "appPaths", js.undefined)
    
    inline def setAppPathsVarargs(value: String*): Self = StObject.set(x, "appPaths", js.Array(value*))
    
    inline def setIsAppPath(value: Boolean): Self = StObject.set(x, "isAppPath", value.asInstanceOf[js.Any])
    
    inline def setParams(value: typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: NextParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setSriEnabled(value: Boolean): Self = StObject.set(x, "sriEnabled", value.asInstanceOf[js.Any])
    
    inline def setSriEnabledUndefined: Self = StObject.set(x, "sriEnabled", js.undefined)
  }
}
