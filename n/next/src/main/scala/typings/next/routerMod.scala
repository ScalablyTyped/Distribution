package typings.next

import typings.nextDashServer.routerMod.DefaultQuery
import typings.nextDashServer.routerMod.Omit
import typings.nextDashServer.routerMod.RouterProps
import typings.nextDashServer.routerMod.SingletonRouter
import typings.nextDashServer.routerMod.WithRouterProps
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/router", JSImport.Namespace)
@js.native
object routerMod extends js.Object {
  val default: SingletonRouter[DefaultQuery] = js.native
  def useRouter[Q](): RouterProps[Q] = js.native
  def withRouter[T /* <: js.Object */, Q](Component: ComponentType[T with WithRouterProps[Q]]): ComponentType[Omit[T, String]] = js.native
}

