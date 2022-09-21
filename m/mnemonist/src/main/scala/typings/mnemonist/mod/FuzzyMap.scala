package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.fuzzyMapMod.HashFunction
import typings.mnemonist.fuzzyMapMod.HashFunctionsTuple
import typings.mnemonist.fuzzyMapMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "FuzzyMap")
@js.native
open class FuzzyMap[K, V] protected () extends default[K, V] {
  def this(hashFunctionsTuple: HashFunctionsTuple[K]) = this()
  // Constructor
  def this(hashFunction: HashFunction[K]) = this()
}
/* static members */
object FuzzyMap {
  
  @JSImport("mnemonist", "FuzzyMap")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], hashFunction: HashFunction[I]): typings.mnemonist.fuzzyMapMod.FuzzyMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fuzzyMapMod.FuzzyMap[I, J]]
  inline def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], hashFunction: HashFunctionsTuple[I]): typings.mnemonist.fuzzyMapMod.FuzzyMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fuzzyMapMod.FuzzyMap[I, J]]
  inline def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunction[I]): typings.mnemonist.fuzzyMapMod.FuzzyMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fuzzyMapMod.FuzzyMap[I, J]]
  inline def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunctionsTuple[I]): typings.mnemonist.fuzzyMapMod.FuzzyMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.fuzzyMapMod.FuzzyMap[I, J]]
}
