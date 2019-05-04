package typings
package atPhosphorAlgorithmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/reduce", JSImport.Namespace)
@js.native
object libReduceMod extends js.Object {
  def reduce[T](
    `object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T],
    fn: js.Function3[/* accumulator */ T, /* value */ T, /* index */ scala.Double, T]
  ): T = js.native
  def reduce[T, U](
    `object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T],
    fn: js.Function3[/* accumulator */ U, /* value */ T, /* index */ scala.Double, U],
    initial: U
  ): U = js.native
}

