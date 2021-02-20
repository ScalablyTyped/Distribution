package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.Groups
import typings.next.nextBooleans.`false`
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeMatcherMod {
  
  @JSImport("next/dist/next-server/lib/router/utils/route-matcher", "getRouteMatcher")
  @js.native
  def getRouteMatcher(routeRegex: ReturnType[js.Function1[/* normalizedRoute */ String, Groups]]): js.Function1[
    /* pathname */ js.UndefOr[String | Null], 
    `false` | (StringDictionary[String | js.Array[String]])
  ] = js.native
}
