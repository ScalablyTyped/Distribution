package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/become-observed", JSImport.Namespace)
@js.native
object libApiBecomeDashObservedMod extends js.Object {
  def onBecomeObserved(
    value: mobxLib.libCoreComputedvalueMod.IComputedValue[_],
    listener: mobxLib.libUtilsUtilsMod.Lambda
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeObserved(value: mobxLib.libCoreObservableMod.IObservable, listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeObserved(value: mobxLib.libInternalMod.ObservableMap[_, _], listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeObserved(
    value: mobxLib.libTypesObservablearrayMod.IObservableArray[_],
    listener: mobxLib.libUtilsUtilsMod.Lambda
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeObserved[K, V](value: js.Object, property: K, listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeObserved[K, V](
    value: mobxLib.libInternalMod.ObservableMap[K, V],
    property: K,
    listener: mobxLib.libUtilsUtilsMod.Lambda
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved(
    value: mobxLib.libCoreComputedvalueMod.IComputedValue[_],
    listener: mobxLib.libUtilsUtilsMod.Lambda
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved(value: mobxLib.libCoreObservableMod.IObservable, listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved(value: mobxLib.libInternalMod.ObservableMap[_, _], listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved(
    value: mobxLib.libTypesObservablearrayMod.IObservableArray[_],
    listener: mobxLib.libUtilsUtilsMod.Lambda
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved[K, V](value: js.Object, property: K, listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved[K, V](
    value: mobxLib.libInternalMod.ObservableMap[K, V],
    property: K,
    listener: mobxLib.libUtilsUtilsMod.Lambda
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
}

