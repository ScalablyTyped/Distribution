package typings
package mobxLib.libCoreComputedvalueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- mobxLib.libCoreDerivationMod.IDerivation because var conflicts: name, observing. Inlined newObserving, dependenciesState, runId, unboundDepsCount, __mapid, onBecomeStale, isTracing */ @JSImport("mobx/lib/core/computedvalue", "ComputedValue")
@js.native
class ComputedValue[T] protected ()
  extends mobxLib.libCoreObservableMod.IObservable
     with IComputedValue[T] {
  /**
    * Create a new computed value based on a function expression.
    *
    * The `name` property is for debug purposes only.
    *
    * The `equals` property specifies the comparer function to use to determine if a newly produced
    * value differs from the previous value. Two comparers are provided in the library; `defaultComparer`
    * compares based on identity comparison (===), and `structualComparer` deeply compares the structure.
    * Structural comparison can be convenient if you always produce a new aggregated object and
    * don't want to notify observers if it is structurally the same.
    * This is useful for working with vectors, mouse coordinates etc.
    */
  def this(options: IComputedValueOptions[T]) = this()
  var __mapid: java.lang.String = js.native
  var dependenciesState: mobxLib.libCoreDerivationMod.IDerivationState = js.native
  /* CompleteClass */
  override var diffValue: scala.Double = js.native
  @JSName("equals")
  var equals_FComputedValue: js.Any = js.native
  /* CompleteClass */
  override var isBeingObserved: scala.Boolean = js.native
  var isComputing: scala.Boolean = js.native
  /* CompleteClass */
  override var isPendingUnobservation: scala.Boolean = js.native
  var isRunningSetter: scala.Boolean = js.native
  var isTracing: mobxLib.libCoreDerivationMod.TraceMode = js.native
  var keepAlive: js.Any = js.native
  /**
    * Id of the derivation *run* that last accessed this observable.
    * If this id equals the *run* id of the current derivation,
    * the dependency is already established
    */
  /* CompleteClass */
  override var lastAccessedBy: scala.Double = js.native
  /* CompleteClass */
  override var lowestObserverState: mobxLib.libCoreDerivationMod.IDerivationState = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var newObserving: js.Array[mobxLib.libCoreObservableMod.IObservable] | scala.Null = js.native
  /* CompleteClass */
  override var observers: stdLib.Set[mobxLib.libCoreDerivationMod.IDerivation] = js.native
  @JSName("observers")
  var observers_ComputedValue: stdLib.Set[_] = js.native
  @JSName("observing")
  var observing_ComputedValue: js.Array[mobxLib.libCoreObservableMod.IObservable] = js.native
  var requiresReaction: js.Any = js.native
  var runId: scala.Double = js.native
  var scope: js.UndefOr[js.Object] = js.native
  var setter: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.native
  @JSName(scala.scalajs.js.Symbol.toPrimitive)
  var toPrimitive: js.Function0[T] = js.native
  var trackAndCompute: js.Any = js.native
  var triggeredBy: js.UndefOr[java.lang.String] = js.native
  var unboundDepsCount: scala.Double = js.native
  var value: js.UndefOr[T | mobxLib.libInternalMod.CaughtException] = js.native
  def computeValue(track: scala.Boolean): T | mobxLib.libInternalMod.CaughtException = js.native
  def derivation(): T = js.native
  /* CompleteClass */
  override def onBecomeObserved(): scala.Unit = js.native
  def onBecomeStale(): scala.Unit = js.native
  /* CompleteClass */
  override def onBecomeUnobserved(): scala.Unit = js.native
  def peek(): T = js.native
  def suspend(): scala.Unit = js.native
  def toJSON(): T = js.native
  def warnAboutUntrackedRead(): scala.Unit = js.native
}

