package typings.next.appMod

import typings.next.nextMod.NextComponentType
import typings.next.nextMod.NextContext
import typings.nextDashServer.routerMod.DefaultQuery
import typings.nextDashServer.routerMod.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextAppContext[Q /* <: DefaultQuery */, CustomReq] extends js.Object {
  var Component: NextComponentType[_, _, NextContext[Q, CustomReq]]
  var ctx: NextContext[Q, CustomReq]
  var router: RouterProps[Q]
}

object NextAppContext {
  @scala.inline
  def apply[Q /* <: DefaultQuery */, CustomReq](
    Component: NextComponentType[_, _, NextContext[Q, CustomReq]],
    ctx: NextContext[Q, CustomReq],
    router: RouterProps[Q]
  ): NextAppContext[Q, CustomReq] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], ctx = ctx, router = router)
  
    __obj.asInstanceOf[NextAppContext[Q, CustomReq]]
  }
}

