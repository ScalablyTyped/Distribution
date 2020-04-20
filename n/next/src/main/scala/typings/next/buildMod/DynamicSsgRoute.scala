package typings.next.buildMod

import typings.next.nextBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicSsgRoute extends js.Object {
  var dataRoute: String
  var dataRouteRegex: String
  var fallback: String | `false`
  var routeRegex: String
}

object DynamicSsgRoute {
  @scala.inline
  def apply(dataRoute: String, dataRouteRegex: String, fallback: String | `false`, routeRegex: String): DynamicSsgRoute = {
    val __obj = js.Dynamic.literal(dataRoute = dataRoute.asInstanceOf[js.Any], dataRouteRegex = dataRouteRegex.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], routeRegex = routeRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicSsgRoute]
  }
}

