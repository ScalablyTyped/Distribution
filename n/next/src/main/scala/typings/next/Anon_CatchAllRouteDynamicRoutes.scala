package typings.next

import typings.next.distNextDashServerServerRouterMod.DynamicRoutes
import typings.next.distNextDashServerServerRouterMod.PageChecker
import typings.next.distNextDashServerServerRouterMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CatchAllRouteDynamicRoutes extends js.Object {
  var catchAllRoute: Route
  var dynamicRoutes: js.UndefOr[DynamicRoutes] = js.undefined
  var fsRoutes: js.Array[Route]
  var pageChecker: PageChecker
  var routes: js.Array[Route]
}

object Anon_CatchAllRouteDynamicRoutes {
  @scala.inline
  def apply(
    catchAllRoute: Route,
    fsRoutes: js.Array[Route],
    pageChecker: /* pathname */ String => js.Promise[Boolean],
    routes: js.Array[Route],
    dynamicRoutes: DynamicRoutes = null
  ): Anon_CatchAllRouteDynamicRoutes = {
    val __obj = js.Dynamic.literal(catchAllRoute = catchAllRoute.asInstanceOf[js.Any], fsRoutes = fsRoutes.asInstanceOf[js.Any], pageChecker = js.Any.fromFunction1(pageChecker), routes = routes.asInstanceOf[js.Any])
    if (dynamicRoutes != null) __obj.updateDynamic("dynamicRoutes")(dynamicRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CatchAllRouteDynamicRoutes]
  }
}

