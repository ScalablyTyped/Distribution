package typings.next

import typings.next.serverRouterMod.DynamicRoutes
import typings.next.serverRouterMod.PageChecker
import typings.next.serverRouterMod.Route_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCatchAllRouteDynamicRoutes extends js.Object {
  var catchAllRoute: Route_
  var dynamicRoutes: js.UndefOr[DynamicRoutes] = js.undefined
  var fsRoutes: js.Array[Route_]
  var pageChecker: PageChecker
  var routes: js.Array[Route_]
}

object AnonCatchAllRouteDynamicRoutes {
  @scala.inline
  def apply(
    catchAllRoute: Route_,
    fsRoutes: js.Array[Route_],
    pageChecker: /* pathname */ String => js.Promise[Boolean],
    routes: js.Array[Route_],
    dynamicRoutes: DynamicRoutes = null
  ): AnonCatchAllRouteDynamicRoutes = {
    val __obj = js.Dynamic.literal(catchAllRoute = catchAllRoute.asInstanceOf[js.Any], fsRoutes = fsRoutes.asInstanceOf[js.Any], pageChecker = js.Any.fromFunction1(pageChecker), routes = routes.asInstanceOf[js.Any])
    if (dynamicRoutes != null) __obj.updateDynamic("dynamicRoutes")(dynamicRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCatchAllRouteDynamicRoutes]
  }
}

