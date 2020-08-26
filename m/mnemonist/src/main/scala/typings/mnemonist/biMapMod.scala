package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/bi-map", JSImport.Namespace)
@js.native
object biMapMod extends js.Object {
  @js.native
  trait BiMap[K, V]
    extends Iterable[js.Tuple2[K, V]] {
    var inverse: InverseMap[V, K] = js.native
    // Members
    var size: Double = js.native
    // Methods
    def clear(): Unit = js.native
    def delete(key: K): Boolean = js.native
    def entries(): Iterator[js.Tuple2[K, V], _, js.UndefOr[scala.Nothing]] = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit], scope: js.Any): Unit = js.native
    def get(key: K): V = js.native
    def has(key: K): Boolean = js.native
    def inspect(): js.Any = js.native
    def keys(): Iterator[K, _, js.UndefOr[scala.Nothing]] = js.native
    def set(key: K, value: V): this.type = js.native
    def values(): Iterator[V, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  class InverseMap[K, V] ()
    extends Iterable[js.Tuple2[K, V]] {
    var inverse: BiMap[V, K] = js.native
    // Members
    var size: Double = js.native
    // Methods
    def clear(): Unit = js.native
    def delete(key: K): Boolean = js.native
    def entries(): Iterator[js.Tuple2[K, V], _, js.UndefOr[scala.Nothing]] = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit], scope: js.Any): Unit = js.native
    def get(key: K): V = js.native
    def has(key: K): Boolean = js.native
    def inspect(): js.Any = js.native
    def keys(): Iterator[K, _, js.UndefOr[scala.Nothing]] = js.native
    def set(key: K, value: V): this.type = js.native
    def values(): Iterator[V, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  class default[K, V] () extends BiMap[K, V]
  
  /* static members */
  @js.native
  object default extends js.Object {
    def from[I, J](iterable: StringDictionary[J]): BiMap[I, J] = js.native
    // Statics
    def from[I, J](iterable: Iterable[js.Tuple2[I, J]]): BiMap[I, J] = js.native
  }
  
}

