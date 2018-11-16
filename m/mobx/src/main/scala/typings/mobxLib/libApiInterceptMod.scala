package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/intercept", JSImport.Namespace)
@js.native
object libApiInterceptMod extends js.Object {
  def intercept(
    `object`: js.Object,
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[mobxLib.libTypesObservableobjectMod.IObjectWillChange]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def intercept[T](
    observableArray: mobxLib.libTypesObservablearrayMod.IObservableArray[T],
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[
      mobxLib.libTypesObservablearrayMod.IArrayWillChange[T] | mobxLib.libTypesObservablearrayMod.IArrayWillSplice[T]
    ]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def intercept[T](
    value: mobxLib.libTypesObservablevalueMod.IObservableValue[T],
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[mobxLib.libTypesObservablevalueMod.IValueWillChange[T]]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def intercept[T /* <: js.Object */, K /* <: java.lang.String */](
    `object`: T,
    property: K,
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[mobxLib.libTypesObservablevalueMod.IValueWillChange[_]]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def intercept[K, V](
    observableMap: mobxLib.libInternalMod.ObservableMap[K, V],
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[mobxLib.libTypesObservablemapMod.IMapWillChange[K, V]]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def intercept[K, V](
    observableMap: mobxLib.libInternalMod.ObservableMap[K, V],
    property: K,
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[mobxLib.libTypesObservablevalueMod.IValueWillChange[V]]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
}

