package typings.mobxDashReactDashLite

import typings.mobxDashReactDashLite.distUseObservableMod.SupportedValues
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react-lite/dist/useObservable", JSImport.Namespace)
@js.native
object distUseObservableMod extends js.Object {
  def useObservable[T /* <: SupportedValues */](initialValue: T): T = js.native
  type SupportedValues = js.Object | (Map[js.Any, js.Any]) | js.Array[js.Any]
}

