package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/object-api", JSImport.Namespace)
@js.native
object libApiObjectDashApiMod extends js.Object {
  def entries[T](ar: mobxLib.libTypesObservablearrayMod.IObservableArray[T]): js.Array[js.Tuple2[scala.Double, T]] = js.native
  def entries[T](obj: T): js.Array[js.Tuple2[java.lang.String, _]] = js.native
  def entries[K, T](map: mobxLib.libInternalMod.ObservableMap[K, T]): js.Array[js.Tuple2[K, T]] = js.native
  def get[T /* <: js.Object */](obj: T, key: java.lang.String): js.Any = js.native
  def get[T](obj: mobxLib.libTypesObservablearrayMod.IObservableArray[T], index: scala.Double): js.UndefOr[T] = js.native
  def get[K, V](obj: mobxLib.libInternalMod.ObservableMap[K, V], key: K): js.UndefOr[V] = js.native
  def has[T /* <: js.Object */](obj: T, key: java.lang.String): scala.Boolean = js.native
  def has[K](obj: mobxLib.libInternalMod.ObservableMap[K, _], key: K): scala.Boolean = js.native
  def has[T](obj: mobxLib.libTypesObservablearrayMod.IObservableArray[T], index: scala.Double): scala.Boolean = js.native
  def keys[T](ar: mobxLib.libTypesObservablearrayMod.IObservableArray[T]): js.Array[scala.Double] = js.native
  def keys[K](map: mobxLib.libInternalMod.ObservableMap[K, _]): js.Array[K] = js.native
  def keys[T /* <: js.Object */](obj: T): js.Array[java.lang.String] = js.native
  def remove[T /* <: js.Object */](obj: T, key: java.lang.String): js.Any = js.native
  def remove[T](obj: mobxLib.libTypesObservablearrayMod.IObservableArray[T], index: scala.Double): js.Any = js.native
  def remove[K, V](obj: mobxLib.libInternalMod.ObservableMap[K, V], key: K): js.Any = js.native
  def set[T /* <: js.Object */](obj: T, key: java.lang.String, value: js.Any): js.Any = js.native
  def set[T /* <: js.Object */](obj: T, values: ScalablyTyped.runtime.StringDictionary[js.Any]): js.Any = js.native
  def set[V](
    obj: mobxLib.libInternalMod.ObservableMap[java.lang.String, V],
    values: ScalablyTyped.runtime.StringDictionary[V]
  ): js.Any = js.native
  def set[T](obj: mobxLib.libTypesObservablearrayMod.IObservableArray[T], index: scala.Double, value: T): js.Any = js.native
  def set[K, V](obj: mobxLib.libInternalMod.ObservableMap[K, V], key: K, value: V): js.Any = js.native
  def values[T](ar: mobxLib.libTypesObservablearrayMod.IObservableArray[T]): js.Array[T] = js.native
  def values[T](obj: T): js.Array[_] = js.native
  def values[K, T](map: mobxLib.libInternalMod.ObservableMap[K, T]): js.Array[T] = js.native
}

