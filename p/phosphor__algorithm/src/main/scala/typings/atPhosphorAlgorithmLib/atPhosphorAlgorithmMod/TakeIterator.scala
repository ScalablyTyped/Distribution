package typings
package atPhosphorAlgorithmLib.atPhosphorAlgorithmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "TakeIterator")
@js.native
class TakeIterator[T] protected ()
  extends atPhosphorAlgorithmLib.libTakeMod.TakeIterator[T] {
  /**
    * Construct a new take iterator.
    *
    * @param source - The iterator of interest.
    *
    * @param count - The number of items to take from the source.
    */
  def this(source: atPhosphorAlgorithmLib.libIterMod.IIterator[T], count: scala.Double) = this()
}

