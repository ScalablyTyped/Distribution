package typings.atPhosphorAlgorithm.atPhosphorAlgorithmMod

import typings.atPhosphorAlgorithm.libIterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "TakeIterator")
@js.native
class TakeIterator[T] protected ()
  extends typings.atPhosphorAlgorithm.libTakeMod.TakeIterator[T] {
  /**
    * Construct a new take iterator.
    *
    * @param source - The iterator of interest.
    *
    * @param count - The number of items to take from the source.
    */
  def this(source: IIterator[T], count: Double) = this()
}

