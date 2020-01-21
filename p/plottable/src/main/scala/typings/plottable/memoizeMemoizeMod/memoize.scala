package typings.plottable.memoizeMemoizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/memoize/memoize", "memoize")
@js.native
object memoize extends js.Object {
  def apply[F /* <: js.Function */](compute: F): MemoizedFunction[F] = js.native
}

