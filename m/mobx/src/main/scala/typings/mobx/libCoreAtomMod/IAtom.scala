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
    val __obj = js.Dynamic.literal(diffValue = diffValue, isBeingObserved = isBeingObserved, isPendingUnobservation = isPendingUnobservation, lastAccessedBy = lastAccessedBy, lowestObserverState = lowestObserverState, name = name, observers = observers, onBecomeObserved = js.Any.fromFunction0(onBecomeObserved), onBecomeUnobserved = js.Any.fromFunction0(onBecomeUnobserved), reportChanged = js.Any.fromFunction0(reportChanged), reportObserved = js.Any.fromFunction0(reportObserved))
    if (observing != null) __obj.updateDynamic("observing")(observing)
    if (onBecomeObservedListeners != null) __obj.updateDynamic("onBecomeObservedListeners")(onBecomeObservedListeners)
    if (onBecomeUnobservedListeners != null) __obj.updateDynamic("onBecomeUnobservedListeners")(onBecomeUnobservedListeners)
    __obj.asInstanceOf[IAtom]
  }
}

