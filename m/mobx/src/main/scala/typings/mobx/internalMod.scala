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
import scala.scalajs.js.`|`
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
    
    @JSImport("mobx/lib/internal", "FlowCancellationError")
    @js.native
    def apply(): Unit = js.native
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
    def apply(value: Double): js.UndefOr[typings.mobx.derivationMod.IDerivationState with Double] = js.native
    
    /* -1 */ val NOT_TRACKING: typings.mobx.derivationMod.IDerivationState.NOT_TRACKING with Double = js.native
    
    /* 1 */ val POSSIBLY_STALE: typings.mobx.derivationMod.IDerivationState.POSSIBLY_STALE with Double = js.native
    
    /* 2 */ val STALE: typings.mobx.derivationMod.IDerivationState.STALE with Double = js.native
    
    /* 0 */ val UP_TO_DATE: typings.mobx.derivationMod.IDerivationState.UP_TO_DATE with Double = js.native
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
    def this(initialData: js.UndefOr[IObservableMapInitialValues[K, V]], enhancer: IEnhancer[V]) = this()
    def this(
      initialData: js.UndefOr[IObservableMapInitialValues[K, V]],
      enhancer: js.UndefOr[scala.Nothing],
      name: String
    ) = this()
    def this(initialData: js.UndefOr[IObservableMapInitialValues[K, V]], enhancer: IEnhancer[V], name: String) = this()
  }
  
  @JSImport("mobx/lib/internal", "ObservableObjectAdministration")
  @js.native
  class ObservableObjectAdministration protected ()
    extends typings.mobx.observableobjectMod.ObservableObjectAdministration {
    def this(
      target: js.Any,
      values: Map[String | Double | js.Symbol, ObservableValue[_] | ComputedValue[_]],
      name: String,
      defaultEnhancer: IEnhancer[_]
    ) = this()
  }
  
  @JSImport("mobx/lib/internal", "ObservableSet")
  @js.native
  class ObservableSet[T] ()
    extends typings.mobx.observablesetMod.ObservableSet[T] {
    def this(initialData: IObservableSetInitialValues[T]) = this()
    def this(initialData: js.UndefOr[IObservableSetInitialValues[T]], enhancer: IEnhancer[T]) = this()
    def this(
      initialData: js.UndefOr[IObservableSetInitialValues[T]],
      enhancer: js.UndefOr[scala.Nothing],
      name: String
    ) = this()
    def this(initialData: js.UndefOr[IObservableSetInitialValues[T]], enhancer: IEnhancer[T], name: String) = this()
  }
  
  @JSImport("mobx/lib/internal", "ObservableValue")
  @js.native
  class ObservableValue[T] protected ()
    extends typings.mobx.observablevalueMod.ObservableValue[T] {
    def this(value: T, enhancer: IEnhancer[T]) = this()
    def this(value: T, enhancer: IEnhancer[T], name: String) = this()
    def this(value: T, enhancer: IEnhancer[T], name: js.UndefOr[scala.Nothing], notifySpy: Boolean) = this()
    def this(value: T, enhancer: IEnhancer[T], name: String, notifySpy: Boolean) = this()
    def this(
      value: T,
      enhancer: IEnhancer[T],
      name: js.UndefOr[scala.Nothing],
      notifySpy: js.UndefOr[scala.Nothing],
      equals: IEqualsComparer[_]
    ) = this()
    def this(
      value: T,
      enhancer: IEnhancer[T],
      name: js.UndefOr[scala.Nothing],
      notifySpy: Boolean,
      equals: IEqualsComparer[_]
    ) = this()
    def this(
      value: T,
      enhancer: IEnhancer[T],
      name: String,
      notifySpy: js.UndefOr[scala.Nothing],
      equals: IEqualsComparer[_]
    ) = this()
    def this(value: T, enhancer: IEnhancer[T], name: String, notifySpy: Boolean, equals: IEqualsComparer[_]) = this()
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
      errorHandler: js.UndefOr[scala.Nothing],
      requiresObservable: Boolean
    ) = this()
    def this(
      name: String,
      onInvalidate: js.Function0[Unit],
      errorHandler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit],
      requiresObservable: Boolean
    ) = this()
  }
  
  @JSImport("mobx/lib/internal", "TraceMode")
  @js.native
  object TraceMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.mobx.derivationMod.TraceMode with Double] = js.native
    
    /* 2 */ val BREAK: typings.mobx.derivationMod.TraceMode.BREAK with Double = js.native
    
    /* 1 */ val LOG: typings.mobx.derivationMod.TraceMode.LOG with Double = js.native
    
    /* 0 */ val NONE: typings.mobx.derivationMod.TraceMode.NONE with Double = js.native
  }
  
  @JSImport("mobx/lib/internal", "_isComputed")
  @js.native
  def _isComputed(value: js.Any): Boolean = js.native
  @JSImport("mobx/lib/internal", "_isComputed")
  @js.native
  def _isComputed(value: js.Any, property: String): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "action")
  @js.native
  val action: IActionFactory = js.native
  
  @JSImport("mobx/lib/internal", "actionFieldDecorator")
  @js.native
  def actionFieldDecorator(name: String): js.Function3[/* target */ js.Any, /* prop */ js.Any, /* descriptor */ js.Any, Unit] = js.native
  
  @JSImport("mobx/lib/internal", "addHiddenFinalProp")
  @js.native
  def addHiddenFinalProp(`object`: js.Any, propName: PropertyKey, value: js.Any): Unit = js.native
  
  @JSImport("mobx/lib/internal", "addHiddenProp")
  @js.native
  def addHiddenProp(`object`: js.Any, propName: PropertyKey, value: js.Any): Unit = js.native
  
  @JSImport("mobx/lib/internal", "addObserver")
  @js.native
  def addObserver(observable: IObservable, node: IDerivation): Unit = js.native
  
  @JSImport("mobx/lib/internal", "allowStateChanges")
  @js.native
  def allowStateChanges[T](allowStateChanges: Boolean, func: js.Function0[T]): T = js.native
  
  @JSImport("mobx/lib/internal", "allowStateChangesEnd")
  @js.native
  def allowStateChangesEnd(prev: Boolean): Unit = js.native
  
  @JSImport("mobx/lib/internal", "allowStateChangesInsideComputed")
  @js.native
  def allowStateChangesInsideComputed[T](func: js.Function0[T]): T = js.native
  
  @JSImport("mobx/lib/internal", "allowStateChangesStart")
  @js.native
  def allowStateChangesStart(allowStateChanges: Boolean): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "allowStateReadsEnd")
  @js.native
  def allowStateReadsEnd(prev: Boolean): Unit = js.native
  
  @JSImport("mobx/lib/internal", "allowStateReadsStart")
  @js.native
  def allowStateReadsStart(allowStateReads: Boolean): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "asCreateObservableOptions")
  @js.native
  def asCreateObservableOptions(thing: js.Any): CreateObservableOptions = js.native
  
  @JSImport("mobx/lib/internal", "asObservableObject")
  @js.native
  def asObservableObject(target: js.Any): typings.mobx.observableobjectMod.ObservableObjectAdministration = js.native
  @JSImport("mobx/lib/internal", "asObservableObject")
  @js.native
  def asObservableObject(target: js.Any, name: js.UndefOr[PropertyKey], defaultEnhancer: IEnhancer[_]): typings.mobx.observableobjectMod.ObservableObjectAdministration = js.native
  @JSImport("mobx/lib/internal", "asObservableObject")
  @js.native
  def asObservableObject(target: js.Any, name: PropertyKey): typings.mobx.observableobjectMod.ObservableObjectAdministration = js.native
  
  @JSImport("mobx/lib/internal", "assertPropertyConfigurable")
  @js.native
  def assertPropertyConfigurable(`object`: js.Any, prop: PropertyKey): Unit = js.native
  
  @JSImport("mobx/lib/internal", "autorun")
  @js.native
  def autorun(view: js.Function1[/* r */ IReactionPublic, _]): IReactionDisposer = js.native
  @JSImport("mobx/lib/internal", "autorun")
  @js.native
  def autorun(view: js.Function1[/* r */ IReactionPublic, _], opts: IAutorunOptions): IReactionDisposer = js.native
  
  @JSImport("mobx/lib/internal", "boundActionDecorator")
  @js.native
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any): Get | Set | Null = js.native
  @JSImport("mobx/lib/internal", "boundActionDecorator")
  @js.native
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any, applyToInstance: Boolean): Get | Set | Null = js.native
  
  @JSImport("mobx/lib/internal", "changeDependenciesStateTo0")
  @js.native
  def changeDependenciesStateTo0(derivation: IDerivation): Unit = js.native
  
  @JSImport("mobx/lib/internal", "checkIfStateModificationsAreAllowed")
  @js.native
  def checkIfStateModificationsAreAllowed(atom: IAtom): Unit = js.native
  
  @JSImport("mobx/lib/internal", "checkIfStateReadsAreAllowed")
  @js.native
  def checkIfStateReadsAreAllowed(observable: IObservable): Unit = js.native
  
  @JSImport("mobx/lib/internal", "clearObserving")
  @js.native
  def clearObserving(derivation: IDerivation): Unit = js.native
  
  object comparer {
    
    @JSImport("mobx/lib/internal", "comparer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx/lib/internal", "comparer.default")
    @js.native
    def default: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @JSImport("mobx/lib/internal", "comparer.default")
    @js.native
    def default(a: js.Any, b: js.Any): Boolean = js.native
    @scala.inline
    def default_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/internal", "comparer.identity")
    @js.native
    def identity: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @JSImport("mobx/lib/internal", "comparer.identity")
    @js.native
    def identity(a: js.Any, b: js.Any): Boolean = js.native
    @scala.inline
    def identity_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/internal", "comparer.shallow")
    @js.native
    def shallow: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @JSImport("mobx/lib/internal", "comparer.shallow")
    @js.native
    def shallow(a: js.Any, b: js.Any): Boolean = js.native
    @scala.inline
    def shallow_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shallow")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/internal", "comparer.structural")
    @js.native
    def structural: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @JSImport("mobx/lib/internal", "comparer.structural")
    @js.native
    def structural(a: js.Any, b: js.Any): Boolean = js.native
    @scala.inline
    def structural_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structural")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mobx/lib/internal", "computed")
  @js.native
  val computed: IComputed = js.native
  
  @JSImport("mobx/lib/internal", "computedDecorator")
  @js.native
  val computedDecorator: js.Function = js.native
  
  @JSImport("mobx/lib/internal", "configure")
  @js.native
  def configure(options: ComputedConfigurable): Unit = js.native
  
  @JSImport("mobx/lib/internal", "convertToMap")
  @js.native
  def convertToMap(dataStructure: js.Any): Map[_, _] = js.native
  
  @JSImport("mobx/lib/internal", "createAction")
  @js.native
  def createAction(actionName: String, fn: js.Function): js.Function with IAction = js.native
  @JSImport("mobx/lib/internal", "createAction")
  @js.native
  def createAction(actionName: String, fn: js.Function, ref: js.Object): js.Function with IAction = js.native
  
  @JSImport("mobx/lib/internal", "createAtom")
  @js.native
  def createAtom(name: String): IAtom = js.native
  @JSImport("mobx/lib/internal", "createAtom")
  @js.native
  def createAtom(
    name: String,
    onBecomeObservedHandler: js.UndefOr[scala.Nothing],
    onBecomeUnobservedHandler: js.Function0[Unit]
  ): IAtom = js.native
  @JSImport("mobx/lib/internal", "createAtom")
  @js.native
  def createAtom(name: String, onBecomeObservedHandler: js.Function0[Unit]): IAtom = js.native
  @JSImport("mobx/lib/internal", "createAtom")
  @js.native
  def createAtom(
    name: String,
    onBecomeObservedHandler: js.Function0[Unit],
    onBecomeUnobservedHandler: js.Function0[Unit]
  ): IAtom = js.native
  
  @JSImport("mobx/lib/internal", "createDecoratorForEnhancer")
  @js.native
  def createDecoratorForEnhancer(enhancer: IEnhancer[_]): IObservableDecorator = js.native
  
  @JSImport("mobx/lib/internal", "createDynamicObservableObject")
  @js.native
  def createDynamicObservableObject(base: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/internal", "createInstanceofPredicate")
  @js.native
  def createInstanceofPredicate[T](name: String, clazz: Instantiable1[/* args (repeated) */ js.Any, T]): js.Function1[/* x */ js.Any, /* is T */ Boolean] = js.native
  
  @JSImport("mobx/lib/internal", "createObservableArray")
  @js.native
  def createObservableArray[T](initialValues: js.UndefOr[scala.Nothing], enhancer: IEnhancer[T]): IObservableArray[T] = js.native
  @JSImport("mobx/lib/internal", "createObservableArray")
  @js.native
  def createObservableArray[T](
    initialValues: js.UndefOr[scala.Nothing],
    enhancer: IEnhancer[T],
    name: js.UndefOr[scala.Nothing],
    owned: Boolean
  ): IObservableArray[T] = js.native
  @JSImport("mobx/lib/internal", "createObservableArray")
  @js.native
  def createObservableArray[T](initialValues: js.UndefOr[scala.Nothing], enhancer: IEnhancer[T], name: String): IObservableArray[T] = js.native
  @JSImport("mobx/lib/internal", "createObservableArray")
  @js.native
  def createObservableArray[T](initialValues: js.UndefOr[scala.Nothing], enhancer: IEnhancer[T], name: String, owned: Boolean): IObservableArray[T] = js.native
  @JSImport("mobx/lib/internal", "createObservableArray")
  @js.native
  def createObservableArray[T](initialValues: js.Array[_], enhancer: IEnhancer[T]): IObservableArray[T] = js.native
  @JSImport("mobx/lib/internal", "createObservableArray")
  @js.native
  def createObservableArray[T](
    initialValues: js.Array[_],
    enhancer: IEnhancer[T],
    name: js.UndefOr[scala.Nothing],
    owned: Boolean
  ): IObservableArray[T] = js.native
  @JSImport("mobx/lib/internal", "createObservableArray")
  @js.native
  def createObservableArray[T](initialValues: js.Array[_], enhancer: IEnhancer[T], name: String): IObservableArray[T] = js.native
  @JSImport("mobx/lib/internal", "createObservableArray")
  @js.native
  def createObservableArray[T](initialValues: js.Array[_], enhancer: IEnhancer[T], name: String, owned: Boolean): IObservableArray[T] = js.native
  
  @JSImport("mobx/lib/internal", "createPropDecorator")
  @js.native
  def createPropDecorator(propertyInitiallyEnumerable: Boolean, propertyCreator: PropertyCreator): js.Function = js.native
  
  @JSImport("mobx/lib/internal", "decorate")
  @js.native
  def decorate[T](
    clazz: Instantiable1[/* args (repeated) */ js.Any, T],
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.MethodDecorator | std.PropertyDecorator | std.Array<std.MethodDecorator> | std.Array<std.PropertyDecorator>}
    */ typings.mobx.mobxStrings.decorate with TopLevel[js.Any]
  ): Unit = js.native
  @JSImport("mobx/lib/internal", "decorate")
  @js.native
  def decorate[T](
    `object`: T,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.MethodDecorator | std.PropertyDecorator | std.Array<std.MethodDecorator> | std.Array<std.PropertyDecorator>}
    */ typings.mobx.mobxStrings.decorate with TopLevel[js.Any]
  ): T = js.native
  
  @JSImport("mobx/lib/internal", "deepDecorator")
  @js.native
  val deepDecorator: IObservableDecorator = js.native
  
  @JSImport("mobx/lib/internal", "deepEnhancer")
  @js.native
  def deepEnhancer(v: js.Any, _underscore: js.Any, name: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/internal", "deepEqual")
  @js.native
  def deepEqual(a: js.Any, b: js.Any): Boolean = js.native
  @JSImport("mobx/lib/internal", "deepEqual")
  @js.native
  def deepEqual(a: js.Any, b: js.Any, depth: Double): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "defaultCreateObservableOptions")
  @js.native
  val defaultCreateObservableOptions: CreateObservableOptions = js.native
  
  @JSImport("mobx/lib/internal", "defineBoundAction")
  @js.native
  def defineBoundAction(target: js.Any, propertyName: String, fn: js.Function): Unit = js.native
  
  @JSImport("mobx/lib/internal", "deprecated")
  @js.native
  def deprecated(msg: String): Boolean = js.native
  @JSImport("mobx/lib/internal", "deprecated")
  @js.native
  def deprecated(thing: String, replacement: String): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "_endAction")
  @js.native
  def endAction(runInfo: IActionRunInfo): Unit = js.native
  
  @JSImport("mobx/lib/internal", "endBatch")
  @js.native
  def endBatch(): Unit = js.native
  
  @JSImport("mobx/lib/internal", "entries")
  @js.native
  def entries[T](ar: IObservableArray[T]): js.Array[js.Tuple2[Double, T]] = js.native
  @JSImport("mobx/lib/internal", "entries")
  @js.native
  def entries[T](obj: T): js.Array[
    js.Tuple2[
      String, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSImport("mobx/lib/internal", "entries")
  @js.native
  def entries[T](set: ObservableSet[T]): js.Array[js.Tuple2[T, T]] = js.native
  @JSImport("mobx/lib/internal", "entries")
  @js.native
  def entries[K, T](map: ObservableMap[K, T]): js.Array[js.Tuple2[K, T]] = js.native
  
  @JSImport("mobx/lib/internal", "executeAction")
  @js.native
  def executeAction(actionName: String, fn: js.Function): js.Any = js.native
  @JSImport("mobx/lib/internal", "executeAction")
  @js.native
  def executeAction(actionName: String, fn: js.Function, scope: js.UndefOr[scala.Nothing], args: IArguments): js.Any = js.native
  @JSImport("mobx/lib/internal", "executeAction")
  @js.native
  def executeAction(actionName: String, fn: js.Function, scope: js.Any): js.Any = js.native
  @JSImport("mobx/lib/internal", "executeAction")
  @js.native
  def executeAction(actionName: String, fn: js.Function, scope: js.Any, args: IArguments): js.Any = js.native
  
  @JSImport("mobx/lib/internal", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A): A with B = js.native
  @JSImport("mobx/lib/internal", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B): A with B = js.native
  @JSImport("mobx/lib/internal", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with TopLevel[js.Any]
  ): A with B = js.native
  @JSImport("mobx/lib/internal", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with TopLevel[js.Any],
    options: CreateObservableOptions
  ): A with B = js.native
  @JSImport("mobx/lib/internal", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B, decorators: js.UndefOr[scala.Nothing], options: CreateObservableOptions): A with B = js.native
  @JSImport("mobx/lib/internal", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: js.UndefOr[scala.Nothing],
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with TopLevel[js.Any]
  ): A with B = js.native
  @JSImport("mobx/lib/internal", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: js.UndefOr[scala.Nothing],
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with TopLevel[js.Any],
    options: CreateObservableOptions
  ): A with B = js.native
  @JSImport("mobx/lib/internal", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: js.UndefOr[scala.Nothing],
    decorators: js.UndefOr[scala.Nothing],
    options: CreateObservableOptions
  ): A with B = js.native
  
  @JSImport("mobx/lib/internal", "extendObservableObjectWithProperties")
  @js.native
  def extendObservableObjectWithProperties(target: js.Any, properties: js.Any, decorators: js.Any, defaultDecorator: js.Any): Unit = js.native
  
  @JSImport("mobx/lib/internal", "fail")
  @js.native
  def fail(message: String): scala.Nothing = js.native
  @JSImport("mobx/lib/internal", "fail")
  @js.native
  def fail(message: Boolean): scala.Nothing = js.native
  
  @JSImport("mobx/lib/internal", "flow")
  @js.native
  def flow[R, Args /* <: js.Array[_] */](generator: js.Function1[/* args */ Args, (Generator[_, R, _]) | (AsyncGenerator[_, R, _])]): js.Function1[/* args */ Args, CancellablePromise[R]] = js.native
  
  @JSImport("mobx/lib/internal", "generateComputedPropConfig")
  @js.native
  def generateComputedPropConfig(propName: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/internal", "generateObservablePropConfig")
  @js.native
  def generateObservablePropConfig(propName: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/internal", "get")
  @js.native
  def get[T /* <: js.Object */](obj: T, key: String): js.Any = js.native
  @JSImport("mobx/lib/internal", "get")
  @js.native
  def get[T](obj: IObservableArray[T], index: Double): js.UndefOr[T] = js.native
  @JSImport("mobx/lib/internal", "get")
  @js.native
  def get[K, V](obj: ObservableMap[K, V], key: K): js.UndefOr[V] = js.native
  
  @JSImport("mobx/lib/internal", "getAdministration")
  @js.native
  def getAdministration(thing: js.Any): js.Any = js.native
  @JSImport("mobx/lib/internal", "getAdministration")
  @js.native
  def getAdministration(thing: js.Any, property: String): js.Any = js.native
  
  @JSImport("mobx/lib/internal", "getAtom")
  @js.native
  def getAtom(thing: js.Any): IDepTreeNode = js.native
  @JSImport("mobx/lib/internal", "getAtom")
  @js.native
  def getAtom(thing: js.Any, property: String): IDepTreeNode = js.native
  
  @JSImport("mobx/lib/internal", "getDebugName")
  @js.native
  def getDebugName(thing: js.Any): String = js.native
  @JSImport("mobx/lib/internal", "getDebugName")
  @js.native
  def getDebugName(thing: js.Any, property: String): String = js.native
  
  @JSImport("mobx/lib/internal", "getDefaultDecoratorFromObjectOptions")
  @js.native
  def getDefaultDecoratorFromObjectOptions(options: CreateObservableOptions): IObservableDecorator = js.native
  
  @JSImport("mobx/lib/internal", "getDependencyTree")
  @js.native
  def getDependencyTree(thing: js.Any): IDependencyTree = js.native
  @JSImport("mobx/lib/internal", "getDependencyTree")
  @js.native
  def getDependencyTree(thing: js.Any, property: String): IDependencyTree = js.native
  
  @JSImport("mobx/lib/internal", "getGlobal")
  @js.native
  def getGlobal(): js.Any = js.native
  
  @JSImport("mobx/lib/internal", "getGlobalState")
  @js.native
  def getGlobalState(): js.Any = js.native
  
  @JSImport("mobx/lib/internal", "getNextId")
  @js.native
  def getNextId(): Double = js.native
  
  @JSImport("mobx/lib/internal", "getObserverTree")
  @js.native
  def getObserverTree(thing: js.Any): IObserverTree = js.native
  @JSImport("mobx/lib/internal", "getObserverTree")
  @js.native
  def getObserverTree(thing: js.Any, property: String): IObserverTree = js.native
  
  @JSImport("mobx/lib/internal", "getObservers")
  @js.native
  def getObservers(observable: IObservable): typings.std.Set[IDerivation] = js.native
  
  @JSImport("mobx/lib/internal", "getPlainObjectKeys")
  @js.native
  def getPlainObjectKeys(`object`: js.Any): js.Array[String | Double | js.Symbol] = js.native
  
  @JSImport("mobx/lib/internal", "globalState")
  @js.native
  def globalState: typings.mobx.globalstateMod.MobXGlobals = js.native
  @scala.inline
  def globalState_=(x: typings.mobx.globalstateMod.MobXGlobals): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalState")(x.asInstanceOf[js.Any])
  
  @JSImport("mobx/lib/internal", "has")
  @js.native
  def has[T /* <: js.Object */](obj: T, key: String): Boolean = js.native
  @JSImport("mobx/lib/internal", "has")
  @js.native
  def has[K](obj: ObservableMap[K, _], key: K): Boolean = js.native
  @JSImport("mobx/lib/internal", "has")
  @js.native
  def has[T](obj: ObservableSet[T], key: T): Boolean = js.native
  @JSImport("mobx/lib/internal", "has")
  @js.native
  def has[T](obj: IObservableArray[T], index: Double): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "hasInterceptors")
  @js.native
  def hasInterceptors(interceptable: IInterceptable[_]): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "hasListeners")
  @js.native
  def hasListeners(listenable: IListenable): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "hasObservers")
  @js.native
  def hasObservers(observable: IObservable): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "initializeInstance")
  @js.native
  def initializeInstance(target: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/internal", "intercept")
  @js.native
  def intercept(`object`: js.Object, handler: IInterceptor[IObjectWillChange[_]]): Lambda = js.native
  @JSImport("mobx/lib/internal", "intercept")
  @js.native
  def intercept[T](
    observableArray: IObservableArray[T],
    handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]
  ): Lambda = js.native
  @JSImport("mobx/lib/internal", "intercept")
  @js.native
  def intercept[V](observableMap: ObservableSet[V], handler: IInterceptor[ISetWillChange[V]]): Lambda = js.native
  @JSImport("mobx/lib/internal", "intercept")
  @js.native
  def intercept[T](value: IObservableValue[T], handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
  @JSImport("mobx/lib/internal", "intercept")
  @js.native
  def intercept[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: T, property: K, handler: IInterceptor[IValueWillChange[_]]): Lambda = js.native
  @JSImport("mobx/lib/internal", "intercept")
  @js.native
  def intercept[K, V](observableMap: ObservableMap[K, V], handler: IInterceptor[IMapWillChange[K, V]]): Lambda = js.native
  @JSImport("mobx/lib/internal", "intercept")
  @js.native
  def intercept[K, V](observableMap: ObservableMap[K, V], property: K, handler: IInterceptor[IValueWillChange[V]]): Lambda = js.native
  
  @JSImport("mobx/lib/internal", "interceptChange")
  @js.native
  def interceptChange[T](interceptable: IInterceptable[T | Null]): T | Null = js.native
  @JSImport("mobx/lib/internal", "interceptChange")
  @js.native
  def interceptChange[T](interceptable: IInterceptable[T | Null], change: T): T | Null = js.native
  
  @JSImport("mobx/lib/internal", "interceptReads")
  @js.native
  def interceptReads(`object`: js.Object, property: String, handler: ReadInterceptor[_]): Lambda = js.native
  @JSImport("mobx/lib/internal", "interceptReads")
  @js.native
  def interceptReads[T](observableArray: IObservableArray[T], handler: ReadInterceptor[T]): Lambda = js.native
  @JSImport("mobx/lib/internal", "interceptReads")
  @js.native
  def interceptReads[V](observableSet: ObservableSet[V], handler: ReadInterceptor[V]): Lambda = js.native
  @JSImport("mobx/lib/internal", "interceptReads")
  @js.native
  def interceptReads[T](value: IObservableValue[T], handler: ReadInterceptor[T]): Lambda = js.native
  @JSImport("mobx/lib/internal", "interceptReads")
  @js.native
  def interceptReads[K, V](observableMap: ObservableMap[K, V], handler: ReadInterceptor[V]): Lambda = js.native
  
  @JSImport("mobx/lib/internal", "invariant")
  @js.native
  def invariant(check: js.Any): Unit = js.native
  @JSImport("mobx/lib/internal", "invariant")
  @js.native
  def invariant(check: js.Any, message: String): Unit = js.native
  @JSImport("mobx/lib/internal", "invariant")
  @js.native
  def invariant(check: js.Any, message: Boolean): Unit = js.native
  @JSImport("mobx/lib/internal", "invariant")
  @js.native
  def invariant_false(check: `false`): scala.Nothing = js.native
  @JSImport("mobx/lib/internal", "invariant")
  @js.native
  def invariant_false(check: `false`, message: String): scala.Nothing = js.native
  @JSImport("mobx/lib/internal", "invariant")
  @js.native
  def invariant_false(check: `false`, message: Boolean): scala.Nothing = js.native
  @JSImport("mobx/lib/internal", "invariant")
  @js.native
  def invariant_true(check: `true`): Unit = js.native
  @JSImport("mobx/lib/internal", "invariant")
  @js.native
  def invariant_true(check: `true`, message: String): Unit = js.native
  @JSImport("mobx/lib/internal", "invariant")
  @js.native
  def invariant_true(check: `true`, message: Boolean): Unit = js.native
  
  @JSImport("mobx/lib/internal", "isAction")
  @js.native
  def isAction(thing: js.Any): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isArrayLike")
  @js.native
  def isArrayLike(x: js.Any): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isAtom")
  @js.native
  def isAtom(x: js.Any): /* is mobx.mobx/lib/core/atom.Atom */ Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isCaughtException")
  @js.native
  def isCaughtException(e: js.Any): /* is mobx.mobx/lib/core/derivation.CaughtException */ Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isComputed")
  @js.native
  def isComputed(value: js.Any): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isComputedProp")
  @js.native
  def isComputedProp(value: js.Any, propName: String): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isComputedValue")
  @js.native
  def isComputedValue(x: js.Any): /* is mobx.mobx/lib/core/computedvalue.ComputedValue<unknown> */ Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isComputingDerivation")
  @js.native
  def isComputingDerivation(): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isES6Map")
  @js.native
  def isES6Map(thing: js.Any): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isES6Set")
  @js.native
  def isES6Set(thing: js.Any): /* is std.Set<any> */ Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isFlowCancellationError")
  @js.native
  def isFlowCancellationError(error: Error): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isObject")
  @js.native
  def isObject(value: js.Any): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isObservable")
  @js.native
  def isObservable(value: js.Any): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isObservableArray")
  @js.native
  def isObservableArray(thing: js.Any): /* is mobx.mobx/lib/types/observablearray.IObservableArray<any> */ Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isObservableMap")
  @js.native
  def isObservableMap(thing: js.Any): /* is mobx.mobx/lib/types/observablemap.ObservableMap<any, any> */ Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isObservableObject")
  @js.native
  def isObservableObject(thing: js.Any): /* is mobx.mobx/lib/types/observableobject.IObservableObject */ Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isObservableProp")
  @js.native
  def isObservableProp(value: js.Any, propName: String): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isObservableSet")
  @js.native
  def isObservableSet(thing: js.Any): /* is mobx.mobx/lib/types/observableset.ObservableSet<any> */ Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isObservableValue")
  @js.native
  def isObservableValue(x: js.Any): /* is mobx.mobx/lib/types/observablevalue.IObservableValue<any> */ Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isPlainObject")
  @js.native
  def isPlainObject(value: js.Any): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isPropertyConfigurable")
  @js.native
  def isPropertyConfigurable(`object`: js.Any, prop: PropertyKey): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isReaction")
  @js.native
  def isReaction(x: js.Any): /* is mobx.mobx/lib/core/reaction.Reaction */ Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isSpyEnabled")
  @js.native
  def isSpyEnabled(): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "isolateGlobalState")
  @js.native
  def isolateGlobalState(): Unit = js.native
  
  @JSImport("mobx/lib/internal", "keys")
  @js.native
  def keys[T](ar: IObservableArray[T]): js.Array[Double] = js.native
  @JSImport("mobx/lib/internal", "keys")
  @js.native
  def keys[K](map: ObservableMap[K, _]): js.Array[K] = js.native
  @JSImport("mobx/lib/internal", "keys")
  @js.native
  def keys[T /* <: js.Object */](obj: T): js.Array[PropertyKey] = js.native
  @JSImport("mobx/lib/internal", "keys")
  @js.native
  def keys[T](set: ObservableSet[T]): js.Array[T] = js.native
  
  @JSImport("mobx/lib/internal", "makeIterable")
  @js.native
  def makeIterable[T](iterator: Iterator[T, _, js.UndefOr[scala.Nothing]]): IterableIterator[T] = js.native
  
  @JSImport("mobx/lib/internal", "makeNonEnumerable")
  @js.native
  def makeNonEnumerable(`object`: js.Any, propNames: js.Array[PropertyKey]): Unit = js.native
  
  @JSImport("mobx/lib/internal", "$mobx")
  @js.native
  val mobx: js.Symbol = js.native
  
  @JSImport("mobx/lib/internal", "mobxDidRunLazyInitializersSymbol")
  @js.native
  val mobxDidRunLazyInitializersSymbol: js.Symbol = js.native
  
  @JSImport("mobx/lib/internal", "mobxPendingDecorators")
  @js.native
  val mobxPendingDecorators: js.Symbol = js.native
  
  @JSImport("mobx/lib/internal", "namedActionDecorator")
  @js.native
  def namedActionDecorator(name: String): js.Function3[
    /* target */ js.Any, 
    /* prop */ js.Any, 
    /* descriptor */ BabelDescriptor, 
    Unit | Configurable | Enumerable
  ] = js.native
  
  @JSImport("mobx/lib/internal", "noop")
  @js.native
  def noop(): Unit = js.native
  
  @JSImport("mobx/lib/internal", "notifyListeners")
  @js.native
  def notifyListeners[T](listenable: IListenable, change: T): Unit = js.native
  
  /* Inlined mobx.mobx/lib/api/observable.IObservableFactory & mobx.mobx/lib/api/observable.IObservableFactories & {  enhancer :mobx.mobx/lib/internal.IEnhancer<any>} */
  object observable {
    
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply(): scala.Nothing = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply(target: js.Object, key: String): js.Any = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply(target: js.Object, key: String, baseDescriptor: PropertyDescriptor): js.Any = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply(target: js.Object, key: js.Symbol): js.Any = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply(target: js.Object, key: js.Symbol, baseDescriptor: PropertyDescriptor): js.Any = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply(value: String): scala.Nothing = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply(value: Boolean): scala.Nothing = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply(value: Double): scala.Nothing = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply[T /* <: js.Object */](value: T): T with IObservableObject = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply[T /* <: js.Object */](
      value: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.apply with TopLevel[js.Any]
    ): T with IObservableObject = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply[T /* <: js.Object */](
      value: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.apply with TopLevel[js.Any],
      options: CreateObservableOptions
    ): T with IObservableObject = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply[T /* <: js.Object */](value: T, decorators: js.UndefOr[scala.Nothing], options: CreateObservableOptions): T with IObservableObject = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply[T](value: js.Array[T]): IObservableArray[T] = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply[T](value: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply[T](value: typings.std.Set[T]): ObservableSet[T] = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply[T](value: typings.std.Set[T], options: CreateObservableOptions): ObservableSet[T] = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply[K, V](value: Map[K, V]): ObservableMap[K, V] = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    def apply[K, V](value: Map[K, V], options: CreateObservableOptions): ObservableMap[K, V] = js.native
    @JSImport("mobx/lib/internal", "observable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx/lib/internal", "observable.array")
    @js.native
    def array[T](): IObservableArray[T] = js.native
    @JSImport("mobx/lib/internal", "observable.array")
    @js.native
    def array[T](initialValues: js.UndefOr[scala.Nothing], options: CreateObservableOptions): IObservableArray[T] = js.native
    @JSImport("mobx/lib/internal", "observable.array")
    @js.native
    def array[T](initialValues: js.Array[T]): IObservableArray[T] = js.native
    @JSImport("mobx/lib/internal", "observable.array")
    @js.native
    def array[T](initialValues: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = js.native
    
    @JSImport("mobx/lib/internal", "observable.box")
    @js.native
    def box[T](): IObservableValue[T] = js.native
    @JSImport("mobx/lib/internal", "observable.box")
    @js.native
    def box[T](value: T): IObservableValue[T] = js.native
    @JSImport("mobx/lib/internal", "observable.box")
    @js.native
    def box[T](value: T, options: CreateObservableOptions): IObservableValue[T] = js.native
    @JSImport("mobx/lib/internal", "observable.box")
    @js.native
    def box[T](value: js.UndefOr[scala.Nothing], options: CreateObservableOptions): IObservableValue[T] = js.native
    
    @JSImport("mobx/lib/internal", "observable.deep")
    @js.native
    def deep: IObservableDecorator = js.native
    @JSImport("mobx/lib/internal", "observable.deep")
    @js.native
    def deep(target: js.Object, property: String): Unit = js.native
    @JSImport("mobx/lib/internal", "observable.deep")
    @js.native
    def deep(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
    @JSImport("mobx/lib/internal", "observable.deep")
    @js.native
    def deep(target: js.Object, property: js.Symbol): Unit = js.native
    @JSImport("mobx/lib/internal", "observable.deep")
    @js.native
    def deep(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
    @scala.inline
    def deep_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deep")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/internal", "observable.enhancer")
    @js.native
    def enhancer: IEnhancer[js.Any] = js.native
    @JSImport("mobx/lib/internal", "observable.enhancer")
    @js.native
    def enhancer(newValue: js.Any, oldValue: js.UndefOr[scala.Nothing], name: String): js.Any = js.native
    @JSImport("mobx/lib/internal", "observable.enhancer")
    @js.native
    def enhancer(newValue: js.Any, oldValue: js.Any, name: String): js.Any = js.native
    @scala.inline
    def enhancer_=(x: IEnhancer[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enhancer")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/internal", "observable.map")
    @js.native
    def map[K, V](): ObservableMap[K, V] = js.native
    @JSImport("mobx/lib/internal", "observable.map")
    @js.native
    def map[K, V](initialValues: js.UndefOr[IObservableMapInitialValues[K, V]], options: CreateObservableOptions): ObservableMap[K, V] = js.native
    @JSImport("mobx/lib/internal", "observable.map")
    @js.native
    def map[K, V](initialValues: IObservableMapInitialValues[K, V]): ObservableMap[K, V] = js.native
    
    /**
      * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
      */
    @JSImport("mobx/lib/internal", "observable.ref")
    @js.native
    def ref: IObservableDecorator = js.native
    /**
      * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
      */
    @JSImport("mobx/lib/internal", "observable.ref")
    @js.native
    def ref(target: js.Object, property: String): Unit = js.native
    @JSImport("mobx/lib/internal", "observable.ref")
    @js.native
    def ref(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
    @JSImport("mobx/lib/internal", "observable.ref")
    @js.native
    def ref(target: js.Object, property: js.Symbol): Unit = js.native
    @JSImport("mobx/lib/internal", "observable.ref")
    @js.native
    def ref(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
    @scala.inline
    def ref_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ref")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/internal", "observable.set")
    @js.native
    def set[T](): ObservableSet[T] = js.native
    @JSImport("mobx/lib/internal", "observable.set")
    @js.native
    def set[T](initialValues: js.UndefOr[IObservableSetInitialValues[T]], options: CreateObservableOptions): ObservableSet[T] = js.native
    @JSImport("mobx/lib/internal", "observable.set")
    @js.native
    def set[T](initialValues: IObservableSetInitialValues[T]): ObservableSet[T] = js.native
    
    /**
      * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
      */
    @JSImport("mobx/lib/internal", "observable.shallow")
    @js.native
    def shallow: IObservableDecorator = js.native
    /**
      * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
      */
    @JSImport("mobx/lib/internal", "observable.shallow")
    @js.native
    def shallow(target: js.Object, property: String): Unit = js.native
    @JSImport("mobx/lib/internal", "observable.shallow")
    @js.native
    def shallow(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
    @JSImport("mobx/lib/internal", "observable.shallow")
    @js.native
    def shallow(target: js.Object, property: js.Symbol): Unit = js.native
    @JSImport("mobx/lib/internal", "observable.shallow")
    @js.native
    def shallow(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
    @scala.inline
    def shallow_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shallow")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/internal", "observable.struct")
    @js.native
    def struct: IObservableDecorator = js.native
    @JSImport("mobx/lib/internal", "observable.struct")
    @js.native
    def struct(target: js.Object, property: String): Unit = js.native
    @JSImport("mobx/lib/internal", "observable.struct")
    @js.native
    def struct(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
    @JSImport("mobx/lib/internal", "observable.struct")
    @js.native
    def struct(target: js.Object, property: js.Symbol): Unit = js.native
    @JSImport("mobx/lib/internal", "observable.struct")
    @js.native
    def struct(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
    @scala.inline
    def struct_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("struct")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/internal", "observable.object")
    @js.native
    def `object`[T](props: T): T with IObservableObject = js.native
    @JSImport("mobx/lib/internal", "observable.object")
    @js.native
    def `object`[T](
      props: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.`object` with TopLevel[js.Any]
    ): T with IObservableObject = js.native
    @JSImport("mobx/lib/internal", "observable.object")
    @js.native
    def `object`[T](
      props: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.`object` with TopLevel[js.Any],
      options: CreateObservableOptions
    ): T with IObservableObject = js.native
    @JSImport("mobx/lib/internal", "observable.object")
    @js.native
    def `object`[T](props: T, decorators: js.UndefOr[scala.Nothing], options: CreateObservableOptions): T with IObservableObject = js.native
  }
  
  @JSImport("mobx/lib/internal", "observe")
  @js.native
  def observe(`object`: js.Object, listener: js.Function1[/* change */ IObjectDidChange[_], Unit]): Lambda = js.native
  @JSImport("mobx/lib/internal", "observe")
  @js.native
  def observe(
    `object`: js.Object,
    listener: js.Function1[/* change */ IObjectDidChange[_], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx/lib/internal", "observe")
  @js.native
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = js.native
  @JSImport("mobx/lib/internal", "observe")
  @js.native
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx/lib/internal", "observe")
  @js.native
  def observe[V](observableMap: ObservableSet[V], listener: js.Function1[/* change */ ISetDidChange[V], Unit]): Lambda = js.native
  @JSImport("mobx/lib/internal", "observe")
  @js.native
  def observe[V](
    observableMap: ObservableSet[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx/lib/internal", "observe")
  @js.native
  def observe[T](value: IComputedValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  @JSImport("mobx/lib/internal", "observe")
  @js.native
  def observe[T](
    value: IComputedValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx/lib/internal", "observe")
  @js.native
  def observe[T](value: IObservableValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  @JSImport("mobx/lib/internal", "observe")
  @js.native
  def observe[T](
    value: IObservableValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx/lib/internal", "observe")
  @js.native
  def observe[T, K /* <: /* keyof T */ String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ IValueDidChange[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      Unit
    ]
  ): Lambda = js.native
  @JSImport("mobx/lib/internal", "observe")
  @js.native
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
  ): Lambda = js.native
  @JSImport("mobx/lib/internal", "observe")
  @js.native
  def observe[K, V](observableMap: ObservableMap[K, V], listener: js.Function1[/* change */ IMapDidChange[K, V], Unit]): Lambda = js.native
  @JSImport("mobx/lib/internal", "observe")
  @js.native
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    listener: js.Function1[/* change */ IMapDidChange[K, V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx/lib/internal", "observe")
  @js.native
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit]
  ): Lambda = js.native
  @JSImport("mobx/lib/internal", "observe")
  @js.native
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  
  @JSImport("mobx/lib/internal", "onBecomeObserved")
  @js.native
  def onBecomeObserved(value: IComputedValue[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/internal", "onBecomeObserved")
  @js.native
  def onBecomeObserved(value: IObservable, listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/internal", "onBecomeObserved")
  @js.native
  def onBecomeObserved(value: ObservableMap[_, _], listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/internal", "onBecomeObserved")
  @js.native
  def onBecomeObserved(value: ObservableSet[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/internal", "onBecomeObserved")
  @js.native
  def onBecomeObserved(value: IObservableArray[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/internal", "onBecomeObserved")
  @js.native
  def onBecomeObserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/internal", "onBecomeObserved")
  @js.native
  def onBecomeObserved[K, V](value: ObservableMap[K, V], property: K, listener: Lambda): Lambda = js.native
  
  @JSImport("mobx/lib/internal", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved(value: IComputedValue[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/internal", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved(value: IObservable, listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/internal", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved(value: ObservableMap[_, _], listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/internal", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved(value: ObservableSet[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/internal", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved(value: IObservableArray[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/internal", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/internal", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved[K, V](value: ObservableMap[K, V], property: K, listener: Lambda): Lambda = js.native
  
  @JSImport("mobx/lib/internal", "onReactionError")
  @js.native
  def onReactionError(handler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit]): Lambda = js.native
  
  @JSImport("mobx/lib/internal", "once")
  @js.native
  def once(func: Lambda): Lambda = js.native
  
  @JSImport("mobx/lib/internal", "ownKeys")
  @js.native
  def ownKeys(target: js.Any): js.Array[PropertyKey] = js.native
  
  @JSImport("mobx/lib/internal", "propagateChangeConfirmed")
  @js.native
  def propagateChangeConfirmed(observable: IObservable): Unit = js.native
  
  @JSImport("mobx/lib/internal", "propagateChanged")
  @js.native
  def propagateChanged(observable: IObservable): Unit = js.native
  
  @JSImport("mobx/lib/internal", "propagateMaybeChanged")
  @js.native
  def propagateMaybeChanged(observable: IObservable): Unit = js.native
  
  @JSImport("mobx/lib/internal", "quacksLikeADecorator")
  @js.native
  def quacksLikeADecorator(args: IArguments): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "queueForUnobservation")
  @js.native
  def queueForUnobservation(observable: IObservable): Unit = js.native
  
  @JSImport("mobx/lib/internal", "reaction")
  @js.native
  def reaction[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit]
  ): IReactionDisposer = js.native
  @JSImport("mobx/lib/internal", "reaction")
  @js.native
  def reaction[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit],
    opts: IReactionOptions
  ): IReactionDisposer = js.native
  
  @JSImport("mobx/lib/internal", "refDecorator")
  @js.native
  val refDecorator: IObservableDecorator = js.native
  
  @JSImport("mobx/lib/internal", "refStructEnhancer")
  @js.native
  def refStructEnhancer(v: js.Any, oldValue: js.Any, name: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/internal", "referenceEnhancer")
  @js.native
  def referenceEnhancer(): js.Any = js.native
  @JSImport("mobx/lib/internal", "referenceEnhancer")
  @js.native
  def referenceEnhancer(newValue: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/internal", "registerInterceptor")
  @js.native
  def registerInterceptor[T](interceptable: IInterceptable[T], handler: IInterceptor[T]): Lambda = js.native
  
  @JSImport("mobx/lib/internal", "registerListener")
  @js.native
  def registerListener(listenable: IListenable, handler: js.Function): Lambda = js.native
  
  @JSImport("mobx/lib/internal", "remove")
  @js.native
  def remove[T /* <: js.Object */](obj: T, key: String): js.Any = js.native
  @JSImport("mobx/lib/internal", "remove")
  @js.native
  def remove[T](obj: ObservableSet[T], key: T): js.Any = js.native
  @JSImport("mobx/lib/internal", "remove")
  @js.native
  def remove[T](obj: IObservableArray[T], index: Double): js.Any = js.native
  @JSImport("mobx/lib/internal", "remove")
  @js.native
  def remove[K, V](obj: ObservableMap[K, V], key: K): js.Any = js.native
  
  @JSImport("mobx/lib/internal", "removeObserver")
  @js.native
  def removeObserver(observable: IObservable, node: IDerivation): Unit = js.native
  
  @JSImport("mobx/lib/internal", "reportObserved")
  @js.native
  def reportObserved(observable: IObservable): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "resetGlobalState")
  @js.native
  def resetGlobalState(): Unit = js.native
  
  @JSImport("mobx/lib/internal", "runInAction")
  @js.native
  def runInAction[T](block: js.Function0[T]): T = js.native
  @JSImport("mobx/lib/internal", "runInAction")
  @js.native
  def runInAction[T](name: String, block: js.Function0[T]): T = js.native
  
  @JSImport("mobx/lib/internal", "runReactions")
  @js.native
  def runReactions(): Unit = js.native
  
  @JSImport("mobx/lib/internal", "set")
  @js.native
  def set[T /* <: js.Object */](obj: T, key: PropertyKey, value: js.Any): js.Any = js.native
  @JSImport("mobx/lib/internal", "set")
  @js.native
  def set[T /* <: js.Object */](obj: T, values: StringDictionary[js.Any]): js.Any = js.native
  @JSImport("mobx/lib/internal", "set")
  @js.native
  def set[V](obj: ObservableMap[PropertyKey, V], values: StringDictionary[V]): js.Any = js.native
  @JSImport("mobx/lib/internal", "set")
  @js.native
  def set[T](obj: ObservableSet[T], value: T): js.Any = js.native
  @JSImport("mobx/lib/internal", "set")
  @js.native
  def set[T](obj: IObservableArray[T], index: Double, value: T): js.Any = js.native
  @JSImport("mobx/lib/internal", "set")
  @js.native
  def set[K, V](obj: ObservableMap[K, V], key: K, value: V): js.Any = js.native
  
  @JSImport("mobx/lib/internal", "setReactionScheduler")
  @js.native
  def setReactionScheduler(fn: js.Function1[/* f */ js.Function0[Unit], Unit]): Unit = js.native
  
  @JSImport("mobx/lib/internal", "shallowEnhancer")
  @js.native
  def shallowEnhancer(v: js.Any, _underscore: js.Any, name: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/internal", "shouldCompute")
  @js.native
  def shouldCompute(derivation: IDerivation): Boolean = js.native
  
  @JSImport("mobx/lib/internal", "spy")
  @js.native
  def spy(listener: js.Function1[/* change */ js.Any, Unit]): Lambda = js.native
  
  @JSImport("mobx/lib/internal", "spyReport")
  @js.native
  def spyReport(event: js.Any): Unit = js.native
  
  @JSImport("mobx/lib/internal", "spyReportEnd")
  @js.native
  def spyReportEnd(): Unit = js.native
  @JSImport("mobx/lib/internal", "spyReportEnd")
  @js.native
  def spyReportEnd(change: js.Any): Unit = js.native
  
  @JSImport("mobx/lib/internal", "spyReportStart")
  @js.native
  def spyReportStart(event: js.Any): Unit = js.native
  
  @JSImport("mobx/lib/internal", "_startAction")
  @js.native
  def startAction(actionName: String, scope: js.Any): IActionRunInfo = js.native
  @JSImport("mobx/lib/internal", "_startAction")
  @js.native
  def startAction(actionName: String, scope: js.Any, args: IArguments): IActionRunInfo = js.native
  
  @JSImport("mobx/lib/internal", "startBatch")
  @js.native
  def startBatch(): Unit = js.native
  
  @JSImport("mobx/lib/internal", "stringifyKey")
  @js.native
  def stringifyKey(key: js.Any): String = js.native
  
  @JSImport("mobx/lib/internal", "toJS")
  @js.native
  def toJS(source: js.Any): js.Any = js.native
  @JSImport("mobx/lib/internal", "toJS")
  @js.native
  def toJS(source: js.Any, options: ToJSOptions): js.Any = js.native
  @JSImport("mobx/lib/internal", "toJS")
  @js.native
  def toJS[T](source: T): T = js.native
  @JSImport("mobx/lib/internal", "toJS")
  @js.native
  def toJS[T](source: T, options: ToJSOptions): T = js.native
  
  @JSImport("mobx/lib/internal", "toPrimitive")
  @js.native
  def toPrimitive(value: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/internal", "trace")
  @js.native
  def trace(): Unit = js.native
  @JSImport("mobx/lib/internal", "trace")
  @js.native
  def trace(enterBreakPoint: Boolean): Unit = js.native
  @JSImport("mobx/lib/internal", "trace")
  @js.native
  def trace(thing: js.UndefOr[scala.Nothing], enterBreakPoint: Boolean): Unit = js.native
  @JSImport("mobx/lib/internal", "trace")
  @js.native
  def trace(thing: js.UndefOr[scala.Nothing], prop: js.UndefOr[scala.Nothing], enterBreakPoint: Boolean): Unit = js.native
  @JSImport("mobx/lib/internal", "trace")
  @js.native
  def trace(thing: js.UndefOr[scala.Nothing], prop: String): Unit = js.native
  @JSImport("mobx/lib/internal", "trace")
  @js.native
  def trace(thing: js.UndefOr[scala.Nothing], prop: String, enterBreakPoint: Boolean): Unit = js.native
  @JSImport("mobx/lib/internal", "trace")
  @js.native
  def trace(thing: js.Any): Unit = js.native
  @JSImport("mobx/lib/internal", "trace")
  @js.native
  def trace(thing: js.Any, enterBreakPoint: Boolean): Unit = js.native
  @JSImport("mobx/lib/internal", "trace")
  @js.native
  def trace(thing: js.Any, prop: js.UndefOr[scala.Nothing], enterBreakPoint: Boolean): Unit = js.native
  @JSImport("mobx/lib/internal", "trace")
  @js.native
  def trace(thing: js.Any, prop: String): Unit = js.native
  @JSImport("mobx/lib/internal", "trace")
  @js.native
  def trace(thing: js.Any, prop: String, enterBreakPoint: Boolean): Unit = js.native
  
  @JSImport("mobx/lib/internal", "trackDerivedFunction")
  @js.native
  def trackDerivedFunction[T](derivation: IDerivation, f: js.Function0[T], context: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/internal", "transaction")
  @js.native
  def transaction[T](action: js.Function0[T], thisArg: js.UndefOr[scala.Nothing]): T = js.native
  
  @JSImport("mobx/lib/internal", "unique")
  @js.native
  def unique[T](list: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("mobx/lib/internal", "untracked")
  @js.native
  def untracked[T](action: js.Function0[T]): T = js.native
  
  @JSImport("mobx/lib/internal", "untrackedEnd")
  @js.native
  def untrackedEnd(): Unit = js.native
  @JSImport("mobx/lib/internal", "untrackedEnd")
  @js.native
  def untrackedEnd(prev: IDerivation): Unit = js.native
  
  @JSImport("mobx/lib/internal", "untrackedStart")
  @js.native
  def untrackedStart(): IDerivation | Null = js.native
  
  @JSImport("mobx/lib/internal", "values")
  @js.native
  def values[T](ar: IObservableArray[T]): js.Array[T] = js.native
  @JSImport("mobx/lib/internal", "values")
  @js.native
  def values[T](obj: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSImport("mobx/lib/internal", "values")
  @js.native
  def values[T](set: ObservableSet[T]): js.Array[T] = js.native
  @JSImport("mobx/lib/internal", "values")
  @js.native
  def values[K, T](map: ObservableMap[K, T]): js.Array[T] = js.native
  
  @JSImport("mobx/lib/internal", "when")
  @js.native
  def when(predicate: js.Function0[Boolean]): Promisevoidcancelvoid = js.native
  @JSImport("mobx/lib/internal", "when")
  @js.native
  def when(predicate: js.Function0[Boolean], effect: Lambda): IReactionDisposer = js.native
  @JSImport("mobx/lib/internal", "when")
  @js.native
  def when(predicate: js.Function0[Boolean], effect: Lambda, opts: IWhenOptions): IReactionDisposer = js.native
  @JSImport("mobx/lib/internal", "when")
  @js.native
  def when(predicate: js.Function0[Boolean], opts: IWhenOptions): Promisevoidcancelvoid = js.native
}
