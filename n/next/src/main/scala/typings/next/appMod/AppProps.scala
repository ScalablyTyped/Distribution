package typings.next.appMod

import typings.next.nextMod.NextComponentType
import typings.next.nextMod.NextContext
import typings.nextDashServer.routerMod.DefaultQuery
import typings.nextDashServer.routerMod.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppProps[Q /* <: DefaultQuery */, CustomReq] extends js.Object {
  var Component: NextComponentType[_, _, NextContext[Q, CustomReq]]
  var router: RouterProps[Q]
}

object AppProps {
  @scala.inline
  def apply[Q /* <: DefaultQuery */, CustomReq](Component: NextComponentType[_, _, NextContext[Q, CustomReq]], router: RouterProps[Q]): AppProps[Q, CustomReq] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], router = router)
  
    __obj.asInstanceOf[AppProps[Q, CustomReq]]
  }
}

