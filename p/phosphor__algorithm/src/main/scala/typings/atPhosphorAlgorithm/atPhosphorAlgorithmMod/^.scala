package typings.atPhosphorAlgorithm.atPhosphorAlgorithmMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPhosphorAlgorithm.libIterMod.IIterator
import typings.atPhosphorAlgorithm.libIterMod.IterableOrArrayLike
import typings.atPhosphorAlgorithm.libRetroMod.RetroableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def chain[T](objects: IterableOrArrayLike[T]*): IIterator[T] = js.native
  def each[T](
    `object`: IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ Double, Boolean | Unit]
  ): Unit = js.native
  def empty[T](): IIterator[T] = js.native
  def enumerate[T](`object`: IterableOrArrayLike[T]): IIterator[js.Tuple2[Double, T]] = js.native
  def enumerate[T](`object`: IterableOrArrayLike[T], start: Double): IIterator[js.Tuple2[Double, T]] = js.native
  def every[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Boolean = js.native
  def filter[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): IIterator[T] = js.native
  def find[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.UndefOr[T] = js.native
  def findIndex[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Double = js.native
  def iter[T](`object`: IterableOrArrayLike[T]): IIterator[T] = js.native
  def iterFn[T](fn: js.Function0[js.UndefOr[T]]): IIterator[T] = js.native
  def iterItems[T](`object`: StringDictionary[T]): IIterator[js.Tuple2[String, T]] = js.native
  def iterKeys[T](`object`: StringDictionary[T]): IIterator[String] = js.native
  def iterValues[T](`object`: StringDictionary[T]): IIterator[T] = js.native
  def map[T, U](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, U]): IIterator[U] = js.native
  def max[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[T] = js.native
  def min[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[T] = js.native
  def minmax[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[js.Tuple2[T, T]] = js.native
  def once[T](value: T): IIterator[T] = js.native
  def range(start: Double): IIterator[Double] = js.native
  def range(start: Double, stop: Double): IIterator[Double] = js.native
  def range(start: Double, stop: Double, step: Double): IIterator[Double] = js.native
  def reduce[T](
    `object`: IterableOrArrayLike[T],
    fn: js.Function3[/* accumulator */ T, /* value */ T, /* index */ Double, T]
  ): T = js.native
  def reduce[T, U](
    `object`: IterableOrArrayLike[T],
    fn: js.Function3[/* accumulator */ U, /* value */ T, /* index */ Double, U],
    initial: U
  ): U = js.native
  def repeat[T](value: T, count: Double): IIterator[T] = js.native
  def retro[T](`object`: RetroableOrArrayLike[T]): IIterator[T] = js.native
  def some[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Boolean = js.native
  def stride[T](`object`: IterableOrArrayLike[T], step: Double): IIterator[T] = js.native
  def take[T](`object`: IterableOrArrayLike[T], count: Double): IIterator[T] = js.native
  def toArray[T](`object`: IterableOrArrayLike[T]): js.Array[T] = js.native
  def toObject[T](`object`: IterableOrArrayLike[js.Tuple2[String, T]]): StringDictionary[T] = js.native
  def topologicSort[T](edges: IterableOrArrayLike[js.Tuple2[T, T]]): js.Array[T] = js.native
  def zip[T](objects: IterableOrArrayLike[T]*): IIterator[js.Array[T]] = js.native
}

