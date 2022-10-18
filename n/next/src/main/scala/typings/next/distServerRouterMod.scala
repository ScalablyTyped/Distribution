package typings.next

import typings.next.anon.Match
import typings.next.distLibLoadCustomRoutesMod.RouteHas
import typings.next.distServerBaseHttpMod.BaseNextRequest
import typings.next.distServerBaseHttpMod.BaseNextResponse
import typings.next.distServerRequestMetaMod.NextUrlWithParsedQuery
import typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params
import typings.next.distSharedLibRouterUtilsRouteMatcherMod.RouteMatch
import typings.next.nextBooleans.`true`
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerRouterMod {
  
  @JSImport("next/dist/server/router", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Router {
    def this(hasHeadersFsRoutesRewritesRedirectsCatchAllRouteCatchAllMiddlewareDynamicRoutesPageCheckerUseFileSystemPublicRoutesNextConfig: typings.next.anon.DynamicRoutes) = this()
  }
  
  type DynamicRoutes = js.Array[Match]
  
  type PageChecker = js.Function1[/* pathname */ String, js.Promise[Boolean]]
  
  @js.native
  trait Route extends StObject {
    
    var check: js.UndefOr[Boolean] = js.native
    
    def fn(
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      params: Params,
      parsedUrl: NextUrlWithParsedQuery
    ): js.Promise[RouteResult] | RouteResult = js.native
    def fn(
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      params: Params,
      parsedUrl: NextUrlWithParsedQuery,
      upgradeHead: Buffer
    ): js.Promise[RouteResult] | RouteResult = js.native
    
    var has: js.UndefOr[js.Array[RouteHas]] = js.native
    
    var internal: js.UndefOr[`true`] = js.native
    
    var `match`: RouteMatch = js.native
    
    var matchesBasePath: js.UndefOr[`true`] = js.native
    
    var matchesLocale: js.UndefOr[`true`] = js.native
    
    var matchesLocaleAPIRoutes: js.UndefOr[`true`] = js.native
    
    var matchesTrailingSlash: js.UndefOr[`true`] = js.native
    
    var name: String = js.native
    
    var statusCode: js.UndefOr[Double] = js.native
    
    var `type`: String = js.native
  }
  
  trait RouteResult extends StObject {
    
    var finished: Boolean
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ] = js.undefined
  }
  object RouteResult {
    
    inline def apply(finished: Boolean): RouteResult = {
      val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteResult]
    }
    
    extension [Self <: RouteResult](x: Self) {
      
      inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setQuery(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  @js.native
  trait Router extends StObject {
    
    def addFsRoute(fsRoute: Route): Unit = js.native
    
    def basePath: String = js.native
    
    var catchAllMiddleware: js.Array[Route] = js.native
    
    /* private */ val catchAllRoute: Any = js.native
    
    /* private */ var checkFsRoutes: Any = js.native
    
    /* private */ var checkPage: Any = js.native
    
    /* private */ var compileRoutes: Any = js.native
    
    /* private */ var compiledRoutes: Any = js.native
    
    /**
      * context stores information used by the router.
      */
    /* private */ val context: Any = js.native
    
    /* private */ var dynamicRoutes: Any = js.native
    
    def execute(req: BaseNextRequest[Any], res: BaseNextResponse[Any], parsedUrl: NextUrlWithParsedQuery): js.Promise[Boolean] = js.native
    def execute(
      req: BaseNextRequest[Any],
      res: BaseNextResponse[Any],
      parsedUrl: NextUrlWithParsedQuery,
      upgradeHead: Buffer
    ): js.Promise[Boolean] = js.native
    
    /* private */ val fsRoutes: Any = js.native
    
    /* private */ val headers: Any = js.native
    
    def locales: js.Array[String] = js.native
    
    /* private */ var needsRecompilation: Any = js.native
    
    /* private */ val nextConfig: Any = js.native
    
    /* private */ val pageChecker: Any = js.native
    
    /* private */ val redirects: Any = js.native
    
    /* private */ val rewrites: Any = js.native
    
    def setCatchallMiddleware(catchAllMiddleware: js.Array[Route]): Unit = js.native
    
    def setDynamicRoutes(dynamicRoutes: DynamicRoutes): Unit = js.native
    
    /* private */ val useFileSystemPublicRoutes: Any = js.native
  }
}
