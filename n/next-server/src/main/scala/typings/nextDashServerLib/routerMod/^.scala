package typings
package nextDashServerLib.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: SingletonRouter[DefaultQuery] = js.native
  def withRouter[T /* <: js.Object */, Q](Component: reactLib.reactMod.ComponentType[T with WithRouterProps[Q]]): reactLib.reactMod.ComponentType[Omit[T, java.lang.String]] = js.native
}

