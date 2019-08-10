package typings.atPhosphorAlgorithm.libIterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/iter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def each[T](
    `object`: IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ Double, Boolean | Unit]
  ): Unit = js.native
  def every[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Boolean = js.native
  def iter[T](`object`: IterableOrArrayLike[T]): IIterator[T] = js.native
  def iterFn[T](fn: js.Function0[js.UndefOr[T]]): IIterator[T] = js.native
  def iterItems[T](`object`: StringDictionary[T]): IIterator[js.Tuple2[String, T]] = js.native
  def iterKeys[T](`object`: StringDictionary[T]): IIterator[String] = js.native
  def iterValues[T](`object`: StringDictionary[T]): IIterator[T] = js.native
  def some[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Boolean = js.native
  def toArray[T](`object`: IterableOrArrayLike[T]): js.Array[T] = js.native
  def toObject[T](`object`: IterableOrArrayLike[js.Tuple2[String, T]]): StringDictionary[T] = js.native
}

