package typings
package atPhosphorAlgorithmLib.atPhosphorAlgorithmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def chain[T](objects: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T]*): atPhosphorAlgorithmLib.libIterMod.IIterator[T] = js.native
  def each[T](
    `object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean | scala.Unit]
  ): scala.Unit = js.native
  def empty[T](): atPhosphorAlgorithmLib.libIterMod.IIterator[T] = js.native
  def every[T](
    `object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): scala.Boolean = js.native
  def filter[T](
    `object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): atPhosphorAlgorithmLib.libIterMod.IIterator[T] = js.native
  def find[T](
    `object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): js.UndefOr[T] = js.native
  def iter[T](`object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T]): atPhosphorAlgorithmLib.libIterMod.IIterator[T] = js.native
  def map[T, U](
    `object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, U]
  ): atPhosphorAlgorithmLib.libIterMod.IIterator[U] = js.native
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
  def once[T](value: T): atPhosphorAlgorithmLib.libIterMod.IIterator[T] = js.native
  def range(start: scala.Double): atPhosphorAlgorithmLib.libIterMod.IIterator[scala.Double] = js.native
  def range(start: scala.Double, stop: scala.Double): atPhosphorAlgorithmLib.libIterMod.IIterator[scala.Double] = js.native
  def range(start: scala.Double, stop: scala.Double, step: scala.Double): atPhosphorAlgorithmLib.libIterMod.IIterator[scala.Double] = js.native
  def reduce[T](
    `object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T],
    fn: js.Function3[/* accumulator */ T, /* value */ T, /* index */ scala.Double, T]
  ): T = js.native
  def reduce[T, U](
    `object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T],
    fn: js.Function3[/* accumulator */ U, /* value */ T, /* index */ scala.Double, U],
    initial: U
  ): U = js.native
  def repeat[T](value: T, count: scala.Double): atPhosphorAlgorithmLib.libIterMod.IIterator[T] = js.native
  def retro[T](`object`: atPhosphorAlgorithmLib.libRetroMod.RetroableOrArrayLike[T]): atPhosphorAlgorithmLib.libIterMod.IIterator[T] = js.native
  def some[T](
    `object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): scala.Boolean = js.native
  def stride[T](`object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T], step: scala.Double): atPhosphorAlgorithmLib.libIterMod.IIterator[T] = js.native
  def take[T](`object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T], count: scala.Double): atPhosphorAlgorithmLib.libIterMod.IIterator[T] = js.native
  def toArray[T](`object`: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T]): js.Array[T] = js.native
  def topologicSort[T](edges: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[js.Tuple2[T, T]]): js.Array[T] = js.native
  def zip[T](objects: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T]*): atPhosphorAlgorithmLib.libIterMod.IIterator[js.Array[T]] = js.native
}

