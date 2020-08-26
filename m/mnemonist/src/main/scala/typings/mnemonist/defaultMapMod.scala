package typings.mnemonist

import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/default-map", JSImport.Namespace)
@js.native
object defaultMapMod extends js.Object {
  @js.native
  trait DefaultMap[K, V]
    extends Iterable[js.Tuple2[K, V]] {
    // Members
    var size: Double = js.native
    // Methods
    def clear(): Unit = js.native
    def delete(key: K): Boolean = js.native
    def entries(): Iterator[js.Tuple2[K, V], _, js.UndefOr[scala.Nothing]] = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit], scope: js.Any): Unit = js.native
    def get(key: K): js.UndefOr[V] = js.native
    def has(key: K): Boolean = js.native
    def inspect(): js.Any = js.native
    def keys(): Iterator[K, _, js.UndefOr[scala.Nothing]] = js.native
    def peek(key: K): js.UndefOr[V] = js.native
    def set(key: K, value: V): this.type = js.native
    def values(): Iterator[V, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  class default[K, V] protected () extends DefaultMap[K, V] {
    // Constructor
    def this(factory: js.Function2[/* key */ js.UndefOr[K], /* index */ js.UndefOr[Double], V]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    // Statics
    def autoIncrement(): Double = js.native
  }
  
}

