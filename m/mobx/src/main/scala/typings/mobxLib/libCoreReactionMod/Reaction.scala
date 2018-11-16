package typings
package mobxLib.libCoreReactionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/reaction", "Reaction")
@js.native
class Reaction protected ()
  extends mobxLib.libCoreDerivationMod.IDerivation
     with IReactionPublic {
  def this(name: java.lang.String, onInvalidate: js.Function0[scala.Unit]) = this()
  def this(name: java.lang.String, onInvalidate: js.Function0[scala.Unit], errorHandler: js.Function2[
      /* error */ js.Any, 
      /* derivation */ mobxLib.libCoreDerivationMod.IDerivation, 
      scala.Unit
    ]) = this()
  /* CompleteClass */
  override var __mapid: java.lang.String = js.native
  var _isRunning: scala.Boolean = js.native
  var _isScheduled: scala.Boolean = js.native
  var _isTrackPending: scala.Boolean = js.native
  /* CompleteClass */
  override var dependenciesState: mobxLib.libCoreDerivationMod.IDerivationState = js.native
  var diffValue: scala.Double = js.native
  var errorHandler: js.UndefOr[js.Any] = js.native
  var isDisposed: scala.Boolean = js.native
  /* CompleteClass */
  override var isTracing: mobxLib.libCoreDerivationMod.TraceMode = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var newObserving: scala.Null | js.Array[mobxLib.libCoreObservableMod.IObservable] = js.native
  @JSName("newObserving")
  var newObserving_Reaction: js.Array[mobxLib.libCoreObservableMod.IObservable] = js.native
  /* CompleteClass */
  @JSName("observing")
  override var observing_IDerivation: js.Array[mobxLib.libCoreObservableMod.IObservable] = js.native
  var onInvalidate: js.Any = js.native
  /**
       * Id of the current run of a derivation. Each time the derivation is tracked
       * this number is increased by one. This number is globally unique
       */
  /* CompleteClass */
  override var runId: scala.Double = js.native
  /**
       * amount of dependencies used by the derivation in this run, which has not been bound yet.
       */
  /* CompleteClass */
  override var unboundDepsCount: scala.Double = js.native
  def getDisposer(): IReactionDisposer = js.native
  def isScheduled(): scala.Boolean = js.native
  /* CompleteClass */
  override def onBecomeStale(): scala.Unit = js.native
  def reportExceptionInDerivation(error: js.Any): scala.Unit = js.native
  /**
       * internal, use schedule() if you intend to kick off a reaction
       */
  def runReaction(): scala.Unit = js.native
  def schedule(): scala.Unit = js.native
  def track(fn: js.Function0[scala.Unit]): scala.Unit = js.native
}

