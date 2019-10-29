package typings.memoizeDashOne

import typings.memoizeDashOne.memoizeDashOneMod.EqualityFn
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memoize-one", JSImport.Namespace)
@js.native
object memoizeDashOneMod extends js.Object {
  def default[ResultFn /* <: js.ThisFunction1[/* this */ js.Any, /* repeated */ js.Any, ReturnType[ResultFn]] */](resultFn: ResultFn): ResultFn = js.native
  def default[ResultFn /* <: js.ThisFunction1[/* this */ js.Any, /* repeated */ js.Any, ReturnType[ResultFn]] */](resultFn: ResultFn, isEqual: EqualityFn): ResultFn = js.native
  type EqualityFn = js.Function2[/* newArgs */ js.Array[js.Any], /* lastArgs */ js.Array[js.Any], Boolean]
}

