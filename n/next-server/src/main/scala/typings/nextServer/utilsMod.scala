package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import typings.nextServer.anon.Groups
import typings.nextServer.nextServerBooleans.`false`
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next-server/dist/lib/router/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def getRouteMatcher(routeRegex: ReturnType[js.Function1[/* normalizedRoute */ String, Groups]]): js.Function1[/* pathname */ js.UndefOr[String], `false` | StringDictionary[String]] = js.native
  
  def getRouteRegex(normalizedRoute: String): Groups = js.native
  
  def getSortedRoutes(normalizedPages: js.Array[String]): js.Array[String] = js.native
  
  def isDynamicRoute(route: String): Boolean = js.native
}
