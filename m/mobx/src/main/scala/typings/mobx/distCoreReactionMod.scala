package typings.mobx

import typings.mobx.distCoreDerivationMod.IDerivation
import typings.mobx.distCoreDerivationMod.IDerivationState
import typings.mobx.distCoreDerivationMod.TraceMode
import typings.mobx.distCoreObservableMod.IObservable
import typings.mobx.distUtilsUtilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreReactionMod {
  
  @JSImport("mobx/dist/core/reaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/dist/core/reaction", "Reaction")
  @js.native
  open class Reaction protected ()
    extends StObject
       with IDerivation
       with IReactionPublic {
    def this(name_ : String, onInvalidate_ : js.Function0[Unit]) = this()
    def this(
      name_ : String,
      onInvalidate_ : js.Function0[Unit],
      errorHandler_ : js.Function2[/* error */ Any, /* derivation */ IDerivation, Unit]
    ) = this()
    def this(
      name_ : String,
      onInvalidate_ : js.Function0[Unit],
      errorHandler_ : js.Function2[/* error */ Any, /* derivation */ IDerivation, Unit],
      requiresObservable_ : Any
    ) = this()
    def this(
      name_ : String,
      onInvalidate_ : js.Function0[Unit],
      errorHandler_ : Unit,
      requiresObservable_ : Any
    ) = this()
    
    /* CompleteClass */
    var dependenciesState_ : IDerivationState = js.native
    
    var diffValue_ : Double = js.native
    
    /* private */ var errorHandler_ : Any = js.native
    
    def getDisposer_(): IReactionDisposer = js.native
    
    var isDisposed_ : Boolean = js.native
    
    var isRunning_ : Boolean = js.native
    
    def isScheduled(): Boolean = js.native
    
    var isScheduled_ : Boolean = js.native
    
    /* CompleteClass */
    var isTracing_ : TraceMode = js.native
    
    var isTrackPending_ : Boolean = js.native
    
    /* CompleteClass */
    var name_ : String = js.native
    
    /* CompleteClass */
    var newObserving_ : Null | js.Array[IObservable] = js.native
    @JSName("newObserving_")
    var newObserving__Reaction: js.Array[IObservable] = js.native
    
    /* CompleteClass */
    @JSName("observing_")
    var observing__IDerivation: js.Array[IObservable] = js.native
    
    /* CompleteClass */
    override def onBecomeStale_(): Unit = js.native
    
    /* private */ var onInvalidate_ : Any = js.native
    
    def reportExceptionInDerivation_(error: Any): Unit = js.native
    
    @JSName("requiresObservable_")
    var requiresObservable__Reaction: js.UndefOr[Any] = js.native
    
    /**
      * Id of the current run of a derivation. Each time the derivation is tracked
      * this number is increased by one. This number is globally unique
      */
    /* CompleteClass */
    var runId_ : Double = js.native
    
    /**
      * internal, use schedule() if you intend to kick off a reaction
      */
    def runReaction_(): Unit = js.native
    
    def schedule_(): Unit = js.native
    
    def track(fn: js.Function0[Unit]): Unit = js.native
    
    /**
      * amount of dependencies used by the derivation in this run, which has not been bound yet.
      */
    /* CompleteClass */
    var unboundDepsCount_ : Double = js.native
  }
  
  inline def isReaction(x: Any): /* is mobx.mobx/dist/core/reaction.Reaction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReaction")(x.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/dist/core/reaction.Reaction */ Boolean]
  
  inline def onReactionError(handler: js.Function2[/* error */ Any, /* derivation */ IDerivation, Unit]): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("onReactionError")(handler.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  
  inline def runReactions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runReactions")().asInstanceOf[Unit]
  
  inline def setReactionScheduler(fn: js.Function1[/* f */ js.Function0[Unit], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setReactionScheduler")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
