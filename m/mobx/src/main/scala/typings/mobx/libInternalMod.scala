package typings.mobx

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.mobx.libApiActionMod.IActionFactory
import typings.mobx.libApiAutorunMod.IAutorunOptions
import typings.mobx.libApiAutorunMod.IReactionOptions
import typings.mobx.libApiComputedMod.IComputed
import typings.mobx.libApiExtrasMod.IDependencyTree
import typings.mobx.libApiExtrasMod.IObserverTree
import typings.mobx.libApiFlowMod.CancellablePromise
import typings.mobx.libApiFlowMod.FlowReturnType
import typings.mobx.libApiInterceptDashReadMod.ReadInterceptor
import typings.mobx.libApiObservableMod.CreateObservableOptions
import typings.mobx.libApiObservableMod.IObservableFactories
import typings.mobx.libApiObservableMod.IObservableFactory
import typings.mobx.libApiObservabledecoratorMod.IObservableDecorator
import typings.mobx.libApiTojsMod.ToJSOptions
import typings.mobx.libApiWhenMod.IWhenOptions
import typings.mobx.libCoreActionMod.IAction
import typings.mobx.libCoreActionMod.IActionRunInfo
import typings.mobx.libCoreAtomMod.IAtom
import typings.mobx.libCoreComputedvalueMod.IComputedValue
import typings.mobx.libCoreComputedvalueMod.IComputedValueOptions
import typings.mobx.libCoreDerivationMod.IDerivation
import typings.mobx.libCoreObservableMod.IDepTreeNode
import typings.mobx.libCoreObservableMod.IObservable
import typings.mobx.libCoreReactionMod.IReactionDisposer
import typings.mobx.libCoreReactionMod.IReactionPublic
import typings.mobx.libInternalMod.ComputedValue
import typings.mobx.libInternalMod.ObservableMap
import typings.mobx.libInternalMod.ObservableSet
import typings.mobx.libInternalMod.ObservableValue
import typings.mobx.libTypesInterceptDashUtilsMod.IInterceptable
import typings.mobx.libTypesInterceptDashUtilsMod.IInterceptor
import typings.mobx.libTypesListenDashUtilsMod.IListenable
import typings.mobx.libTypesModifiersMod.IEnhancer
import typings.mobx.libTypesObservablearrayMod.IArrayChange
import typings.mobx.libTypesObservablearrayMod.IArraySplice
import typings.mobx.libTypesObservablearrayMod.IArrayWillChange
import typings.mobx.libTypesObservablearrayMod.IArrayWillSplice
import typings.mobx.libTypesObservablearrayMod.IObservableArray
import typings.mobx.libTypesObservablemapMod.IKeyValueMap
import typings.mobx.libTypesObservablemapMod.IMapDidChange
import typings.mobx.libTypesObservablemapMod.IMapWillChange
import typings.mobx.libTypesObservablemapMod.IObservableMapInitialValues
import typings.mobx.libTypesObservableobjectMod.IObjectDidChange
import typings.mobx.libTypesObservableobjectMod.IObjectWillChange
import typings.mobx.libTypesObservablesetMod.IObservableSetInitialValues
import typings.mobx.libTypesObservablesetMod.ISetDidChange
import typings.mobx.libTypesObservablesetMod.ISetWillChange
import typings.mobx.libTypesObservablevalueMod.IObservableValue
import typings.mobx.libTypesObservablevalueMod.IValueDidChange
import typings.mobx.libTypesObservablevalueMod.IValueWillChange
import typings.mobx.libUtilsComparerMod.IEqualsComparer
import typings.mobx.libUtilsDecoratorsMod.BabelDescriptor
import typings.mobx.libUtilsDecoratorsMod.PropertyCreator
import typings.mobx.libUtilsUtilsMod.Lambda
import typings.mobx.mobxNumbers.`false`
import typings.mobx.mobxNumbers.`true`
import typings.mobx.mobxStrings.`An invariant failed, however the error is obfuscated because this is an production buildDOT`
import typings.std.IArguments
import typings.std.IterableIterator
import typings.std.Iterator
import typings.std.Map
import typings.std.PropertyKey
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", JSImport.Namespace)
@js.native
object libInternalMod extends js.Object {
  @js.native
  /**
    * Create a new atom. For debugging purposes it is recommended to give it a name.
    * The onBecomeObserved and onBecomeUnobserved callbacks can be used for resource management.
    */
  class Atom ()
    extends typings.mobx.libCoreAtomMod.Atom {
    def this(name: String) = this()
  }
  
