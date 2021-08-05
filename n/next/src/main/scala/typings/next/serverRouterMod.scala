package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.CatchAllRoute
import typings.next.anon.Match
import typings.next.nextBooleans.`false`
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.UrlWithParsedQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverRouterMod {
  
  @JSImport("next/dist/next-server/server/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/next-server/server/router", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Router {
    def this(hasBasePathHeadersFsRoutesRewritesRedirectsCatchAllRouteDynamicRoutesPageCheckerUseFileSystemPublicRoutesLocales: CatchAllRoute) = this()
  }
  
  inline def route(path: String): js.Function2[/* pathname */ js.UndefOr[String | Null], /* params */ js.UndefOr[js.Any], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("route")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* pathname */ js.UndefOr[String | Null], /* params */ js.UndefOr[js.Any], js.Any]]
  
  type DynamicRoutes = js.Array[Match]
  
  type PageChecker = js.Function1[/* pathname */ String, js.Promise[Boolean]]
  
  type Params = StringDictionary[js.Any]
  
  type RouteMatch = js.Function1[/* pathname */ js.UndefOr[String | Null], `false` | Params]
  
  trait RouteResult extends StObject {
    
    var finished: Boolean
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[StringDictionary[String]] = js.undefined
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
      
      inline def setQuery(value: StringDictionary[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait Route_ extends StObject {
    
    var check: js.UndefOr[Boolean] = js.undefined
    
    def fn(req: IncomingMessage, res: ServerResponse, params: Params, parsedUrl: UrlWithParsedQuery): js.Promise[RouteResult] | RouteResult
    
    var `match`: RouteMatch
    
    var name: String
    
    var requireBasePath: js.UndefOr[`false`] = js.undefined
    
    var statusCode: js.UndefOr[Double] = js.undefined
    
    var `type`: String
  }
  object Route_ {
    
    inline def apply(
      fn: (IncomingMessage, ServerResponse, Params, UrlWithParsedQuery) => js.Promise[RouteResult] | RouteResult,
      `match`: /* pathname */ js.UndefOr[String | Null] => `false` | Params,
      name: String,
      `type`: String
    ): Route_ = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction4(fn), name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route_]
    }
    
    extension [Self <: Route_](x: Self) {
      
      inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setFn(
        value: (IncomingMessage, ServerResponse, Params, UrlWithParsedQuery) => js.Promise[RouteResult] | RouteResult
      ): Self = StObject.set(x, "fn", js.Any.fromFunction4(value))
      
      inline def setMatch(value: /* pathname */ js.UndefOr[String | Null] => `false` | Params): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRequireBasePath(value: `false`): Self = StObject.set(x, "requireBasePath", value.asInstanceOf[js.Any])
      
      inline def setRequireBasePathUndefined: Self = StObject.set(x, "requireBasePath", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Router extends StObject {
    
    def addFsRoute(fsRoute: Route_): Unit = js.native
    
    var basePath: String = js.native
    
    var catchAllRoute: Route_ = js.native
    
    var dynamicRoutes: DynamicRoutes = js.native
    
    def execute(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.Promise[Boolean] = js.native
    
    var fsRoutes: js.Array[Route_] = js.native
    
    var headers: js.Array[Route_] = js.native
    
    var locales: js.Array[String] = js.native
    
    var pageChecker: PageChecker = js.native
    
    var redirects: js.Array[Route_] = js.native
    
    var rewrites: js.Array[Route_] = js.native
    
    def setDynamicRoutes(): Unit = js.native
    def setDynamicRoutes(routes: DynamicRoutes): Unit = js.native
    
    var useFileSystemPublicRoutes: Boolean = js.native
  }
}
