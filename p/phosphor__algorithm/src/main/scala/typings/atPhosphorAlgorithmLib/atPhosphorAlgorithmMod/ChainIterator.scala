package typings
package atPhosphorAlgorithmLib.atPhosphorAlgorithmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "ChainIterator")
@js.native
class ChainIterator[T] protected ()
  extends atPhosphorAlgorithmLib.libChainMod.ChainIterator[T] {
  /**
    * Construct a new chain iterator.
    *
    * @param source - The iterator of iterators of interest.
    */
  def this(source: atPhosphorAlgorithmLib.libIterMod.IIterator[atPhosphorAlgorithmLib.libIterMod.IIterator[T]]) = this()
}

