package typings.mobx.internalMod

import typings.mobx.interceptReadMod.ReadInterceptor
import typings.mobx.observablearrayMod.IObservableArray
import typings.mobx.observablevalueMod.IObservableValue
import typings.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/internal", "interceptReads")
@js.native
object interceptReads extends js.Object {
  def apply(`object`: js.Object, property: String, handler: ReadInterceptor[_]): Lambda = js.native
  def apply[T](observableArray: IObservableArray[T], handler: ReadInterceptor[T]): Lambda = js.native
  def apply[V](observableSet: ObservableSet[V], handler: ReadInterceptor[V]): Lambda = js.native
  def apply[T](value: IObservableValue[T], handler: ReadInterceptor[T]): Lambda = js.native
  def apply[K, V](observableMap: ObservableMap[K, V], handler: ReadInterceptor[V]): Lambda = js.native
}

