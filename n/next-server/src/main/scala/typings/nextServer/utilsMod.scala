package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import typings.nextServer.anon.Groups
import typings.nextServer.nextServerBooleans.`false`
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("next-server/dist/lib/router/utils", "getRouteMatcher")
  @js.native
  def getRouteMatcher(routeRegex: ReturnType[js.Function1[/* normalizedRoute */ String, Groups]]): js.Function1[/* pathname */ js.UndefOr[String], `false` | StringDictionary[String]] = js.native
  
  @JSImport("next-server/dist/lib/router/utils", "getRouteRegex")
  @js.native
  def getRouteRegex(normalizedRoute: String): Groups = js.native
  
  @JSImport("next-server/dist/lib/router/utils", "getSortedRoutes")
  @js.native
  def getSortedRoutes(normalizedPages: js.Array[String]): js.Array[String] = js.native
  
  @JSImport("next-server/dist/lib/router/utils", "isDynamicRoute")
  @js.native
  def isDynamicRoute(route: String): Boolean = js.native
}
