package typings.mobx.libCoreDerivationMod

import typings.mobx.libCoreObservableMod.IDepTreeNode
import typings.mobx.libCoreObservableMod.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDerivation extends IDepTreeNode {
  var __mapid: String
  var dependenciesState: IDerivationState
  var isTracing: TraceMode
  var newObserving: Null | js.Array[IObservable]
  @JSName("observing")
  var observing_IDerivation: js.Array[IObservable]
  /**
    *  warn if the derivation has no dependencies after creation/update
    */
  var requiresObservable: js.UndefOr[Boolean] = js.undefined
  /**
    * Id of the current run of a derivation. Each time the derivation is tracked
    * this number is increased by one. This number is globally unique
    */
  var runId: Double
  /**
    * amount of dependencies used by the derivation in this run, which has not been bound yet.
    */
  var unboundDepsCount: Double
  def onBecomeStale(): Unit
}

object IDerivation {
  @scala.inline
  def apply(
    __mapid: String,
    dependenciesState: IDerivationState,
    isTracing: TraceMode,
    name: String,
    observing: js.Array[IObservable],
    onBecomeStale: () => Unit,
    runId: Double,
    unboundDepsCount: Double,
    newObserving: js.Array[IObservable] = null,
    requiresObservable: js.UndefOr[Boolean] = js.undefined
  ): IDerivation = {
    val __obj = js.Dynamic.literal(__mapid = __mapid.asInstanceOf[js.Any], dependenciesState = dependenciesState.asInstanceOf[js.Any], isTracing = isTracing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], observing = observing.asInstanceOf[js.Any], onBecomeStale = js.Any.fromFunction0(onBecomeStale), runId = runId.asInstanceOf[js.Any], unboundDepsCount = unboundDepsCount.asInstanceOf[js.Any])
    if (newObserving != null) __obj.updateDynamic("newObserving")(newObserving.asInstanceOf[js.Any])
    if (!js.isUndefined(requiresObservable)) __obj.updateDynamic("requiresObservable")(requiresObservable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDerivation]
  }
}

