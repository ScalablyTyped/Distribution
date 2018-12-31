package typings
package mobxLib.libInternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", JSImport.Namespace)
@js.native
object libInternalModMembers extends js.Object {
  @JSName("$mobx")
  val $mobx: js.Symbol = js.native
  val EMPTY_ARRAY: js.Array[scala.Nothing] = js.native
  val OBFUSCATED_ERROR: /* An invariant failed, however the error is obfuscated because this is an production build. */ java.lang.String = js.native
  var action: mobxLib.libApiActionMod.IActionFactory = js.native
  val comparer: mobxLib.Anon_Default = js.native
  var computed: mobxLib.libApiComputedMod.IComputed = js.native
  val computedDecorator: js.Function = js.native
  val deepDecorator: mobxLib.libApiObservabledecoratorMod.IObservableDecorator = js.native
  val defaultCreateObservableOptions: mobxLib.libApiObservableMod.CreateObservableOptions = js.native
  var globalState: mobxLib.libCoreGlobalstateMod.MobXGlobals = js.native
  var isObservableMap: js.Function1[
    /* thing */ js.Any, 
    /* is mobx.mobx/lib/types/observablemap.ObservableMap<any, any> */ scala.Boolean
  ] = js.native
  var isObservableValue: js.Function1[
    /* x */ js.Any, 
    /* is mobx.mobx/lib/types/observablevalue.IObservableValue<any> */ scala.Boolean
  ] = js.native
  val mobxDidRunLazyInitializersSymbol: js.Symbol = js.native
  val mobxPendingDecorators: js.Symbol = js.native
  val observable: mobxLib.libApiObservableMod.IObservableFactory with mobxLib.libApiObservableMod.IObservableFactories with mobxLib.Anon_Enhancer = js.native
  val refDecorator: mobxLib.libApiObservabledecoratorMod.IObservableDecorator = js.native
  def _isComputed(value: js.Any): scala.Boolean = js.native
  def _isComputed(value: js.Any, property: java.lang.String): scala.Boolean = js.native
  def actionFieldDecorator(name: java.lang.String): js.Function3[/* target */ js.Any, /* prop */ js.Any, /* descriptor */ js.Any, scala.Unit] = js.native
  def addHiddenFinalProp(`object`: js.Any, propName: stdLib.PropertyKey, value: js.Any): scala.Unit = js.native
  def addHiddenProp(`object`: js.Any, propName: stdLib.PropertyKey, value: js.Any): scala.Unit = js.native
  def addObserver(
    observable: mobxLib.libCoreObservableMod.IObservable,
    node: mobxLib.libCoreDerivationMod.IDerivation
  ): scala.Unit = js.native
  def allowStateChanges[T](allowStateChanges: scala.Boolean, func: js.Function0[T]): T = js.native
  def allowStateChangesEnd(prev: scala.Boolean): scala.Unit = js.native
  def allowStateChangesInsideComputed[T](func: js.Function0[T]): T = js.native
  def allowStateChangesStart(allowStateChanges: scala.Boolean): scala.Boolean = js.native
  def asCreateObservableOptions(thing: js.Any): mobxLib.libApiObservableMod.CreateObservableOptions = js.native
  def asObservableObject(target: js.Any): mobxLib.libTypesObservableobjectMod.ObservableObjectAdministration = js.native
  def asObservableObject(target: js.Any, name: java.lang.String): mobxLib.libTypesObservableobjectMod.ObservableObjectAdministration = js.native
  def asObservableObject(target: js.Any, name: java.lang.String, defaultEnhancer: mobxLib.libTypesModifiersMod.IEnhancer[_]): mobxLib.libTypesObservableobjectMod.ObservableObjectAdministration = js.native
  def assertPropertyConfigurable(`object`: js.Any, prop: stdLib.PropertyKey): scala.Unit = js.native
  def autorun(view: js.Function1[/* r */ mobxLib.libCoreReactionMod.IReactionPublic, _]): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
  def autorun(
    view: js.Function1[/* r */ mobxLib.libCoreReactionMod.IReactionPublic, _],
    opts: mobxLib.libApiAutorunMod.IAutorunOptions
  ): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any): mobxLib.Anon_Set | mobxLib.Anon_SetV | scala.Null = js.native
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any, applyToInstance: scala.Boolean): mobxLib.Anon_Set | mobxLib.Anon_SetV | scala.Null = js.native
  def changeDependenciesStateTo0(derivation: mobxLib.libCoreDerivationMod.IDerivation): scala.Unit = js.native
  def checkIfStateModificationsAreAllowed(atom: mobxLib.libCoreAtomMod.IAtom): scala.Unit = js.native
  def clearObserving(derivation: mobxLib.libCoreDerivationMod.IDerivation): scala.Unit = js.native
  def configure(options: mobxLib.Anon_ReactionScheduler): scala.Unit = js.native
  def createAction(actionName: java.lang.String, fn: js.Function): js.Function with mobxLib.libCoreActionMod.IAction = js.native
  def createAtom(name: java.lang.String): mobxLib.libCoreAtomMod.IAtom = js.native
  def createAtom(name: java.lang.String, onBecomeObservedHandler: js.Function0[scala.Unit]): mobxLib.libCoreAtomMod.IAtom = js.native
  def createAtom(
    name: java.lang.String,
    onBecomeObservedHandler: js.Function0[scala.Unit],
    onBecomeUnobservedHandler: js.Function0[scala.Unit]
  ): mobxLib.libCoreAtomMod.IAtom = js.native
  def createDecoratorForEnhancer(enhancer: mobxLib.libTypesModifiersMod.IEnhancer[_]): mobxLib.libApiObservabledecoratorMod.IObservableDecorator = js.native
  def createDynamicObservableObject(base: js.Any): js.Any = js.native
  def createInstanceofPredicate[T](
    name: java.lang.String,
    clazz: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]
  ): js.Function1[/* x */ js.Any, /* is T */ scala.Boolean] = js.native
  def createObservableArray[T](initialValues: js.Array[_], enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T]): mobxLib.libTypesObservablearrayMod.IObservableArray[T] = js.native
  def createObservableArray[T](
    initialValues: js.Array[_],
    enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T],
    name: java.lang.String
  ): mobxLib.libTypesObservablearrayMod.IObservableArray[T] = js.native
  def createObservableArray[T](
    initialValues: js.Array[_],
    enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T],
    name: java.lang.String,
    owned: scala.Boolean
  ): mobxLib.libTypesObservablearrayMod.IObservableArray[T] = js.native
  def createObservableArray[T](initialValues: js.UndefOr[scala.Nothing], enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T]): mobxLib.libTypesObservablearrayMod.IObservableArray[T] = js.native
  def createObservableArray[T](
    initialValues: js.UndefOr[scala.Nothing],
    enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T],
    name: java.lang.String
  ): mobxLib.libTypesObservablearrayMod.IObservableArray[T] = js.native
  def createObservableArray[T](
    initialValues: js.UndefOr[scala.Nothing],
    enhancer: mobxLib.libTypesModifiersMod.IEnhancer[T],
    name: java.lang.String,
    owned: scala.Boolean
  ): mobxLib.libTypesObservablearrayMod.IObservableArray[T] = js.native
  def createPropDecorator(
    propertyInitiallyEnumerable: scala.Boolean,
    propertyCreator: mobxLib.libUtilsDecoratorsMod.PropertyCreator
  ): js.Function = js.native
  def decorate[T](
    clazz: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T],
    decorators: mobxLib.mobxLibStrings.decorate with js.Any
  ): scala.Unit = js.native
  def decorate[T](`object`: T, decorators: mobxLib.mobxLibStrings.decorate with js.Any): T = js.native
  def deepEnhancer(v: js.Any, `_`: js.Any, name: js.Any): js.Any = js.native
  def deepEqual(a: js.Any, b: js.Any): scala.Boolean = js.native
  def defineBoundAction(target: js.Any, propertyName: java.lang.String, fn: js.Function): scala.Unit = js.native
  def deprecated(msg: java.lang.String): scala.Boolean = js.native
  def deprecated(thing: java.lang.String, replacement: java.lang.String): scala.Boolean = js.native
  def endBatch(): scala.Unit = js.native
  def entries[T](ar: mobxLib.libTypesObservablearrayMod.IObservableArray[T]): js.Array[js.Tuple2[scala.Double, T]] = js.native
  def entries[T](obj: T): js.Array[js.Tuple2[java.lang.String, _]] = js.native
  def entries[K, T](map: ObservableMap[K, T]): js.Array[js.Tuple2[K, T]] = js.native
  def executeAction(actionName: java.lang.String, fn: js.Function): js.Any = js.native
  def executeAction(actionName: java.lang.String, fn: js.Function, scope: js.Any): js.Any = js.native
  def executeAction(actionName: java.lang.String, fn: js.Function, scope: js.Any, args: stdLib.IArguments): js.Any = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B, decorators: mobxLib.mobxLibStrings.extendObservable with js.Any): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: mobxLib.mobxLibStrings.extendObservable with js.Any,
    options: mobxLib.libApiObservableMod.CreateObservableOptions
  ): A with B = js.native
  def extendObservableObjectWithProperties(target: js.Any, properties: js.Any, decorators: js.Any, defaultDecorator: js.Any): scala.Unit = js.native
  def fail(message: java.lang.String): scala.Nothing = js.native
  def fail(message: scala.Boolean): scala.Nothing = js.native
  def flow[T, U /* <: js.Array[_] */](generator: js.Function1[/* args */ U, mobxLib.libApiFlowMod.FlowIterator[_]]): js.Function1[/* args */ U, mobxLib.libApiFlowMod.CancellablePromise[T]] = js.native
  def generateComputedPropConfig(propName: js.Any): js.Any = js.native
  def generateObservablePropConfig(propName: js.Any): js.Any = js.native
  def get[T /* <: js.Object */](obj: T, key: java.lang.String): js.Any = js.native
  def get[T](obj: mobxLib.libTypesObservablearrayMod.IObservableArray[T], index: scala.Double): js.UndefOr[T] = js.native
  def get[K, V](obj: ObservableMap[K, V], key: K): js.UndefOr[V] = js.native
  def getAdministration(thing: js.Any): js.Any = js.native
  def getAdministration(thing: js.Any, property: java.lang.String): js.Any = js.native
  def getAtom(thing: js.Any): mobxLib.libCoreObservableMod.IDepTreeNode = js.native
  def getAtom(thing: js.Any, property: java.lang.String): mobxLib.libCoreObservableMod.IDepTreeNode = js.native
  def getDebugName(thing: js.Any): java.lang.String = js.native
  def getDebugName(thing: js.Any, property: java.lang.String): java.lang.String = js.native
  def getDefaultDecoratorFromObjectOptions(options: mobxLib.libApiObservableMod.CreateObservableOptions): mobxLib.libApiObservabledecoratorMod.IObservableDecorator = js.native
  def getDependencyTree(thing: js.Any): mobxLib.libApiExtrasMod.IDependencyTree = js.native
  def getDependencyTree(thing: js.Any, property: java.lang.String): mobxLib.libApiExtrasMod.IDependencyTree = js.native
  def getGlobal(): js.Any = js.native
  def getGlobalState(): js.Any = js.native
  def getMapLikeKeys[V](map: js.Any): js.Array[java.lang.String] = js.native
  def getMapLikeKeys[V](map: mobxLib.libTypesObservablemapMod.IKeyValueMap[V]): js.Array[java.lang.String] = js.native
  def getMapLikeKeys[K, V](map: ObservableMap[K, V]): js.Array[K] = js.native
  def getNextId(): scala.Double = js.native
  def getObserverTree(thing: js.Any): mobxLib.libApiExtrasMod.IObserverTree = js.native
  def getObserverTree(thing: js.Any, property: java.lang.String): mobxLib.libApiExtrasMod.IObserverTree = js.native
  def getObservers(observable: mobxLib.libCoreObservableMod.IObservable): stdLib.Set[mobxLib.libCoreDerivationMod.IDerivation] = js.native
  def has[T /* <: js.Object */](obj: T, key: java.lang.String): scala.Boolean = js.native
  def has[K](obj: ObservableMap[K, _], key: K): scala.Boolean = js.native
  def has[T](obj: mobxLib.libTypesObservablearrayMod.IObservableArray[T], index: scala.Double): scala.Boolean = js.native
  def hasInterceptors(interceptable: mobxLib.libTypesInterceptDashUtilsMod.IInterceptable[_]): scala.Boolean = js.native
  def hasListeners(listenable: mobxLib.libTypesListenDashUtilsMod.IListenable): scala.Boolean = js.native
  def hasObservers(observable: mobxLib.libCoreObservableMod.IObservable): scala.Boolean = js.native
  def initializeInstance(target: js.Any): js.Any = js.native
  def intercept(
    `object`: js.Object,
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[mobxLib.libTypesObservableobjectMod.IObjectWillChange]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def intercept[T](
    observableArray: mobxLib.libTypesObservablearrayMod.IObservableArray[T],
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[
      mobxLib.libTypesObservablearrayMod.IArrayWillChange[T] | mobxLib.libTypesObservablearrayMod.IArrayWillSplice[T]
    ]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def intercept[T](
    value: mobxLib.libTypesObservablevalueMod.IObservableValue[T],
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[mobxLib.libTypesObservablevalueMod.IValueWillChange[T]]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def intercept[T /* <: js.Object */, K /* <: java.lang.String */](
    `object`: T,
    property: K,
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[mobxLib.libTypesObservablevalueMod.IValueWillChange[_]]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def intercept[K, V](
    observableMap: ObservableMap[K, V],
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[mobxLib.libTypesObservablemapMod.IMapWillChange[K, V]]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def intercept[K, V](
    observableMap: ObservableMap[K, V],
    property: K,
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[mobxLib.libTypesObservablevalueMod.IValueWillChange[V]]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def interceptChange[T](interceptable: mobxLib.libTypesInterceptDashUtilsMod.IInterceptable[T | scala.Null]): T | scala.Null = js.native
  def interceptChange[T](interceptable: mobxLib.libTypesInterceptDashUtilsMod.IInterceptable[T | scala.Null], change: T): T | scala.Null = js.native
  def interceptReads(
    `object`: js.Object,
    property: java.lang.String,
    handler: mobxLib.libApiInterceptDashReadMod.ReadInterceptor[_]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def interceptReads[T](
    observableArray: mobxLib.libTypesObservablearrayMod.IObservableArray[T],
    handler: mobxLib.libApiInterceptDashReadMod.ReadInterceptor[T]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def interceptReads[T](
    value: mobxLib.libTypesObservablevalueMod.IObservableValue[T],
    handler: mobxLib.libApiInterceptDashReadMod.ReadInterceptor[T]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def interceptReads[K, V](observableMap: ObservableMap[K, V], handler: mobxLib.libApiInterceptDashReadMod.ReadInterceptor[V]): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def invariant(check: js.Any): scala.Unit = js.native
  def invariant(check: js.Any, message: java.lang.String): scala.Unit = js.native
  def invariant(check: js.Any, message: scala.Boolean): scala.Unit = js.native
  def invariant(check: mobxLib.mobxLibNumbers.`false`): scala.Nothing = js.native
  def invariant(check: mobxLib.mobxLibNumbers.`false`, message: java.lang.String): scala.Nothing = js.native
  def invariant(check: mobxLib.mobxLibNumbers.`false`, message: scala.Boolean): scala.Nothing = js.native
  def invariant(check: mobxLib.mobxLibNumbers.`true`): scala.Unit = js.native
  def invariant(check: mobxLib.mobxLibNumbers.`true`, message: java.lang.String): scala.Unit = js.native
  def invariant(check: mobxLib.mobxLibNumbers.`true`, message: scala.Boolean): scala.Unit = js.native
  def isAction(thing: js.Any): scala.Boolean = js.native
  def isArrayLike(x: js.Any): scala.Boolean = js.native
  def isAtom(x: js.Any): /* is mobx.mobx/lib/core/atom.Atom */ scala.Boolean = js.native
  def isCaughtException(e: js.Any): /* is mobx.mobx/lib/core/derivation.CaughtException */ scala.Boolean = js.native
  def isComputed(value: js.Any): scala.Boolean = js.native
  def isComputedProp(value: js.Any, propName: java.lang.String): scala.Boolean = js.native
  def isComputedValue(x: js.Any): /* is mobx.mobx/lib/core/computedvalue.ComputedValue<{}> */ scala.Boolean = js.native
  def isComputingDerivation(): scala.Boolean = js.native
  def isES6Map(thing: js.Any): scala.Boolean = js.native
  def isObject(value: js.Any): scala.Boolean = js.native
  def isObservable(value: js.Any): scala.Boolean = js.native
  def isObservableArray(thing: js.Any): /* is mobx.mobx/lib/types/observablearray.IObservableArray<any> */ scala.Boolean = js.native
  def isObservableObject(thing: js.Any): /* is mobx.mobx/lib/types/observableobject.IObservableObject */ scala.Boolean = js.native
  def isObservableProp(value: js.Any, propName: java.lang.String): scala.Boolean = js.native
  def isPlainObject(value: js.Any): scala.Boolean = js.native
  def isPropertyConfigurable(`object`: js.Any, prop: stdLib.PropertyKey): scala.Boolean = js.native
  def isReaction(x: js.Any): /* is mobx.mobx/lib/core/reaction.Reaction */ scala.Boolean = js.native
  def isSpyEnabled(): scala.Boolean = js.native
  def isolateGlobalState(): scala.Unit = js.native
  def keys[T](ar: mobxLib.libTypesObservablearrayMod.IObservableArray[T]): js.Array[scala.Double] = js.native
  def keys[K](map: ObservableMap[K, _]): js.Array[K] = js.native
  def keys[T /* <: js.Object */](obj: T): js.Array[java.lang.String] = js.native
  def makeIterable[T](iterator: stdLib.Iterator[T]): stdLib.IterableIterator[T] = js.native
  def makeNonEnumerable(`object`: js.Any, propNames: js.Array[stdLib.PropertyKey]): scala.Unit = js.native
  def namedActionDecorator(name: java.lang.String): js.Function3[
    /* target */ js.Any, 
    /* prop */ js.Any, 
    /* descriptor */ mobxLib.libUtilsDecoratorsMod.BabelDescriptor, 
    scala.Unit | mobxLib.Anon_Enumerable | mobxLib.Anon_InitializerConfigurable
  ] = js.native
  def noop(): scala.Unit = js.native
  def notifyListeners[T](listenable: mobxLib.libTypesListenDashUtilsMod.IListenable, change: T): scala.Unit = js.native
  def observe(
    `object`: js.Object,
    listener: js.Function1[/* change */ mobxLib.libTypesObservableobjectMod.IObjectDidChange, scala.Unit]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe(
    `object`: js.Object,
    listener: js.Function1[/* change */ mobxLib.libTypesObservableobjectMod.IObjectDidChange, scala.Unit],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[T](
    observableArray: mobxLib.libTypesObservablearrayMod.IObservableArray[T],
    listener: js.Function1[
      /* change */ mobxLib.libTypesObservablearrayMod.IArrayChange[T] | mobxLib.libTypesObservablearrayMod.IArraySplice[T], 
      scala.Unit
    ]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[T](
    observableArray: mobxLib.libTypesObservablearrayMod.IObservableArray[T],
    listener: js.Function1[
      /* change */ mobxLib.libTypesObservablearrayMod.IArrayChange[T] | mobxLib.libTypesObservablearrayMod.IArraySplice[T], 
      scala.Unit
    ],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[T](
    value: mobxLib.libCoreComputedvalueMod.IComputedValue[T],
    listener: js.Function1[/* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[T], scala.Unit]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[T](
    value: mobxLib.libCoreComputedvalueMod.IComputedValue[T],
    listener: js.Function1[/* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[T], scala.Unit],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[T](
    value: mobxLib.libTypesObservablevalueMod.IObservableValue[T],
    listener: js.Function1[/* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[T], scala.Unit]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[T](
    value: mobxLib.libTypesObservablevalueMod.IObservableValue[T],
    listener: js.Function1[/* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[T], scala.Unit],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[T, K /* <: java.lang.String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any], 
      scala.Unit
    ]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[T, K /* <: java.lang.String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any], 
      scala.Unit
    ],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    listener: js.Function1[/* change */ mobxLib.libTypesObservablemapMod.IMapDidChange[K, V], scala.Unit]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    listener: js.Function1[/* change */ mobxLib.libTypesObservablemapMod.IMapDidChange[K, V], scala.Unit],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[V], scala.Unit]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ mobxLib.libTypesObservablevalueMod.IValueDidChange[V], scala.Unit],
    fireImmediately: scala.Boolean
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeObserved(
    value: mobxLib.libCoreComputedvalueMod.IComputedValue[_],
    listener: mobxLib.libUtilsUtilsMod.Lambda
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeObserved(value: mobxLib.libCoreObservableMod.IObservable, listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeObserved(value: ObservableMap[_, _], listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeObserved(
    value: mobxLib.libTypesObservablearrayMod.IObservableArray[_],
    listener: mobxLib.libUtilsUtilsMod.Lambda
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeObserved[K, V](value: js.Object, property: K, listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeObserved[K, V](value: ObservableMap[K, V], property: K, listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved(
    value: mobxLib.libCoreComputedvalueMod.IComputedValue[_],
    listener: mobxLib.libUtilsUtilsMod.Lambda
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved(value: mobxLib.libCoreObservableMod.IObservable, listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved(value: ObservableMap[_, _], listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved(
    value: mobxLib.libTypesObservablearrayMod.IObservableArray[_],
    listener: mobxLib.libUtilsUtilsMod.Lambda
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved[K, V](value: js.Object, property: K, listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onBecomeUnobserved[K, V](value: ObservableMap[K, V], property: K, listener: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def onReactionError(
    handler: js.Function2[
      /* error */ js.Any, 
      /* derivation */ mobxLib.libCoreDerivationMod.IDerivation, 
      scala.Unit
    ]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def once(func: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def propagateChangeConfirmed(observable: mobxLib.libCoreObservableMod.IObservable): scala.Unit = js.native
  def propagateChanged(observable: mobxLib.libCoreObservableMod.IObservable): scala.Unit = js.native
  def propagateMaybeChanged(observable: mobxLib.libCoreObservableMod.IObservable): scala.Unit = js.native
  def quacksLikeADecorator(args: stdLib.IArguments): scala.Boolean = js.native
  def queueForUnobservation(observable: mobxLib.libCoreObservableMod.IObservable): scala.Unit = js.native
  def reaction[T](
    expression: js.Function1[/* r */ mobxLib.libCoreReactionMod.IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ mobxLib.libCoreReactionMod.IReactionPublic, scala.Unit]
  ): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
  def reaction[T](
    expression: js.Function1[/* r */ mobxLib.libCoreReactionMod.IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ mobxLib.libCoreReactionMod.IReactionPublic, scala.Unit],
    opts: mobxLib.libApiAutorunMod.IReactionOptions
  ): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
  def refStructEnhancer(v: js.Any, oldValue: js.Any, name: js.Any): js.Any = js.native
  def referenceEnhancer(): js.Any = js.native
  def referenceEnhancer(newValue: js.Any): js.Any = js.native
  def registerInterceptor[T](
    interceptable: mobxLib.libTypesInterceptDashUtilsMod.IInterceptable[T],
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[T]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def registerListener(listenable: mobxLib.libTypesListenDashUtilsMod.IListenable, handler: js.Function): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def remove[T /* <: js.Object */](obj: T, key: java.lang.String): js.Any = js.native
  def remove[T](obj: mobxLib.libTypesObservablearrayMod.IObservableArray[T], index: scala.Double): js.Any = js.native
  def remove[K, V](obj: ObservableMap[K, V], key: K): js.Any = js.native
  def removeObserver(
    observable: mobxLib.libCoreObservableMod.IObservable,
    node: mobxLib.libCoreDerivationMod.IDerivation
  ): scala.Unit = js.native
  def reportObserved(observable: mobxLib.libCoreObservableMod.IObservable): scala.Boolean = js.native
  def resetGlobalState(): scala.Unit = js.native
  def runInAction[T](block: js.Function0[T]): T = js.native
  def runInAction[T](name: java.lang.String, block: js.Function0[T]): T = js.native
  def runReactions(): scala.Unit = js.native
  def set[T /* <: js.Object */](obj: T, key: java.lang.String, value: js.Any): js.Any = js.native
  def set[T /* <: js.Object */](obj: T, values: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Any = js.native
  def set[V](obj: ObservableMap[java.lang.String, V], values: org.scalablytyped.runtime.StringDictionary[V]): js.Any = js.native
  def set[T](obj: mobxLib.libTypesObservablearrayMod.IObservableArray[T], index: scala.Double, value: T): js.Any = js.native
  def set[K, V](obj: ObservableMap[K, V], key: K, value: V): js.Any = js.native
  def setReactionScheduler(fn: js.Function1[/* f */ js.Function0[scala.Unit], scala.Unit]): scala.Unit = js.native
  def shallowEnhancer(v: js.Any, `_`: js.Any, name: js.Any): js.Any = js.native
  def shouldCompute(derivation: mobxLib.libCoreDerivationMod.IDerivation): scala.Boolean = js.native
  def spy(listener: js.Function1[/* change */ js.Any, scala.Unit]): mobxLib.libUtilsUtilsMod.Lambda = js.native
  def spyReport(event: js.Any): scala.Unit = js.native
  def spyReportEnd(): scala.Unit = js.native
  def spyReportEnd(change: js.Any): scala.Unit = js.native
  def spyReportStart(event: js.Any): scala.Unit = js.native
  def startBatch(): scala.Unit = js.native
  def toJS(source: js.Any): js.Any = js.native
  def toJS(source: js.Any, options: mobxLib.libApiTojsMod.ToJSOptions): js.Any = js.native
  def toJS[T](source: T): T = js.native
  def toJS[T](source: T, options: mobxLib.libApiTojsMod.ToJSOptions): T = js.native
  def toPrimitive(value: js.Any): js.Any = js.native
  def trace(): scala.Unit = js.native
  def trace(enterBreakPoint: scala.Boolean): scala.Unit = js.native
  def trace(thing: js.Any): scala.Unit = js.native
  def trace(thing: js.Any, enterBreakPoint: scala.Boolean): scala.Unit = js.native
  def trace(thing: js.Any, prop: java.lang.String): scala.Unit = js.native
  def trace(thing: js.Any, prop: java.lang.String, enterBreakPoint: scala.Boolean): scala.Unit = js.native
  def trackDerivedFunction[T](derivation: mobxLib.libCoreDerivationMod.IDerivation, f: js.Function0[T], context: js.Any): js.Any = js.native
  def transaction[T](action: js.Function0[T]): T = js.native
  def unique[T](list: js.Array[T]): js.Array[T] = js.native
  def untracked[T](action: js.Function0[T]): T = js.native
  def untrackedEnd(): scala.Unit = js.native
  def untrackedEnd(prev: mobxLib.libCoreDerivationMod.IDerivation): scala.Unit = js.native
  def untrackedStart(): mobxLib.libCoreDerivationMod.IDerivation | scala.Null = js.native
  def values[T](ar: mobxLib.libTypesObservablearrayMod.IObservableArray[T]): js.Array[T] = js.native
  def values[T](obj: T): js.Array[_] = js.native
  def values[K, T](map: ObservableMap[K, T]): js.Array[T] = js.native
  def when(predicate: js.Function0[scala.Boolean]): js.Promise[scala.Unit] with mobxLib.Anon_Cancel = js.native
  def when(predicate: js.Function0[scala.Boolean], effect: mobxLib.libUtilsUtilsMod.Lambda): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
  def when(
    predicate: js.Function0[scala.Boolean],
    effect: mobxLib.libUtilsUtilsMod.Lambda,
    opts: mobxLib.libApiWhenMod.IWhenOptions
  ): mobxLib.libCoreReactionMod.IReactionDisposer = js.native
  def when(predicate: js.Function0[scala.Boolean], opts: mobxLib.libApiWhenMod.IWhenOptions): js.Promise[scala.Unit] with mobxLib.Anon_Cancel = js.native
}

