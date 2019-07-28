package typings.mobx.libCoreObservableMod

import typings.mobx.libCoreDerivationMod.IDerivation
import typings.mobx.libCoreDerivationMod.IDerivationState
import typings.mobx.libUtilsUtilsMod.Lambda
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservable extends IDepTreeNode {
  var diffValue: Double
  var isBeingObserved: Boolean
  var isPendingUnobservation: Boolean
  /**
    * Id of the derivation *run* that last accessed this observable.
    * If this id equals the *run* id of the current derivation,
    * the dependency is already established
    */
  var lastAccessedBy: Double
  var lowestObserverState: IDerivationState
  var observers: Set[IDerivation]
  var onBecomeObservedListeners: js.UndefOr[Set[Lambda]] = js.undefined
  var onBecomeUnobservedListeners: js.UndefOr[Set[Lambda]] = js.undefined
  def onBecomeObserved(): Unit
  def onBecomeUnobserved(): Unit
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
    onBecomeUnobserved: () => Unit,
    observing: js.Array[IObservable] = null,
    onBecomeObservedListeners: Set[Lambda] = null,
    onBecomeUnobservedListeners: Set[Lambda] = null
  ): IObservable = {
    val __obj = js.Dynamic.literal(diffValue = diffValue, isBeingObserved = isBeingObserved, isPendingUnobservation = isPendingUnobservation, lastAccessedBy = lastAccessedBy, lowestObserverState = lowestObserverState, name = name, observers = observers, onBecomeObserved = js.Any.fromFunction0(onBecomeObserved), onBecomeUnobserved = js.Any.fromFunction0(onBecomeUnobserved))
    if (observing != null) __obj.updateDynamic("observing")(observing)
    if (onBecomeObservedListeners != null) __obj.updateDynamic("onBecomeObservedListeners")(onBecomeObservedListeners)
    if (onBecomeUnobservedListeners != null) __obj.updateDynamic("onBecomeUnobservedListeners")(onBecomeUnobservedListeners)
    __obj.asInstanceOf[IObservable]
  }
}

