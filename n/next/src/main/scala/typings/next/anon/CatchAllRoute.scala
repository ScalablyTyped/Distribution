package typings.next.anon

import typings.next.serverRouterMod.DynamicRoutes
import typings.next.serverRouterMod.PageChecker
import typings.next.serverRouterMod.Route_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatchAllRoute extends js.Object {
  
  var basePath: String = js.native
  
  var catchAllRoute: Route_ = js.native
  
  var dynamicRoutes: js.UndefOr[DynamicRoutes] = js.native
  
  var fsRoutes: js.Array[Route_] = js.native
  
  var headers: js.Array[Route_] = js.native
  
  var locales: js.Array[String] = js.native
  
  var pageChecker: PageChecker = js.native
  
  var redirects: js.Array[Route_] = js.native
  
  var rewrites: js.Array[Route_] = js.native
  
  var useFileSystemPublicRoutes: Boolean = js.native
}
object CatchAllRoute {
  
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
  ): CatchAllRoute = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], catchAllRoute = catchAllRoute.asInstanceOf[js.Any], fsRoutes = fsRoutes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], pageChecker = js.Any.fromFunction1(pageChecker), redirects = redirects.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any], useFileSystemPublicRoutes = useFileSystemPublicRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatchAllRoute]
  }
  
  @scala.inline
  implicit class CatchAllRouteOps[Self <: CatchAllRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatchAllRoute(value: Route_): Self = this.set("catchAllRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsRoutesVarargs(value: Route_ *): Self = this.set("fsRoutes", js.Array(value :_*))
    
    @scala.inline
    def setFsRoutes(value: js.Array[Route_]): Self = this.set("fsRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: Route_ *): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[Route_]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalesVarargs(value: String*): Self = this.set("locales", js.Array(value :_*))
    
    @scala.inline
    def setLocales(value: js.Array[String]): Self = this.set("locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageChecker(value: /* pathname */ String => js.Promise[Boolean]): Self = this.set("pageChecker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRedirectsVarargs(value: Route_ *): Self = this.set("redirects", js.Array(value :_*))
    
    @scala.inline
    def setRedirects(value: js.Array[Route_]): Self = this.set("redirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewritesVarargs(value: Route_ *): Self = this.set("rewrites", js.Array(value :_*))
    
    @scala.inline
    def setRewrites(value: js.Array[Route_]): Self = this.set("rewrites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFileSystemPublicRoutes(value: Boolean): Self = this.set("useFileSystemPublicRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRoutesVarargs(value: Match*): Self = this.set("dynamicRoutes", js.Array(value :_*))
    
    @scala.inline
    def setDynamicRoutes(value: DynamicRoutes): Self = this.set("dynamicRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicRoutes: Self = this.set("dynamicRoutes", js.undefined)
  }
}
