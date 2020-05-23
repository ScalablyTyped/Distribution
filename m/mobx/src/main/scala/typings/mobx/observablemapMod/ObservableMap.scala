package typings.mobx.observablemapMod

import typings.mobx.interceptUtilsMod.IInterceptable
import typings.mobx.interceptUtilsMod.IInterceptor
import typings.mobx.listenUtilsMod.IListenable
import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.utilsMod.Lambda
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/observablemap", "ObservableMap")
@js.native
class ObservableMap[K, V] ()
  extends Map[K, V]
     with IInterceptable[IMapWillChange[K, V]]
     with IListenable {
  def this(initialData: IObservableMapInitialValues[K, V]) = this()
  def this(initialData: IObservableMapInitialValues[K, V], enhancer: IEnhancer[V]) = this()
  def this(initialData: IObservableMapInitialValues[K, V], enhancer: IEnhancer[V], name: String) = this()
  var _addValue: js.Any = js.native
  var _data: js.Any = js.native
  var _has: js.Any = js.native
  var _hasMap: js.Any = js.native
  var _keysAtom: js.Any = js.native
  var _updateHasMapEntry: js.Any = js.native
  var _updateValue: js.Any = js.native
  var dehanceValue: js.Any = js.native
  var dehancer: js.Any = js.native
  @JSName("enhancer")
  var enhancer_Original: IEnhancer[V] = js.native
  var name: String = js.native
  @JSName(js.Symbol.toStringTag)
  var toStringTag_ObservableMap: typings.mobx.mobxStrings.Map = js.native
  def enhancer(newValue: V, oldValue: js.UndefOr[V], name: String): V = js.native
  /* CompleteClass */
  override def intercept(handler: IInterceptor[IMapWillChange[K, V]]): Lambda = js.native
  def merge(other: js.Any): ObservableMap[K, V] = js.native
  def merge(other: IKeyValueMap[V]): ObservableMap[K, V] = js.native
  /** Merge another object into this object, returns this. */
  def merge(other: ObservableMap[K, V]): ObservableMap[K, V] = js.native
  /**
    * Observes this object. Triggers for the events 'add', 'update' and 'delete'.
    * See: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/observe
    * for callback details
    */
  def observe(listener: js.Function1[/* changes */ IMapDidChange[K, V], Unit]): Lambda = js.native
  def observe(listener: js.Function1[/* changes */ IMapDidChange[K, V], Unit], fireImmediately: Boolean): Lambda = js.native
  def replace(values: js.Any): ObservableMap[K, V] = js.native
  def replace(values: IKeyValueMap[V]): ObservableMap[K, V] = js.native
  def replace(values: ObservableMap[K, V]): ObservableMap[K, V] = js.native
  /**
    * Returns a shallow non observable object clone of this map.
    * Note that the values migth still be observable. For a deep clone use mobx.toJS.
    */
  def toJS(): Map[K, V] = js.native
  def toJSON(): IKeyValueMap[V] = js.native
  /**
    * Returns a plain object that represents this map.
    * Note that all the keys being stringified.
    * If there are duplicating keys after converting them to strings, behaviour is undetermined.
    */
  def toPOJO(): IKeyValueMap[V] = js.native
}

