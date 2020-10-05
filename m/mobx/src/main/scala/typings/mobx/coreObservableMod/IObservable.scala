package typings.mobx.coreObservableMod

import typings.mobx.derivationMod.IDerivation
import typings.mobx.derivationMod.IDerivationState
import typings.mobx.utilsMod.Lambda
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObservable extends IDepTreeNode {
  var diffValue: Double = js.native
  var isBeingObserved: Boolean = js.native
  var isPendingUnobservation: Boolean = js.native
  /**
    * Id of the derivation *run* that last accessed this observable.
    * If this id equals the *run* id of the current derivation,
    * the dependency is already established
    */
  var lastAccessedBy: Double = js.native
  var lowestObserverState: IDerivationState = js.native
  var observers: Set[IDerivation] = js.native
  var onBecomeObservedListeners: js.UndefOr[Set[Lambda]] = js.native
  var onBecomeUnobservedListeners: js.UndefOr[Set[Lambda]] = js.native
  def onBecomeObserved(): Unit = js.native
  def onBecomeUnobserved(): Unit = js.native
}

object IObservable {
  @scala.inline
  def apply(
    diffValue: Double,
    isBeingObserved: Boolean,
    isPendingUnobservation: Boolean,
    lastAccessedBy: Double,
    lowestObserverState: IDerivationState,
    name: String,
    observers: Set[IDerivation],
    onBecomeObserved: () => Unit,
    onBecomeUnobserved: () => Unit
  ): IObservable = {
    val __obj = js.Dynamic.literal(diffValue = diffValue.asInstanceOf[js.Any], isBeingObserved = isBeingObserved.asInstanceOf[js.Any], isPendingUnobservation = isPendingUnobservation.asInstanceOf[js.Any], lastAccessedBy = lastAccessedBy.asInstanceOf[js.Any], lowestObserverState = lowestObserverState.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], onBecomeObserved = js.Any.fromFunction0(onBecomeObserved), onBecomeUnobserved = js.Any.fromFunction0(onBecomeUnobserved))
    __obj.asInstanceOf[IObservable]
  }
  @scala.inline
  implicit class IObservableOps[Self <: IObservable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDiffValue(value: Double): Self = this.set("diffValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBeingObserved(value: Boolean): Self = this.set("isBeingObserved", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPendingUnobservation(value: Boolean): Self = this.set("isPendingUnobservation", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastAccessedBy(value: Double): Self = this.set("lastAccessedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setLowestObserverState(value: IDerivationState): Self = this.set("lowestObserverState", value.asInstanceOf[js.Any])
    @scala.inline
    def setObservers(value: Set[IDerivation]): Self = this.set("observers", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBecomeObserved(value: () => Unit): Self = this.set("onBecomeObserved", js.Any.fromFunction0(value))
    @scala.inline
    def setOnBecomeUnobserved(value: () => Unit): Self = this.set("onBecomeUnobserved", js.Any.fromFunction0(value))
    @scala.inline
    def setOnBecomeObservedListeners(value: Set[Lambda]): Self = this.set("onBecomeObservedListeners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBecomeObservedListeners: Self = this.set("onBecomeObservedListeners", js.undefined)
    @scala.inline
    def setOnBecomeUnobservedListeners(value: Set[Lambda]): Self = this.set("onBecomeUnobservedListeners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBecomeUnobservedListeners: Self = this.set("onBecomeUnobservedListeners", js.undefined)
  }
  
}

