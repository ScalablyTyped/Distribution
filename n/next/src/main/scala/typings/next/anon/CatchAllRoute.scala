package typings.next.anon

import typings.next.serverRouterMod.PageChecker
import typings.next.serverRouterMod.Route_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatchAllRoute extends js.Object {
  var catchAllRoute: Route_
  var dynamicRoutes: js.UndefOr[typings.next.serverRouterMod.DynamicRoutes] = js.undefined
  var fsRoutes: js.Array[Route_]
  var headers: js.Array[Route_]
  var pageChecker: PageChecker
  var redirects: js.Array[Route_]
  var rewrites: js.Array[Route_]
  var useFileSystemPublicRoutes: Boolean
}

object CatchAllRoute {
  @scala.inline
  def apply(
    catchAllRoute: Route_,
    fsRoutes: js.Array[Route_],
    headers: js.Array[Route_],
    pageChecker: /* pathname */ String => js.Promise[Boolean],
    redirects: js.Array[Route_],
    rewrites: js.Array[Route_],
    useFileSystemPublicRoutes: Boolean,
    dynamicRoutes: typings.next.serverRouterMod.DynamicRoutes = null
  ): CatchAllRoute = {
    val __obj = js.Dynamic.literal(catchAllRoute = catchAllRoute.asInstanceOf[js.Any], fsRoutes = fsRoutes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], pageChecker = js.Any.fromFunction1(pageChecker), redirects = redirects.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any], useFileSystemPublicRoutes = useFileSystemPublicRoutes.asInstanceOf[js.Any])
    if (dynamicRoutes != null) __obj.updateDynamic("dynamicRoutes")(dynamicRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatchAllRoute]
  }
}

