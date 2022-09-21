package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayConstructor
import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Set
import typings.std.SetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fuzzyMultiMapMod {
  
  @JSImport("mnemonist/fuzzy-multi-map", JSImport.Default)
  @js.native
  open class default[K, V] protected ()
    extends StObject
       with FuzzyMultiMap[K, V] {
    def this(hashFunctions: HashFunctionsTuple[K]) = this()
    // Constructor
    def this(hashFunction: HashFunction[K]) = this()
    def this(hashFunctions: HashFunctionsTuple[K], Container: FuzzyMultiMapContainer) = this()
    def this(hashFunction: HashFunction[K], Container: FuzzyMultiMapContainer) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mnemonist/fuzzy-multi-map", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], hashFunction: HashFunction[I]): FuzzyMultiMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any])).asInstanceOf[FuzzyMultiMap[I, J]]
    inline def from[I, J](
      iterable: js.Iterable[js.Tuple2[I, J]],
      hashFunction: HashFunction[I],
      Container: FuzzyMultiMapContainer
    ): FuzzyMultiMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any], Container.asInstanceOf[js.Any])).asInstanceOf[FuzzyMultiMap[I, J]]
    inline def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], hashFunction: HashFunctionsTuple[I]): FuzzyMultiMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any])).asInstanceOf[FuzzyMultiMap[I, J]]
    inline def from[I, J](
      iterable: js.Iterable[js.Tuple2[I, J]],
      hashFunction: HashFunctionsTuple[I],
      Container: FuzzyMultiMapContainer
    ): FuzzyMultiMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any], Container.asInstanceOf[js.Any])).asInstanceOf[FuzzyMultiMap[I, J]]
    inline def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunction[I]): FuzzyMultiMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any])).asInstanceOf[FuzzyMultiMap[I, J]]
    inline def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunction[I], Container: FuzzyMultiMapContainer): FuzzyMultiMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any], Container.asInstanceOf[js.Any])).asInstanceOf[FuzzyMultiMap[I, J]]
    inline def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunctionsTuple[I]): FuzzyMultiMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any])).asInstanceOf[FuzzyMultiMap[I, J]]
    inline def from[I, J](
      iterable: StringDictionary[J],
      hashFunction: HashFunctionsTuple[I],
      Container: FuzzyMultiMapContainer
    ): FuzzyMultiMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any], Container.asInstanceOf[js.Any])).asInstanceOf[FuzzyMultiMap[I, J]]
  }
  
  @js.native
  trait FuzzyMultiMap[K, V]
    extends StObject
       with Iterable[V] {
    
    def add(value: V): this.type = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    // Members
    var dimension: Double = js.native
    
    def forEach(callback: js.Function2[/* value */ V, /* key */ V, Unit]): Unit = js.native
    def forEach(callback: js.Function2[/* value */ V, /* key */ V, Unit], scope: Any): Unit = js.native
    
    def get(key: Any): js.UndefOr[js.Array[V] | Set[V]] = js.native
    
    def has(key: Any): Boolean = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_FuzzyMultiMap: js.Function0[IterableIterator[V]] = js.native
    
    def set(key: K, value: V): this.type = js.native
    
    var size: Double = js.native
    
    def values(): IterableIterator[V] = js.native
  }
  
  type FuzzyMultiMapContainer = ArrayConstructor | SetConstructor
  
  type HashFunction[K] = js.Function1[/* key */ Any, K]
  
  type HashFunctionsTuple[K] = js.Tuple2[HashFunction[K], HashFunction[K]]
}
