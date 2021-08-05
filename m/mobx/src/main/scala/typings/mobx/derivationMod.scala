package typings.mobx

import typings.mobx.atomMod.IAtom
import typings.mobx.coreObservableMod.IDepTreeNode
import typings.mobx.coreObservableMod.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object derivationMod {
  
  @JSImport("mobx/lib/core/derivation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/lib/core/derivation", "CaughtException")
  @js.native
  class CaughtException protected () extends StObject {
    def this(cause: js.Any) = this()
    
    var cause: js.Any = js.native
  }
  
  @js.native
  sealed trait IDerivationState extends StObject
  @JSImport("mobx/lib/core/derivation", "IDerivationState")
  @js.native
  object IDerivationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[IDerivationState & Double] = js.native
    
    @js.native
    sealed trait NOT_TRACKING
      extends StObject
         with IDerivationState
    /* -1 */ val NOT_TRACKING: typings.mobx.derivationMod.IDerivationState.NOT_TRACKING & Double = js.native
    
    @js.native
    sealed trait POSSIBLY_STALE
      extends StObject
         with IDerivationState
    /* 1 */ val POSSIBLY_STALE: typings.mobx.derivationMod.IDerivationState.POSSIBLY_STALE & Double = js.native
    
    @js.native
    sealed trait STALE
      extends StObject
         with IDerivationState
    /* 2 */ val STALE: typings.mobx.derivationMod.IDerivationState.STALE & Double = js.native
    
    @js.native
    sealed trait UP_TO_DATE
      extends StObject
         with IDerivationState
    /* 0 */ val UP_TO_DATE: typings.mobx.derivationMod.IDerivationState.UP_TO_DATE & Double = js.native
  }
  
  @js.native
  sealed trait TraceMode extends StObject
  @JSImport("mobx/lib/core/derivation", "TraceMode")
  @js.native
  object TraceMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TraceMode & Double] = js.native
    
    @js.native
    sealed trait BREAK
      extends StObject
         with TraceMode
    /* 2 */ val BREAK: typings.mobx.derivationMod.TraceMode.BREAK & Double = js.native
    
    @js.native
    sealed trait LOG
      extends StObject
         with TraceMode
    /* 1 */ val LOG: typings.mobx.derivationMod.TraceMode.LOG & Double = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with TraceMode
    /* 0 */ val NONE: typings.mobx.derivationMod.TraceMode.NONE & Double = js.native
  }
  
  inline def allowStateReadsEnd(prev: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStateReadsEnd")(prev.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def allowStateReadsStart(allowStateReads: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStateReadsStart")(allowStateReads.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def changeDependenciesStateTo0(derivation: IDerivation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("changeDependenciesStateTo0")(derivation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def checkIfStateModificationsAreAllowed(atom: IAtom): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkIfStateModificationsAreAllowed")(atom.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def checkIfStateReadsAreAllowed(observable: IObservable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkIfStateReadsAreAllowed")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearObserving(derivation: IDerivation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearObserving")(derivation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isCaughtException(e: js.Any): /* is mobx.mobx/lib/core/derivation.CaughtException */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCaughtException")(e.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/core/derivation.CaughtException */ Boolean]
  
  inline def isComputingDerivation(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComputingDerivation")().asInstanceOf[Boolean]
  
  inline def shouldCompute(derivation: IDerivation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCompute")(derivation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def trackDerivedFunction[T](derivation: IDerivation, f: js.Function0[T], context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("trackDerivedFunction")(derivation.asInstanceOf[js.Any], f.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def untracked[T](action: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("untracked")(action.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def untrackedEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("untrackedEnd")().asInstanceOf[Unit]
  inline def untrackedEnd(prev: IDerivation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("untrackedEnd")(prev.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def untrackedStart(): IDerivation | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("untrackedStart")().asInstanceOf[IDerivation | Null]
  
  trait IDerivation
    extends StObject
       with IDepTreeNode {
    
    var __mapid: String
    
    var dependenciesState: IDerivationState
    
    var isTracing: TraceMode
    
    var newObserving: Null | js.Array[IObservable]
    
    @JSName("observing")
    var observing_IDerivation: js.Array[IObservable]
    
    def onBecomeStale(): Unit
    
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
  }
  object IDerivation {
    
    inline def apply(
      __mapid: String,
      dependenciesState: IDerivationState,
      isTracing: TraceMode,
      name: String,
      observing: js.Array[IObservable],
      onBecomeStale: () => Unit,
      runId: Double,
      unboundDepsCount: Double
    ): IDerivation = {
      val __obj = js.Dynamic.literal(__mapid = __mapid.asInstanceOf[js.Any], dependenciesState = dependenciesState.asInstanceOf[js.Any], isTracing = isTracing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], observing = observing.asInstanceOf[js.Any], onBecomeStale = js.Any.fromFunction0(onBecomeStale), runId = runId.asInstanceOf[js.Any], unboundDepsCount = unboundDepsCount.asInstanceOf[js.Any], newObserving = null)
      __obj.asInstanceOf[IDerivation]
    }
    
    extension [Self <: IDerivation](x: Self) {
      
      inline def setDependenciesState(value: IDerivationState): Self = StObject.set(x, "dependenciesState", value.asInstanceOf[js.Any])
      
      inline def setIsTracing(value: TraceMode): Self = StObject.set(x, "isTracing", value.asInstanceOf[js.Any])
      
      inline def setNewObserving(value: js.Array[IObservable]): Self = StObject.set(x, "newObserving", value.asInstanceOf[js.Any])
      
      inline def setNewObservingNull: Self = StObject.set(x, "newObserving", null)
      
      inline def setNewObservingVarargs(value: IObservable*): Self = StObject.set(x, "newObserving", js.Array(value :_*))
      
      inline def setObserving(value: js.Array[IObservable]): Self = StObject.set(x, "observing", value.asInstanceOf[js.Any])
      
      inline def setObservingVarargs(value: IObservable*): Self = StObject.set(x, "observing", js.Array(value :_*))
      
      inline def setOnBecomeStale(value: () => Unit): Self = StObject.set(x, "onBecomeStale", js.Any.fromFunction0(value))
      
      inline def setRequiresObservable(value: Boolean): Self = StObject.set(x, "requiresObservable", value.asInstanceOf[js.Any])
      
      inline def setRequiresObservableUndefined: Self = StObject.set(x, "requiresObservable", js.undefined)
      
      inline def setRunId(value: Double): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
      
      inline def setUnboundDepsCount(value: Double): Self = StObject.set(x, "unboundDepsCount", value.asInstanceOf[js.Any])
      
      inline def set__mapid(value: String): Self = StObject.set(x, "__mapid", value.asInstanceOf[js.Any])
    }
  }
}
