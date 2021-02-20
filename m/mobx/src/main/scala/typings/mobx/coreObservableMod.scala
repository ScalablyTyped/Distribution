package typings.mobx

import typings.mobx.derivationMod.IDerivation
import typings.mobx.derivationMod.IDerivationState
import typings.mobx.utilsMod.Lambda
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreObservableMod {
  
  @JSImport("mobx/lib/core/observable", "addObserver")
  @js.native
  def addObserver(observable: IObservable, node: IDerivation): Unit = js.native
  
  @JSImport("mobx/lib/core/observable", "endBatch")
  @js.native
  def endBatch(): Unit = js.native
  
  @JSImport("mobx/lib/core/observable", "getObservers")
  @js.native
  def getObservers(observable: IObservable): Set[IDerivation] = js.native
  
  @JSImport("mobx/lib/core/observable", "hasObservers")
  @js.native
  def hasObservers(observable: IObservable): Boolean = js.native
  
  @JSImport("mobx/lib/core/observable", "propagateChangeConfirmed")
  @js.native
  def propagateChangeConfirmed(observable: IObservable): Unit = js.native
  
  @JSImport("mobx/lib/core/observable", "propagateChanged")
  @js.native
  def propagateChanged(observable: IObservable): Unit = js.native
  
  @JSImport("mobx/lib/core/observable", "propagateMaybeChanged")
  @js.native
  def propagateMaybeChanged(observable: IObservable): Unit = js.native
  
  @JSImport("mobx/lib/core/observable", "queueForUnobservation")
  @js.native
  def queueForUnobservation(observable: IObservable): Unit = js.native
  
  @JSImport("mobx/lib/core/observable", "removeObserver")
  @js.native
  def removeObserver(observable: IObservable, node: IDerivation): Unit = js.native
  
  @JSImport("mobx/lib/core/observable", "reportObserved")
  @js.native
  def reportObserved(observable: IObservable): Boolean = js.native
  
  @JSImport("mobx/lib/core/observable", "startBatch")
  @js.native
  def startBatch(): Unit = js.native
  
  @js.native
  trait IDepTreeNode extends StObject {
    
    var name: String = js.native
    
    var observing: js.UndefOr[js.Array[IObservable]] = js.native
  }
  object IDepTreeNode {
    
    @scala.inline
    def apply(name: String): IDepTreeNode = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDepTreeNode]
    }
    
    @scala.inline
    implicit class IDepTreeNodeMutableBuilder[Self <: IDepTreeNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObserving(value: js.Array[IObservable]): Self = StObject.set(x, "observing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObservingUndefined: Self = StObject.set(x, "observing", js.undefined)
      
      @scala.inline
      def setObservingVarargs(value: IObservable*): Self = StObject.set(x, "observing", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IObservable extends IDepTreeNode {
    
    var diffValue: Double = js.native
    
    var isBeingObserved: Boolean = js.native
    
    var isPendingUnobservation: Boolean = js.native
    
    /**
      * Id of the derivation *run* that last accessed this observable.
      * If this id equals the *run* id of the current derivation,
      * the dependency is already established
      */
    var lastAccessedBy: Double = js.native
    
    var lowestObserverState: IDerivationState = js.native
    
    var observers: Set[IDerivation] = js.native
    
    def onBecomeObserved(): Unit = js.native
    
    var onBecomeObservedListeners: js.UndefOr[Set[Lambda]] = js.native
    
    def onBecomeUnobserved(): Unit = js.native
    
    var onBecomeUnobservedListeners: js.UndefOr[Set[Lambda]] = js.native
  }
  object IObservable {
    
    @scala.inline
    def apply(
      diffValue: Double,
      isBeingObserved: Boolean,
      isPendingUnobservation: Boolean,
      lastAccessedBy: Double,
      lowestObserverState: IDerivationState,
      name: String,
      observers: Set[IDerivation],
      onBecomeObserved: () => Unit,
      onBecomeUnobserved: () => Unit
    ): IObservable = {
      val __obj = js.Dynamic.literal(diffValue = diffValue.asInstanceOf[js.Any], isBeingObserved = isBeingObserved.asInstanceOf[js.Any], isPendingUnobservation = isPendingUnobservation.asInstanceOf[js.Any], lastAccessedBy = lastAccessedBy.asInstanceOf[js.Any], lowestObserverState = lowestObserverState.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], onBecomeObserved = js.Any.fromFunction0(onBecomeObserved), onBecomeUnobserved = js.Any.fromFunction0(onBecomeUnobserved))
      __obj.asInstanceOf[IObservable]
    }
    
    @scala.inline
    implicit class IObservableMutableBuilder[Self <: IObservable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiffValue(value: Double): Self = StObject.set(x, "diffValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBeingObserved(value: Boolean): Self = StObject.set(x, "isBeingObserved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPendingUnobservation(value: Boolean): Self = StObject.set(x, "isPendingUnobservation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastAccessedBy(value: Double): Self = StObject.set(x, "lastAccessedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowestObserverState(value: IDerivationState): Self = StObject.set(x, "lowestObserverState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObservers(value: Set[IDerivation]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBecomeObserved(value: () => Unit): Self = StObject.set(x, "onBecomeObserved", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBecomeObservedListeners(value: Set[Lambda]): Self = StObject.set(x, "onBecomeObservedListeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBecomeObservedListenersUndefined: Self = StObject.set(x, "onBecomeObservedListeners", js.undefined)
      
      @scala.inline
      def setOnBecomeUnobserved(value: () => Unit): Self = StObject.set(x, "onBecomeUnobserved", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBecomeUnobservedListeners(value: Set[Lambda]): Self = StObject.set(x, "onBecomeUnobservedListeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBecomeUnobservedListenersUndefined: Self = StObject.set(x, "onBecomeUnobservedListeners", js.undefined)
    }
  }
}
