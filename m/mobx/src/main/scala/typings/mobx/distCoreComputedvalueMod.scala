package typings.mobx

import typings.mobx.distCoreDerivationMod.IDerivation
import typings.mobx.distCoreDerivationMod.IDerivationState
import typings.mobx.distCoreDerivationMod.TraceMode
import typings.mobx.distCoreObservableMod.IObservable
import typings.mobx.distInternalMod.CaughtException
import typings.mobx.distUtilsComparerMod.IEqualsComparer
import typings.mobx.distUtilsUtilsMod.Lambda
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreComputedvalueMod {
  
  @JSImport("mobx/dist/core/computedvalue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.mobx.distCoreObservableMod.IDepTreeNode because Already inherited
  - typings.mobx.distCoreDerivationMod.IDerivation because var conflicts: name_, observing_. Inlined newObserving_, dependenciesState_, runId_, unboundDepsCount_, onBecomeStale_, isTracing_, requiresObservable_ */ @JSImport("mobx/dist/core/computedvalue", "ComputedValue")
  @js.native
  open class ComputedValue[T] protected ()
    extends StObject
       with IObservable
       with IComputedValue[T] {
    /**
      * Create a new computed value based on a function expression.
      *
      * The `name` property is for debug purposes only.
      *
      * The `equals` property specifies the comparer function to use to determine if a newly produced
      * value differs from the previous value. Two comparers are provided in the library; `defaultComparer`
      * compares based on identity comparison (===), and `structuralComparer` deeply compares the structure.
      * Structural comparison can be convenient if you always produce a new aggregated object and
      * don't want to notify observers if it is structurally the same.
      * This is useful for working with vectors, mouse coordinates etc.
      */
    def this(options: IComputedValueOptions[T]) = this()
    
    def computeValue_(track: Boolean): T | CaughtException = js.native
    
    var dependenciesState_ : IDerivationState = js.native
    
    def derivation(): T = js.native
    
    /* CompleteClass */
    var diffValue_ : Double = js.native
    
    /* private */ var equals_ : Any = js.native
    
    /* CompleteClass */
    var isBeingObserved_ : Boolean = js.native
    
    var isComputing_ : Boolean = js.native
    
    /* CompleteClass */
    var isPendingUnobservation_ : Boolean = js.native
    
    var isRunningSetter_ : Boolean = js.native
    
    var isTracing_ : TraceMode = js.native
    
    var keepAlive_ : Boolean = js.native
    
    /**
      * Id of the derivation *run* that last accessed this observable.
      * If this id equals the *run* id of the current derivation,
      * the dependency is already established
      */
    /* CompleteClass */
    var lastAccessedBy_ : Double = js.native
    
    /* CompleteClass */
    var lowestObserverState_ : IDerivationState = js.native
    
    /* CompleteClass */
    var name_ : String = js.native
    
    var newObserving_ : js.Array[IObservable] | Null = js.native
    
    /* CompleteClass */
    var observers_ : Set[IDerivation] = js.native
    
    @JSName("observing_")
    var observing__ComputedValue: js.Array[IObservable] = js.native
    
    /* CompleteClass */
    override def onBO(): Unit = js.native
    
    /* CompleteClass */
    override def onBUO(): Unit = js.native
    
    def onBecomeStale_(): Unit = js.native
    
    /**
      *  warn if the derivation has no dependencies after creation/update
      */
    var requiresObservable_ : js.UndefOr[Boolean] = js.native
    
    /* private */ var requiresReaction_ : Any = js.native
    
    var runId_ : Double = js.native
    
    var scope_ : js.UndefOr[js.Object] = js.native
    
    var setter_ : js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
    
    def suspend_(): Unit = js.native
    
    @JSName(js.Symbol.toPrimitive)
    var toPrimitive: js.Function0[T] = js.native
    
    def trackAndCompute(): Boolean = js.native
    
    var triggeredBy_ : js.UndefOr[String] = js.native
    
    var unboundDepsCount_ : Double = js.native
    
    /* protected */ var value_ : js.UndefOr[T | CaughtException] = js.native
    
    def warnAboutUntrackedRead_(): Unit = js.native
  }
  
  inline def isComputedValue(x: Any): /* is mobx.mobx/dist/core/computedvalue.ComputedValue<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComputedValue")(x.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/dist/core/computedvalue.ComputedValue<unknown> */ Boolean]
  
  trait IComputedDidChange[T] extends StObject {
    
    var debugObjectName: String
    
    var newValue: T
    
    var `object`: Any
    
    var observableKind: "computed"
    
    var oldValue: js.UndefOr[T] = js.undefined
    
    var `type`: "update"
  }
  object IComputedDidChange {
    
    inline def apply[T](debugObjectName: String, newValue: T, `object`: Any): IComputedDidChange[T] = {
      val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], observableKind = "computed")
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[IComputedDidChange[T]]
    }
    
    extension [Self <: IComputedDidChange[?], T](x: Self & IComputedDidChange[T]) {
      
      inline def setDebugObjectName(value: String): Self = StObject.set(x, "debugObjectName", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObservableKind(value: "computed"): Self = StObject.set(x, "observableKind", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      inline def setType(value: "update"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IComputedValue[T] extends StObject {
    
    def get(): T = js.native
    
    def observe_(listener: js.Function1[/* change */ IComputedDidChange[T], Unit]): Lambda = js.native
    def observe_(listener: js.Function1[/* change */ IComputedDidChange[T], Unit], fireImmediately: Boolean): Lambda = js.native
    
    def set(value: T): Unit = js.native
  }
  
  trait IComputedValueOptions[T] extends StObject {
    
    var context: js.UndefOr[Any] = js.undefined
    
    @JSName("equals")
    var equals_FIComputedValueOptions: js.UndefOr[IEqualsComparer[T]] = js.undefined
    
    var get: js.UndefOr[js.Function0[T]] = js.undefined
    
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var requiresReaction: js.UndefOr[Boolean] = js.undefined
    
    var set: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  }
  object IComputedValueOptions {
    
    inline def apply[T](): IComputedValueOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IComputedValueOptions[T]]
    }
    
    extension [Self <: IComputedValueOptions[?], T](x: Self & IComputedValueOptions[T]) {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setEquals_(value: (T, T) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRequiresReaction(value: Boolean): Self = StObject.set(x, "requiresReaction", value.asInstanceOf[js.Any])
      
      inline def setRequiresReactionUndefined: Self = StObject.set(x, "requiresReaction", js.undefined)
      
      inline def setSet(value: /* value */ T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    }
  }
}
