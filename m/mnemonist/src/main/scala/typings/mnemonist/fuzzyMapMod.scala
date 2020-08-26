package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/fuzzy-map", JSImport.Namespace)
@js.native
object fuzzyMapMod extends js.Object {
  @js.native
  trait FuzzyMap[K, V] extends Iterable[V] {
    // Members
    var size: Double = js.native
    def add(key: V): this.type = js.native
    // Methods
    def clear(): Unit = js.native
    def forEach(callback: js.Function2[/* value */ V, /* key */ V, Unit]): Unit = js.native
    def forEach(callback: js.Function2[/* value */ V, /* key */ V, Unit], scope: this.type): Unit = js.native
    def get(key: js.Any): js.UndefOr[V] = js.native
    def has(key: js.Any): Boolean = js.native
    def inspect(): js.Any = js.native
    def set(key: K, value: V): this.type = js.native
    def values(): Iterator[V, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  class default[K, V] protected () extends FuzzyMap[K, V] {
    def this(hashFunctionsTuple: HashFunctionsTuple[K]) = this()
    // Constructor
    def this(hashFunction: HashFunction[K]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunction[I]): FuzzyMap[I, J] = js.native
    def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunctionsTuple[I]): FuzzyMap[I, J] = js.native
    // Statics
    def from[I, J](iterable: Iterable[js.Tuple2[I, J]], hashFunction: HashFunction[I]): FuzzyMap[I, J] = js.native
    def from[I, J](iterable: Iterable[js.Tuple2[I, J]], hashFunction: HashFunctionsTuple[I]): FuzzyMap[I, J] = js.native
  }
  
  type HashFunction[K] = js.Function1[/* key */ js.Any, K]
  type HashFunctionsTuple[K] = js.Tuple2[HashFunction[K], HashFunction[K]]
}

