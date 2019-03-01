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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("diffValue")(diffValue)
    __obj.updateDynamic("isBeingObserved")(isBeingObserved)
    __obj.updateDynamic("isPendingUnobservation")(isPendingUnobservation)
    __obj.updateDynamic("lastAccessedBy")(lastAccessedBy)
    __obj.updateDynamic("lowestObserverState")(lowestObserverState)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("observers")(observers)
    __obj.updateDynamic("onBecomeObserved")(onBecomeObserved)
    __obj.updateDynamic("onBecomeUnobserved")(onBecomeUnobserved)
    __obj.updateDynamic("reportChanged")(reportChanged)
    __obj.updateDynamic("reportObserved")(reportObserved)
    if (observing != null) __obj.updateDynamic("observing")(observing)
    if (onBecomeObservedListeners != null) __obj.updateDynamic("onBecomeObservedListeners")(onBecomeObservedListeners)
    if (onBecomeUnobservedListeners != null) __obj.updateDynamic("onBecomeUnobservedListeners")(onBecomeUnobservedListeners)
    __obj.asInstanceOf[IAtom]
  }
}

