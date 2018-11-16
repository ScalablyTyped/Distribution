package typings
package mobservableLib.libObservablemapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/observablemap", "ObservableMap")
@js.native
class ObservableMap[V] () extends js.Object {
  def this(initialData: Entries[V]) = this()
  def this(initialData: KeyValueMap[V]) = this()
  def this(initialData: Entries[V], valueModeFunc: js.Function) = this()
  def this(initialData: KeyValueMap[V], valueModeFunc: js.Function) = this()
  var _data: js.Any = js.native
  var _events: js.Any = js.native
  var _hasMap: js.Any = js.native
  var _keys: js.Any = js.native
  var _valueMode: js.Any = js.native
  var size: scala.Double = js.native
  def _has(key: java.lang.String): scala.Boolean = js.native
  def _updateHasMapEntry(key: java.lang.String, value: scala.Boolean): mobservableLib.libObservablevalueMod.ObservableValue[scala.Boolean] = js.native
  /* private */ def assertValidKey(key: js.Any): js.Any = js.native
  def clear(): scala.Unit = js.native
  def delete(key: java.lang.String): scala.Unit = js.native
  def entries(): Entries[V] = js.native
  def forEach(
    callback: js.Function3[/* value */ V, /* key */ java.lang.String, /* object */ KeyValueMap[V], scala.Unit]
  ): scala.Unit = js.native
  def forEach(
    callback: js.Function3[/* value */ V, /* key */ java.lang.String, /* object */ KeyValueMap[V], scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  def get(key: java.lang.String): V = js.native
  def has(key: java.lang.String): scala.Boolean = js.native
  /* private */ def isValidKey(key: js.Any): js.Any = js.native
  def keys(): js.Array[java.lang.String] = js.native
  def merge(other: KeyValueMap[V]): ObservableMap[V] = js.native
  def merge(other: ObservableMap[V]): ObservableMap[V] = js.native
  def observe(callback: js.Function1[/* changes */ IObservableMapChange[V], scala.Unit]): mobservableLib.libInterfacesMod.Lambda = js.native
  def set(key: java.lang.String, value: V): scala.Unit = js.native
  def toJs(): KeyValueMap[V] = js.native
  def values(): js.Array[V] = js.native
}

