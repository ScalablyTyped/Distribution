package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMapContainer
import typings.mnemonist.fuzzyMultiMapMod.HashFunction
import typings.mnemonist.fuzzyMultiMapMod.HashFunctionsTuple
import typings.mnemonist.fuzzyMultiMapMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "FuzzyMultiMap")
@js.native
class FuzzyMultiMap[K, V] protected () extends default[K, V] {
  def this(hashFunctions: HashFunctionsTuple[K]) = this()
  // Constructor
  def this(hashFunction: HashFunction[K]) = this()
  def this(hashFunctions: HashFunctionsTuple[K], Container: FuzzyMultiMapContainer) = this()
  def this(hashFunction: HashFunction[K], Container: FuzzyMultiMapContainer) = this()
}

/* static members */
@JSImport("mnemonist", "FuzzyMultiMap")
@js.native
object FuzzyMultiMap extends js.Object {
  def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunction[I]): typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = js.native
  def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunction[I], Container: FuzzyMultiMapContainer): typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = js.native
  def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunctionsTuple[I]): typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = js.native
  def from[I, J](
    iterable: StringDictionary[J],
    hashFunction: HashFunctionsTuple[I],
    Container: FuzzyMultiMapContainer
  ): typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = js.native
  // Statics
  def from[I, J](iterable: Iterable[js.Tuple2[I, J]], hashFunction: HashFunction[I]): typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = js.native
  def from[I, J](
    iterable: Iterable[js.Tuple2[I, J]],
    hashFunction: HashFunction[I],
    Container: FuzzyMultiMapContainer
  ): typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = js.native
  def from[I, J](iterable: Iterable[js.Tuple2[I, J]], hashFunction: HashFunctionsTuple[I]): typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = js.native
  def from[I, J](
    iterable: Iterable[js.Tuple2[I, J]],
    hashFunction: HashFunctionsTuple[I],
    Container: FuzzyMultiMapContainer
  ): typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = js.native
}

