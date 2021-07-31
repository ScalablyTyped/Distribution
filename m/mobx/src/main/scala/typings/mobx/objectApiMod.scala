package typings.mobx

import org.scalablytyped.runtime.StringDictionary
import typings.mobx.internalMod.ObservableMap
import typings.mobx.internalMod.ObservableSet
import typings.mobx.observablearrayMod.IObservableArray
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectApiMod {
  
  @JSImport("mobx/lib/api/object-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def entries[T](ar: IObservableArray[T]): js.Array[js.Tuple2[Double, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(ar.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[Double, T]]]
  @scala.inline
  def entries[T](obj: T): js.Array[
    js.Tuple2[
      String, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    js.Tuple2[
      String, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]]
  @scala.inline
  def entries[T](set: ObservableSet[T]): js.Array[js.Tuple2[T, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(set.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[T, T]]]
  @scala.inline
  def entries[K, T](map: ObservableMap[K, T]): js.Array[js.Tuple2[K, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(map.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[K, T]]]
  
  @scala.inline
  def get[T /* <: js.Object */](obj: T, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def get[T](obj: IObservableArray[T], index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  @scala.inline
  def get[K, V](obj: ObservableMap[K, V], key: K): js.UndefOr[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[V]]
  
  @scala.inline
  def has[T /* <: js.Object */](obj: T, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def has[K](obj: ObservableMap[K, js.Any], key: K): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def has[T](obj: ObservableSet[T], key: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def has[T](obj: IObservableArray[T], index: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def keys[T](ar: IObservableArray[T]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(ar.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def keys[K](map: ObservableMap[K, js.Any]): js.Array[K] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(map.asInstanceOf[js.Any]).asInstanceOf[js.Array[K]]
  @scala.inline
  def keys[T /* <: js.Object */](obj: T): js.Array[PropertyKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[PropertyKey]]
  @scala.inline
  def keys[T](set: ObservableSet[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(set.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def remove[T /* <: js.Object */](obj: T, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def remove[T](obj: ObservableSet[T], key: T): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def remove[T](obj: IObservableArray[T], index: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(obj.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def remove[K, V](obj: ObservableMap[K, V], key: K): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def set[T /* <: js.Object */](obj: T, key: PropertyKey, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def set[T /* <: js.Object */](obj: T, values: StringDictionary[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def set[V](obj: ObservableMap[PropertyKey, V], values: StringDictionary[V]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def set[T](obj: ObservableSet[T], value: T): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def set[T](obj: IObservableArray[T], index: Double, value: T): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def set[K, V](obj: ObservableMap[K, V], key: K, value: V): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def values[T](ar: IObservableArray[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(ar.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def values[T](obj: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]]
  @scala.inline
  def values[T](set: ObservableSet[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(set.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def values[K, T](map: ObservableMap[K, T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(map.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
