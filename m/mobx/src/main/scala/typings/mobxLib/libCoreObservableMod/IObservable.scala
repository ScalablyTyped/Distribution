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
  var onBecomeObservedListeners: js.UndefOr[stdLib.Set[mobxLib.libUtilsUtilsMod.Lambda]] = js.undefined
  var onBecomeUnobservedListeners: js.UndefOr[stdLib.Set[mobxLib.libUtilsUtilsMod.Lambda]] = js.undefined
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
    onBecomeObserved: () => scala.Unit,
    onBecomeUnobserved: () => scala.Unit,
    observing: js.Array[IObservable] = null,
    onBecomeObservedListeners: stdLib.Set[mobxLib.libUtilsUtilsMod.Lambda] = null,
    onBecomeUnobservedListeners: stdLib.Set[mobxLib.libUtilsUtilsMod.Lambda] = null
  ): IObservable = {
    val __obj = js.Dynamic.literal(diffValue = diffValue, isBeingObserved = isBeingObserved, isPendingUnobservation = isPendingUnobservation, lastAccessedBy = lastAccessedBy, lowestObserverState = lowestObserverState, name = name, observers = observers, onBecomeObserved = js.Any.fromFunction0(onBecomeObserved), onBecomeUnobserved = js.Any.fromFunction0(onBecomeUnobserved))
    if (observing != null) __obj.updateDynamic("observing")(observing)
    if (onBecomeObservedListeners != null) __obj.updateDynamic("onBecomeObservedListeners")(onBecomeObservedListeners)
    if (onBecomeUnobservedListeners != null) __obj.updateDynamic("onBecomeUnobservedListeners")(onBecomeUnobservedListeners)
    __obj.asInstanceOf[IObservable]
  }
}

