package typings.nextServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routerMod {
  type BeforePopStateCallback = js.Function1[/* state */ js.Any, scala.Boolean]
  type ComponentLoadCancel = js.Function0[scala.Unit] | scala.Null
  type NextRouter = typings.nextServer.routerMod.BaseRouter with (typings.std.Pick[
    typings.nextServer.routerMod.Router, 
    typings.nextServer.nextServerStrings.push | typings.nextServer.nextServerStrings.replace | typings.nextServer.nextServerStrings.reload | typings.nextServer.nextServerStrings.back | typings.nextServer.nextServerStrings.prefetch | typings.nextServer.nextServerStrings.beforePopState | typings.nextServer.nextServerStrings.events
  ])
  type Subscription = js.Function2[
    /* data */ typings.nextServer.routerMod.RouteInfo, 
    /* App */ js.UndefOr[typings.react.mod.ComponentType[js.Object]], 
    scala.Unit
  ]
  type Url = typings.node.urlMod.UrlObject | java.lang.String
}
