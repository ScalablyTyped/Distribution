package typings.mobx

import typings.mobx.libInternalMod.ObservableMap
import typings.mobx.libInternalMod.ObservableSet
import typings.mobx.libTypesInterceptDashUtilsMod.IInterceptor
import typings.mobx.libTypesObservablearrayMod.IArrayWillChange
import typings.mobx.libTypesObservablearrayMod.IArrayWillSplice
import typings.mobx.libTypesObservablearrayMod.IObservableArray
import typings.mobx.libTypesObservablemapMod.IMapWillChange
import typings.mobx.libTypesObservableobjectMod.IObjectWillChange
import typings.mobx.libTypesObservablesetMod.ISetWillChange
import typings.mobx.libTypesObservablevalueMod.IObservableValue
import typings.mobx.libTypesObservablevalueMod.IValueWillChange
import typings.mobx.libUtilsUtilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/intercept", JSImport.Namespace)
@js.native
object libApiInterceptMod extends js.Object {
  def intercept(`object`: js.Object, handler: IInterceptor[IObjectWillChange]): Lambda = js.native
  def intercept[T](
    observableArray: IObservableArray[T],
    handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]
  ): Lambda = js.native
  def intercept[V](observableMap: ObservableSet[V], handler: IInterceptor[ISetWillChange[V]]): Lambda = js.native
  def intercept[T](value: IObservableValue[T], handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
  def intercept[T /* <: js.Object */, K /* <: String */](`object`: T, property: K, handler: IInterceptor[IValueWillChange[_]]): Lambda = js.native
  def intercept[K, V](observableMap: ObservableMap[K, V], handler: IInterceptor[IMapWillChange[K, V]]): Lambda = js.native
  def intercept[K, V](observableMap: ObservableMap[K, V], property: K, handler: IInterceptor[IValueWillChange[V]]): Lambda = js.native
}

