package typings.atPhosphorAlgorithm.atPhosphorAlgorithmMod

import typings.atPhosphorAlgorithm.libIterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "ZipIterator")
@js.native
class ZipIterator[T] protected ()
  extends typings.atPhosphorAlgorithm.libZipMod.ZipIterator[T] {
  /**
    * Construct a new zip iterator.
    *
    * @param source - The iterators of interest.
    */
  def this(source: js.Array[IIterator[T]]) = this()
}

