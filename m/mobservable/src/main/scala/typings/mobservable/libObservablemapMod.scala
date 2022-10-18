package typings.mobservable

import org.scalablytyped.runtime.StringDictionary
import typings.mobservable.libInterfacesMod.IObjectChange
import typings.mobservable.libInterfacesMod.Lambda
import typings.mobservable.libObservablevalueMod.ObservableValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libObservablemapMod {
  
  @JSImport("mobservable/lib/observablemap", "ObservableMap")
  @js.native
  open class ObservableMap[V] () extends StObject {
    def this(initialData: Entries[V]) = this()
    def this(initialData: KeyValueMap[V]) = this()
    def this(initialData: Unit, valueModeFunc: js.Function) = this()
    def this(initialData: Entries[V], valueModeFunc: js.Function) = this()
    def this(initialData: KeyValueMap[V], valueModeFunc: js.Function) = this()
    
    /* private */ var _data: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    def _has(key: String): Boolean = js.native
    
    /* private */ var _hasMap: Any = js.native
    
    /* private */ var _keys: Any = js.native
    
    def _updateHasMapEntry(key: String, value: Boolean): ObservableValue[Boolean] = js.native
    
    /* private */ var _valueMode: Any = js.native
    
    /* private */ def assertValidKey(key: Any): Any = js.native
    
    def clear(): Unit = js.native
    
    def delete(key: String): Unit = js.native
    
    def entries(): Entries[V] = js.native
    
    def forEach(callback: js.Function3[/* value */ V, /* key */ String, /* object */ KeyValueMap[V], Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* value */ V, /* key */ String, /* object */ KeyValueMap[V], Unit],
      thisArg: Any
    ): Unit = js.native
    
    def get(key: String): V = js.native
    
    def has(key: String): Boolean = js.native
    
    /* private */ def isValidKey(key: Any): Any = js.native
    
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
