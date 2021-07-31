package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import typings.nextServer.anon.Groups
import typings.nextServer.nextServerBooleans.`false`
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("next-server/dist/lib/router/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getRouteMatcher(routeRegex: ReturnType[js.Function1[/* normalizedRoute */ String, Groups]]): js.Function1[/* pathname */ js.UndefOr[String], `false` | StringDictionary[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteMatcher")(routeRegex.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* pathname */ js.UndefOr[String], `false` | StringDictionary[String]]]
  
  @scala.inline
  def getRouteRegex(normalizedRoute: String): Groups = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteRegex")(normalizedRoute.asInstanceOf[js.Any]).asInstanceOf[Groups]
  
  @scala.inline
  def getSortedRoutes(normalizedPages: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSortedRoutes")(normalizedPages.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def isDynamicRoute(route: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicRoute")(route.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
