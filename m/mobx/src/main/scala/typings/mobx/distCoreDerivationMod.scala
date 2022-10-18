package typings.mobx

import typings.mobx.distCoreAtomMod.IAtom
import typings.mobx.distCoreObservableMod.IDepTreeNode
import typings.mobx.distCoreObservableMod.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreDerivationMod {
  
  @JSImport("mobx/dist/core/derivation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/dist/core/derivation", "CaughtException")
  @js.native
  open class CaughtException protected () extends StObject {
    def this(cause: Any) = this()
    
    var cause: Any = js.native
  }
  
  @js.native
  sealed trait IDerivationState extends StObject
  @JSImport("mobx/dist/core/derivation", "IDerivationState_")
  @js.native
  object IDerivationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[IDerivationState & Double] = js.native
    
    @js.native
    sealed trait NOT_TRACKING_
      extends StObject
         with IDerivationState
    /* -1 */ val NOT_TRACKING_ : typings.mobx.distCoreDerivationMod.IDerivationState.NOT_TRACKING_ & Double = js.native
    
    @js.native
    sealed trait POSSIBLY_STALE_
      extends StObject
         with IDerivationState
    /* 1 */ val POSSIBLY_STALE_ : typings.mobx.distCoreDerivationMod.IDerivationState.POSSIBLY_STALE_ & Double = js.native
    
    @js.native
    sealed trait STALE_
      extends StObject
         with IDerivationState
    /* 2 */ val STALE_ : typings.mobx.distCoreDerivationMod.IDerivationState.STALE_ & Double = js.native
    
    @js.native
    sealed trait UP_TO_DATE_
      extends StObject
         with IDerivationState
    /* 0 */ val UP_TO_DATE_ : typings.mobx.distCoreDerivationMod.IDerivationState.UP_TO_DATE_ & Double = js.native
  }
  
  @js.native
  sealed trait TraceMode extends StObject
  @JSImport("mobx/dist/core/derivation", "TraceMode")
  @js.native
  object TraceMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TraceMode & Double] = js.native
    
    @js.native
    sealed trait BREAK
      extends StObject
         with TraceMode
    /* 2 */ val BREAK: typings.mobx.distCoreDerivationMod.TraceMode.BREAK & Double = js.native
    
    @js.native
    sealed trait LOG
      extends StObject
         with TraceMode
    /* 1 */ val LOG: typings.mobx.distCoreDerivationMod.TraceMode.LOG & Double = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with TraceMode
    /* 0 */ val NONE: typings.mobx.distCoreDerivationMod.TraceMode.NONE & Double = js.native
  }
  
  inline def allowStateReadsEnd(prev: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStateReadsEnd")(prev.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def allowStateReadsStart(allowStateReads: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStateReadsStart")(allowStateReads.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def changeDependenciesStateTo0(derivation: IDerivation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("changeDependenciesStateTo0")(derivation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def checkIfStateModificationsAreAllowed(atom: IAtom): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkIfStateModificationsAreAllowed")(atom.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def checkIfStateReadsAreAllowed(observable: IObservable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkIfStateReadsAreAllowed")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearObserving(derivation: IDerivation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearObserving")(derivation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isCaughtException(e: Any): /* is mobx.mobx/dist/core/derivation.CaughtException */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCaughtException")(e.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/dist/core/derivation.CaughtException */ Boolean]
  
  inline def isComputingDerivation(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComputingDerivation")().asInstanceOf[Boolean]
  
  inline def shouldCompute(derivation: IDerivation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCompute")(derivation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def trackDerivedFunction[T](derivation: IDerivation, f: js.Function0[T], context: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("trackDerivedFunction")(derivation.asInstanceOf[js.Any], f.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def untracked[T](action: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("untracked")(action.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def untrackedEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("untrackedEnd")().asInstanceOf[Unit]
  inline def untrackedEnd(prev: IDerivation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("untrackedEnd")(prev.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def untrackedStart(): IDerivation | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("untrackedStart")().asInstanceOf[IDerivation | Null]
  
  trait IDerivation
    extends StObject
       with IDepTreeNode {
    
    var dependenciesState_ : IDerivationState
    
    var isTracing_ : TraceMode
    
    var newObserving_ : Null | js.Array[IObservable]
    
    @JSName("observing_")
    var observing__IDerivation: js.Array[IObservable]
    
    def onBecomeStale_(): Unit
    
    /**
      *  warn if the derivation has no dependencies after creation/update
      */
    var requiresObservable_ : js.UndefOr[Boolean] = js.undefined
    
    /**
      * Id of the current run of a derivation. Each time the derivation is tracked
      * this number is increased by one. This number is globally unique
      */
    var runId_ : Double
    
    /**
      * amount of dependencies used by the derivation in this run, which has not been bound yet.
      */
    var unboundDepsCount_ : Double
  }
  object IDerivation {
    
    inline def apply(
      dependenciesState_ : IDerivationState,
      isTracing_ : TraceMode,
      name_ : String,
      observing_ : js.Array[IObservable],
      onBecomeStale_ : () => Unit,
      runId_ : Double,
      unboundDepsCount_ : Double
    ): IDerivation = {
      val __obj = js.Dynamic.literal(dependenciesState_ = dependenciesState_.asInstanceOf[js.Any], isTracing_ = isTracing_.asInstanceOf[js.Any], name_ = name_.asInstanceOf[js.Any], observing_ = observing_.asInstanceOf[js.Any], onBecomeStale_ = js.Any.fromFunction0(onBecomeStale_), runId_ = runId_.asInstanceOf[js.Any], unboundDepsCount_ = unboundDepsCount_.asInstanceOf[js.Any], newObserving_ = null)
      __obj.asInstanceOf[IDerivation]
    }
    
    extension [Self <: IDerivation](x: Self) {
      
      inline def setDependenciesState_(value: IDerivationState): Self = StObject.set(x, "dependenciesState_", value.asInstanceOf[js.Any])
      
      inline def setIsTracing_(value: TraceMode): Self = StObject.set(x, "isTracing_", value.asInstanceOf[js.Any])
      
      inline def setNewObserving_(value: js.Array[IObservable]): Self = StObject.set(x, "newObserving_", value.asInstanceOf[js.Any])
      
      inline def setNewObserving_Null: Self = StObject.set(x, "newObserving_", null)
      
      inline def setNewObserving_Varargs(value: IObservable*): Self = StObject.set(x, "newObserving_", js.Array(value*))
      
      inline def setObserving_(value: js.Array[IObservable]): Self = StObject.set(x, "observing_", value.asInstanceOf[js.Any])
      
      inline def setObserving_Varargs(value: IObservable*): Self = StObject.set(x, "observing_", js.Array(value*))
      
      inline def setOnBecomeStale_(value: () => Unit): Self = StObject.set(x, "onBecomeStale_", js.Any.fromFunction0(value))
      
      inline def setRequiresObservable_(value: Boolean): Self = StObject.set(x, "requiresObservable_", value.asInstanceOf[js.Any])
      
      inline def setRequiresObservable_Undefined: Self = StObject.set(x, "requiresObservable_", js.undefined)
      
      inline def setRunId_(value: Double): Self = StObject.set(x, "runId_", value.asInstanceOf[js.Any])
      
      inline def setUnboundDepsCount_(value: Double): Self = StObject.set(x, "unboundDepsCount_", value.asInstanceOf[js.Any])
    }
  }
}
