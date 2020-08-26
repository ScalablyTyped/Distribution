package typings.mnemonist

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/multi-set", JSImport.Namespace)
@js.native
object multiSetMod extends js.Object {
  @js.native
  trait MultiSet[K] extends Iterable[K] {
    // Members
    var dimension: Double = js.native
    var size: Double = js.native
    def add(key: K): this.type = js.native
    def add(key: K, count: Double): this.type = js.native
    // Methods
    def clear(): Unit = js.native
    def count(key: K): Double = js.native
    def delete(key: K): Boolean = js.native
    def edit(a: K, b: K): this.type = js.native
    def forEach(callback: js.Function3[/* value */ K, /* key */ K, /* set */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ K, /* key */ K, /* set */ this.type, Unit], scope: js.Any): Unit = js.native
    def forEachMultiplicity(callback: js.Function3[/* value */ Double, /* key */ K, /* set */ this.type, Unit]): Unit = js.native
    def forEachMultiplicity(callback: js.Function3[/* value */ Double, /* key */ K, /* set */ this.type, Unit], scope: js.Any): Unit = js.native
    def frequency(key: K): Double = js.native
    def get(key: K): Double = js.native
    def has(key: K): Boolean = js.native
    def inspect(): js.Any = js.native
    def keys(): Iterator[K, _, js.UndefOr[scala.Nothing]] = js.native
    def multiplicities(): Iterator[js.Tuple2[K, Double], _, js.UndefOr[scala.Nothing]] = js.native
    def multiplicity(key: K): Double = js.native
    def remove(key: K): Unit = js.native
    def remove(key: K, count: Double): Unit = js.native
    def set(key: K, count: Double): this.type = js.native
    def toJSON(): js.Any = js.native
    def top(n: Double): js.Array[js.Tuple2[K, Double]] = js.native
    def values(): Iterator[Double, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @js.native
  class default[K] () extends MultiSet[K]
  
  /* static members */
  @js.native
  object default extends js.Object {
    def from[I](iterable: StringDictionary[I]): MultiSet[I] = js.native
    // Statics
    def from[I](iterable: Iterable[I]): MultiSet[I] = js.native
    def isSubset[T](a: MultiSet[T], b: MultiSet[T]): Boolean = js.native
    def isSuperset[T](a: MultiSet[T], b: MultiSet[T]): Boolean = js.native
  }
  
}

