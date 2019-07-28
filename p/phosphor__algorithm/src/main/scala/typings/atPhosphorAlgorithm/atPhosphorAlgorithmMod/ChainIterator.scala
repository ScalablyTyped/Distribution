package typings.atPhosphorAlgorithm.atPhosphorAlgorithmMod

import typings.atPhosphorAlgorithm.libIterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "ChainIterator")
@js.native
class ChainIterator[T] protected ()
  extends typings.atPhosphorAlgorithm.libChainMod.ChainIterator[T] {
  /**
    * Construct a new chain iterator.
    *
    * @param source - The iterator of iterators of interest.
    */
  def this(source: IIterator[IIterator[T]]) = this()
}

