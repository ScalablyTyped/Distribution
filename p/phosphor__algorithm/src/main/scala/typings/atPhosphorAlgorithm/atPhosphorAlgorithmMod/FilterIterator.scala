package typings.atPhosphorAlgorithm.atPhosphorAlgorithmMod

import typings.atPhosphorAlgorithm.libIterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "FilterIterator")
@js.native
class FilterIterator[T] protected ()
  extends typings.atPhosphorAlgorithm.libFilterMod.FilterIterator[T] {
  /**
    * Construct a new filter iterator.
    *
    * @param source - The iterator of values of interest.
    *
    * @param fn - The predicate function to invoke for each value.
    */
  def this(source: IIterator[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]) = this()
}

