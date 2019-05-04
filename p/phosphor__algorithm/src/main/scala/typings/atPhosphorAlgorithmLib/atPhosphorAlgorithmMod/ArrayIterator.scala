package typings
package atPhosphorAlgorithmLib.atPhosphorAlgorithmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "ArrayIterator")
@js.native
class ArrayIterator[T] protected ()
  extends atPhosphorAlgorithmLib.libIterMod.ArrayIterator[T] {
  /**
    * Construct a new array iterator.
    *
    * @param source - The array-like object of interest.
    */
  def this(source: stdLib.ArrayLike[T]) = this()
}

