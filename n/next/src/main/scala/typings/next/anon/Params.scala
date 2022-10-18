package typings.next.anon

import typings.next.distServerBaseHttpMod.BaseNextRequest
import typings.next.distServerBaseHttpMod.BaseNextResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params extends StObject {
  
  var appPaths: js.Array[String] | Null
  
  var isAppPath: Boolean
  
  var page: String
  
  var params: js.UndefOr[typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params] = js.undefined
  
  var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  
  var req: BaseNextRequest[Any]
  
  var res: BaseNextResponse[Any]
}
object Params {
  
  inline def apply(
    isAppPath: Boolean,
    page: String,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
    req: BaseNextRequest[Any],
    res: BaseNextResponse[Any]
  ): Params = {
    val __obj = js.Dynamic.literal(isAppPath = isAppPath.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], appPaths = null)
    __obj.asInstanceOf[Params]
  }
  
  extension [Self <: Params](x: Self) {
    
    inline def setAppPaths(value: js.Array[String]): Self = StObject.set(x, "appPaths", value.asInstanceOf[js.Any])
    
    inline def setAppPathsNull: Self = StObject.set(x, "appPaths", null)
    
    inline def setAppPathsVarargs(value: String*): Self = StObject.set(x, "appPaths", js.Array(value*))
    
    inline def setIsAppPath(value: Boolean): Self = StObject.set(x, "isAppPath", value.asInstanceOf[js.Any])
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setParams(value: typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setQuery(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReq(value: BaseNextRequest[Any]): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setRes(value: BaseNextResponse[Any]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
