package typings.mnemonist

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayConstructor
import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Set
import typings.std.SetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiMapMod extends Shortcut {
  
  @JSImport("mnemonist/multi-map", JSImport.Default)
  @js.native
  val default: MultiMapConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mnemonist/multi-map", JSImport.Default)
  @js.native
  open class defaultCls[K, V] protected ()
    extends StObject
       with MultiMap[K, V, Set[V]] {
    def this(container: SetConstructor) = this()
  }
  
  @js.native
  trait MultiMap[K, V, C /* <: js.Array[V] | Set[V] */]
    extends StObject
       with Iterable[js.Tuple2[K, V]] {
    
    def associations(): IterableIterator[js.Tuple2[K, C]] = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    def containers(): IterableIterator[C] = js.native
    
    def delete(key: K): Boolean = js.native
    
    // Members
    var dimension: Double = js.native
    
    def entries(): IterableIterator[js.Tuple2[K, V]] = js.native
    
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ V, /* key */ K, /* map */ this.type, Unit], scope: Any): Unit = js.native
    
    def forEachAssociation(callback: js.Function3[/* value */ C, /* key */ K, /* map */ this.type, Unit]): Unit = js.native
    def forEachAssociation(callback: js.Function3[/* value */ C, /* key */ K, /* map */ this.type, Unit], scope: Any): Unit = js.native
    
    def get(key: K): js.UndefOr[C] = js.native
    
    def has(key: K): Boolean = js.native
    
    def inspect(): Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_MultiMap: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
    
    def keys(): IterableIterator[K] = js.native
    
    def multiplicity(key: K): Double = js.native
    
    def remove(key: K, value: V): Boolean = js.native
    
    def set(key: K, value: V): this.type = js.native
    
    var size: Double = js.native
    
    def toJSON(): Any = js.native
    
    def values(): IterableIterator[V] = js.native
  }
  
  @js.native
  trait MultiMapConstructor
    extends StObject
       with Instantiable0[MultiMap[js.Object, js.Object, js.Array[js.Object]]]
       with Instantiable1[
          (/* container */ ArrayConstructor) | (/* container */ SetConstructor), 
          MultiMap[js.Object, js.Object, js.Array[js.Object] | Set[js.Object]]
        ] {
    
    def from[K, V](iterable: js.Iterable[js.Tuple2[K, V]]): MultiMap[K, V, js.Array[V]] = js.native
    def from[K, V](iterable: js.Iterable[js.Tuple2[K, V]], Container: ArrayConstructor): MultiMap[K, V, js.Array[V]] = js.native
    def from[K, V](iterable: js.Iterable[js.Tuple2[K, V]], Container: SetConstructor): MultiMap[K, V, Set[V]] = js.native
    def from[K, V](iterable: StringDictionary[V]): MultiMap[K, V, js.Array[V]] = js.native
    def from[K, V](iterable: StringDictionary[V], Container: ArrayConstructor): MultiMap[K, V, js.Array[V]] = js.native
    def from[K, V](iterable: StringDictionary[V], Container: SetConstructor): MultiMap[K, V, Set[V]] = js.native
  }
  
  type _To = MultiMapConstructor
  
  /* This means you don't have to write `default`, but can instead just say `multiMapMod.foo` */
  override def _to: MultiMapConstructor = default
}
