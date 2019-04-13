package typings
package nextLib.appMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppProps[Q /* <: nextDashServerLib.routerMod.DefaultQuery */] extends js.Object {
  var Component: nextLib.nextMod.NextComponentType[_, _, nextLib.nextMod.NextContext[Q]]
  var router: nextDashServerLib.routerMod.RouterProps[Q]
}

object AppProps {
  @scala.inline
  def apply[Q /* <: nextDashServerLib.routerMod.DefaultQuery */](
    Component: nextLib.nextMod.NextComponentType[_, _, nextLib.nextMod.NextContext[Q]],
    router: nextDashServerLib.routerMod.RouterProps[Q]
  ): AppProps[Q] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], router = router)
  
    __obj.asInstanceOf[AppProps[Q]]
  }
}

