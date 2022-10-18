package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pathname extends StObject {
  
  var appPaths: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var isAppPath: Boolean
  
  var params: typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params
  
  var pathname: String
  
  var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
}
object Pathname {
  
  inline def apply(
    isAppPath: Boolean,
    params: typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params,
    pathname: String,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ): Pathname = {
    val __obj = js.Dynamic.literal(isAppPath = isAppPath.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pathname]
  }
  
  extension [Self <: Pathname](x: Self) {
    
    inline def setAppPaths(value: js.Array[String]): Self = StObject.set(x, "appPaths", value.asInstanceOf[js.Any])
    
    inline def setAppPathsNull: Self = StObject.set(x, "appPaths", null)
    
    inline def setAppPathsUndefined: Self = StObject.set(x, "appPaths", js.undefined)
    
    inline def setAppPathsVarargs(value: String*): Self = StObject.set(x, "appPaths", js.Array(value*))
    
    inline def setIsAppPath(value: Boolean): Self = StObject.set(x, "isAppPath", value.asInstanceOf[js.Any])
    
    inline def setParams(value: typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setQuery(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
