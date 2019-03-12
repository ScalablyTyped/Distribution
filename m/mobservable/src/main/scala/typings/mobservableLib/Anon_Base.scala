package typings
package mobservableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends js.Object {
  def isComputingView(): scala.Boolean
  def quickDiff[T](current: js.Array[T], base: js.Array[T]): js.Tuple2[js.Array[T], js.Array[T]]
}

object Anon_Base {
  @scala.inline
  def apply(
    isComputingView: () => scala.Boolean,
    quickDiff: (js.Array[js.Any], js.Array[js.Any]) => js.Tuple2[js.Array[js.Any], js.Array[js.Any]]
  ): Anon_Base = {
    val __obj = js.Dynamic.literal(isComputingView = js.Any.fromFunction0(isComputingView), quickDiff = js.Any.fromFunction2(quickDiff))
  
    __obj.asInstanceOf[Anon_Base]
  }
}

