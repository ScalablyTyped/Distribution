package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import typings.nextServer.anon.Groups
import typings.nextServer.nextServerBooleans.`false`
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeMatcherMod {
  
  @JSImport("next-server/dist/lib/router/utils/route-matcher", "getRouteMatcher")
  @js.native
  def getRouteMatcher(routeRegex: ReturnType[js.Function1[/* normalizedRoute */ String, Groups]]): js.Function1[/* pathname */ js.UndefOr[String], `false` | StringDictionary[String]] = js.native
}
