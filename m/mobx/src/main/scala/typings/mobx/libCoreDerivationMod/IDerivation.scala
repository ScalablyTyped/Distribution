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
    newObserving: js.Array[IObservable] = null
  ): IDerivation = {
    val __obj = js.Dynamic.literal(__mapid = __mapid, dependenciesState = dependenciesState, isTracing = isTracing, name = name, observing = observing, onBecomeStale = js.Any.fromFunction0(onBecomeStale), runId = runId, unboundDepsCount = unboundDepsCount)
    if (newObserving != null) __obj.updateDynamic("newObserving")(newObserving)
    __obj.asInstanceOf[IDerivation]
  }
}

