package typings
package nextLib.appMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppProps[Q /* <: nextDashServerLib.routerMod.DefaultQuery */, CustomReq] extends js.Object {
  var Component: nextLib.nextMod.NextComponentType[_, _, nextLib.nextMod.NextContext[Q, CustomReq]]
  var router: nextDashServerLib.routerMod.RouterProps[Q]
}

object AppProps {
  @scala.inline
  def apply[Q /* <: nextDashServerLib.routerMod.DefaultQuery */, CustomReq](
    Component: nextLib.nextMod.NextComponentType[_, _, nextLib.nextMod.NextContext[Q, CustomReq]],
    router: nextDashServerLib.routerMod.RouterProps[Q]
  ): AppProps[Q, CustomReq] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], router = router)
  
    __obj.asInstanceOf[AppProps[Q, CustomReq]]
  }
}

