package typings
package mobxLib.libCoreAtomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAtom
  extends mobxLib.libCoreObservableMod.IObservable {
  def reportChanged(): js.Any
  def reportObserved(): js.Any
}

object IAtom {
  @scala.inline
  def apply(
    diffValue: scala.Double,
    isBeingObserved: scala.Boolean,
    isPendingUnobservation: scala.Boolean,
    lastAccessedBy: scala.Double,
    lowestObserverState: mobxLib.libCoreDerivationMod.IDerivationState,
    name: java.lang.String,
    observers: stdLib.Set[mobxLib.libCoreDerivationMod.IDerivation],
    onBecomeObserved: js.Function0[scala.Unit],
    onBecomeUnobserved: js.Function0[scala.Unit],
    reportChanged: js.Function0[js.Any],
    reportObserved: js.Function0[js.Any],
    observing: js.Array[mobxLib.libCoreObservableMod.IObservable] = null,
    onBecomeObservedListeners: stdLib.Set[mobxLib.libUtilsUtilsMod.Lambda] = null,
    onBecomeUnobservedListeners: stdLib.Set[mobxLib.libUtilsUtilsMod.Lambda] = null
  ): IAtom = {
    val __obj = js.Dynamic.literal(diffValue = diffValue, isBeingObserved = isBeingObserved, isPendingUnobservation = isPendingUnobservation, lastAccessedBy = lastAccessedBy, lowestObserverState = lowestObserverState, name = name, observers = observers, onBecomeObserved = onBecomeObserved, onBecomeUnobserved = onBecomeUnobserved, reportChanged = reportChanged, reportObserved = reportObserved)
    if (observing != null) __obj.updateDynamic("observing")(observing)
    if (onBecomeObservedListeners != null) __obj.updateDynamic("onBecomeObservedListeners")(onBecomeObservedListeners)
    if (onBecomeUnobservedListeners != null) __obj.updateDynamic("onBecomeUnobservedListeners")(onBecomeUnobservedListeners)
    __obj.asInstanceOf[IAtom]
  }
}

