package typings.next.anon

import typings.next.distServerRouterMod.PageChecker
import typings.next.distServerRouterMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatchAllRoute extends StObject {
  
  var catchAllMiddleware: js.Array[Route]
  
  var catchAllRoute: Route
  
  var dynamicRoutes: js.UndefOr[typings.next.distServerRouterMod.DynamicRoutes] = js.undefined
  
  var fsRoutes: js.Array[Route]
  
  var headers: js.Array[Route]
  
  var nextConfig: typings.next.distServerConfigSharedMod.NextConfig
  
  var pageChecker: PageChecker
  
  var redirects: js.Array[Route]
  
  var rewrites: Fallback
  
  var useFileSystemPublicRoutes: Boolean
}
object CatchAllRoute {
  
  inline def apply(
    catchAllMiddleware: js.Array[Route],
    catchAllRoute: Route,
    fsRoutes: js.Array[Route],
    headers: js.Array[Route],
    nextConfig: typings.next.distServerConfigSharedMod.NextConfig,
    pageChecker: /* pathname */ String => js.Promise[Boolean],
    redirects: js.Array[Route],
    rewrites: Fallback,
    useFileSystemPublicRoutes: Boolean
  ): CatchAllRoute = {
    val __obj = js.Dynamic.literal(catchAllMiddleware = catchAllMiddleware.asInstanceOf[js.Any], catchAllRoute = catchAllRoute.asInstanceOf[js.Any], fsRoutes = fsRoutes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], nextConfig = nextConfig.asInstanceOf[js.Any], pageChecker = js.Any.fromFunction1(pageChecker), redirects = redirects.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any], useFileSystemPublicRoutes = useFileSystemPublicRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatchAllRoute]
  }
  
  extension [Self <: CatchAllRoute](x: Self) {
    
    inline def setCatchAllMiddleware(value: js.Array[Route]): Self = StObject.set(x, "catchAllMiddleware", value.asInstanceOf[js.Any])
    
    inline def setCatchAllMiddlewareVarargs(value: Route*): Self = StObject.set(x, "catchAllMiddleware", js.Array(value*))
    
    inline def setCatchAllRoute(value: Route): Self = StObject.set(x, "catchAllRoute", value.asInstanceOf[js.Any])
    
    inline def setDynamicRoutes(value: typings.next.distServerRouterMod.DynamicRoutes): Self = StObject.set(x, "dynamicRoutes", value.asInstanceOf[js.Any])
    
    inline def setDynamicRoutesUndefined: Self = StObject.set(x, "dynamicRoutes", js.undefined)
    
    inline def setDynamicRoutesVarargs(value: Match*): Self = StObject.set(x, "dynamicRoutes", js.Array(value*))
    
    inline def setFsRoutes(value: js.Array[Route]): Self = StObject.set(x, "fsRoutes", value.asInstanceOf[js.Any])
    
    inline def setFsRoutesVarargs(value: Route*): Self = StObject.set(x, "fsRoutes", js.Array(value*))
    
    inline def setHeaders(value: js.Array[Route]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersVarargs(value: Route*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setNextConfig(value: typings.next.distServerConfigSharedMod.NextConfig): Self = StObject.set(x, "nextConfig", value.asInstanceOf[js.Any])
    
    inline def setPageChecker(value: /* pathname */ String => js.Promise[Boolean]): Self = StObject.set(x, "pageChecker", js.Any.fromFunction1(value))
    
    inline def setRedirects(value: js.Array[Route]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
    
    inline def setRedirectsVarargs(value: Route*): Self = StObject.set(x, "redirects", js.Array(value*))
    
    inline def setRewrites(value: Fallback): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
    
    inline def setUseFileSystemPublicRoutes(value: Boolean): Self = StObject.set(x, "useFileSystemPublicRoutes", value.asInstanceOf[js.Any])
  }
}
