package typings.mobx

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.mobx.actionMod.IActionFactory
import typings.mobx.anon.ComputedConfigurable
import typings.mobx.anon.Configurable
import typings.mobx.anon.Enumerable
import typings.mobx.anon.Get
import typings.mobx.anon.Promisevoidcancelvoid
import typings.mobx.anon.Set
import typings.mobx.atomMod.IAtom
import typings.mobx.autorunMod.IAutorunOptions
import typings.mobx.autorunMod.IReactionOptions
import typings.mobx.comparerMod.IEqualsComparer
import typings.mobx.computedMod.IComputed
import typings.mobx.computedvalueMod.IComputedValue
import typings.mobx.computedvalueMod.IComputedValueOptions
import typings.mobx.coreActionMod.IAction
import typings.mobx.coreActionMod.IActionRunInfo
import typings.mobx.coreObservableMod.IDepTreeNode
import typings.mobx.coreObservableMod.IObservable
import typings.mobx.decoratorsMod.BabelDescriptor
import typings.mobx.decoratorsMod.PropertyCreator
import typings.mobx.derivationMod.IDerivation
import typings.mobx.extrasMod.IDependencyTree
import typings.mobx.extrasMod.IObserverTree
import typings.mobx.flowMod.CancellablePromise
import typings.mobx.interceptReadMod.ReadInterceptor
import typings.mobx.interceptUtilsMod.IInterceptable
import typings.mobx.interceptUtilsMod.IInterceptor
import typings.mobx.listenUtilsMod.IListenable
import typings.mobx.mobxBooleans.`false`
import typings.mobx.mobxBooleans.`true`
import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.observableMod.CreateObservableOptions
import typings.mobx.observablearrayMod.IArrayChange
import typings.mobx.observablearrayMod.IArraySplice
import typings.mobx.observablearrayMod.IArrayWillChange
import typings.mobx.observablearrayMod.IArrayWillSplice
import typings.mobx.observablearrayMod.IObservableArray
import typings.mobx.observabledecoratorMod.IObservableDecorator
import typings.mobx.observablemapMod.IMapDidChange
import typings.mobx.observablemapMod.IMapWillChange
import typings.mobx.observablemapMod.IObservableMapInitialValues
import typings.mobx.observableobjectMod.IObjectDidChange
import typings.mobx.observableobjectMod.IObjectWillChange
import typings.mobx.observableobjectMod.IObservableObject
import typings.mobx.observablesetMod.IObservableSetInitialValues
import typings.mobx.observablesetMod.ISetDidChange
import typings.mobx.observablesetMod.ISetWillChange
import typings.mobx.observablevalueMod.IObservableValue
import typings.mobx.observablevalueMod.IValueDidChange
import typings.mobx.observablevalueMod.IValueWillChange
import typings.mobx.reactionMod.IReactionDisposer
import typings.mobx.reactionMod.IReactionPublic
import typings.mobx.reactionMod.Reaction
import typings.mobx.tojsMod.ToJSOptions
import typings.mobx.utilsMod.Lambda
import typings.mobx.whenMod.IWhenOptions
import typings.std.AsyncGenerator
import typings.std.Error
import typings.std.Generator
import typings.std.IArguments
import typings.std.IterableIterator
import typings.std.Iterator
import typings.std.Map
import typings.std.PropertyDescriptor
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalMod {
  
  @JSImport("mobx/lib/internal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/lib/internal", "Atom")
  @js.native
  /**
    * Create a new atom. For debugging purposes it is recommended to give it a name.
    * The onBecomeObserved and onBecomeUnobserved callbacks can be used for resource management.
    */
  class Atom ()
    extends typings.mobx.atomMod.Atom {
    def this(name: String) = this()
  }
  
  @JSImport("mobx/lib/internal", "CaughtException")
  @js.native
  class CaughtException protected ()
    extends typings.mobx.derivationMod.CaughtException {
    def this(cause: js.Any) = this()
  }
  
  @JSImport("mobx/lib/internal", "ComputedValue")
  @js.native
  class ComputedValue[T] protected ()
    extends typings.mobx.computedvalueMod.ComputedValue[T] {
    /**
      * Create a new computed value based on a function expression.
      *
      * The `name` property is for debug purposes only.
      *
      * The `equals` property specifies the comparer function to use to determine if a newly produced
      * value differs from the previous value. Two comparers are provided in the library; `defaultComparer`
      * compares based on identity comparison (===), and `structualComparer` deeply compares the structure.
      * Structural comparison can be convenient if you always produce a new aggregated object and
      * don't want to notify observers if it is structurally the same.
      * This is useful for working with vectors, mouse coordinates etc.
      */
    def this(options: IComputedValueOptions[T]) = this()
  }
  
  @JSImport("mobx/lib/internal", "EMPTY_ARRAY")
  @js.native
  val EMPTY_ARRAY: js.Array[scala.Nothing] = js.native
  
  object FlowCancellationError {
    
    @scala.inline
    def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
    
    @JSImport("mobx/lib/internal", "FlowCancellationError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx/lib/internal", "FlowCancellationError.prototype")
    @js.native
    def prototype: js.Any = js.native
    @scala.inline
    def prototype_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prototype")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mobx/lib/internal", "IDerivationState")
  @js.native
  object IDerivationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.mobx.derivationMod.IDerivationState & Double] = js.native
    
    /* -1 */ val NOT_TRACKING: typings.mobx.derivationMod.IDerivationState.NOT_TRACKING & Double = js.native
    
    /* 1 */ val POSSIBLY_STALE: typings.mobx.derivationMod.IDerivationState.POSSIBLY_STALE & Double = js.native
    
    /* 2 */ val STALE: typings.mobx.derivationMod.IDerivationState.STALE & Double = js.native
    
    /* 0 */ val UP_TO_DATE: typings.mobx.derivationMod.IDerivationState.UP_TO_DATE & Double = js.native
  }
  
  @JSImport("mobx/lib/internal", "MobXGlobals")
  @js.native
  class MobXGlobals ()
    extends typings.mobx.globalstateMod.MobXGlobals
  
  @JSImport("mobx/lib/internal", "OBFUSCATED_ERROR")
  @js.native
  val OBFUSCATED_ERROR: /* "An invariant failed, however the error is obfuscated because this is a production build." */ String = js.native
  
  @JSImport("mobx/lib/internal", "ObservableMap")
  @js.native
  class ObservableMap[K, V] ()
    extends typings.mobx.observablemapMod.ObservableMap[K, V] {
    def this(initialData: IObservableMapInitialValues[K, V]) = this()
    def this(initialData: Unit, enhancer: IEnhancer[V]) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer: IEnhancer[V]) = this()
    def this(initialData: Unit, enhancer: Unit, name: String) = this()
    def this(initialData: Unit, enhancer: IEnhancer[V], name: String) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer: Unit, name: String) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer: IEnhancer[V], name: String) = this()
  }
  
  @JSImport("mobx/lib/internal", "ObservableObjectAdministration")
  @js.native
  class ObservableObjectAdministration protected ()
    extends typings.mobx.observableobjectMod.ObservableObjectAdministration {
    def this(
      target: js.Any,
      values: Map[String | Double | js.Symbol, ObservableValue[js.Any] | ComputedValue[js.Any]],
      name: String,
      defaultEnhancer: IEnhancer[js.Any]
    ) = this()
  }
  
  @JSImport("mobx/lib/internal", "ObservableSet")
  @js.native
  class ObservableSet[T] ()
    extends typings.mobx.observablesetMod.ObservableSet[T] {
    def this(initialData: IObservableSetInitialValues[T]) = this()
    def this(initialData: Unit, enhancer: IEnhancer[T]) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T]) = this()
    def this(initialData: Unit, enhancer: Unit, name: String) = this()
    def this(initialData: Unit, enhancer: IEnhancer[T], name: String) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: Unit, name: String) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T], name: String) = this()
  }
  
  @JSImport("mobx/lib/internal", "ObservableValue")
  @js.native
  class ObservableValue[T] protected ()
    extends typings.mobx.observablevalueMod.ObservableValue[T] {
    def this(value: T, enhancer: IEnhancer[T]) = this()
    def this(value: T, enhancer: IEnhancer[T], name: String) = this()
    def this(value: T, enhancer: IEnhancer[T], name: String, notifySpy: Boolean) = this()
    def this(value: T, enhancer: IEnhancer[T], name: Unit, notifySpy: Boolean) = this()
    def this(
      value: T,
      enhancer: IEnhancer[T],
      name: String,
      notifySpy: Boolean,
      equals: IEqualsComparer[js.Any]
    ) = this()
    def this(value: T, enhancer: IEnhancer[T], name: String, notifySpy: Unit, equals: IEqualsComparer[js.Any]) = this()
    def this(value: T, enhancer: IEnhancer[T], name: Unit, notifySpy: Boolean, equals: IEqualsComparer[js.Any]) = this()
    def this(value: T, enhancer: IEnhancer[T], name: Unit, notifySpy: Unit, equals: IEqualsComparer[js.Any]) = this()
  }
  
  @JSImport("mobx/lib/internal", "Reaction")
  @js.native
  class Reaction_ protected () extends Reaction {
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
  }
  
  @JSImport("mobx/lib/internal", "TraceMode")
  @js.native
  object TraceMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.mobx.derivationMod.TraceMode & Double] = js.native
    
    /* 2 */ val BREAK: typings.mobx.derivationMod.TraceMode.BREAK & Double = js.native
    
    /* 1 */ val LOG: typings.mobx.derivationMod.TraceMode.LOG & Double = js.native
    
    /* 0 */ val NONE: typings.mobx.derivationMod.TraceMode.NONE & Double = js.native
  }
  
  @scala.inline
  def _isComputed(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isComputed")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def _isComputed(value: js.Any, property: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_isComputed")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("mobx/lib/internal", "action")
  @js.native
  val action: IActionFactory = js.native
  
  @scala.inline
  def actionFieldDecorator(name: String): js.Function3[/* target */ js.Any, /* prop */ js.Any, /* descriptor */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("actionFieldDecorator")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* prop */ js.Any, /* descriptor */ js.Any, Unit]]
  
  @scala.inline
  def addHiddenFinalProp(`object`: js.Any, propName: PropertyKey, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHiddenFinalProp")(`object`.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def addHiddenProp(`object`: js.Any, propName: PropertyKey, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHiddenProp")(`object`.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def addObserver(observable: IObservable, node: IDerivation): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addObserver")(observable.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def allowStateChanges[T](allowStateChanges: Boolean, func: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("allowStateChanges")(allowStateChanges.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def allowStateChangesEnd(prev: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStateChangesEnd")(prev.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def allowStateChangesInsideComputed[T](func: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStateChangesInsideComputed")(func.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def allowStateChangesStart(allowStateChanges: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStateChangesStart")(allowStateChanges.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def allowStateReadsEnd(prev: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStateReadsEnd")(prev.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def allowStateReadsStart(allowStateReads: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStateReadsStart")(allowStateReads.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def asCreateObservableOptions(thing: js.Any): CreateObservableOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("asCreateObservableOptions")(thing.asInstanceOf[js.Any]).asInstanceOf[CreateObservableOptions]
  
  @scala.inline
  def asObservableObject(target: js.Any): typings.mobx.observableobjectMod.ObservableObjectAdministration = ^.asInstanceOf[js.Dynamic].applyDynamic("asObservableObject")(target.asInstanceOf[js.Any]).asInstanceOf[typings.mobx.observableobjectMod.ObservableObjectAdministration]
  @scala.inline
  def asObservableObject(target: js.Any, name: Unit, defaultEnhancer: IEnhancer[js.Any]): typings.mobx.observableobjectMod.ObservableObjectAdministration = (^.asInstanceOf[js.Dynamic].applyDynamic("asObservableObject")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any], defaultEnhancer.asInstanceOf[js.Any])).asInstanceOf[typings.mobx.observableobjectMod.ObservableObjectAdministration]
  @scala.inline
  def asObservableObject(target: js.Any, name: PropertyKey): typings.mobx.observableobjectMod.ObservableObjectAdministration = (^.asInstanceOf[js.Dynamic].applyDynamic("asObservableObject")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.mobx.observableobjectMod.ObservableObjectAdministration]
  @scala.inline
  def asObservableObject(target: js.Any, name: PropertyKey, defaultEnhancer: IEnhancer[js.Any]): typings.mobx.observableobjectMod.ObservableObjectAdministration = (^.asInstanceOf[js.Dynamic].applyDynamic("asObservableObject")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any], defaultEnhancer.asInstanceOf[js.Any])).asInstanceOf[typings.mobx.observableobjectMod.ObservableObjectAdministration]
  
  @scala.inline
  def assertPropertyConfigurable(`object`: js.Any, prop: PropertyKey): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPropertyConfigurable")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def autorun(view: js.Function1[/* r */ IReactionPublic, js.Any]): IReactionDisposer = ^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(view.asInstanceOf[js.Any]).asInstanceOf[IReactionDisposer]
  @scala.inline
  def autorun(view: js.Function1[/* r */ IReactionPublic, js.Any], opts: IAutorunOptions): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(view.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  
  @scala.inline
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any): Get | Set | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("boundActionDecorator")(target.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Get | Set | Null]
  @scala.inline
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any, applyToInstance: Boolean): Get | Set | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("boundActionDecorator")(target.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], applyToInstance.asInstanceOf[js.Any])).asInstanceOf[Get | Set | Null]
  
  @scala.inline
  def changeDependenciesStateTo0(derivation: IDerivation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("changeDependenciesStateTo0")(derivation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def checkIfStateModificationsAreAllowed(atom: IAtom): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkIfStateModificationsAreAllowed")(atom.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def checkIfStateReadsAreAllowed(observable: IObservable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkIfStateReadsAreAllowed")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def clearObserving(derivation: IDerivation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearObserving")(derivation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object comparer {
    
    @JSImport("mobx/lib/internal", "comparer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx/lib/internal", "comparer.default")
    @js.native
    def default: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @scala.inline
    def default(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def default_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/internal", "comparer.identity")
    @js.native
    def identity: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @scala.inline
    def identity(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("identity")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def identity_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/internal", "comparer.shallow")
    @js.native
    def shallow: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @scala.inline
    def shallow(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def shallow_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shallow")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/internal", "comparer.structural")
    @js.native
    def structural: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @scala.inline
    def structural(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("structural")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def structural_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structural")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mobx/lib/internal", "computed")
  @js.native
  val computed: IComputed = js.native
  
  @JSImport("mobx/lib/internal", "computedDecorator")
  @js.native
  val computedDecorator: js.Function = js.native
  
  @scala.inline
  def configure(options: ComputedConfigurable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def convertToMap(dataStructure: js.Any): Map[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToMap")(dataStructure.asInstanceOf[js.Any]).asInstanceOf[Map[js.Any, js.Any]]
  
  @scala.inline
  def createAction(actionName: String, fn: js.Function): js.Function & IAction = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function & IAction]
  @scala.inline
  def createAction(actionName: String, fn: js.Function, ref: js.Object): js.Function & IAction = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[js.Function & IAction]
  
  @scala.inline
  def createAtom(name: String): IAtom = ^.asInstanceOf[js.Dynamic].applyDynamic("createAtom")(name.asInstanceOf[js.Any]).asInstanceOf[IAtom]
  @scala.inline
  def createAtom(name: String, onBecomeObservedHandler: js.Function0[Unit]): IAtom = (^.asInstanceOf[js.Dynamic].applyDynamic("createAtom")(name.asInstanceOf[js.Any], onBecomeObservedHandler.asInstanceOf[js.Any])).asInstanceOf[IAtom]
  @scala.inline
  def createAtom(
    name: String,
    onBecomeObservedHandler: js.Function0[Unit],
    onBecomeUnobservedHandler: js.Function0[Unit]
  ): IAtom = (^.asInstanceOf[js.Dynamic].applyDynamic("createAtom")(name.asInstanceOf[js.Any], onBecomeObservedHandler.asInstanceOf[js.Any], onBecomeUnobservedHandler.asInstanceOf[js.Any])).asInstanceOf[IAtom]
  @scala.inline
  def createAtom(name: String, onBecomeObservedHandler: Unit, onBecomeUnobservedHandler: js.Function0[Unit]): IAtom = (^.asInstanceOf[js.Dynamic].applyDynamic("createAtom")(name.asInstanceOf[js.Any], onBecomeObservedHandler.asInstanceOf[js.Any], onBecomeUnobservedHandler.asInstanceOf[js.Any])).asInstanceOf[IAtom]
  
  @scala.inline
  def createDecoratorForEnhancer(enhancer: IEnhancer[js.Any]): IObservableDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecoratorForEnhancer")(enhancer.asInstanceOf[js.Any]).asInstanceOf[IObservableDecorator]
  
  @scala.inline
  def createDynamicObservableObject(base: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createDynamicObservableObject")(base.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def createInstanceofPredicate[T](name: String, clazz: Instantiable1[/* args (repeated) */ js.Any, T]): js.Function1[/* x */ js.Any, /* is T */ Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstanceofPredicate")(name.asInstanceOf[js.Any], clazz.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ js.Any, /* is T */ Boolean]]
  
  @scala.inline
  def createObservableArray[T](initialValues: js.Array[js.Any], enhancer: IEnhancer[T]): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  @scala.inline
  def createObservableArray[T](initialValues: js.Array[js.Any], enhancer: IEnhancer[T], name: String): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  @scala.inline
  def createObservableArray[T](initialValues: js.Array[js.Any], enhancer: IEnhancer[T], name: String, owned: Boolean): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any], owned.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  @scala.inline
  def createObservableArray[T](initialValues: js.Array[js.Any], enhancer: IEnhancer[T], name: Unit, owned: Boolean): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any], owned.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  @scala.inline
  def createObservableArray[T](initialValues: Unit, enhancer: IEnhancer[T]): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  @scala.inline
  def createObservableArray[T](initialValues: Unit, enhancer: IEnhancer[T], name: String): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  @scala.inline
  def createObservableArray[T](initialValues: Unit, enhancer: IEnhancer[T], name: String, owned: Boolean): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any], owned.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  @scala.inline
  def createObservableArray[T](initialValues: Unit, enhancer: IEnhancer[T], name: Unit, owned: Boolean): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any], owned.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  
  @scala.inline
  def createPropDecorator(propertyInitiallyEnumerable: Boolean, propertyCreator: PropertyCreator): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("createPropDecorator")(propertyInitiallyEnumerable.asInstanceOf[js.Any], propertyCreator.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @scala.inline
  def decorate[T](
    clazz: Instantiable1[/* args (repeated) */ js.Any, T],
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.MethodDecorator | std.PropertyDecorator | std.Array<std.MethodDecorator> | std.Array<std.PropertyDecorator>}
    */ typings.mobx.mobxStrings.decorate & TopLevel[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(clazz.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def decorate[T](
    `object`: T,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.MethodDecorator | std.PropertyDecorator | std.Array<std.MethodDecorator> | std.Array<std.PropertyDecorator>}
    */ typings.mobx.mobxStrings.decorate & TopLevel[js.Any]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(`object`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("mobx/lib/internal", "deepDecorator")
  @js.native
  val deepDecorator: IObservableDecorator = js.native
  
  @scala.inline
  def deepEnhancer(v: js.Any, _underscore: js.Any, name: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEnhancer")(v.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def deepEqual(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def deepEqual(a: js.Any, b: js.Any, depth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("mobx/lib/internal", "defaultCreateObservableOptions")
  @js.native
  val defaultCreateObservableOptions: CreateObservableOptions = js.native
  
  @scala.inline
  def defineBoundAction(target: js.Any, propertyName: String, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineBoundAction")(target.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def deprecated(msg: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(msg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def deprecated(thing: String, replacement: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(thing.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def endAction(runInfo: IActionRunInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_endAction")(runInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def endBatch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("endBatch")().asInstanceOf[Unit]
  
  @scala.inline
  def entries[T](ar: IObservableArray[T]): js.Array[js.Tuple2[Double, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(ar.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[Double, T]]]
  @scala.inline
  def entries[T](obj: T): js.Array[
    js.Tuple2[
      String, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    js.Tuple2[
      String, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]]
  @scala.inline
  def entries[T](set: ObservableSet[T]): js.Array[js.Tuple2[T, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(set.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[T, T]]]
  @scala.inline
  def entries[K, T](map: ObservableMap[K, T]): js.Array[js.Tuple2[K, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(map.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[K, T]]]
  
  @scala.inline
  def executeAction(actionName: String, fn: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAction")(actionName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def executeAction(actionName: String, fn: js.Function, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAction")(actionName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def executeAction(actionName: String, fn: js.Function, scope: js.Any, args: IArguments): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAction")(actionName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def executeAction(actionName: String, fn: js.Function, scope: Unit, args: IArguments): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAction")(actionName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A): A & B = ^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any]).asInstanceOf[A & B]
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[A & B]
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable & TopLevel[js.Any]
  ): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[A & B]
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable & TopLevel[js.Any],
    options: CreateObservableOptions
  ): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[A & B]
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B, decorators: Unit, options: CreateObservableOptions): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[A & B]
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: Unit,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable & TopLevel[js.Any]
  ): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[A & B]
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: Unit,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable & TopLevel[js.Any],
    options: CreateObservableOptions
  ): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[A & B]
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: Unit, decorators: Unit, options: CreateObservableOptions): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[A & B]
  
  @scala.inline
  def extendObservableObjectWithProperties(target: js.Any, properties: js.Any, decorators: js.Any, defaultDecorator: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservableObjectWithProperties")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], defaultDecorator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fail(message: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(message: Boolean): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def flow[R, Args /* <: js.Array[js.Any] */](
    generator: js.Function1[
      /* args */ Args, 
      (Generator[js.Any, R, js.Any]) | (AsyncGenerator[js.Any, R, js.Any])
    ]
  ): js.Function1[/* args */ Args, CancellablePromise[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flow")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, CancellablePromise[R]]]
  
  @scala.inline
  def generateComputedPropConfig(propName: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("generateComputedPropConfig")(propName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def generateObservablePropConfig(propName: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("generateObservablePropConfig")(propName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def get[T /* <: js.Object */](obj: T, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def get[T](obj: IObservableArray[T], index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  @scala.inline
  def get[K, V](obj: ObservableMap[K, V], key: K): js.UndefOr[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[V]]
  
  @scala.inline
  def getAdministration(thing: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdministration")(thing.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def getAdministration(thing: js.Any, property: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdministration")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getAtom(thing: js.Any): IDepTreeNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getAtom")(thing.asInstanceOf[js.Any]).asInstanceOf[IDepTreeNode]
  @scala.inline
  def getAtom(thing: js.Any, property: String): IDepTreeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("getAtom")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IDepTreeNode]
  
  @scala.inline
  def getDebugName(thing: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDebugName")(thing.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getDebugName(thing: js.Any, property: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDebugName")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getDefaultDecoratorFromObjectOptions(options: CreateObservableOptions): IObservableDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultDecoratorFromObjectOptions")(options.asInstanceOf[js.Any]).asInstanceOf[IObservableDecorator]
  
  @scala.inline
  def getDependencyTree(thing: js.Any): IDependencyTree = ^.asInstanceOf[js.Dynamic].applyDynamic("getDependencyTree")(thing.asInstanceOf[js.Any]).asInstanceOf[IDependencyTree]
  @scala.inline
  def getDependencyTree(thing: js.Any, property: String): IDependencyTree = (^.asInstanceOf[js.Dynamic].applyDynamic("getDependencyTree")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IDependencyTree]
  
  @scala.inline
  def getGlobal(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobal")().asInstanceOf[js.Any]
  
  @scala.inline
  def getGlobalState(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalState")().asInstanceOf[js.Any]
  
  @scala.inline
  def getNextId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextId")().asInstanceOf[Double]
  
  @scala.inline
  def getObserverTree(thing: js.Any): IObserverTree = ^.asInstanceOf[js.Dynamic].applyDynamic("getObserverTree")(thing.asInstanceOf[js.Any]).asInstanceOf[IObserverTree]
  @scala.inline
  def getObserverTree(thing: js.Any, property: String): IObserverTree = (^.asInstanceOf[js.Dynamic].applyDynamic("getObserverTree")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IObserverTree]
  
  @scala.inline
  def getObservers(observable: IObservable): typings.std.Set[IDerivation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObservers")(observable.asInstanceOf[js.Any]).asInstanceOf[typings.std.Set[IDerivation]]
  
  @scala.inline
  def getPlainObjectKeys(`object`: js.Any): js.Array[String | Double | js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlainObjectKeys")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | Double | js.Symbol]]
  
  @JSImport("mobx/lib/internal", "globalState")
  @js.native
  def globalState: typings.mobx.globalstateMod.MobXGlobals = js.native
  @scala.inline
  def globalState_=(x: typings.mobx.globalstateMod.MobXGlobals): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalState")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def has[T /* <: js.Object */](obj: T, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def has[K](obj: ObservableMap[K, js.Any], key: K): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def has[T](obj: ObservableSet[T], key: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def has[T](obj: IObservableArray[T], index: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def hasInterceptors(interceptable: IInterceptable[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInterceptors")(interceptable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def hasListeners(listenable: IListenable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListeners")(listenable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def hasObservers(observable: IObservable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasObservers")(observable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def initializeInstance(target: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeInstance")(target.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def intercept(`object`: js.Object, handler: IInterceptor[IObjectWillChange[js.Any]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(`object`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def intercept[T](
    observableArray: IObservableArray[T],
    handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableArray.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def intercept[V](observableMap: ObservableSet[V], handler: IInterceptor[ISetWillChange[V]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableMap.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def intercept[T](value: IObservableValue[T], handler: IInterceptor[IValueWillChange[T]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(value.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def intercept[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: T, property: K, handler: IInterceptor[IValueWillChange[js.Any]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def intercept[K, V](observableMap: ObservableMap[K, V], handler: IInterceptor[IMapWillChange[K, V]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableMap.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def intercept[K, V](observableMap: ObservableMap[K, V], property: K, handler: IInterceptor[IValueWillChange[V]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableMap.asInstanceOf[js.Any], property.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  @scala.inline
  def interceptChange[T](interceptable: IInterceptable[T | Null]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptChange")(interceptable.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  @scala.inline
  def interceptChange[T](interceptable: IInterceptable[T | Null], change: T): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptChange")(interceptable.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  @scala.inline
  def interceptReads(`object`: js.Object, property: String, handler: ReadInterceptor[js.Any]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptReads")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def interceptReads[T](observableArray: IObservableArray[T], handler: ReadInterceptor[T]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptReads")(observableArray.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def interceptReads[V](observableSet: ObservableSet[V], handler: ReadInterceptor[V]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptReads")(observableSet.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def interceptReads[T](value: IObservableValue[T], handler: ReadInterceptor[T]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptReads")(value.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def interceptReads[K, V](observableMap: ObservableMap[K, V], handler: ReadInterceptor[V]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptReads")(observableMap.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  @scala.inline
  def invariant(check: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def invariant(check: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def invariant(check: js.Any, message: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def invariant_false(check: `false`): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  @scala.inline
  def invariant_false(check: `false`, message: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def invariant_false(check: `false`, message: Boolean): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def invariant_true(check: `true`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def invariant_true(check: `true`, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def invariant_true(check: `true`, message: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def isAction(thing: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAction")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isArrayLike(x: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayLike")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isAtom(x: js.Any): /* is mobx.mobx/lib/core/atom.Atom */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAtom")(x.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/core/atom.Atom */ Boolean]
  
  @scala.inline
  def isCaughtException(e: js.Any): /* is mobx.mobx/lib/core/derivation.CaughtException */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCaughtException")(e.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/core/derivation.CaughtException */ Boolean]
  
  @scala.inline
  def isComputed(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComputed")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isComputedProp(value: js.Any, propName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isComputedProp")(value.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isComputedValue(x: js.Any): /* is mobx.mobx/lib/core/computedvalue.ComputedValue<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComputedValue")(x.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/core/computedvalue.ComputedValue<unknown> */ Boolean]
  
  @scala.inline
  def isComputingDerivation(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComputingDerivation")().asInstanceOf[Boolean]
  
  @scala.inline
  def isES6Map(thing: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isES6Map")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isES6Set(thing: js.Any): /* is std.Set<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isES6Set")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is std.Set<any> */ Boolean]
  
  @scala.inline
  def isFlowCancellationError(error: Error): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlowCancellationError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isObservable(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isObservableArray(thing: js.Any): /* is mobx.mobx/lib/types/observablearray.IObservableArray<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableArray")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/types/observablearray.IObservableArray<any> */ Boolean]
  
  @scala.inline
  def isObservableMap(thing: js.Any): /* is mobx.mobx/lib/types/observablemap.ObservableMap<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableMap")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/types/observablemap.ObservableMap<any, any> */ Boolean]
  
  @scala.inline
  def isObservableObject(thing: js.Any): /* is mobx.mobx/lib/types/observableobject.IObservableObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableObject")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/types/observableobject.IObservableObject */ Boolean]
  
  @scala.inline
  def isObservableProp(value: js.Any, propName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObservableProp")(value.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isObservableSet(thing: js.Any): /* is mobx.mobx/lib/types/observableset.ObservableSet<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableSet")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/types/observableset.ObservableSet<any> */ Boolean]
  
  @scala.inline
  def isObservableValue(x: js.Any): /* is mobx.mobx/lib/types/observablevalue.IObservableValue<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableValue")(x.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/types/observablevalue.IObservableValue<any> */ Boolean]
  
  @scala.inline
  def isPlainObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPropertyConfigurable(`object`: js.Any, prop: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyConfigurable")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isReaction(x: js.Any): /* is mobx.mobx/lib/core/reaction.Reaction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReaction")(x.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/core/reaction.Reaction */ Boolean]
  
  @scala.inline
  def isSpyEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpyEnabled")().asInstanceOf[Boolean]
  
  @scala.inline
  def isolateGlobalState(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isolateGlobalState")().asInstanceOf[Unit]
  
  @scala.inline
  def keys[T](ar: IObservableArray[T]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(ar.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def keys[K](map: ObservableMap[K, js.Any]): js.Array[K] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(map.asInstanceOf[js.Any]).asInstanceOf[js.Array[K]]
  @scala.inline
  def keys[T /* <: js.Object */](obj: T): js.Array[PropertyKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[PropertyKey]]
  @scala.inline
  def keys[T](set: ObservableSet[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(set.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def makeIterable[T](iterator: Iterator[T, js.Any, Unit]): IterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeIterable")(iterator.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[T]]
  
  @scala.inline
  def makeNonEnumerable(`object`: js.Any, propNames: js.Array[PropertyKey]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("makeNonEnumerable")(`object`.asInstanceOf[js.Any], propNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("mobx/lib/internal", "$mobx")
  @js.native
  val mobx: js.Symbol = js.native
  
  @JSImport("mobx/lib/internal", "mobxDidRunLazyInitializersSymbol")
  @js.native
  val mobxDidRunLazyInitializersSymbol: js.Symbol = js.native
  
  @JSImport("mobx/lib/internal", "mobxPendingDecorators")
  @js.native
  val mobxPendingDecorators: js.Symbol = js.native
  
  @scala.inline
  def namedActionDecorator(name: String): js.Function3[
    /* target */ js.Any, 
    /* prop */ js.Any, 
    /* descriptor */ BabelDescriptor, 
    Unit | Configurable | Enumerable
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("namedActionDecorator")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ js.Any, 
    /* prop */ js.Any, 
    /* descriptor */ BabelDescriptor, 
    Unit | Configurable | Enumerable
  ]]
  
  @scala.inline
  def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  @scala.inline
  def notifyListeners[T](listenable: IListenable, change: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notifyListeners")(listenable.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Inlined mobx.mobx/lib/api/observable.IObservableFactory & mobx.mobx/lib/api/observable.IObservableFactories & {  enhancer :mobx.mobx/lib/internal.IEnhancer<any>} */
  object observable {
    
    @scala.inline
    def apply(): scala.Nothing = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[scala.Nothing]
    @scala.inline
    def apply(target: js.Object, key: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(target: js.Object, key: String, baseDescriptor: PropertyDescriptor): js.Any = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], baseDescriptor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(target: js.Object, key: js.Symbol): js.Any = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(target: js.Object, key: js.Symbol, baseDescriptor: PropertyDescriptor): js.Any = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], baseDescriptor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(value: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
    @scala.inline
    def apply(value: Boolean): scala.Nothing = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
    @scala.inline
    def apply(value: Double): scala.Nothing = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
    @scala.inline
    def apply[T /* <: js.Object */](value: T): T & IObservableObject = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[T & IObservableObject]
    @scala.inline
    def apply[T /* <: js.Object */](
      value: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.apply & TopLevel[js.Any]
    ): T & IObservableObject = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[T & IObservableObject]
    @scala.inline
    def apply[T /* <: js.Object */](
      value: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.apply & TopLevel[js.Any],
      options: CreateObservableOptions
    ): T & IObservableObject = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & IObservableObject]
    @scala.inline
    def apply[T /* <: js.Object */](value: T, decorators: Unit, options: CreateObservableOptions): T & IObservableObject = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & IObservableObject]
    @scala.inline
    def apply[T](value: js.Array[T]): IObservableArray[T] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[IObservableArray[T]]
    @scala.inline
    def apply[T](value: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
    @scala.inline
    def apply[T](value: typings.std.Set[T]): ObservableSet[T] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[ObservableSet[T]]
    @scala.inline
    def apply[T](value: typings.std.Set[T], options: CreateObservableOptions): ObservableSet[T] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ObservableSet[T]]
    @scala.inline
    def apply[K, V](value: Map[K, V]): ObservableMap[K, V] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[ObservableMap[K, V]]
    @scala.inline
    def apply[K, V](value: Map[K, V], options: CreateObservableOptions): ObservableMap[K, V] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ObservableMap[K, V]]
    
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def array[T](): IObservableArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")().asInstanceOf[IObservableArray[T]]
    @scala.inline
    def array[T](initialValues: js.Array[T]): IObservableArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(initialValues.asInstanceOf[js.Any]).asInstanceOf[IObservableArray[T]]
    @scala.inline
    def array[T](initialValues: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(initialValues.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
    @scala.inline
    def array[T](initialValues: Unit, options: CreateObservableOptions): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(initialValues.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
    
    @scala.inline
    def box[T](): IObservableValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("box")().asInstanceOf[IObservableValue[T]]
    @scala.inline
    def box[T](value: T): IObservableValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("box")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[T]]
    @scala.inline
    def box[T](value: T, options: CreateObservableOptions): IObservableValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IObservableValue[T]]
    @scala.inline
    def box[T](value: Unit, options: CreateObservableOptions): IObservableValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IObservableValue[T]]
    
    @JSImport("mobx/lib/internal", "observable.deep")
    @js.native
    def deep: IObservableDecorator = js.native
    @scala.inline
    def deep(target: js.Object, property: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deep")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def deep(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deep")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def deep(target: js.Object, property: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deep")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def deep(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deep")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def deep_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deep")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/internal", "observable.enhancer")
    @js.native
    def enhancer: IEnhancer[js.Any] = js.native
    @scala.inline
    def enhancer(newValue: js.Any, oldValue: js.Any, name: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enhancer")(newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def enhancer(newValue: js.Any, oldValue: Unit, name: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enhancer")(newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def enhancer_=(x: IEnhancer[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enhancer")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def map[K, V](): ObservableMap[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")().asInstanceOf[ObservableMap[K, V]]
    @scala.inline
    def map[K, V](initialValues: Unit, options: CreateObservableOptions): ObservableMap[K, V] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(initialValues.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ObservableMap[K, V]]
    @scala.inline
    def map[K, V](initialValues: IObservableMapInitialValues[K, V]): ObservableMap[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(initialValues.asInstanceOf[js.Any]).asInstanceOf[ObservableMap[K, V]]
    @scala.inline
    def map[K, V](initialValues: IObservableMapInitialValues[K, V], options: CreateObservableOptions): ObservableMap[K, V] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(initialValues.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ObservableMap[K, V]]
    
    @scala.inline
    def `object`[T](props: T): T & IObservableObject = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(props.asInstanceOf[js.Any]).asInstanceOf[T & IObservableObject]
    @scala.inline
    def `object`[T](
      props: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.`object` & TopLevel[js.Any]
    ): T & IObservableObject = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(props.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[T & IObservableObject]
    @scala.inline
    def `object`[T](
      props: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.`object` & TopLevel[js.Any],
      options: CreateObservableOptions
    ): T & IObservableObject = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(props.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & IObservableObject]
    @scala.inline
    def `object`[T](props: T, decorators: Unit, options: CreateObservableOptions): T & IObservableObject = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(props.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & IObservableObject]
    
    /**
      * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
      */
    @JSImport("mobx/lib/internal", "observable.ref")
    @js.native
    def ref: IObservableDecorator = js.native
    /**
      * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
      */
    @scala.inline
    def ref(target: js.Object, property: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def ref(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def ref(target: js.Object, property: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def ref(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def ref_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ref")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def set[T](): ObservableSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")().asInstanceOf[ObservableSet[T]]
    @scala.inline
    def set[T](initialValues: Unit, options: CreateObservableOptions): ObservableSet[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(initialValues.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ObservableSet[T]]
    @scala.inline
    def set[T](initialValues: IObservableSetInitialValues[T]): ObservableSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(initialValues.asInstanceOf[js.Any]).asInstanceOf[ObservableSet[T]]
    @scala.inline
    def set[T](initialValues: IObservableSetInitialValues[T], options: CreateObservableOptions): ObservableSet[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(initialValues.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ObservableSet[T]]
    
    /**
      * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
      */
    @JSImport("mobx/lib/internal", "observable.shallow")
    @js.native
    def shallow: IObservableDecorator = js.native
    /**
      * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
      */
    @scala.inline
    def shallow(target: js.Object, property: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def shallow(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def shallow(target: js.Object, property: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def shallow(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def shallow_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shallow")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/internal", "observable.struct")
    @js.native
    def struct: IObservableDecorator = js.native
    @scala.inline
    def struct(target: js.Object, property: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("struct")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def struct(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("struct")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def struct(target: js.Object, property: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("struct")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def struct(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("struct")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def struct_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("struct")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def observe(`object`: js.Object, listener: js.Function1[/* change */ IObjectDidChange[js.Any], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe(
    `object`: js.Object,
    listener: js.Function1[/* change */ IObjectDidChange[js.Any], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableArray.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableArray.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[V](observableMap: ObservableSet[V], listener: js.Function1[/* change */ ISetDidChange[V], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[V](
    observableMap: ObservableSet[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[T](value: IComputedValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[T](
    value: IComputedValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[T](value: IObservableValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[T](
    value: IObservableValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[T, K /* <: /* keyof T */ String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ IValueDidChange[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      Unit
    ]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[T, K /* <: /* keyof T */ String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ IValueDidChange[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      Unit
    ],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[K, V](observableMap: ObservableMap[K, V], listener: js.Function1[/* change */ IMapDidChange[K, V], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    listener: js.Function1[/* change */ IMapDidChange[K, V], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  @scala.inline
  def onBecomeObserved(value: IComputedValue[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeObserved(value: IObservable, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeObserved(value: ObservableMap[js.Any, js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeObserved(value: ObservableSet[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeObserved(value: IObservableArray[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeObserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeObserved[K, V](value: ObservableMap[K, V], property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  @scala.inline
  def onBecomeUnobserved(value: IComputedValue[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeUnobserved(value: IObservable, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeUnobserved(value: ObservableMap[js.Any, js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeUnobserved(value: ObservableSet[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeUnobserved(value: IObservableArray[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeUnobserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def onBecomeUnobserved[K, V](value: ObservableMap[K, V], property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  @scala.inline
  def onReactionError(handler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit]): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("onReactionError")(handler.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  
  @scala.inline
  def once(func: Lambda): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(func.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  
  @scala.inline
  def ownKeys(target: js.Any): js.Array[PropertyKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("ownKeys")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[PropertyKey]]
  
  @scala.inline
  def propagateChangeConfirmed(observable: IObservable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("propagateChangeConfirmed")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def propagateChanged(observable: IObservable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("propagateChanged")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def propagateMaybeChanged(observable: IObservable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("propagateMaybeChanged")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def quacksLikeADecorator(args: IArguments): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("quacksLikeADecorator")(args.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def queueForUnobservation(observable: IObservable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("queueForUnobservation")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def reaction[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit]
  ): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("reaction")(expression.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  @scala.inline
  def reaction[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit],
    opts: IReactionOptions
  ): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("reaction")(expression.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  
  @JSImport("mobx/lib/internal", "refDecorator")
  @js.native
  val refDecorator: IObservableDecorator = js.native
  
  @scala.inline
  def refStructEnhancer(v: js.Any, oldValue: js.Any, name: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("refStructEnhancer")(v.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def referenceEnhancer(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("referenceEnhancer")().asInstanceOf[js.Any]
  @scala.inline
  def referenceEnhancer(newValue: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("referenceEnhancer")(newValue.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def registerInterceptor[T](interceptable: IInterceptable[T], handler: IInterceptor[T]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInterceptor")(interceptable.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  @scala.inline
  def registerListener(listenable: IListenable, handler: js.Function): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("registerListener")(listenable.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  @scala.inline
  def remove[T /* <: js.Object */](obj: T, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def remove[T](obj: ObservableSet[T], key: T): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def remove[T](obj: IObservableArray[T], index: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(obj.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def remove[K, V](obj: ObservableMap[K, V], key: K): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def removeObserver(observable: IObservable, node: IDerivation): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeObserver")(observable.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def reportObserved(observable: IObservable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("reportObserved")(observable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def resetGlobalState(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalState")().asInstanceOf[Unit]
  
  @scala.inline
  def runInAction[T](block: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("runInAction")(block.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def runInAction[T](name: String, block: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("runInAction")(name.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def runReactions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runReactions")().asInstanceOf[Unit]
  
  @scala.inline
  def set[T /* <: js.Object */](obj: T, key: PropertyKey, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def set[T /* <: js.Object */](obj: T, values: StringDictionary[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def set[V](obj: ObservableMap[PropertyKey, V], values: StringDictionary[V]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def set[T](obj: ObservableSet[T], value: T): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def set[T](obj: IObservableArray[T], index: Double, value: T): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def set[K, V](obj: ObservableMap[K, V], key: K, value: V): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def setReactionScheduler(fn: js.Function1[/* f */ js.Function0[Unit], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setReactionScheduler")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def shallowEnhancer(v: js.Any, _underscore: js.Any, name: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEnhancer")(v.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def shouldCompute(derivation: IDerivation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCompute")(derivation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def spy(listener: js.Function1[/* change */ js.Any, Unit]): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(listener.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  
  @scala.inline
  def spyReport(event: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spyReport")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def spyReportEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spyReportEnd")().asInstanceOf[Unit]
  @scala.inline
  def spyReportEnd(change: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spyReportEnd")(change.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def spyReportStart(event: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spyReportStart")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def startAction(actionName: String, scope: js.Any): IActionRunInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("_startAction")(actionName.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IActionRunInfo]
  @scala.inline
  def startAction(actionName: String, scope: js.Any, args: IArguments): IActionRunInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("_startAction")(actionName.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[IActionRunInfo]
  
  @scala.inline
  def startBatch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startBatch")().asInstanceOf[Unit]
  
  @scala.inline
  def stringifyKey(key: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyKey")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toJS(source: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def toJS(source: js.Any, options: ToJSOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def toJS[T](source: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def toJS[T](source: T, options: ToJSOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def toPrimitive(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toPrimitive")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def trace(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")().asInstanceOf[Unit]
  @scala.inline
  def trace(enterBreakPoint: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(enterBreakPoint.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: js.Any, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: js.Any, prop: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: js.Any, prop: String, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: js.Any, prop: Unit, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: Unit, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: Unit, prop: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: Unit, prop: String, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: Unit, prop: Unit, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def trackDerivedFunction[T](derivation: IDerivation, f: js.Function0[T], context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("trackDerivedFunction")(derivation.asInstanceOf[js.Any], f.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def transaction[T](action: js.Function0[T], thisArg: Unit): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transaction")(action.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def unique[T](list: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def untracked[T](action: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("untracked")(action.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def untrackedEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("untrackedEnd")().asInstanceOf[Unit]
  @scala.inline
  def untrackedEnd(prev: IDerivation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("untrackedEnd")(prev.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def untrackedStart(): IDerivation | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("untrackedStart")().asInstanceOf[IDerivation | Null]
  
  @scala.inline
  def values[T](ar: IObservableArray[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(ar.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def values[T](obj: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]]
  @scala.inline
  def values[T](set: ObservableSet[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(set.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def values[K, T](map: ObservableMap[K, T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(map.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def when(predicate: js.Function0[Boolean]): Promisevoidcancelvoid = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any]).asInstanceOf[Promisevoidcancelvoid]
  @scala.inline
  def when(predicate: js.Function0[Boolean], effect: Lambda): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  @scala.inline
  def when(predicate: js.Function0[Boolean], effect: Lambda, opts: IWhenOptions): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  @scala.inline
  def when(predicate: js.Function0[Boolean], opts: IWhenOptions): Promisevoidcancelvoid = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Promisevoidcancelvoid]
}
