package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distNextDashServerServerRouterMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.next.Anon_Match
  import typings.next.nextBooleans.`false`

  type DynamicRoutes = js.Array[Anon_Match]
  type PageChecker = js.Function1[/* pathname */ String, js.Promise[Boolean]]
  type Params = StringDictionary[js.Any]
  type RouteMatch = js.Function1[/* pathname */ js.UndefOr[String], `false` | Params]
}
