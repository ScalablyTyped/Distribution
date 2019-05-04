package typings
package atPhosphorAlgorithmLib.atPhosphorAlgorithmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "FilterIterator")
@js.native
class FilterIterator[T] protected ()
  extends atPhosphorAlgorithmLib.libFilterMod.FilterIterator[T] {
  /**
    * Construct a new filter iterator.
    *
    * @param source - The iterator of values of interest.
    *
    * @param fn - The predicate function to invoke for each value.
    */
  def this(source: atPhosphorAlgorithmLib.libIterMod.IIterator[T], fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]) = this()
}

