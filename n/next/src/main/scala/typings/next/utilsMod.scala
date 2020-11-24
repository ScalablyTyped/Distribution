package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.Groups
import typings.next.nextBooleans.`false`
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next/dist/next-server/lib/router/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def getRouteMatcher(routeRegex: ReturnType[js.Function1[/* normalizedRoute */ String, Groups]]): js.Function1[
    /* pathname */ js.UndefOr[String | Null], 
    `false` | (StringDictionary[String | js.Array[String]])
  ] = js.native
  
  def getRouteRegex(normalizedRoute: String): Groups = js.native
  
  def getSortedRoutes(normalizedPages: js.Array[String]): js.Array[String] = js.native
  
  def isDynamicRoute(route: String): Boolean = js.native
}
