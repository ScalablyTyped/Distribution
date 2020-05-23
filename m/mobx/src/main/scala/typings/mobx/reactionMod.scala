package typings.mobx

import typings.mobx.coreObservableMod.IObservable
import typings.mobx.derivationMod.IDerivation
import typings.mobx.derivationMod.IDerivationState
import typings.mobx.derivationMod.TraceMode
import typings.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/reaction", JSImport.Namespace)
@js.native
object reactionMod extends js.Object {
  @js.native
  trait IReactionDisposer extends js.Object {
    @JSName("$mobx")
    var $mobx: Reaction = js.native
    def apply(): Unit = js.native
  }
  
  @js.native
  trait IReactionPublic extends js.Object {
    def dispose(): Unit = js.native
    def trace(): Unit = js.native
    def trace(enterBreakPoint: Boolean): Unit = js.native
  }
  
  @js.native
  class Reaction protected ()
    extends IDerivation
       with IReactionPublic {
    def this(name: String, onInvalidate: js.Function0[Unit]) = this()
    def this(
      name: String,
      onInvalidate: js.Function0[Unit],
      errorHandler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit]
    ) = this()
    def this(
      name: String,
      onInvalidate: js.Function0[Unit],
      errorHandler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit],
      requiresObservable: Boolean
    ) = this()
    /* CompleteClass */
    override var __mapid: String = js.native
    var _isRunning: Boolean = js.native
    var _isScheduled: Boolean = js.native
    var _isTrackPending: Boolean = js.native
    /* CompleteClass */
    override var dependenciesState: IDerivationState = js.native
    var diffValue: Double = js.native
    var errorHandler: js.UndefOr[js.Any] = js.native
    var isDisposed: Boolean = js.native
    /* CompleteClass */
    override var isTracing: TraceMode = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var newObserving: Null | js.Array[IObservable] = js.native
    @JSName("newObserving")
    var newObserving_Reaction: js.Array[IObservable] = js.native
    /* CompleteClass */
    @JSName("observing")
    override var observing_IDerivation: js.Array[IObservable] = js.native
    var onInvalidate: js.Any = js.native
    @JSName("requiresObservable")
    var requiresObservable_Reaction: Boolean = js.native
    /**
      * Id of the current run of a derivation. Each time the derivation is tracked
      * this number is increased by one. This number is globally unique
      */
    /* CompleteClass */
    override var runId: Double = js.native
    /**
      * amount of dependencies used by the derivation in this run, which has not been bound yet.
      */
    /* CompleteClass */
    override var unboundDepsCount: Double = js.native
    def getDisposer(): IReactionDisposer = js.native
    def isScheduled(): Boolean = js.native
    /* CompleteClass */
    override def onBecomeStale(): Unit = js.native
    def reportExceptionInDerivation(error: js.Any): Unit = js.native
    /**
      * internal, use schedule() if you intend to kick off a reaction
      */
    def runReaction(): Unit = js.native
    def schedule(): Unit = js.native
    def track(fn: js.Function0[Unit]): Unit = js.native
  }
  
  def isReaction(x: js.Any): /* is mobx.mobx/lib/core/reaction.Reaction */ Boolean = js.native
  def onReactionError(handler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit]): Lambda = js.native
  def runReactions(): Unit = js.native
  def setReactionScheduler(fn: js.Function1[/* f */ js.Function0[Unit], Unit]): Unit = js.native
}

