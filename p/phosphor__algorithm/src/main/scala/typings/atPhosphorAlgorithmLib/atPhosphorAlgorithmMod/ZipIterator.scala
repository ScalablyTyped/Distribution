package typings
package atPhosphorAlgorithmLib.atPhosphorAlgorithmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "ZipIterator")
@js.native
class ZipIterator[T] protected ()
  extends atPhosphorAlgorithmLib.libZipMod.ZipIterator[T] {
  /**
    * Construct a new zip iterator.
    *
    * @param source - The iterators of interest.
    */
  def this(source: js.Array[atPhosphorAlgorithmLib.libIterMod.IIterator[T]]) = this()
}

