package typings.next.anon

import typings.next.serverRouterMod.DynamicRoutes
import typings.next.serverRouterMod.PageChecker
import typings.next.serverRouterMod.Route_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasePath extends StObject {
  
  var basePath: String
  
  var catchAllRoute: Route_
  
  var dynamicRoutes: js.UndefOr[DynamicRoutes] = js.undefined
  
  var fsRoutes: js.Array[Route_]
  
  var headers: js.Array[Route_]
  
  var locales: js.Array[String]
  
  var pageChecker: PageChecker
  
  var redirects: js.Array[Route_]
  
  var rewrites: js.Array[Route_]
  
  var useFileSystemPublicRoutes: Boolean
}
object BasePath {
  
  @scala.inline
  def apply(
    basePath: String,
    catchAllRoute: Route_,
    fsRoutes: js.Array[Route_],
    headers: js.Array[Route_],
    locales: js.Array[String],
    pageChecker: /* pathname */ String => js.Promise[Boolean],
    redirects: js.Array[Route_],
    rewrites: js.Array[Route_],
    useFileSystemPublicRoutes: Boolean
  ): BasePath = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], catchAllRoute = catchAllRoute.asInstanceOf[js.Any], fsRoutes = fsRoutes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], pageChecker = js.Any.fromFunction1(pageChecker), redirects = redirects.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any], useFileSystemPublicRoutes = useFileSystemPublicRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePath]
  }
  
  @scala.inline
  implicit class BasePathMutableBuilder[Self <: BasePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatchAllRoute(value: Route_): Self = StObject.set(x, "catchAllRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRoutes(value: DynamicRoutes): Self = StObject.set(x, "dynamicRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRoutesUndefined: Self = StObject.set(x, "dynamicRoutes", js.undefined)
    
    @scala.inline
    def setDynamicRoutesVarargs(value: Match*): Self = StObject.set(x, "dynamicRoutes", js.Array(value :_*))
    
    @scala.inline
    def setFsRoutes(value: js.Array[Route_]): Self = StObject.set(x, "fsRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsRoutesVarargs(value: Route_ *): Self = StObject.set(x, "fsRoutes", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[Route_]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: Route_ *): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
    
    @scala.inline
    def setPageChecker(value: /* pathname */ String => js.Promise[Boolean]): Self = StObject.set(x, "pageChecker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRedirects(value: js.Array[Route_]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectsVarargs(value: Route_ *): Self = StObject.set(x, "redirects", js.Array(value :_*))
    
    @scala.inline
    def setRewrites(value: js.Array[Route_]): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewritesVarargs(value: Route_ *): Self = StObject.set(x, "rewrites", js.Array(value :_*))
    
    @scala.inline
    def setUseFileSystemPublicRoutes(value: Boolean): Self = StObject.set(x, "useFileSystemPublicRoutes", value.asInstanceOf[js.Any])
  }
}
