package typings.memoizeDashOne

import typings.memoizeDashOne.memoizeDashOneMod.EqualityFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memoize-one", JSImport.Namespace)
@js.native
object memoizeDashOneMod extends js.Object {
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](resultFn: T): T = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](resultFn: T, isEqual: EqualityFn): T = js.native
  type EqualityFn = js.Function3[/* a */ js.Any, /* b */ js.Any, /* index */ Double, Boolean]
}

