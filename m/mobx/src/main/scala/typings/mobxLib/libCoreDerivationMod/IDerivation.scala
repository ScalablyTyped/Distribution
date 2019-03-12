package typings
package mobxLib.libCoreDerivationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDerivation
  extends mobxLib.libCoreObservableMod.IDepTreeNode {
  var __mapid: java.lang.String
  var dependenciesState: IDerivationState
  var isTracing: TraceMode
  var newObserving: scala.Null | js.Array[mobxLib.libCoreObservableMod.IObservable]
  @JSName("observing")
  var observing_IDerivation: js.Array[mobxLib.libCoreObservableMod.IObservable]
  /**
    * Id of the current run of a derivation. Each time the derivation is tracked
    * this number is increased by one. This number is globally unique
    */
  var runId: scala.Double
  /**
    * amount of dependencies used by the derivation in this run, which has not been bound yet.
    */
  var unboundDepsCount: scala.Double
  def onBecomeStale(): scala.Unit
}

object IDerivation {
  @scala.inline
  def apply(
    __mapid: java.lang.String,
    dependenciesState: IDerivationState,
    isTracing: TraceMode,
    name: java.lang.String,
    observing: js.Array[mobxLib.libCoreObservableMod.IObservable],
    onBecomeStale: () => scala.Unit,
    runId: scala.Double,
    unboundDepsCount: scala.Double,
    newObserving: js.Array[mobxLib.libCoreObservableMod.IObservable] = null
  ): IDerivation = {
    val __obj = js.Dynamic.literal(__mapid = __mapid, dependenciesState = dependenciesState, isTracing = isTracing, name = name, observing = observing, onBecomeStale = js.Any.fromFunction0(onBecomeStale), runId = runId, unboundDepsCount = unboundDepsCount)
    if (newObserving != null) __obj.updateDynamic("newObserving")(newObserving)
    __obj.asInstanceOf[IDerivation]
  }
}

