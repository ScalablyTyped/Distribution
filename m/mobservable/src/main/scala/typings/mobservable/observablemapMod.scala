package typings.mobservable

import org.scalablytyped.runtime.StringDictionary
import typings.mobservable.interfacesMod.IObjectChange
import typings.mobservable.interfacesMod.Lambda
import typings.mobservable.observablevalueMod.ObservableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobservable/lib/observablemap", JSImport.Namespace)
@js.native
object observablemapMod extends js.Object {
  
  @js.native
  class ObservableMap[V] () extends js.Object {
    def this(initialData: Entries[V]) = this()
    def this(initialData: KeyValueMap[V]) = this()
    def this(initialData: js.UndefOr[scala.Nothing], valueModeFunc: js.Function) = this()
    def this(initialData: Entries[V], valueModeFunc: js.Function) = this()
    def this(initialData: KeyValueMap[V], valueModeFunc: js.Function) = this()
    
    var _data: js.Any = js.native
    
    var _events: js.Any = js.native
    
    def _has(key: String): Boolean = js.native
    
    var _hasMap: js.Any = js.native
    
    var _keys: js.Any = js.native
    
    def _updateHasMapEntry(key: String, value: Boolean): ObservableValue[Boolean] = js.native
    
    var _valueMode: js.Any = js.native
    
    /* private */ def assertValidKey(key: js.Any): js.Any = js.native
    
    def clear(): Unit = js.native
    
    def delete(key: String): Unit = js.native
    
    def entries(): Entries[V] = js.native
    
    def forEach(callback: js.Function3[/* value */ V, /* key */ String, /* object */ KeyValueMap[V], Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* value */ V, /* key */ String, /* object */ KeyValueMap[V], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    def get(key: String): V = js.native
    
    def has(key: String): Boolean = js.native
    
    /* private */ def isValidKey(key: js.Any): js.Any = js.native
    
    def keys(): js.Array[String] = js.native
    
    def merge(other: KeyValueMap[V]): ObservableMap[V] = js.native
    def merge(other: ObservableMap[V]): ObservableMap[V] = js.native
    
    def observe(callback: js.Function1[/* changes */ IObservableMapChange[V], Unit]): Lambda = js.native
    
    def set(key: String, value: V): Unit = js.native
    
    var size: Double = js.native
    
    def toJs(): KeyValueMap[V] = js.native
    
    def values(): js.Array[V] = js.native
  }
  
  type Entries[V] = js.Array[js.Tuple2[String, V]]
  
  type IObservableMapChange[T] = IObjectChange[T, ObservableMap[T]]
  
  type KeyValueMap[V] = StringDictionary[V]
}
