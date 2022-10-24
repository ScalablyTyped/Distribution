package typings.next

import typings.next.anon.RestrictedRedirectPathsArray
import typings.next.anon.RestrictedRedirectPathsRule
import typings.next.anon.RestrictedRedirectPathsRuleType
import typings.next.anon.Rule
import typings.next.anon.RuleType
import typings.next.distLibLoadCustomRoutesMod.Header
import typings.next.distLibLoadCustomRoutesMod.Redirect
import typings.next.distLibLoadCustomRoutesMod.Rewrite
import typings.next.distServerBaseHttpMod.BaseNextRequest
import typings.next.distServerRouterMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerServerRouteUtilsMod {
  
  @JSImport("next/dist/server/server-route-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHeaderRoute(param0: Rule): Route = ^.asInstanceOf[js.Dynamic].applyDynamic("createHeaderRoute")(param0.asInstanceOf[js.Any]).asInstanceOf[Route]
  
  inline def createRedirectRoute(param0: RestrictedRedirectPathsRule): Route = ^.asInstanceOf[js.Dynamic].applyDynamic("createRedirectRoute")(param0.asInstanceOf[js.Any]).asInstanceOf[Route]
  
  inline def getCustomRoute(params: RestrictedRedirectPathsArray): Route & Redirect = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomRoute")(params.asInstanceOf[js.Any]).asInstanceOf[Route & Redirect]
  inline def getCustomRoute(params: RestrictedRedirectPathsRuleType): Route & Rewrite = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomRoute")(params.asInstanceOf[js.Any]).asInstanceOf[Route & Rewrite]
  inline def getCustomRoute(params: RuleType): Route & Header = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomRoute")(params.asInstanceOf[js.Any]).asInstanceOf[Route & Header]
  
  inline def stringifyQuery(
    req: BaseNextRequest[Any],
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyQuery")(req.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[String]
}
