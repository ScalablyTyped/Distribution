package typings.mobx.mod

import typings.mobx.computedvalueMod.IComputedValue
import typings.mobx.coreObservableMod.IObservable
import typings.mobx.observablearrayMod.IObservableArray
import typings.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx", "onBecomeObserved")
@js.native
object onBecomeObserved extends js.Object {
  def apply(value: IComputedValue[_], listener: Lambda): Lambda = js.native
  def apply(value: IObservable, listener: Lambda): Lambda = js.native
  def apply(value: IObservableArray[_], listener: Lambda): Lambda = js.native
  def apply(value: typings.mobx.observablemapMod.ObservableMap[_, _], listener: Lambda): Lambda = js.native
  def apply(value: typings.mobx.observablesetMod.ObservableSet[_], listener: Lambda): Lambda = js.native
  def apply[K, V](value: js.Object, property: K, listener: Lambda): Lambda = js.native
  def apply[K, V](value: typings.mobx.observablemapMod.ObservableMap[K, V], property: K, listener: Lambda): Lambda = js.native
}

