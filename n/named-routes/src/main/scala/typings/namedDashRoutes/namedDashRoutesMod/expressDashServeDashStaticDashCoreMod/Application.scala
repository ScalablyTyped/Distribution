package typings.namedDashRoutes.namedDashRoutesMod.expressDashServeDashStaticDashCoreMod

import typings.namedDashRoutes.namedDashRoutesMod.NamedRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application extends js.Object {
  var namedRoutes: NamedRouter
}

object Application {
  @scala.inline
  def apply(namedRoutes: NamedRouter): Application = {
    val __obj = js.Dynamic.literal(namedRoutes = namedRoutes)
  
    __obj.asInstanceOf[Application]
  }
}

