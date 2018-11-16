package typings
package nextDashServerLib.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/router", JSImport.Namespace)
@js.native
object routerModMembers extends js.Object {
  val default: SingletonRouter[DefaultQuery] = js.native
  def withRouter[T /* <: js.Object */, Q](Component: reactLib.reactMod.ReactNs.ComponentType[T with WithRouterProps[Q]]): reactLib.reactMod.ReactNs.ComponentType[Omit[T, java.lang.String]] = js.native
}

