package typings.mobx

import typings.mobx.coreObservableMod.IObservable
import typings.mobx.derivationMod.IDerivation
import typings.mobx.derivationMod.IDerivationState
import typings.mobx.derivationMod.TraceMode
import typings.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionMod {
  
  @JSImport("mobx/lib/core/reaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/lib/core/reaction", "Reaction")
  @js.native
  class Reaction protected ()
    extends StObject
       with IDerivation
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
    def this(name: String, onInvalidate: js.Function0[Unit], errorHandler: Unit, requiresObservable: Boolean) = this()
    
    /* CompleteClass */
    var __mapid: String = js.native
    
    var _isRunning: Boolean = js.native
    
    var _isScheduled: Boolean = js.native
    
    var _isTrackPending: Boolean = js.native
    
    /* CompleteClass */
    var dependenciesState: IDerivationState = js.native
    
    var diffValue: Double = js.native
    
    var errorHandler: js.Any = js.native
    
    def getDisposer(): IReactionDisposer = js.native
    
    var isDisposed: Boolean = js.native
    
    def isScheduled(): Boolean = js.native
    
    /* CompleteClass */
    var isTracing: TraceMode = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var newObserving: Null | js.Array[IObservable] = js.native
    @JSName("newObserving")
    var newObserving_Reaction: js.Array[IObservable] = js.native
    
    /* CompleteClass */
    @JSName("observing")
    var observing_IDerivation: js.Array[IObservable] = js.native
    
    /* CompleteClass */
    override def onBecomeStale(): Unit = js.native
    
    var onInvalidate: js.Any = js.native
    
    def reportExceptionInDerivation(error: js.Any): Unit = js.native
    
    @JSName("requiresObservable")
    var requiresObservable_Reaction: Boolean = js.native
    
    /**
      * Id of the current run of a derivation. Each time the derivation is tracked
      * this number is increased by one. This number is globally unique
      */
    /* CompleteClass */
    var runId: Double = js.native
    
    /**
      * internal, use schedule() if you intend to kick off a reaction
      */
    def runReaction(): Unit = js.native
    
    def schedule(): Unit = js.native
    
    def track(fn: js.Function0[Unit]): Unit = js.native
    
    /**
      * amount of dependencies used by the derivation in this run, which has not been bound yet.
      */
    /* CompleteClass */
    var unboundDepsCount: Double = js.native
  }
  
  @scala.inline
  def isReaction(x: js.Any): /* is mobx.mobx/lib/core/reaction.Reaction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReaction")(x.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/core/reaction.Reaction */ Boolean]
  
  @scala.inline
  def onReactionError(handler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit]): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("onReactionError")(handler.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  
  @scala.inline
  def runReactions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runReactions")().asInstanceOf[Unit]
  
  @scala.inline
  def setReactionScheduler(fn: js.Function1[/* f */ js.Function0[Unit], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setReactionScheduler")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait IReactionDisposer extends StObject {
    
    def apply(): Unit = js.native
    
    @JSName("$mobx")
    var $mobx: Reaction = js.native
  }
  
  @js.native
  trait IReactionPublic extends StObject {
    
    def dispose(): Unit = js.native
    
    def trace(): Unit = js.native
    def trace(enterBreakPoint: Boolean): Unit = js.native
  }
}
