package typings
package atPhosphorAlgorithmLib.atPhosphorAlgorithmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "MapIterator")
@js.native
class MapIterator[T, U] protected ()
  extends atPhosphorAlgorithmLib.libMapMod.MapIterator[T, U] {
  /**
    * Construct a new map iterator.
    *
    * @param source - The iterator of values of interest.
    *
    * @param fn - The mapping function to invoke for each value.
    */
  def this(source: atPhosphorAlgorithmLib.libIterMod.IIterator[T], fn: js.Function2[/* value */ T, /* index */ scala.Double, U]) = this()
}

