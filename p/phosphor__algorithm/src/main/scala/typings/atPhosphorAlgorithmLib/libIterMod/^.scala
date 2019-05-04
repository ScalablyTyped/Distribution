package typings
package atPhosphorAlgorithmLib.libIterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/iter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def each[T](
    `object`: IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean | scala.Unit]
  ): scala.Unit = js.native
  def every[T](
    `object`: IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): scala.Boolean = js.native
  def iter[T](`object`: IterableOrArrayLike[T]): IIterator[T] = js.native
  def some[T](
    `object`: IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): scala.Boolean = js.native
  def toArray[T](`object`: IterableOrArrayLike[T]): js.Array[T] = js.native
}

