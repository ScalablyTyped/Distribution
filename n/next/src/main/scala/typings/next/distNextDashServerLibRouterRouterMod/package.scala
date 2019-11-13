package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distNextDashServerLibRouterRouterMod {
  import typings.next.nextStrings.back
  import typings.next.nextStrings.beforePopState
  import typings.next.nextStrings.events
  import typings.next.nextStrings.prefetch
  import typings.next.nextStrings.push
  import typings.next.nextStrings.reload
  import typings.next.nextStrings.replace
  import typings.node.urlMod.UrlObject
  import typings.react.reactMod.ComponentType
  import typings.std.Pick

  type BeforePopStateCallback = js.Function1[/* state */ js.Any, Boolean]
  type ComponentLoadCancel = js.Function0[Unit] | Null
  type NextRouter = BaseRouter with (Pick[Router, push | replace | reload | back | prefetch | beforePopState | events])
  type Subscription = js.Function2[/* data */ RouteInfo, /* App */ js.UndefOr[ComponentType[js.Object]], Unit]
  type Url = UrlObject | String
}