  @js.native
  class CaughtException protected ()
    extends typings.mobx.libCoreDerivationMod.CaughtException {
    def this(cause: js.Any) = this()
  }
  
  @js.native
  class ComputedValue[T] protected ()
    extends typings.mobx.libCoreComputedvalueMod.ComputedValue[T] {
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
  
  @js.native
  class MobXGlobals ()
    extends typings.mobx.libCoreGlobalstateMod.MobXGlobals
  
  @js.native
  class ObservableMap[K, V] ()
    extends typings.mobx.libTypesObservablemapMod.ObservableMap[K, V] {
    def this(initialData: IObservableMapInitialValues[K, V]) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer: IEnhancer[V]) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer: IEnhancer[V], name: String) = this()
  }
  
  @js.native
  class ObservableObjectAdministration protected ()
    extends typings.mobx.libTypesObservableobjectMod.ObservableObjectAdministration {
    def this(
      target: js.Any,
      values: Map[String | Double | js.Symbol, ObservableValue[_] | ComputedValue[_]],
      name: String,
      defaultEnhancer: IEnhancer[_]
    ) = this()
  }
  
  @js.native
  class ObservableSet[T] ()
    extends typings.mobx.libTypesObservablesetMod.ObservableSet[T] {
    def this(initialData: IObservableSetInitialValues[T]) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T]) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T], name: String) = this()
  }
  
  @js.native
  class ObservableValue[T] protected ()
    extends typings.mobx.libTypesObservablevalueMod.ObservableValue[T] {
    def this(value: T, enhancer: IEnhancer[T]) = this()
    def this(value: T, enhancer: IEnhancer[T], name: String) = this()
    def this(value: T, enhancer: IEnhancer[T], name: String, notifySpy: Boolean) = this()
    def this(value: T, enhancer: IEnhancer[T], name: String, notifySpy: Boolean, equals: IEqualsComparer[_]) = this()
  }
  
  @js.native
  class Reaction protected ()
    extends typings.mobx.libCoreReactionMod.Reaction {
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
  
  @JSName("$mobx")
  val $mobx: js.Symbol = js.native
  val EMPTY_ARRAY: js.Array[scala.Nothing] = js.native
  val OBFUSCATED_ERROR: `An invariant failed, however the error is obfuscated because this is an production buildDOT` = js.native
  val action: IActionFactory = js.native
  val computed: IComputed = js.native
  val computedDecorator: js.Function = js.native
  val deepDecorator: IObservableDecorator = js.native
  val defaultCreateObservableOptions: CreateObservableOptions = js.native
  var globalState: typings.mobx.libCoreGlobalstateMod.MobXGlobals = js.native
  val mobxDidRunLazyInitializersSymbol: js.Symbol = js.native
  val mobxPendingDecorators: js.Symbol = js.native
  val observable: IObservableFactory with IObservableFactories with Anon_Enhancer = js.native
  val refDecorator: IObservableDecorator = js.native
  def _endAction(runInfo: IActionRunInfo): Unit = js.native
  def _isComputed(value: js.Any): Boolean = js.native
  def _isComputed(value: js.Any, property: String): Boolean = js.native
  def _startAction(actionName: String, scope: js.Any): IActionRunInfo = js.native
  def _startAction(actionName: String, scope: js.Any, args: IArguments): IActionRunInfo = js.native
  def actionFieldDecorator(name: String): js.Function3[/* target */ js.Any, /* prop */ js.Any, /* descriptor */ js.Any, Unit] = js.native
  def addHiddenFinalProp(`object`: js.Any, propName: PropertyKey, value: js.Any): Unit = js.native
  def addHiddenProp(`object`: js.Any, propName: PropertyKey, value: js.Any): Unit = js.native
  def addObserver(observable: IObservable, node: IDerivation): Unit = js.native
  def allowStateChanges[T](allowStateChanges: Boolean, func: js.Function0[T]): T = js.native
  def allowStateChangesEnd(prev: Boolean): Unit = js.native
  def allowStateChangesInsideComputed[T](func: js.Function0[T]): T = js.native
  def allowStateChangesStart(allowStateChanges: Boolean): Boolean = js.native
  def allowStateReadsEnd(prev: Boolean): Unit = js.native
  def allowStateReadsStart(allowStateReads: Boolean): Boolean = js.native
  def asCreateObservableOptions(thing: js.Any): CreateObservableOptions = js.native
  def asObservableObject(target: js.Any): typings.mobx.libTypesObservableobjectMod.ObservableObjectAdministration = js.native
  def asObservableObject(target: js.Any, name: PropertyKey): typings.mobx.libTypesObservableobjectMod.ObservableObjectAdministration = js.native
  def asObservableObject(target: js.Any, name: PropertyKey, defaultEnhancer: IEnhancer[_]): typings.mobx.libTypesObservableobjectMod.ObservableObjectAdministration = js.native
  def assertPropertyConfigurable(`object`: js.Any, prop: PropertyKey): Unit = js.native
  def autorun(view: js.Function1[/* r */ IReactionPublic, _]): IReactionDisposer = js.native
  def autorun(view: js.Function1[/* r */ IReactionPublic, _], opts: IAutorunOptions): IReactionDisposer = js.native
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any): Anon_ConfigurableEnumerableGet | Anon_ConfigurableEnumerableGetSet | Null = js.native
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any, applyToInstance: Boolean): Anon_ConfigurableEnumerableGet | Anon_ConfigurableEnumerableGetSet | Null = js.native
  def changeDependenciesStateTo0(derivation: IDerivation): Unit = js.native
  def checkIfStateModificationsAreAllowed(atom: IAtom): Unit = js.native
  def checkIfStateReadsAreAllowed(observable: IObservable): Unit = js.native
  def clearObserving(derivation: IDerivation): Unit = js.native
  def configure(options: Anon_Always): Unit = js.native
  def createAction(actionName: String, fn: js.Function): js.Function with IAction = js.native
  def createAction(actionName: String, fn: js.Function, ref: js.Object): js.Function with IAction = js.native
  def createAtom(name: String): IAtom = js.native
  def createAtom(name: String, onBecomeObservedHandler: js.Function0[Unit]): IAtom = js.native
  def createAtom(
    name: String,
    onBecomeObservedHandler: js.Function0[Unit],
    onBecomeUnobservedHandler: js.Function0[Unit]
  ): IAtom = js.native
  def createDecoratorForEnhancer(enhancer: IEnhancer[_]): IObservableDecorator = js.native
  def createDynamicObservableObject(base: js.Any): js.Any = js.native
  def createInstanceofPredicate[T](name: String, clazz: Instantiable1[/* args (repeated) */ js.Any, T]): js.Function1[/* x */ js.Any, /* is T */ Boolean] = js.native
  def createObservableArray[T](initialValues: js.UndefOr[scala.Nothing], enhancer: IEnhancer[T]): IObservableArray[T] = js.native
  def createObservableArray[T](initialValues: js.UndefOr[scala.Nothing], enhancer: IEnhancer[T], name: String): IObservableArray[T] = js.native
  def createObservableArray[T](initialValues: js.UndefOr[scala.Nothing], enhancer: IEnhancer[T], name: String, owned: Boolean): IObservableArray[T] = js.native
  def createObservableArray[T](initialValues: js.Array[_], enhancer: IEnhancer[T]): IObservableArray[T] = js.native
  def createObservableArray[T](initialValues: js.Array[_], enhancer: IEnhancer[T], name: String): IObservableArray[T] = js.native
  def createObservableArray[T](initialValues: js.Array[_], enhancer: IEnhancer[T], name: String, owned: Boolean): IObservableArray[T] = js.native
  def createPropDecorator(propertyInitiallyEnumerable: Boolean, propertyCreator: PropertyCreator): js.Function = js.native
  def decorate[T](
    clazz: Instantiable1[/* args (repeated) */ js.Any, T],
    decorators: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.MethodDecorator | std.PropertyDecorator | std.Array<std.MethodDecorator> | std.Array<std.PropertyDecorator>}
    */ typings.mobx.mobxStrings.decorate with js.Any
  ): Unit = js.native
  def decorate[T](
    `object`: T,
    decorators: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.MethodDecorator | std.PropertyDecorator | std.Array<std.MethodDecorator> | std.Array<std.PropertyDecorator>}
    */ typings.mobx.mobxStrings.decorate with js.Any
  ): T = js.native
  def deepEnhancer(v: js.Any, `_`: js.Any, name: js.Any): js.Any = js.native
  def deepEqual(a: js.Any, b: js.Any): Boolean = js.native
  def defineBoundAction(target: js.Any, propertyName: String, fn: js.Function): Unit = js.native
  def deprecated(msg: String): Boolean = js.native
  def deprecated(thing: String, replacement: String): Boolean = js.native
  def endBatch(): Unit = js.native
  def entries[T](ar: IObservableArray[T]): js.Array[js.Tuple2[Double, T]] = js.native
  def entries[T](obj: T): js.Array[
    js.Tuple2[
      String, 
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def entries[T](set: ObservableSet[T]): js.Array[js.Tuple2[T, T]] = js.native
  def entries[K, T](map: ObservableMap[K, T]): js.Array[js.Tuple2[K, T]] = js.native
  def executeAction(actionName: String, fn: js.Function): js.Any = js.native
  def executeAction(actionName: String, fn: js.Function, scope: js.Any): js.Any = js.native
  def executeAction(actionName: String, fn: js.Function, scope: js.Any, args: IArguments): js.Any = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with js.Any
  ): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with js.Any,
    options: CreateObservableOptions
  ): A with B = js.native
  def extendObservableObjectWithProperties(target: js.Any, properties: js.Any, decorators: js.Any, defaultDecorator: js.Any): Unit = js.native
  def fail(message: String): scala.Nothing = js.native
  def fail(message: Boolean): scala.Nothing = js.native
  def flow[R, Args /* <: js.Array[_] */](generator: js.Function1[/* args */ Args, IterableIterator[R]]): js.Function1[/* args */ Args, CancellablePromise[FlowReturnType[R]]] = js.native
  def generateComputedPropConfig(propName: js.Any): js.Any = js.native
  def generateObservablePropConfig(propName: js.Any): js.Any = js.native
  def get[T /* <: js.Object */](obj: T, key: String): js.Any = js.native
  def get[T](obj: IObservableArray[T], index: Double): js.UndefOr[T] = js.native
  def get[K, V](obj: ObservableMap[K, V], key: K): js.UndefOr[V] = js.native
  def getAdministration(thing: js.Any): js.Any = js.native
  def getAdministration(thing: js.Any, property: String): js.Any = js.native
  def getAtom(thing: js.Any): IDepTreeNode = js.native
  def getAtom(thing: js.Any, property: String): IDepTreeNode = js.native
  def getDebugName(thing: js.Any): String = js.native
  def getDebugName(thing: js.Any, property: String): String = js.native
  def getDefaultDecoratorFromObjectOptions(options: CreateObservableOptions): IObservableDecorator = js.native
  def getDependencyTree(thing: js.Any): IDependencyTree = js.native
  def getDependencyTree(thing: js.Any, property: String): IDependencyTree = js.native
  def getGlobal(): js.Any = js.native
  def getGlobalState(): js.Any = js.native
  def getMapLikeKeys[V](map: js.Any): js.Array[String] = js.native
  def getMapLikeKeys[V](map: IKeyValueMap[V]): js.Array[String] = js.native
  def getMapLikeKeys[K, V](map: ObservableMap[K, V]): js.Array[K] = js.native
  def getNextId(): Double = js.native
  def getObserverTree(thing: js.Any): IObserverTree = js.native
  def getObserverTree(thing: js.Any, property: String): IObserverTree = js.native
  def getObservers(observable: IObservable): Set[IDerivation] = js.native
  def getPlainObjectKeys(`object`: js.Any): js.Array[String | Double | js.Symbol] = js.native
  def has[T /* <: js.Object */](obj: T, key: String): Boolean = js.native
  def has[K](obj: ObservableMap[K, _], key: K): Boolean = js.native
  def has[T](obj: ObservableSet[T], key: T): Boolean = js.native
  def has[T](obj: IObservableArray[T], index: Double): Boolean = js.native
  def hasInterceptors(interceptable: IInterceptable[_]): Boolean = js.native
  def hasListeners(listenable: IListenable): Boolean = js.native
  def hasObservers(observable: IObservable): Boolean = js.native
  def initializeInstance(target: js.Any): js.Any = js.native
  def intercept(`object`: js.Object, handler: IInterceptor[IObjectWillChange]): Lambda = js.native
  def intercept[T](
    observableArray: IObservableArray[T],
    handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]
  ): Lambda = js.native
  def intercept[V](observableMap: ObservableSet[V], handler: IInterceptor[ISetWillChange[V]]): Lambda = js.native
  def intercept[T](value: IObservableValue[T], handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
  def intercept[T /* <: js.Object */, K /* <: String */](`object`: T, property: K, handler: IInterceptor[IValueWillChange[_]]): Lambda = js.native
  def intercept[K, V](observableMap: ObservableMap[K, V], handler: IInterceptor[IMapWillChange[K, V]]): Lambda = js.native
  def intercept[K, V](observableMap: ObservableMap[K, V], property: K, handler: IInterceptor[IValueWillChange[V]]): Lambda = js.native
  def interceptChange[T](interceptable: IInterceptable[T | Null]): T | Null = js.native
  def interceptChange[T](interceptable: IInterceptable[T | Null], change: T): T | Null = js.native
  def interceptReads(`object`: js.Object, property: String, handler: ReadInterceptor[_]): Lambda = js.native
  def interceptReads[T](observableArray: IObservableArray[T], handler: ReadInterceptor[T]): Lambda = js.native
  def interceptReads[V](observableSet: ObservableSet[V], handler: ReadInterceptor[V]): Lambda = js.native
  def interceptReads[T](value: IObservableValue[T], handler: ReadInterceptor[T]): Lambda = js.native
  def interceptReads[K, V](observableMap: ObservableMap[K, V], handler: ReadInterceptor[V]): Lambda = js.native
  def invariant(check: js.Any): Unit = js.native
  def invariant(check: js.Any, message: String): Unit = js.native
  def invariant(check: js.Any, message: Boolean): Unit = js.native
  @JSName("invariant")
  def invariant_false(check: `false`): scala.Nothing = js.native
  @JSName("invariant")
  def invariant_false(check: `false`, message: String): scala.Nothing = js.native
  @JSName("invariant")
  def invariant_false(check: `false`, message: Boolean): scala.Nothing = js.native
  @JSName("invariant")
  def invariant_true(check: `true`): Unit = js.native
  @JSName("invariant")
  def invariant_true(check: `true`, message: String): Unit = js.native
  @JSName("invariant")
  def invariant_true(check: `true`, message: Boolean): Unit = js.native
  def isAction(thing: js.Any): Boolean = js.native
  def isArrayLike(x: js.Any): Boolean = js.native
  def isAtom(x: js.Any): /* is mobx.mobx/lib/core/atom.Atom */ Boolean = js.native
  def isCaughtException(e: js.Any): /* is mobx.mobx/lib/core/derivation.CaughtException */ Boolean = js.native
  def isComputed(value: js.Any): Boolean = js.native
  def isComputedProp(value: js.Any, propName: String): Boolean = js.native
  def isComputedValue(x: js.Any): /* is mobx.mobx/lib/core/computedvalue.ComputedValue<{}> */ Boolean = js.native
  def isComputingDerivation(): Boolean = js.native
  def isES6Map(thing: js.Any): Boolean = js.native
  def isES6Set(thing: js.Any): /* is std.Set<any> */ Boolean = js.native
  def isObject(value: js.Any): Boolean = js.native
  def isObservable(value: js.Any): Boolean = js.native
  def isObservableArray(thing: js.Any): /* is mobx.mobx/lib/types/observablearray.IObservableArray<any> */ Boolean = js.native
  def isObservableMap(thing: js.Any): /* is mobx.mobx/lib/types/observablemap.ObservableMap<any, any> */ Boolean = js.native
  def isObservableObject(thing: js.Any): /* is mobx.mobx/lib/types/observableobject.IObservableObject */ Boolean = js.native
  def isObservableProp(value: js.Any, propName: String): Boolean = js.native
  def isObservableSet(thing: js.Any): /* is mobx.mobx/lib/types/observableset.ObservableSet<any> */ Boolean = js.native
  def isObservableValue(x: js.Any): /* is mobx.mobx/lib/types/observablevalue.IObservableValue<any> */ Boolean = js.native
  def isPlainObject(value: js.Any): Boolean = js.native
  def isPropertyConfigurable(`object`: js.Any, prop: PropertyKey): Boolean = js.native
  def isReaction(x: js.Any): /* is mobx.mobx/lib/core/reaction.Reaction */ Boolean = js.native
  def isSpyEnabled(): Boolean = js.native
  def isolateGlobalState(): Unit = js.native
  def keys[T](ar: IObservableArray[T]): js.Array[Double] = js.native
  def keys[K](map: ObservableMap[K, _]): js.Array[K] = js.native
  def keys[T /* <: js.Object */](obj: T): js.Array[PropertyKey] = js.native
  def keys[T](set: ObservableSet[T]): js.Array[T] = js.native
  def makeIterable[T](iterator: Iterator[T, _, js.UndefOr[scala.Nothing]]): IterableIterator[T] = js.native
  def makeNonEnumerable(`object`: js.Any, propNames: js.Array[PropertyKey]): Unit = js.native
  def namedActionDecorator(name: String): js.Function3[
    /* target */ js.Any, 
    /* prop */ js.Any, 
    /* descriptor */ BabelDescriptor, 
    Unit | Anon_Configurable | Anon_ConfigurableEnumerable
  ] = js.native
  def noop(): Unit = js.native
  def notifyListeners[T](listenable: IListenable, change: T): Unit = js.native
  def observe(`object`: js.Object, listener: js.Function1[/* change */ IObjectDidChange, Unit]): Lambda = js.native
  def observe(
    `object`: js.Object,
    listener: js.Function1[/* change */ IObjectDidChange, Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = js.native
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[V](observableMap: ObservableSet[V], listener: js.Function1[/* change */ ISetDidChange[V], Unit]): Lambda = js.native
  def observe[V](
    observableMap: ObservableSet[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[T](value: IComputedValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  def observe[T](
    value: IComputedValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[T](value: IObservableValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  def observe[T](
    value: IObservableValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[T, K /* <: String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ IValueDidChange[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any], 
      Unit
    ]
  ): Lambda = js.native
  def observe[T, K /* <: String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ IValueDidChange[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any], 
      Unit
    ],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[K, V](observableMap: ObservableMap[K, V], listener: js.Function1[/* change */ IMapDidChange[K, V], Unit]): Lambda = js.native
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    listener: js.Function1[/* change */ IMapDidChange[K, V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit]
  ): Lambda = js.native
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def onBecomeObserved(value: IComputedValue[_], listener: Lambda): Lambda = js.native
  def onBecomeObserved(value: IObservable, listener: Lambda): Lambda = js.native
  def onBecomeObserved(value: ObservableMap[_, _], listener: Lambda): Lambda = js.native
  def onBecomeObserved(value: ObservableSet[_], listener: Lambda): Lambda = js.native
  def onBecomeObserved(value: IObservableArray[_], listener: Lambda): Lambda = js.native
  def onBecomeObserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = js.native
  def onBecomeObserved[K, V](value: ObservableMap[K, V], property: K, listener: Lambda): Lambda = js.native
  def onBecomeUnobserved(value: IComputedValue[_], listener: Lambda): Lambda = js.native
  def onBecomeUnobserved(value: IObservable, listener: Lambda): Lambda = js.native
  def onBecomeUnobserved(value: ObservableMap[_, _], listener: Lambda): Lambda = js.native
  def onBecomeUnobserved(value: ObservableSet[_], listener: Lambda): Lambda = js.native
  def onBecomeUnobserved(value: IObservableArray[_], listener: Lambda): Lambda = js.native
  def onBecomeUnobserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = js.native
  def onBecomeUnobserved[K, V](value: ObservableMap[K, V], property: K, listener: Lambda): Lambda = js.native
  def onReactionError(handler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit]): Lambda = js.native
  def once(func: Lambda): Lambda = js.native
  def propagateChangeConfirmed(observable: IObservable): Unit = js.native
  def propagateChanged(observable: IObservable): Unit = js.native
  def propagateMaybeChanged(observable: IObservable): Unit = js.native
  def quacksLikeADecorator(args: IArguments): Boolean = js.native
  def queueForUnobservation(observable: IObservable): Unit = js.native
  def reaction[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit]
  ): IReactionDisposer = js.native
  def reaction[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit],
    opts: IReactionOptions
  ): IReactionDisposer = js.native
  def refStructEnhancer(v: js.Any, oldValue: js.Any, name: js.Any): js.Any = js.native
  def referenceEnhancer(): js.Any = js.native
  def referenceEnhancer(newValue: js.Any): js.Any = js.native
  def registerInterceptor[T](interceptable: IInterceptable[T], handler: IInterceptor[T]): Lambda = js.native
  def registerListener(listenable: IListenable, handler: js.Function): Lambda = js.native
  def remove[T /* <: js.Object */](obj: T, key: String): js.Any = js.native
  def remove[T](obj: ObservableSet[T], key: T): js.Any = js.native
  def remove[T](obj: IObservableArray[T], index: Double): js.Any = js.native
  def remove[K, V](obj: ObservableMap[K, V], key: K): js.Any = js.native
  def removeObserver(observable: IObservable, node: IDerivation): Unit = js.native
  def reportObserved(observable: IObservable): Boolean = js.native
  def resetGlobalState(): Unit = js.native
  def runInAction[T](block: js.Function0[T]): T = js.native
  def runInAction[T](name: String, block: js.Function0[T]): T = js.native
  def runReactions(): Unit = js.native
  def set[T /* <: js.Object */](obj: T, key: PropertyKey, value: js.Any): js.Any = js.native
  def set[T /* <: js.Object */](obj: T, values: StringDictionary[js.Any]): js.Any = js.native
  def set[V](obj: ObservableMap[PropertyKey, V], values: StringDictionary[V]): js.Any = js.native
  def set[T](obj: ObservableSet[T], value: T): js.Any = js.native
  def set[T](obj: IObservableArray[T], index: Double, value: T): js.Any = js.native
  def set[K, V](obj: ObservableMap[K, V], key: K, value: V): js.Any = js.native
  def setReactionScheduler(fn: js.Function1[/* f */ js.Function0[Unit], Unit]): Unit = js.native
  def shallowEnhancer(v: js.Any, `_`: js.Any, name: js.Any): js.Any = js.native
  def shouldCompute(derivation: IDerivation): Boolean = js.native
  def spy(listener: js.Function1[/* change */ js.Any, Unit]): Lambda = js.native
  def spyReport(event: js.Any): Unit = js.native
  def spyReportEnd(): Unit = js.native
  def spyReportEnd(change: js.Any): Unit = js.native
  def spyReportStart(event: js.Any): Unit = js.native
  def startBatch(): Unit = js.native
  def stringifyKey(key: js.Any): String = js.native
  def toJS(source: js.Any): js.Any = js.native
  def toJS(source: js.Any, options: ToJSOptions): js.Any = js.native
  def toJS[T](source: T): T = js.native
  def toJS[T](source: T, options: ToJSOptions): T = js.native
  def toPrimitive(value: js.Any): js.Any = js.native
  def trace(): Unit = js.native
  def trace(enterBreakPoint: Boolean): Unit = js.native
  def trace(thing: js.Any): Unit = js.native
  def trace(thing: js.Any, enterBreakPoint: Boolean): Unit = js.native
  def trace(thing: js.Any, prop: String): Unit = js.native
  def trace(thing: js.Any, prop: String, enterBreakPoint: Boolean): Unit = js.native
  def trackDerivedFunction[T](derivation: IDerivation, f: js.Function0[T], context: js.Any): js.Any = js.native
  def transaction[T](action: js.Function0[T]): T = js.native
  def unique[T](list: js.Array[T]): js.Array[T] = js.native
  def untracked[T](action: js.Function0[T]): T = js.native
  def untrackedEnd(): Unit = js.native
  def untrackedEnd(prev: IDerivation): Unit = js.native
  def untrackedStart(): IDerivation | Null = js.native
  def values[T](ar: IObservableArray[T]): js.Array[T] = js.native
  def values[T](obj: T): js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def values[T](set: ObservableSet[T]): js.Array[T] = js.native
  def values[K, T](map: ObservableMap[K, T]): js.Array[T] = js.native
  def when(predicate: js.Function0[Boolean]): js.Promise[Unit] with Anon_Cancel = js.native
  def when(predicate: js.Function0[Boolean], effect: Lambda): IReactionDisposer = js.native
  def when(predicate: js.Function0[Boolean], effect: Lambda, opts: IWhenOptions): IReactionDisposer = js.native
  def when(predicate: js.Function0[Boolean], opts: IWhenOptions): js.Promise[Unit] with Anon_Cancel = js.native
  @js.native
  object IDerivationState extends js.Object {
    /* -1 */ val NOT_TRACKING: typings.mobx.libCoreDerivationMod.IDerivationState.NOT_TRACKING with Double = js.native
    /* 1 */ val POSSIBLY_STALE: typings.mobx.libCoreDerivationMod.IDerivationState.POSSIBLY_STALE with Double = js.native
    /* 2 */ val STALE: typings.mobx.libCoreDerivationMod.IDerivationState.STALE with Double = js.native
    /* 0 */ val UP_TO_DATE: typings.mobx.libCoreDerivationMod.IDerivationState.UP_TO_DATE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.mobx.libCoreDerivationMod.IDerivationState with Double] = js.native
  }
  
  @js.native
  object TraceMode extends js.Object {
    /* 2 */ val BREAK: typings.mobx.libCoreDerivationMod.TraceMode.BREAK with Double = js.native
    /* 1 */ val LOG: typings.mobx.libCoreDerivationMod.TraceMode.LOG with Double = js.native
    /* 0 */ val NONE: typings.mobx.libCoreDerivationMod.TraceMode.NONE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.mobx.libCoreDerivationMod.TraceMode with Double] = js.native
  }
  
  @js.native
  object comparer extends js.Object {
    @JSName("default")
    var default_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @JSName("identity")
    var identity_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @JSName("structural")
    var structural_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    def default(a: js.Any, b: js.Any): Boolean = js.native
    def identity(a: js.Any, b: js.Any): Boolean = js.native
    def structural(a: js.Any, b: js.Any): Boolean = js.native
  }
  
}

