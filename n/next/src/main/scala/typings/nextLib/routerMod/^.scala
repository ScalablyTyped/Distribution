package typings
package nextLib.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: nextDashServerLib.routerMod.SingletonRouter[nextDashServerLib.routerMod.DefaultQuery] = js.native
  def withRouter[T /* <: js.Object */, Q](
    Component: reactLib.reactMod.ReactNs.ComponentType[T with nextDashServerLib.routerMod.WithRouterProps[Q]]
  ): reactLib.reactMod.ReactNs.ComponentType[nextDashServerLib.routerMod.Omit[T, java.lang.String]] = js.native
}

