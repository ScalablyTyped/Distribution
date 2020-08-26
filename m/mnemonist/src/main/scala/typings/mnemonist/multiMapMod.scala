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

@JSImport("mnemonist/multi-map", JSImport.Namespace)
@js.native
object multiMapMod extends js.Object {
  @js.native
  trait MultiMap[K, V]
    extends Iterable[js.Tuple2[K, V]] {
    // Members
    var dimension: Double = js.native
    var size: Double = js.native
    def associations(): Iterator[js.Tuple2[K, js.Array[V] | Set[V]], _, js.UndefOr[scala.Nothing]] = js.native
    // Methods
    def clear(): Unit = js.native
    def containers(): Iterator[js.Array[V] | Set[V], _, js.UndefOr[scala.Nothing]] = js.native
    def delete(key: K): Boolean = js.native
    def entries(): Iterator[js.Tuple2[K, V], _, js.UndefOr[scala.Nothing]] = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit], scope: js.Any): Unit = js.native
    def forEachAssociation(callback: js.Function3[/* value */ js.Array[V] | Set[V], /* key */ K, /* map */ this.type, Unit]): Unit = js.native
    def forEachAssociation(
      callback: js.Function3[/* value */ js.Array[V] | Set[V], /* key */ K, /* map */ this.type, Unit],
      scope: js.Any
    ): Unit = js.native
    def get(key: K): js.UndefOr[js.Array[V] | Set[V]] = js.native
    def has(key: K): Boolean = js.native
    def inspect(): js.Any = js.native
    def keys(): Iterator[K, _, js.UndefOr[scala.Nothing]] = js.native
    def multiplicity(key: K): Double = js.native
    def remove(key: K, value: V): Boolean = js.native
    def set(key: K, value: V): this.type = js.native
    def toJSON(): js.Any = js.native
    def values(): Iterator[V, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  // Constructor
  class default[K, V] () extends MultiMap[K, V] {
    def this(Container: ArrayConstructor) = this()
    def this(Container: SetConstructor) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def from[I, J](iterable: StringDictionary[J]): MultiMap[I, J] = js.native
    def from[I, J](iterable: StringDictionary[J], Container: ArrayConstructor): MultiMap[I, J] = js.native
    def from[I, J](iterable: StringDictionary[J], Container: SetConstructor): MultiMap[I, J] = js.native
    // Statics
    def from[I, J](iterable: Iterable[js.Tuple2[I, J]]): MultiMap[I, J] = js.native
    def from[I, J](iterable: Iterable[js.Tuple2[I, J]], Container: ArrayConstructor): MultiMap[I, J] = js.native
    def from[I, J](iterable: Iterable[js.Tuple2[I, J]], Container: SetConstructor): MultiMap[I, J] = js.native
  }
  
}

