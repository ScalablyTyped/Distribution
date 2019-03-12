package typings
package mobxLib.libApiInterceptDashReadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/intercept-read", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def interceptReads(`object`: js.Object, property: java.lang.String, handler: ReadInterceptor[_]): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def interceptReads[T](
    observableArray: mobxLib.libTypesObservablearrayMod.IObservableArray[T],
    handler: ReadInterceptor[T]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def interceptReads[V](observableSet: mobxLib.libInternalMod.ObservableSet[V], handler: ReadInterceptor[V]): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def interceptReads[T](value: mobxLib.libTypesObservablevalueMod.IObservableValue[T], handler: ReadInterceptor[T]): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def interceptReads[K, V](observableMap: mobxLib.libInternalMod.ObservableMap[K, V], handler: ReadInterceptor[V]): mobxLib.libUtilsUtilsMod.Lambda = js.native
}

