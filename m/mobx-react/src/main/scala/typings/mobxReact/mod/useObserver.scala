package typings.mobxReact.mod

import typings.mobxReactLite.useObserverMod.IUseObserverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react", "useObserver")
@js.native
object useObserver extends js.Object {
  def apply[T](fn: js.Function0[T]): T = js.native
  def apply[T](fn: js.Function0[T], baseComponentName: String): T = js.native
  def apply[T](fn: js.Function0[T], baseComponentName: String, options: IUseObserverOptions): T = js.native
}

