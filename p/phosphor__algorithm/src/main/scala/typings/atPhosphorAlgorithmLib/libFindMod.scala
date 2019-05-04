package typings
package atPhosphorAlgorithmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/find", JSImport.Namespace)
@js.native
object libFindMod extends js.Object {
  def find[T](
    `object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): js.UndefOr[T] = js.native
  def max[T](
    `object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T],
    fn: js.Function2[/* first */ T, /* second */ T, scala.Double]
  ): js.UndefOr[T] = js.native
  def min[T](
    `object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T],
    fn: js.Function2[/* first */ T, /* second */ T, scala.Double]
  ): js.UndefOr[T] = js.native
  def minmax[T](
    `object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T],
    fn: js.Function2[/* first */ T, /* second */ T, scala.Double]
  ): js.UndefOr[js.Tuple2[T, T]] = js.native
}

