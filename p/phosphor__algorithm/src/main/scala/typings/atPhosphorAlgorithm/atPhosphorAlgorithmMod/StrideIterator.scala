package typings.atPhosphorAlgorithm.atPhosphorAlgorithmMod

import typings.atPhosphorAlgorithm.libIterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "StrideIterator")
@js.native
class StrideIterator[T] protected ()
  extends typings.atPhosphorAlgorithm.libStrideMod.StrideIterator[T] {
  /**
    * Construct a new stride iterator.
    *
    * @param source - The iterator of values of interest.
    *
    * @param step - The distance to step on each iteration. A value
    *   of less than `1` will behave the same as a value of `1`.
    */
  def this(source: IIterator[T], step: Double) = this()
}

