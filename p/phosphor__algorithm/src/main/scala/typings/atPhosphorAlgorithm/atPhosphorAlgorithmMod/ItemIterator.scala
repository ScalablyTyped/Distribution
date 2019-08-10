package typings.atPhosphorAlgorithm.atPhosphorAlgorithmMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "ItemIterator")
@js.native
class ItemIterator[T] protected ()
  extends typings.atPhosphorAlgorithm.libIterMod.ItemIterator[T] {
  /**
    * Construct a new item iterator.
    *
    * @param source - The object of interest.
    *
    * @param keys - The keys to iterate, if known.
    */
  def this(source: StringDictionary[T]) = this()
  def this(source: StringDictionary[T], keys: js.Array[String]) = this()
}

