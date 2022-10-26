package typings.next.anon

import typings.next.distServerBaseHttpMod.BaseNextRequest
import typings.next.distSharedLibRouterUtilsRouteMatcherMod.RouteMatch
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.UrlWithParsedQuery
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultRouteMatches extends StObject {
  
  var defaultRouteMatches: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ] = js.native
  
  var defaultRouteRegex: js.UndefOr[Groups] = js.native
  
  var dynamicRouteMatcher: js.UndefOr[RouteMatch] = js.native
  
  def getParamsFromRouteMatches(req: BaseNextRequest[Any]): Any = js.native
  def getParamsFromRouteMatches(req: BaseNextRequest[Any], renderOpts: Any): Any = js.native
  def getParamsFromRouteMatches(req: BaseNextRequest[Any], renderOpts: Any, detectedLocale: String): Any = js.native
  def getParamsFromRouteMatches(req: BaseNextRequest[Any], renderOpts: Unit, detectedLocale: String): Any = js.native
  def getParamsFromRouteMatches(req: IncomingMessage): Any = js.native
  def getParamsFromRouteMatches(req: IncomingMessage, renderOpts: Any): Any = js.native
  def getParamsFromRouteMatches(req: IncomingMessage, renderOpts: Any, detectedLocale: String): Any = js.native
  def getParamsFromRouteMatches(req: IncomingMessage, renderOpts: Unit, detectedLocale: String): Any = js.native
  
  def handleBasePath(req: BaseNextRequest[Any], parsedUrl: UrlWithParsedQuery): Unit = js.native
  def handleBasePath(req: IncomingMessage, parsedUrl: UrlWithParsedQuery): Unit = js.native
  
  def handleLocale(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    parsedUrl: UrlWithParsedQuery,
    routeNoAssetPath: String,
    shouldNotRedirect: Boolean
  ): js.UndefOr[DetectedLocale] = js.native
  
  def handleRewrites(req: BaseNextRequest[Any], parsedUrl: UrlWithParsedQuery): js.Object = js.native
  def handleRewrites(req: IncomingMessage, parsedUrl: UrlWithParsedQuery): js.Object = js.native
  
  def interpolateDynamicPath(pathname: String, params: Record[String, js.UndefOr[String | js.Array[String]]]): String = js.native
  
  def normalizeDynamicRouteParams(
    params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ): HasValidParams = js.native
  def normalizeDynamicRouteParams(
    params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
    ignoreOptional: Boolean
  ): HasValidParams = js.native
  
  def normalizeVercelUrl(req: BaseNextRequest[Any], trustQuery: Boolean): Unit = js.native
  def normalizeVercelUrl(req: BaseNextRequest[Any], trustQuery: Boolean, paramKeys: js.Array[String]): Unit = js.native
  def normalizeVercelUrl(req: IncomingMessage, trustQuery: Boolean): Unit = js.native
  def normalizeVercelUrl(req: IncomingMessage, trustQuery: Boolean, paramKeys: js.Array[String]): Unit = js.native
}
