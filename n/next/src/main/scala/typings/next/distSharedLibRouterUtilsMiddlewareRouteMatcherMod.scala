package typings.next

import typings.next.distBuildAnalysisGetPageStaticInfoMod.MiddlewareMatcher
import typings.next.distServerBaseHttpMod.BaseNextRequest
import typings.next.distSharedLibRouterUtilsRouteMatcherMod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsMiddlewareRouteMatcherMod {
  
  @JSImport("next/dist/shared/lib/router/utils/middleware-route-matcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMiddlewareRouteMatcher(matchers: js.Array[MiddlewareMatcher]): MiddlewareRouteMatch = ^.asInstanceOf[js.Dynamic].applyDynamic("getMiddlewareRouteMatcher")(matchers.asInstanceOf[js.Any]).asInstanceOf[MiddlewareRouteMatch]
  
  type MiddlewareRouteMatch = js.Function3[
    /* pathname */ js.UndefOr[String | Null], 
    /* request */ BaseNextRequest[Any], 
    /* query */ Params, 
    Boolean
  ]
}
