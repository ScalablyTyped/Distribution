package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayConstructor
import typings.std.Iterable
import typings.std.Iterator
import typings.std.Set
import typings.std.SetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/fuzzy-multi-map", JSImport.Namespace)
@js.native
object fuzzyMultiMapMod extends js.Object {
  @js.native
  trait FuzzyMultiMap[K, V] extends Iterable[V] {
    // Members
    var dimension: Double = js.native
    var size: Double = js.native
    def add(value: V): this.type = js.native
    // Methods
    def clear(): Unit = js.native
    def forEach(callback: js.Function2[/* value */ V, /* key */ V, Unit]): Unit = js.native
    def forEach(callback: js.Function2[/* value */ V, /* key */ V, Unit], scope: js.Any): Unit = js.native
    def get(key: js.Any): js.UndefOr[js.Array[V] | Set[V]] = js.native
    def has(key: js.Any): Boolean = js.native
    def inspect(): js.Any = js.native
    def set(key: K, value: V): this.type = js.native
    def values(): Iterator[V, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  class default[K, V] protected () extends FuzzyMultiMap[K, V] {
    def this(hashFunctions: HashFunctionsTuple[K]) = this()
    // Constructor
    def this(hashFunction: HashFunction[K]) = this()
    def this(hashFunctions: HashFunctionsTuple[K], Container: FuzzyMultiMapContainer) = this()
    def this(hashFunction: HashFunction[K], Container: FuzzyMultiMapContainer) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunction[I]): FuzzyMultiMap[I, J] = js.native
    def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunction[I], Container: FuzzyMultiMapContainer): FuzzyMultiMap[I, J] = js.native
    def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunctionsTuple[I]): FuzzyMultiMap[I, J] = js.native
    def from[I, J](
      iterable: StringDictionary[J],
      hashFunction: HashFunctionsTuple[I],
      Container: FuzzyMultiMapContainer
    ): FuzzyMultiMap[I, J] = js.native
    // Statics
    def from[I, J](iterable: Iterable[js.Tuple2[I, J]], hashFunction: HashFunction[I]): FuzzyMultiMap[I, J] = js.native
    def from[I, J](
      iterable: Iterable[js.Tuple2[I, J]],
      hashFunction: HashFunction[I],
      Container: FuzzyMultiMapContainer
    ): FuzzyMultiMap[I, J] = js.native
    def from[I, J](iterable: Iterable[js.Tuple2[I, J]], hashFunction: HashFunctionsTuple[I]): FuzzyMultiMap[I, J] = js.native
    def from[I, J](
      iterable: Iterable[js.Tuple2[I, J]],
      hashFunction: HashFunctionsTuple[I],
      Container: FuzzyMultiMapContainer
    ): FuzzyMultiMap[I, J] = js.native
  }
  
  type FuzzyMultiMapContainer = ArrayConstructor | SetConstructor
  type HashFunction[K] = js.Function1[/* key */ js.Any, K]
  type HashFunctionsTuple[K] = js.Tuple2[HashFunction[K], HashFunction[K]]
}

