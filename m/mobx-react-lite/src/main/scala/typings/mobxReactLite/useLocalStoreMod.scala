package typings.mobxReactLite

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react-lite/dist/useLocalStore", JSImport.Namespace)
@js.native
object useLocalStoreMod extends js.Object {
  def useLocalStore[TStore /* <: Record[String, _] */](initializer: js.Function0[TStore]): TStore = js.native
  def useLocalStore[TStore /* <: Record[String, _] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore], current: TSource): TStore = js.native
}

