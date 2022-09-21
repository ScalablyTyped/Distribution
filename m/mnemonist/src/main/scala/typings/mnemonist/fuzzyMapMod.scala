package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fuzzyMapMod {
  
  @JSImport("mnemonist/fuzzy-map", JSImport.Default)
  @js.native
  open class default[K, V] protected ()
    extends StObject
       with FuzzyMap[K, V] {
    def this(hashFunctionsTuple: HashFunctionsTuple[K]) = this()
    // Constructor
    def this(hashFunction: HashFunction[K]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mnemonist/fuzzy-map", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    // Statics
    inline def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], hashFunction: HashFunction[I]): FuzzyMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any])).asInstanceOf[FuzzyMap[I, J]]
    inline def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], hashFunction: HashFunctionsTuple[I]): FuzzyMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any])).asInstanceOf[FuzzyMap[I, J]]
    inline def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunction[I]): FuzzyMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any])).asInstanceOf[FuzzyMap[I, J]]
    inline def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunctionsTuple[I]): FuzzyMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any])).asInstanceOf[FuzzyMap[I, J]]
  }
  
  @js.native
  trait FuzzyMap[K, V]
    extends StObject
       with Iterable[V] {
    
    def add(key: V): this.type = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    def forEach(callback: js.Function2[/* value */ V, /* key */ V, Unit]): Unit = js.native
    def forEach(callback: js.Function2[/* value */ V, /* key */ V, Unit], scope: this.type): Unit = js.native
    
    def get(key: Any): js.UndefOr[V] = js.native
    
    def has(key: Any): Boolean = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_FuzzyMap: js.Function0[IterableIterator[V]] = js.native
    
    def set(key: K, value: V): this.type = js.native
    
    // Members
    var size: Double = js.native
    
    def values(): IterableIterator[V] = js.native
  }
  
  type HashFunction[K] = js.Function1[/* key */ Any, K]
  
  type HashFunctionsTuple[K] = js.Tuple2[HashFunction[K], HashFunction[K]]
}
