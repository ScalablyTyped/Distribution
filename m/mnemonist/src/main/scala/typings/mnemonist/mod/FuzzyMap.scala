package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.fuzzyMapMod.HashFunction
import typings.mnemonist.fuzzyMapMod.HashFunctionsTuple
import typings.mnemonist.fuzzyMapMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "FuzzyMap")
@js.native
class FuzzyMap[K, V] protected () extends default[K, V] {
  def this(hashFunctionsTuple: HashFunctionsTuple[K]) = this()
  // Constructor
  def this(hashFunction: HashFunction[K]) = this()
}

/* static members */
@JSImport("mnemonist", "FuzzyMap")
@js.native
object FuzzyMap extends js.Object {
  def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunction[I]): typings.mnemonist.fuzzyMapMod.FuzzyMap[I, J] = js.native
  def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunctionsTuple[I]): typings.mnemonist.fuzzyMapMod.FuzzyMap[I, J] = js.native
  // Statics
  def from[I, J](iterable: Iterable[js.Tuple2[I, J]], hashFunction: HashFunction[I]): typings.mnemonist.fuzzyMapMod.FuzzyMap[I, J] = js.native
  def from[I, J](iterable: Iterable[js.Tuple2[I, J]], hashFunction: HashFunctionsTuple[I]): typings.mnemonist.fuzzyMapMod.FuzzyMap[I, J] = js.native
}

