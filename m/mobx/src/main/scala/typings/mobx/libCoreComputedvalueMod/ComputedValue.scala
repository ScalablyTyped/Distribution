package typings.mobx.libCoreComputedvalueMod

import typings.mobx.libCoreDerivationMod.IDerivation
import typings.mobx.libCoreDerivationMod.IDerivationState
import typings.mobx.libCoreDerivationMod.TraceMode
import typings.mobx.libCoreObservableMod.IObservable
import typings.mobx.libInternalMod.CaughtException
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mobx.libCoreObservableMod.IDepTreeNode because Already inherited
- typings.mobx.libCoreDerivationMod.IDerivation because var conflicts: name, observing. Inlined newObserving, dependenciesState, runId, unboundDepsCount, __mapid, onBecomeStale, isTracing, requiresObservable */ @JSImport("mobx/lib/core/computedvalue", "ComputedValue")
@js.native
class ComputedValue[T] protected ()
  extends IObservable
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
  var __mapid: String = js.native
  var dependenciesState: IDerivationState = js.native
  /* CompleteClass */
  override var diffValue: Double = js.native
  @JSName("equals")
  var equals_FComputedValue: js.Any = js.native
  /* CompleteClass */
  override var isBeingObserved: Boolean = js.native
  var isComputing: Boolean = js.native
  /* CompleteClass */
  override var isPendingUnobservation: Boolean = js.native
  var isRunningSetter: Boolean = js.native
  var isTracing: TraceMode = js.native
  var keepAlive: js.Any = js.native
  /**
    * Id of the derivation *run* that last accessed this observable.
    * If this id equals the *run* id of the current derivation,
    * the dependency is already established
    */
  /* CompleteClass */
  override var lastAccessedBy: Double = js.native
  /* CompleteClass */
  override var lowestObserverState: IDerivationState = js.native
  /* CompleteClass */
  override var name: String = js.native
  var newObserving: js.Array[IObservable] | Null = js.native
  /* CompleteClass */
  override var observers: Set[IDerivation] = js.native
  @JSName("observing")
  var observing_ComputedValue: js.Array[IObservable] = js.native
  /**
    *  warn if the derivation has no dependencies after creation/update
    */
  var requiresObservable: js.UndefOr[Boolean] = js.native
  var requiresReaction: js.Any = js.native
  var runId: Double = js.native
  var scope: js.UndefOr[js.Object] = js.native
  var setter: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
  @JSName(scala.scalajs.js.Symbol.toPrimitive)
  var toPrimitive: js.Function0[T] = js.native
  var trackAndCompute: js.Any = js.native
  var triggeredBy: js.UndefOr[String] = js.native
  var unboundDepsCount: Double = js.native
  var value: js.UndefOr[T | CaughtException] = js.native
  def computeValue(track: Boolean): T | CaughtException = js.native
  def derivation(): T = js.native
  /* CompleteClass */
  override def onBecomeObserved(): Unit = js.native
  def onBecomeStale(): Unit = js.native
  /* CompleteClass */
  override def onBecomeUnobserved(): Unit = js.native
  def peek(): T = js.native
  def suspend(): Unit = js.native
  def toJSON(): T = js.native
  def warnAboutUntrackedRead(): Unit = js.native
}

