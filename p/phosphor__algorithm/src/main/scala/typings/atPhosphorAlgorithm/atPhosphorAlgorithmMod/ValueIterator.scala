package typings.atPhosphorAlgorithm.atPhosphorAlgorithmMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm", "ValueIterator")
@js.native
class ValueIterator[T] protected ()
  extends typings.atPhosphorAlgorithm.libIterMod.ValueIterator[T] {
  /**
    * Construct a new value iterator.
    *
    * @param source - The object of interest.
    *
    * @param keys - The keys to iterate, if known.
    */
  def this(source: StringDictionary[T]) = this()
  def this(source: StringDictionary[T], keys: js.Array[String]) = this()
}

