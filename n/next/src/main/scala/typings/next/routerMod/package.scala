package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routerMod {
  type BeforePopStateCallback = js.Function1[/* state */ js.Any, scala.Boolean]
  type ComponentLoadCancel = js.Function0[scala.Unit] | scala.Null
  type NextRouter = typings.next.routerMod.BaseRouter with (typings.std.Pick[
    typings.next.routerMod.Router, 
    typings.next.nextStrings.push | typings.next.nextStrings.replace | typings.next.nextStrings.reload | typings.next.nextStrings.back | typings.next.nextStrings.prefetch | typings.next.nextStrings.beforePopState | typings.next.nextStrings.events
  ])
  type Subscription = js.Function2[
    /* data */ typings.next.routerMod.RouteInfo, 
    /* App */ js.UndefOr[typings.react.mod.ComponentType[js.Object]], 
    scala.Unit
  ]
  type Url = typings.node.urlMod.UrlObject | java.lang.String
}
