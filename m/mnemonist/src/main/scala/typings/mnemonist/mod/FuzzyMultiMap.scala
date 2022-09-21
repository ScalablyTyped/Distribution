package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMapContainer
import typings.mnemonist.fuzzyMultiMapMod.HashFunction
import typings.mnemonist.fuzzyMultiMapMod.HashFunctionsTuple
import typings.mnemonist.fuzzyMultiMapMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "FuzzyMultiMap")
@js.native
open class FuzzyMultiMap[K, V] protected () extends default[K, V] {
  def this(hashFunctions: HashFunctionsTuple[K]) = this()
  // Constructor
  def this(hashFunction: HashFunction[K]) = this()
  def this(hashFunctions: HashFunctionsTuple[K], Container: FuzzyMultiMapContainer) = this()
  def this(hashFunction: HashFunction[K], Container: FuzzyMultiMapContainer) = this()
}
/* static members */
object FuzzyMultiMap {
  
  @JSImport("mnemonist", "FuzzyMultiMap")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], hashFunction: HashFunction[I]): typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J]]
  inline def from[I, J](
    iterable: js.Iterable[js.Tuple2[I, J]],
    hashFunction: HashFunction[I],
    Container: FuzzyMultiMapContainer
  ): typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any], Container.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J]]
  inline def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], hashFunction: HashFunctionsTuple[I]): typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J]]
  inline def from[I, J](
    iterable: js.Iterable[js.Tuple2[I, J]],
    hashFunction: HashFunctionsTuple[I],
    Container: FuzzyMultiMapContainer
  ): typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any], Container.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J]]
  inline def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunction[I]): typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J]]
  inline def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunction[I], Container: FuzzyMultiMapContainer): typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any], Container.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J]]
  inline def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunctionsTuple[I]): typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J]]
  inline def from[I, J](
    iterable: StringDictionary[J],
    hashFunction: HashFunctionsTuple[I],
    Container: FuzzyMultiMapContainer
  ): typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any], Container.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J]]
}
