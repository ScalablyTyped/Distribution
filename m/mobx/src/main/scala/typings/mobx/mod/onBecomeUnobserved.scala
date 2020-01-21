package typings.mobx.mod

import typings.mobx.computedvalueMod.IComputedValue
import typings.mobx.coreObservableMod.IObservable
import typings.mobx.observablearrayMod.IObservableArray
import typings.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "onBecomeUnobserved")
@js.native
object onBecomeUnobserved extends js.Object {
  def apply(value: IComputedValue[_], listener: Lambda): Lambda = js.native
  def apply(value: IObservable, listener: Lambda): Lambda = js.native
  def apply(value: typings.mobx.internalMod.ObservableMap[_, _], listener: Lambda): Lambda = js.native
  def apply(value: typings.mobx.internalMod.ObservableSet[_], listener: Lambda): Lambda = js.native
  def apply(value: IObservableArray[_], listener: Lambda): Lambda = js.native
  def apply[K, V](value: js.Object, property: K, listener: Lambda): Lambda = js.native
  def apply[K, V](value: typings.mobx.internalMod.ObservableMap[K, V], property: K, listener: Lambda): Lambda = js.native
}

