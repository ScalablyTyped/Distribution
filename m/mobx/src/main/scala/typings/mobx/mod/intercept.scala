package typings.mobx.mod

import typings.mobx.interceptUtilsMod.IInterceptor
import typings.mobx.observablearrayMod.IArrayWillChange
import typings.mobx.observablearrayMod.IArrayWillSplice
import typings.mobx.observablearrayMod.IObservableArray
import typings.mobx.observablemapMod.IMapWillChange
import typings.mobx.observableobjectMod.IObjectWillChange
import typings.mobx.observablesetMod.ISetWillChange
import typings.mobx.observablevalueMod.IObservableValue
import typings.mobx.observablevalueMod.IValueWillChange
import typings.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "intercept")
@js.native
object intercept extends js.Object {
  def apply(`object`: js.Object, handler: IInterceptor[IObjectWillChange]): Lambda = js.native
  def apply[T](
    observableArray: IObservableArray[T],
    handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]
  ): Lambda = js.native
  def apply[V](observableMap: typings.mobx.internalMod.ObservableSet[V], handler: IInterceptor[ISetWillChange[V]]): Lambda = js.native
  def apply[T](value: IObservableValue[T], handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
  def apply[T /* <: js.Object */, K /* <: String */](`object`: T, property: K, handler: IInterceptor[IValueWillChange[_]]): Lambda = js.native
  def apply[K, V](
    observableMap: typings.mobx.internalMod.ObservableMap[K, V],
    handler: IInterceptor[IMapWillChange[K, V]]
  ): Lambda = js.native
  def apply[K, V](
    observableMap: typings.mobx.internalMod.ObservableMap[K, V],
    property: K,
    handler: IInterceptor[IValueWillChange[V]]
  ): Lambda = js.native
}

