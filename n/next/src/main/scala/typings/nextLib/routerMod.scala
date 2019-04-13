package typings
package nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/router", JSImport.Namespace)
@js.native
object routerMod extends js.Object {
  val default: nextDashServerLib.routerMod.SingletonRouter[nextDashServerLib.routerMod.DefaultQuery] = js.native
  def withRouter[T /* <: js.Object */, Q](Component: reactLib.reactMod.ComponentType[T with nextDashServerLib.routerMod.WithRouterProps[Q]]): reactLib.reactMod.ComponentType[nextDashServerLib.routerMod.Omit[T, java.lang.String]] = js.native
}

