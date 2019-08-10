package typings.atPhosphorAlgorithm.atPhosphorAlgorithmMod

import typings.atPhosphorAlgorithm.libIterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "EnumerateIterator")
@js.native
class EnumerateIterator[T] protected ()
  extends typings.atPhosphorAlgorithm.libEnumerateMod.EnumerateIterator[T] {
  /**
    * Construct a new enumerate iterator.
    *
    * @param source - The iterator of values of interest.
    *
    * @param start - The starting enum value.
    */
  def this(source: IIterator[T], start: Double) = this()
}

