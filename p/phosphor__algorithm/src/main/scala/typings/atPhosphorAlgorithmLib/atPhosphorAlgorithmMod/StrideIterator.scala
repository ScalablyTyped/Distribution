package typings
package atPhosphorAlgorithmLib.atPhosphorAlgorithmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "StrideIterator")
@js.native
class StrideIterator[T] protected ()
  extends atPhosphorAlgorithmLib.libStrideMod.StrideIterator[T] {
  /**
    * Construct a new stride iterator.
    *
    * @param source - The iterator of values of interest.
    *
    * @param step - The distance to step on each iteration. A value
    *   of less than `1` will behave the same as a value of `1`.
    */
  def this(source: atPhosphorAlgorithmLib.libIterMod.IIterator[T], step: scala.Double) = this()
}

