package typings.mobx

import typings.mobx.computedvalueMod.IComputedValue
import typings.mobx.coreObservableMod.IObservable
import typings.mobx.internalMod.ObservableMap
import typings.mobx.internalMod.ObservableSet
import typings.mobx.observablearrayMod.IObservableArray
import typings.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object becomeObservedMod {
  
  @JSImport("mobx/lib/api/become-observed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def onBecomeObserved(value: IComputedValue[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeObserved(value: IObservable, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeObserved(value: ObservableMap[js.Any, js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeObserved(value: ObservableSet[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeObserved(value: IObservableArray[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeObserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeObserved[K, V](value: ObservableMap[K, V], property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  @scala.inline
  def onBecomeUnobserved(value: IComputedValue[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeUnobserved(value: IObservable, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeUnobserved(value: ObservableMap[js.Any, js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeUnobserved(value: ObservableSet[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeUnobserved(value: IObservableArray[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeUnobserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeUnobserved[K, V](value: ObservableMap[K, V], property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
}
