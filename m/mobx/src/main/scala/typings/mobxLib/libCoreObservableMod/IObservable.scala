package typings
package mobxLib.libCoreObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservable extends IDepTreeNode {
  var diffValue: scala.Double
  var isBeingObserved: scala.Boolean
  var isPendingUnobservation: scala.Boolean
  /**
    * Id of the derivation *run* that last accessed this observable.
    * If this id equals the *run* id of the current derivation,
    * the dependency is already established
    */
  var lastAccessedBy: scala.Double
  var lowestObserverState: mobxLib.libCoreDerivationMod.IDerivationState
  var observers: stdLib.Set[mobxLib.libCoreDerivationMod.IDerivation]
  var onBecomeObservedListeners: js.UndefOr[stdLib.Set[mobxLib.libUtilsUtilsMod.Lambda]]
  var onBecomeUnobservedListeners: js.UndefOr[stdLib.Set[mobxLib.libUtilsUtilsMod.Lambda]]
  def onBecomeObserved(): scala.Unit
  def onBecomeUnobserved(): scala.Unit
}

object IObservable {
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
    observing: js.Array[IObservable] = null,
    onBecomeObservedListeners: stdLib.Set[mobxLib.libUtilsUtilsMod.Lambda] = null,
    onBecomeUnobservedListeners: stdLib.Set[mobxLib.libUtilsUtilsMod.Lambda] = null
  ): IObservable = {
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
    if (observing != null) __obj.updateDynamic("observing")(observing)
    if (onBecomeObservedListeners != null) __obj.updateDynamic("onBecomeObservedListeners")(onBecomeObservedListeners)
    if (onBecomeUnobservedListeners != null) __obj.updateDynamic("onBecomeUnobservedListeners")(onBecomeUnobservedListeners)
    __obj.asInstanceOf[IObservable]
  }
}

