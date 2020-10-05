package typings.mobx

import typings.mobx.internalMod.ObservableMap
import typings.mobx.internalMod.ObservableSet
import typings.mobx.observablearrayMod.IObservableArray
import typings.mobx.observablevalueMod.IObservableValue
import typings.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/api/intercept-read", JSImport.Namespace)
@js.native
object interceptReadMod extends js.Object {
  def interceptReads(`object`: js.Object, property: String, handler: ReadInterceptor[_]): Lambda = js.native
  def interceptReads[T](observableArray: IObservableArray[T], handler: ReadInterceptor[T]): Lambda = js.native
  def interceptReads[V](observableSet: ObservableSet[V], handler: ReadInterceptor[V]): Lambda = js.native
  def interceptReads[T](value: IObservableValue[T], handler: ReadInterceptor[T]): Lambda = js.native
  def interceptReads[K, V](observableMap: ObservableMap[K, V], handler: ReadInterceptor[V]): Lambda = js.native
  type ReadInterceptor[T] = js.Function1[/* value */ js.Any, T]
}

