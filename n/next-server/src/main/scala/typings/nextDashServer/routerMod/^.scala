package typings.nextDashServer.routerMod

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: SingletonRouter[DefaultQuery] = js.native
  def useRouter[Q](): RouterProps[Q] = js.native
  def withRouter[T /* <: js.Object */, Q](Component: ComponentType[T with WithRouterProps[Q]]): ComponentType[Omit[T, String]] = js.native
}

