package typings.mobx

import typings.mobx.atomMod.IAtom
import typings.mobx.coreObservableMod.IDepTreeNode
import typings.mobx.coreObservableMod.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object derivationMod {
  
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
    def apply(value: Double): js.UndefOr[IDerivationState with Double] = js.native
    
    @js.native
    sealed trait NOT_TRACKING extends IDerivationState
    /* -1 */ val NOT_TRACKING: typings.mobx.derivationMod.IDerivationState.NOT_TRACKING with Double = js.native
    
    @js.native
    sealed trait POSSIBLY_STALE extends IDerivationState
    /* 1 */ val POSSIBLY_STALE: typings.mobx.derivationMod.IDerivationState.POSSIBLY_STALE with Double = js.native
    
    @js.native
    sealed trait STALE extends IDerivationState
    /* 2 */ val STALE: typings.mobx.derivationMod.IDerivationState.STALE with Double = js.native
    
    @js.native
    sealed trait UP_TO_DATE extends IDerivationState
    /* 0 */ val UP_TO_DATE: typings.mobx.derivationMod.IDerivationState.UP_TO_DATE with Double = js.native
  }
  
  @js.native
  sealed trait TraceMode extends StObject
  @JSImport("mobx/lib/core/derivation", "TraceMode")
  @js.native
  object TraceMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TraceMode with Double] = js.native
    
    @js.native
    sealed trait BREAK extends TraceMode
    /* 2 */ val BREAK: typings.mobx.derivationMod.TraceMode.BREAK with Double = js.native
    
    @js.native
    sealed trait LOG extends TraceMode
    /* 1 */ val LOG: typings.mobx.derivationMod.TraceMode.LOG with Double = js.native
    
    @js.native
    sealed trait NONE extends TraceMode
    /* 0 */ val NONE: typings.mobx.derivationMod.TraceMode.NONE with Double = js.native
  }
  
  @JSImport("mobx/lib/core/derivation", "allowStateReadsEnd")
  @js.native
  def allowStateReadsEnd(prev: Boolean): Unit = js.native
  
  @JSImport("mobx/lib/core/derivation", "allowStateReadsStart")
  @js.native
  def allowStateReadsStart(allowStateReads: Boolean): Boolean = js.native
  
  @JSImport("mobx/lib/core/derivation", "changeDependenciesStateTo0")
  @js.native
  def changeDependenciesStateTo0(derivation: IDerivation): Unit = js.native
  
  @JSImport("mobx/lib/core/derivation", "checkIfStateModificationsAreAllowed")
  @js.native
  def checkIfStateModificationsAreAllowed(atom: IAtom): Unit = js.native
  
  @JSImport("mobx/lib/core/derivation", "checkIfStateReadsAreAllowed")
  @js.native
  def checkIfStateReadsAreAllowed(observable: IObservable): Unit = js.native
  
  @JSImport("mobx/lib/core/derivation", "clearObserving")
  @js.native
  def clearObserving(derivation: IDerivation): Unit = js.native
  
  @JSImport("mobx/lib/core/derivation", "isCaughtException")
  @js.native
  def isCaughtException(e: js.Any): /* is mobx.mobx/lib/core/derivation.CaughtException */ Boolean = js.native
  
  @JSImport("mobx/lib/core/derivation", "isComputingDerivation")
  @js.native
  def isComputingDerivation(): Boolean = js.native
  
  @JSImport("mobx/lib/core/derivation", "shouldCompute")
  @js.native
  def shouldCompute(derivation: IDerivation): Boolean = js.native
  
  @JSImport("mobx/lib/core/derivation", "trackDerivedFunction")
  @js.native
  def trackDerivedFunction[T](derivation: IDerivation, f: js.Function0[T], context: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/core/derivation", "untracked")
  @js.native
  def untracked[T](action: js.Function0[T]): T = js.native
  
  @JSImport("mobx/lib/core/derivation", "untrackedEnd")
  @js.native
  def untrackedEnd(): Unit = js.native
  @JSImport("mobx/lib/core/derivation", "untrackedEnd")
  @js.native
  def untrackedEnd(prev: IDerivation): Unit = js.native
  
  @JSImport("mobx/lib/core/derivation", "untrackedStart")
  @js.native
  def untrackedStart(): IDerivation | Null = js.native
  
  @js.native
  trait IDerivation extends IDepTreeNode {
    
    var __mapid: String = js.native
    
    var dependenciesState: IDerivationState = js.native
    
    var isTracing: TraceMode = js.native
    
    var newObserving: Null | js.Array[IObservable] = js.native
    
    @JSName("observing")
    var observing_IDerivation: js.Array[IObservable] = js.native
    
    def onBecomeStale(): Unit = js.native
    
    /**
      *  warn if the derivation has no dependencies after creation/update
      */
    var requiresObservable: js.UndefOr[Boolean] = js.native
    
    /**
      * Id of the current run of a derivation. Each time the derivation is tracked
      * this number is increased by one. This number is globally unique
      */
    var runId: Double = js.native
    
    /**
      * amount of dependencies used by the derivation in this run, which has not been bound yet.
      */
    var unboundDepsCount: Double = js.native
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
      unboundDepsCount: Double
    ): IDerivation = {
      val __obj = js.Dynamic.literal(__mapid = __mapid.asInstanceOf[js.Any], dependenciesState = dependenciesState.asInstanceOf[js.Any], isTracing = isTracing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], observing = observing.asInstanceOf[js.Any], onBecomeStale = js.Any.fromFunction0(onBecomeStale), runId = runId.asInstanceOf[js.Any], unboundDepsCount = unboundDepsCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDerivation]
    }
    
    @scala.inline
    implicit class IDerivationMutableBuilder[Self <: IDerivation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependenciesState(value: IDerivationState): Self = StObject.set(x, "dependenciesState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTracing(value: TraceMode): Self = StObject.set(x, "isTracing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewObserving(value: js.Array[IObservable]): Self = StObject.set(x, "newObserving", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewObservingNull: Self = StObject.set(x, "newObserving", null)
      
      @scala.inline
      def setNewObservingVarargs(value: IObservable*): Self = StObject.set(x, "newObserving", js.Array(value :_*))
      
      @scala.inline
      def setObserving(value: js.Array[IObservable]): Self = StObject.set(x, "observing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObservingVarargs(value: IObservable*): Self = StObject.set(x, "observing", js.Array(value :_*))
      
      @scala.inline
      def setOnBecomeStale(value: () => Unit): Self = StObject.set(x, "onBecomeStale", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRequiresObservable(value: Boolean): Self = StObject.set(x, "requiresObservable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiresObservableUndefined: Self = StObject.set(x, "requiresObservable", js.undefined)
      
      @scala.inline
      def setRunId(value: Double): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnboundDepsCount(value: Double): Self = StObject.set(x, "unboundDepsCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__mapid(value: String): Self = StObject.set(x, "__mapid", value.asInstanceOf[js.Any])
    }
  }
}
