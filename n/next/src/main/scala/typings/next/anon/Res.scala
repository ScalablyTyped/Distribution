package typings.next.anon

import typings.next.distServerBaseHttpMod.BaseNextRequest
import typings.next.distServerBaseHttpMod.BaseNextResponse
import typings.next.distServerBaseHttpNodeMod.NodeNextRequest
import typings.next.distServerBaseHttpNodeMod.NodeNextResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Res extends StObject {
  
  var appPaths: js.Array[String] | Null
  
  var onWarning: js.UndefOr[js.Function1[/* warning */ js.Error, Unit]] = js.undefined
  
  var page: String
  
  var params: js.UndefOr[typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params] = js.undefined
  
  var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  
  var req: BaseNextRequest[Any] | NodeNextRequest
  
  var res: BaseNextResponse[Any] | NodeNextResponse
}
object Res {
  
  inline def apply(
    page: String,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
    req: BaseNextRequest[Any] | NodeNextRequest,
    res: BaseNextResponse[Any] | NodeNextResponse
  ): Res = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], appPaths = null)
    __obj.asInstanceOf[Res]
  }
  
  extension [Self <: Res](x: Self) {
    
    inline def setAppPaths(value: js.Array[String]): Self = StObject.set(x, "appPaths", value.asInstanceOf[js.Any])
    
    inline def setAppPathsNull: Self = StObject.set(x, "appPaths", null)
    
    inline def setAppPathsVarargs(value: String*): Self = StObject.set(x, "appPaths", js.Array(value*))
    
    inline def setOnWarning(value: /* warning */ js.Error => Unit): Self = StObject.set(x, "onWarning", js.Any.fromFunction1(value))
    
    inline def setOnWarningUndefined: Self = StObject.set(x, "onWarning", js.undefined)
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setParams(value: typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setQuery(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReq(value: BaseNextRequest[Any] | NodeNextRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setRes(value: BaseNextResponse[Any] | NodeNextResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
