package typings
package nextLib.appMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextAppContext[Q /* <: nextDashServerLib.routerMod.DefaultQuery */, CustomReq] extends js.Object {
  var Component: nextLib.nextMod.NextComponentType[_, _, nextLib.nextMod.NextContext[Q, CustomReq]]
  var ctx: nextLib.nextMod.NextContext[Q, CustomReq]
  var router: nextDashServerLib.routerMod.RouterProps[Q]
}

object NextAppContext {
  @scala.inline
  def apply[Q /* <: nextDashServerLib.routerMod.DefaultQuery */, CustomReq](
    Component: nextLib.nextMod.NextComponentType[_, _, nextLib.nextMod.NextContext[Q, CustomReq]],
    ctx: nextLib.nextMod.NextContext[Q, CustomReq],
    router: nextDashServerLib.routerMod.RouterProps[Q]
  ): NextAppContext[Q, CustomReq] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], ctx = ctx, router = router)
  
    __obj.asInstanceOf[NextAppContext[Q, CustomReq]]
  }
}

