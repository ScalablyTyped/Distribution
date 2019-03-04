package typings
package nextLib.appMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextAppContext[Q /* <: nextDashServerLib.routerMod.DefaultQuery */] extends js.Object {
  var Component: nextLib.nextMod.nextNs.NextComponentType[_, _, nextLib.nextMod.nextNs.NextContext[Q]]
  var ctx: nextLib.nextMod.nextNs.NextContext[Q]
  var router: nextDashServerLib.routerMod.RouterProps[Q]
}

object NextAppContext {
  @scala.inline
  def apply[Q /* <: nextDashServerLib.routerMod.DefaultQuery */](
    Component: nextLib.nextMod.nextNs.NextComponentType[_, _, nextLib.nextMod.nextNs.NextContext[Q]],
    ctx: nextLib.nextMod.nextNs.NextContext[Q],
    router: nextDashServerLib.routerMod.RouterProps[Q]
  ): NextAppContext[Q] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], ctx = ctx, router = router)
  
    __obj.asInstanceOf[NextAppContext[Q]]
  }
}

