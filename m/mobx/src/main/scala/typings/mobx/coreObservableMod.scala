package typings.mobx

import typings.mobx.derivationMod.IDerivation
import typings.mobx.derivationMod.IDerivationState
import typings.mobx.utilsMod.Lambda
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreObservableMod {
  
  @JSImport("mobx/lib/core/observable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addObserver(observable: IObservable, node: IDerivation): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addObserver")(observable.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def endBatch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("endBatch")().asInstanceOf[Unit]
  
  inline def getObservers(observable: IObservable): Set[IDerivation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObservers")(observable.asInstanceOf[js.Any]).asInstanceOf[Set[IDerivation]]
  
  inline def hasObservers(observable: IObservable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasObservers")(observable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def propagateChangeConfirmed(observable: IObservable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("propagateChangeConfirmed")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def propagateChanged(observable: IObservable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("propagateChanged")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def propagateMaybeChanged(observable: IObservable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("propagateMaybeChanged")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def queueForUnobservation(observable: IObservable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("queueForUnobservation")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeObserver(observable: IObservable, node: IDerivation): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeObserver")(observable.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reportObserved(observable: IObservable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("reportObserved")(observable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def startBatch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startBatch")().asInstanceOf[Unit]
  
  trait IDepTreeNode extends StObject {
    
    var name: String
    
    var observing: js.UndefOr[js.Array[IObservable]] = js.undefined
  }
  object IDepTreeNode {
    
    inline def apply(name: String): IDepTreeNode = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDepTreeNode]
    }
    
    extension [Self <: IDepTreeNode](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObserving(value: js.Array[IObservable]): Self = StObject.set(x, "observing", value.asInstanceOf[js.Any])
      
      inline def setObservingUndefined: Self = StObject.set(x, "observing", js.undefined)
      
      inline def setObservingVarargs(value: IObservable*): Self = StObject.set(x, "observing", js.Array(value :_*))
    }
  }
  
  trait IObservable
    extends StObject
       with IDepTreeNode {
    
    var diffValue: Double
    
    var isBeingObserved: Boolean
    
    var isPendingUnobservation: Boolean
    
    /**
      * Id of the derivation *run* that last accessed this observable.
      * If this id equals the *run* id of the current derivation,
      * the dependency is already established
      */
    var lastAccessedBy: Double
    
    var lowestObserverState: IDerivationState
    
    var observers: Set[IDerivation]
    
    def onBecomeObserved(): Unit
    
    var onBecomeObservedListeners: js.UndefOr[Set[Lambda]] = js.undefined
    
    def onBecomeUnobserved(): Unit
    
    var onBecomeUnobservedListeners: js.UndefOr[Set[Lambda]] = js.undefined
  }
  object IObservable {
    
    inline def apply(
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
    
    extension [Self <: IObservable](x: Self) {
      
      inline def setDiffValue(value: Double): Self = StObject.set(x, "diffValue", value.asInstanceOf[js.Any])
      
      inline def setIsBeingObserved(value: Boolean): Self = StObject.set(x, "isBeingObserved", value.asInstanceOf[js.Any])
      
      inline def setIsPendingUnobservation(value: Boolean): Self = StObject.set(x, "isPendingUnobservation", value.asInstanceOf[js.Any])
      
      inline def setLastAccessedBy(value: Double): Self = StObject.set(x, "lastAccessedBy", value.asInstanceOf[js.Any])
      
      inline def setLowestObserverState(value: IDerivationState): Self = StObject.set(x, "lowestObserverState", value.asInstanceOf[js.Any])
      
      inline def setObservers(value: Set[IDerivation]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
      
      inline def setOnBecomeObserved(value: () => Unit): Self = StObject.set(x, "onBecomeObserved", js.Any.fromFunction0(value))
      
      inline def setOnBecomeObservedListeners(value: Set[Lambda]): Self = StObject.set(x, "onBecomeObservedListeners", value.asInstanceOf[js.Any])
      
      inline def setOnBecomeObservedListenersUndefined: Self = StObject.set(x, "onBecomeObservedListeners", js.undefined)
      
      inline def setOnBecomeUnobserved(value: () => Unit): Self = StObject.set(x, "onBecomeUnobserved", js.Any.fromFunction0(value))
      
      inline def setOnBecomeUnobservedListeners(value: Set[Lambda]): Self = StObject.set(x, "onBecomeUnobservedListeners", value.asInstanceOf[js.Any])
      
      inline def setOnBecomeUnobservedListenersUndefined: Self = StObject.set(x, "onBecomeUnobservedListeners", js.undefined)
    }
  }
}
