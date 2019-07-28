package typings.atPhosphorAlgorithm.atPhosphorAlgorithmMod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "ArrayIterator")
@js.native
class ArrayIterator[T] protected ()
  extends typings.atPhosphorAlgorithm.libIterMod.ArrayIterator[T] {
  /**
    * Construct a new array iterator.
    *
    * @param source - The array-like object of interest.
    */
  def this(source: ArrayLike[T]) = this()
}

