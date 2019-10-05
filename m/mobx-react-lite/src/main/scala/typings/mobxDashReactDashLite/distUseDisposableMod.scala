package typings.mobxDashReactDashLite

import typings.mobxDashReactDashLite.distUseDisposableMod.TDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react-lite/dist/useDisposable", JSImport.Namespace)
@js.native
object distUseDisposableMod extends js.Object {
  def useDisposable[D /* <: TDisposable */](disposerGenerator: js.Function0[D]): D = js.native
  def useDisposable[D /* <: TDisposable */](disposerGenerator: js.Function0[D], inputs: js.Array[_]): D = js.native
  type TDisposable = js.Function0[Unit]
}

