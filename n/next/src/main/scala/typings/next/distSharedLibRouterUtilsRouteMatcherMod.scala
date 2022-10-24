package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.distSharedLibRouterUtilsRouteRegexMod.RouteRegex
import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsRouteMatcherMod {
  
  @JSImport("next/dist/shared/lib/router/utils/route-matcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRouteMatcher(param0: RouteRegex): RouteMatch = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteMatcher")(param0.asInstanceOf[js.Any]).asInstanceOf[RouteMatch]
  
  type Params = StringDictionary[Any]
  
  type RouteMatch = js.Function1[/* pathname */ js.UndefOr[String | Null], `false` | Params]
}
