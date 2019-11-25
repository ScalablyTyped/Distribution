package typings.mobx

import org.scalablytyped.runtime.StringDictionary
import typings.mobx.libInternalMod.ObservableMap
import typings.mobx.libInternalMod.ObservableSet
import typings.mobx.libTypesObservablearrayMod.IObservableArray
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/object-api", JSImport.Namespace)
@js.native
object libApiObjectDashApiMod extends js.Object {
  def entries[T](ar: IObservableArray[T]): js.Array[js.Tuple2[Double, T]] = js.native
  def entries[T](obj: T): js.Array[
    js.Tuple2[
      String, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def entries[T](set: ObservableSet[T]): js.Array[js.Tuple2[T, T]] = js.native
  def entries[K, T](map: ObservableMap[K, T]): js.Array[js.Tuple2[K, T]] = js.native
  def get[T /* <: js.Object */](obj: T, key: String): js.Any = js.native
  def get[T](obj: IObservableArray[T], index: Double): js.UndefOr[T] = js.native
  def get[K, V](obj: ObservableMap[K, V], key: K): js.UndefOr[V] = js.native
  def has[T /* <: js.Object */](obj: T, key: String): Boolean = js.native
  def has[K](obj: ObservableMap[K, _], key: K): Boolean = js.native
  def has[T](obj: ObservableSet[T], key: T): Boolean = js.native
  def has[T](obj: IObservableArray[T], index: Double): Boolean = js.native
  def keys[T](ar: IObservableArray[T]): js.Array[Double] = js.native
  def keys[K](map: ObservableMap[K, _]): js.Array[K] = js.native
  def keys[T /* <: js.Object */](obj: T): js.Array[PropertyKey] = js.native
  def keys[T](set: ObservableSet[T]): js.Array[T] = js.native
  def remove[T /* <: js.Object */](obj: T, key: String): js.Any = js.native
  def remove[T](obj: ObservableSet[T], key: T): js.Any = js.native
  def remove[T](obj: IObservableArray[T], index: Double): js.Any = js.native
  def remove[K, V](obj: ObservableMap[K, V], key: K): js.Any = js.native
  def set[T /* <: js.Object */](obj: T, key: PropertyKey, value: js.Any): js.Any = js.native
  def set[T /* <: js.Object */](obj: T, values: StringDictionary[js.Any]): js.Any = js.native
  def set[V](obj: ObservableMap[PropertyKey, V], values: StringDictionary[V]): js.Any = js.native
  def set[T](obj: ObservableSet[T], value: T): js.Any = js.native
  def set[T](obj: IObservableArray[T], index: Double, value: T): js.Any = js.native
  def set[K, V](obj: ObservableMap[K, V], key: K, value: V): js.Any = js.native
  def values[T](ar: IObservableArray[T]): js.Array[T] = js.native
  def values[T](obj: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def values[T](set: ObservableSet[T]): js.Array[T] = js.native
  def values[K, T](map: ObservableMap[K, T]): js.Array[T] = js.native
}

