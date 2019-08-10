package typings.atPhosphorAlgorithm.atPhosphorAlgorithmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "FnIterator")
@js.native
class FnIterator[T] protected ()
  extends typings.atPhosphorAlgorithm.libIterMod.FnIterator[T] {
  /**
    * Construct a new function iterator.
    *
    * @param fn - The iterator-like function of interest.
    */
  def this(fn: js.Function0[js.UndefOr[T]]) = this()
}

