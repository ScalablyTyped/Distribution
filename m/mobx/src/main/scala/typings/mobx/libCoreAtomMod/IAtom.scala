package typings.mobx.libCoreAtomMod

import typings.mobx.libCoreDerivationMod.IDerivation
import typings.mobx.libCoreDerivationMod.IDerivationState
import typings.mobx.libCoreObservableMod.IObservable
import typings.mobx.libUtilsUtilsMod.Lambda
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAtom extends IObservable {
  def reportChanged(): js.Any
  def reportObserved(): js.Any
}

object IAtom {
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
    reportChanged: () => js.Any,
    reportObserved: () => js.Any,
    observing: js.Array[IObservable] = null,
    onBecomeObservedListeners: Set[Lambda] = null,
    onBecomeUnobservedListeners: Set[Lambda] = null
  ): IAtom = {
    val __obj = js.Dynamic.literal(diffValue = diffValue.asInstanceOf[js.Any], isBeingObserved = isBeingObserved.asInstanceOf[js.Any], isPendingUnobservation = isPendingUnobservation.asInstanceOf[js.Any], lastAccessedBy = lastAccessedBy.asInstanceOf[js.Any], lowestObserverState = lowestObserverState.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], onBecomeObserved = js.Any.fromFunction0(onBecomeObserved), onBecomeUnobserved = js.Any.fromFunction0(onBecomeUnobserved), reportChanged = js.Any.fromFunction0(reportChanged), reportObserved = js.Any.fromFunction0(reportObserved))
    if (observing != null) __obj.updateDynamic("observing")(observing.asInstanceOf[js.Any])
    if (onBecomeObservedListeners != null) __obj.updateDynamic("onBecomeObservedListeners")(onBecomeObservedListeners.asInstanceOf[js.Any])
    if (onBecomeUnobservedListeners != null) __obj.updateDynamic("onBecomeUnobservedListeners")(onBecomeUnobservedListeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAtom]
  }
}

