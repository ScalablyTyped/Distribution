package typings.nextDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distLibRouterRouterMod {
  import typings.nextDashServer.nextDashServerStrings.back
  import typings.nextDashServer.nextDashServerStrings.beforePopState
  import typings.nextDashServer.nextDashServerStrings.events
  import typings.nextDashServer.nextDashServerStrings.prefetch
  import typings.nextDashServer.nextDashServerStrings.push
  import typings.nextDashServer.nextDashServerStrings.reload
  import typings.nextDashServer.nextDashServerStrings.replace
  import typings.node.urlMod.UrlObject
  import typings.react.reactMod.ComponentType
  import typings.std.Pick

  type BeforePopStateCallback = js.Function1[/* state */ js.Any, Boolean]
  type ComponentLoadCancel = js.Function0[Unit] | Null
  type NextRouter = BaseRouter with (Pick[Router, push | replace | reload | back | prefetch | beforePopState | events])
  type Subscription = js.Function2[/* data */ RouteInfo, /* App */ js.UndefOr[ComponentType[js.Object]], Unit]
  type Url = UrlObject | String
}
