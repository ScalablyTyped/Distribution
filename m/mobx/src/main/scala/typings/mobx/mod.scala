package typings.mobx

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.mobx.actionMod.IActionFactory
import typings.mobx.anon.ComputedConfigurable
import typings.mobx.anon.Promisevoidcancelvoid
import typings.mobx.atomMod.IAtom
import typings.mobx.autorunMod.IAutorunOptions
import typings.mobx.autorunMod.IReactionOptions
import typings.mobx.computedMod.IComputed
import typings.mobx.computedvalueMod.IComputedValue
import typings.mobx.coreActionMod.IActionRunInfo
import typings.mobx.coreObservableMod.IDepTreeNode
import typings.mobx.coreObservableMod.IObservable
import typings.mobx.derivationMod.IDerivation
import typings.mobx.extrasMod.IDependencyTree
import typings.mobx.extrasMod.IObserverTree
import typings.mobx.flowMod.CancellablePromise
import typings.mobx.interceptReadMod.ReadInterceptor
import typings.mobx.interceptUtilsMod.IInterceptor
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
import typings.mobx.tojsMod.ToJSOptions
import typings.mobx.utilsMod.Lambda
import typings.mobx.whenMod.IWhenOptions
import typings.std.AsyncGenerator
import typings.std.Error
import typings.std.Generator
import typings.std.IArguments
import typings.std.Map
import typings.std.PropertyDescriptor
import typings.std.PropertyKey
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object FlowCancellationError {
    
    @JSImport("mobx", "FlowCancellationError")
    @js.native
    def apply(): Unit = js.native
    @JSImport("mobx", "FlowCancellationError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx", "FlowCancellationError.prototype")
    @js.native
    def prototype: js.Any = js.native
    @scala.inline
    def prototype_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prototype")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mobx", "IDerivationState")
  @js.native
  object IDerivationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.mobx.derivationMod.IDerivationState with Double] = js.native
    
    /* -1 */ val NOT_TRACKING: typings.mobx.derivationMod.IDerivationState.NOT_TRACKING with Double = js.native
    
    /* 1 */ val POSSIBLY_STALE: typings.mobx.derivationMod.IDerivationState.POSSIBLY_STALE with Double = js.native
    
    /* 2 */ val STALE: typings.mobx.derivationMod.IDerivationState.STALE with Double = js.native
    
    /* 0 */ val UP_TO_DATE: typings.mobx.derivationMod.IDerivationState.UP_TO_DATE with Double = js.native
  }
  
  @JSImport("mobx", "ObservableMap")
  @js.native
  class ObservableMap[K, V] ()
    extends typings.mobx.internalMod.ObservableMap[K, V] {
    def this(initialData: IObservableMapInitialValues[K, V]) = this()
    def this(initialData: js.UndefOr[IObservableMapInitialValues[K, V]], enhancer: IEnhancer[V]) = this()
    def this(
      initialData: js.UndefOr[IObservableMapInitialValues[K, V]],
      enhancer: js.UndefOr[scala.Nothing],
      name: String
    ) = this()
    def this(initialData: js.UndefOr[IObservableMapInitialValues[K, V]], enhancer: IEnhancer[V], name: String) = this()
  }
  
  @JSImport("mobx", "ObservableSet")
  @js.native
  class ObservableSet[T] ()
    extends typings.mobx.internalMod.ObservableSet[T] {
    def this(initialData: IObservableSetInitialValues[T]) = this()
    def this(initialData: js.UndefOr[IObservableSetInitialValues[T]], enhancer: IEnhancer[T]) = this()
    def this(
      initialData: js.UndefOr[IObservableSetInitialValues[T]],
      enhancer: js.UndefOr[scala.Nothing],
      name: String
    ) = this()
    def this(initialData: js.UndefOr[IObservableSetInitialValues[T]], enhancer: IEnhancer[T], name: String) = this()
  }
  
  @JSImport("mobx", "Reaction")
  @js.native
  class Reaction_ protected ()
    extends typings.mobx.internalMod.Reaction_ {
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
  
  @JSImport("mobx", "action")
  @js.native
  val action: IActionFactory = js.native
  
  @JSImport("mobx", "_allowStateChanges")
  @js.native
  def allowStateChanges[T](allowStateChanges: Boolean, func: js.Function0[T]): T = js.native
  
  @JSImport("mobx", "_allowStateChangesInsideComputed")
  @js.native
  def allowStateChangesInsideComputed[T](func: js.Function0[T]): T = js.native
  
  @JSImport("mobx", "_allowStateReadsEnd")
  @js.native
  def allowStateReadsEnd(prev: Boolean): Unit = js.native
  
  @JSImport("mobx", "_allowStateReadsStart")
  @js.native
  def allowStateReadsStart(allowStateReads: Boolean): Boolean = js.native
  
  @JSImport("mobx", "autorun")
  @js.native
  def autorun(view: js.Function1[/* r */ IReactionPublic, _]): IReactionDisposer = js.native
  @JSImport("mobx", "autorun")
  @js.native
  def autorun(view: js.Function1[/* r */ IReactionPublic, _], opts: IAutorunOptions): IReactionDisposer = js.native
  
  object comparer {
    
    @JSImport("mobx", "comparer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx", "comparer.default")
    @js.native
    def default: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @JSImport("mobx", "comparer.default")
    @js.native
    def default(a: js.Any, b: js.Any): Boolean = js.native
    @scala.inline
    def default_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx", "comparer.identity")
    @js.native
    def identity: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @JSImport("mobx", "comparer.identity")
    @js.native
    def identity(a: js.Any, b: js.Any): Boolean = js.native
    @scala.inline
    def identity_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx", "comparer.shallow")
    @js.native
    def shallow: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @JSImport("mobx", "comparer.shallow")
    @js.native
    def shallow(a: js.Any, b: js.Any): Boolean = js.native
    @scala.inline
    def shallow_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shallow")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx", "comparer.structural")
    @js.native
    def structural: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @JSImport("mobx", "comparer.structural")
    @js.native
    def structural(a: js.Any, b: js.Any): Boolean = js.native
    @scala.inline
    def structural_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structural")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mobx", "computed")
  @js.native
  val computed: IComputed = js.native
  
  @JSImport("mobx", "configure")
  @js.native
  def configure(options: ComputedConfigurable): Unit = js.native
  
  @JSImport("mobx", "createAtom")
  @js.native
  def createAtom(name: String): IAtom = js.native
  @JSImport("mobx", "createAtom")
  @js.native
  def createAtom(
    name: String,
    onBecomeObservedHandler: js.UndefOr[scala.Nothing],
    onBecomeUnobservedHandler: js.Function0[Unit]
  ): IAtom = js.native
  @JSImport("mobx", "createAtom")
  @js.native
  def createAtom(name: String, onBecomeObservedHandler: js.Function0[Unit]): IAtom = js.native
  @JSImport("mobx", "createAtom")
  @js.native
  def createAtom(
    name: String,
    onBecomeObservedHandler: js.Function0[Unit],
    onBecomeUnobservedHandler: js.Function0[Unit]
  ): IAtom = js.native
  
  @JSImport("mobx", "decorate")
  @js.native
  def decorate[T](
    clazz: Instantiable1[/* args (repeated) */ js.Any, T],
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.MethodDecorator | std.PropertyDecorator | std.Array<std.MethodDecorator> | std.Array<std.PropertyDecorator>}
    */ typings.mobx.mobxStrings.decorate with TopLevel[js.Any]
  ): Unit = js.native
  @JSImport("mobx", "decorate")
  @js.native
  def decorate[T](
    `object`: T,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.MethodDecorator | std.PropertyDecorator | std.Array<std.MethodDecorator> | std.Array<std.PropertyDecorator>}
    */ typings.mobx.mobxStrings.decorate with TopLevel[js.Any]
  ): T = js.native
  
  @JSImport("mobx", "_endAction")
  @js.native
  def endAction(runInfo: IActionRunInfo): Unit = js.native
  
  @JSImport("mobx", "entries")
  @js.native
  def entries[T](ar: IObservableArray[T]): js.Array[js.Tuple2[Double, T]] = js.native
  @JSImport("mobx", "entries")
  @js.native
  def entries[T](obj: T): js.Array[
    js.Tuple2[
      String, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSImport("mobx", "entries")
  @js.native
  def entries[T](set: typings.mobx.internalMod.ObservableSet[T]): js.Array[js.Tuple2[T, T]] = js.native
  @JSImport("mobx", "entries")
  @js.native
  def entries[K, T](map: typings.mobx.internalMod.ObservableMap[K, T]): js.Array[js.Tuple2[K, T]] = js.native
  
  @JSImport("mobx", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A): A with B = js.native
  @JSImport("mobx", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B): A with B = js.native
  @JSImport("mobx", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with TopLevel[js.Any]
  ): A with B = js.native
  @JSImport("mobx", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with TopLevel[js.Any],
    options: CreateObservableOptions
  ): A with B = js.native
  @JSImport("mobx", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B, decorators: js.UndefOr[scala.Nothing], options: CreateObservableOptions): A with B = js.native
  @JSImport("mobx", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: js.UndefOr[scala.Nothing],
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with TopLevel[js.Any]
  ): A with B = js.native
  @JSImport("mobx", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: js.UndefOr[scala.Nothing],
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with TopLevel[js.Any],
    options: CreateObservableOptions
  ): A with B = js.native
  @JSImport("mobx", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: js.UndefOr[scala.Nothing],
    decorators: js.UndefOr[scala.Nothing],
    options: CreateObservableOptions
  ): A with B = js.native
  
  @JSImport("mobx", "flow")
  @js.native
  def flow[R, Args /* <: js.Array[_] */](generator: js.Function1[/* args */ Args, (Generator[_, R, _]) | (AsyncGenerator[_, R, _])]): js.Function1[/* args */ Args, CancellablePromise[R]] = js.native
  
  @JSImport("mobx", "get")
  @js.native
  def get[T /* <: js.Object */](obj: T, key: String): js.Any = js.native
  @JSImport("mobx", "get")
  @js.native
  def get[T](obj: IObservableArray[T], index: Double): js.UndefOr[T] = js.native
  @JSImport("mobx", "get")
  @js.native
  def get[K, V](obj: typings.mobx.internalMod.ObservableMap[K, V], key: K): js.UndefOr[V] = js.native
  
  @JSImport("mobx", "_getAdministration")
  @js.native
  def getAdministration(thing: js.Any): js.Any = js.native
  @JSImport("mobx", "_getAdministration")
  @js.native
  def getAdministration(thing: js.Any, property: String): js.Any = js.native
  
  @JSImport("mobx", "getAtom")
  @js.native
  def getAtom(thing: js.Any): IDepTreeNode = js.native
  @JSImport("mobx", "getAtom")
  @js.native
  def getAtom(thing: js.Any, property: String): IDepTreeNode = js.native
  
  @JSImport("mobx", "getDebugName")
  @js.native
  def getDebugName(thing: js.Any): String = js.native
  @JSImport("mobx", "getDebugName")
  @js.native
  def getDebugName(thing: js.Any, property: String): String = js.native
  
  @JSImport("mobx", "getDependencyTree")
  @js.native
  def getDependencyTree(thing: js.Any): IDependencyTree = js.native
  @JSImport("mobx", "getDependencyTree")
  @js.native
  def getDependencyTree(thing: js.Any, property: String): IDependencyTree = js.native
  
  @JSImport("mobx", "_getGlobalState")
  @js.native
  def getGlobalState(): js.Any = js.native
  
  @JSImport("mobx", "getObserverTree")
  @js.native
  def getObserverTree(thing: js.Any): IObserverTree = js.native
  @JSImport("mobx", "getObserverTree")
  @js.native
  def getObserverTree(thing: js.Any, property: String): IObserverTree = js.native
  
  @JSImport("mobx", "has")
  @js.native
  def has[T /* <: js.Object */](obj: T, key: String): Boolean = js.native
  @JSImport("mobx", "has")
  @js.native
  def has[K](obj: typings.mobx.internalMod.ObservableMap[K, _], key: K): Boolean = js.native
  @JSImport("mobx", "has")
  @js.native
  def has[T](obj: typings.mobx.internalMod.ObservableSet[T], key: T): Boolean = js.native
  @JSImport("mobx", "has")
  @js.native
  def has[T](obj: IObservableArray[T], index: Double): Boolean = js.native
  
  @JSImport("mobx", "intercept")
  @js.native
  def intercept(`object`: js.Object, handler: IInterceptor[IObjectWillChange[_]]): Lambda = js.native
  @JSImport("mobx", "intercept")
  @js.native
  def intercept[T](
    observableArray: IObservableArray[T],
    handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]
  ): Lambda = js.native
  @JSImport("mobx", "intercept")
  @js.native
  def intercept[V](observableMap: typings.mobx.internalMod.ObservableSet[V], handler: IInterceptor[ISetWillChange[V]]): Lambda = js.native
  @JSImport("mobx", "intercept")
  @js.native
  def intercept[T](value: IObservableValue[T], handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
  @JSImport("mobx", "intercept")
  @js.native
  def intercept[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: T, property: K, handler: IInterceptor[IValueWillChange[_]]): Lambda = js.native
  @JSImport("mobx", "intercept")
  @js.native
  def intercept[K, V](
    observableMap: typings.mobx.internalMod.ObservableMap[K, V],
    handler: IInterceptor[IMapWillChange[K, V]]
  ): Lambda = js.native
  @JSImport("mobx", "intercept")
  @js.native
  def intercept[K, V](
    observableMap: typings.mobx.internalMod.ObservableMap[K, V],
    property: K,
    handler: IInterceptor[IValueWillChange[V]]
  ): Lambda = js.native
  
  @JSImport("mobx", "_interceptReads")
  @js.native
  def interceptReads(`object`: js.Object, property: String, handler: ReadInterceptor[_]): Lambda = js.native
  @JSImport("mobx", "_interceptReads")
  @js.native
  def interceptReads[T](observableArray: IObservableArray[T], handler: ReadInterceptor[T]): Lambda = js.native
  @JSImport("mobx", "_interceptReads")
  @js.native
  def interceptReads[V](observableSet: typings.mobx.internalMod.ObservableSet[V], handler: ReadInterceptor[V]): Lambda = js.native
  @JSImport("mobx", "_interceptReads")
  @js.native
  def interceptReads[T](value: IObservableValue[T], handler: ReadInterceptor[T]): Lambda = js.native
  @JSImport("mobx", "_interceptReads")
  @js.native
  def interceptReads[K, V](observableMap: typings.mobx.internalMod.ObservableMap[K, V], handler: ReadInterceptor[V]): Lambda = js.native
  
  @JSImport("mobx", "isAction")
  @js.native
  def isAction(thing: js.Any): Boolean = js.native
  
  @JSImport("mobx", "isArrayLike")
  @js.native
  def isArrayLike(x: js.Any): Boolean = js.native
  
  @JSImport("mobx", "isBoxedObservable")
  @js.native
  def isBoxedObservable(x: js.Any): /* is mobx.mobx/lib/types/observablevalue.IObservableValue<any> */ Boolean = js.native
  
  @JSImport("mobx", "isComputed")
  @js.native
  def isComputed(value: js.Any): Boolean = js.native
  
  @JSImport("mobx", "isComputedProp")
  @js.native
  def isComputedProp(value: js.Any, propName: String): Boolean = js.native
  
  @JSImport("mobx", "_isComputingDerivation")
  @js.native
  def isComputingDerivation(): Boolean = js.native
  
  @JSImport("mobx", "isFlowCancellationError")
  @js.native
  def isFlowCancellationError(error: Error): Boolean = js.native
  
  @JSImport("mobx", "isObservable")
  @js.native
  def isObservable(value: js.Any): Boolean = js.native
  
  @JSImport("mobx", "isObservableArray")
  @js.native
  def isObservableArray(thing: js.Any): /* is mobx.mobx/lib/types/observablearray.IObservableArray<any> */ Boolean = js.native
  
  @JSImport("mobx", "isObservableMap")
  @js.native
  def isObservableMap(thing: js.Any): /* is mobx.mobx/lib/types/observablemap.ObservableMap<any, any> */ Boolean = js.native
  
  @JSImport("mobx", "isObservableObject")
  @js.native
  def isObservableObject(thing: js.Any): /* is mobx.mobx/lib/types/observableobject.IObservableObject */ Boolean = js.native
  
  @JSImport("mobx", "isObservableProp")
  @js.native
  def isObservableProp(value: js.Any, propName: String): Boolean = js.native
  
  @JSImport("mobx", "isObservableSet")
  @js.native
  def isObservableSet(thing: js.Any): /* is mobx.mobx/lib/types/observableset.ObservableSet<any> */ Boolean = js.native
  
  @JSImport("mobx", "keys")
  @js.native
  def keys[T](ar: IObservableArray[T]): js.Array[Double] = js.native
  @JSImport("mobx", "keys")
  @js.native
  def keys[K](map: typings.mobx.internalMod.ObservableMap[K, _]): js.Array[K] = js.native
  @JSImport("mobx", "keys")
  @js.native
  def keys[T /* <: js.Object */](obj: T): js.Array[PropertyKey] = js.native
  @JSImport("mobx", "keys")
  @js.native
  def keys[T](set: typings.mobx.internalMod.ObservableSet[T]): js.Array[T] = js.native
  
  @JSImport("mobx", "$mobx")
  @js.native
  val mobx: js.Symbol = js.native
  
  /* Inlined mobx.mobx/lib/api/observable.IObservableFactory & mobx.mobx/lib/api/observable.IObservableFactories & {  enhancer :mobx.mobx/lib/internal.IEnhancer<any>} */
  object observable {
    
    @JSImport("mobx", "observable")
    @js.native
    def apply(): scala.Nothing = js.native
    @JSImport("mobx", "observable")
    @js.native
    def apply(target: js.Object, key: String): js.Any = js.native
    @JSImport("mobx", "observable")
    @js.native
    def apply(target: js.Object, key: String, baseDescriptor: PropertyDescriptor): js.Any = js.native
    @JSImport("mobx", "observable")
    @js.native
    def apply(target: js.Object, key: js.Symbol): js.Any = js.native
    @JSImport("mobx", "observable")
    @js.native
    def apply(target: js.Object, key: js.Symbol, baseDescriptor: PropertyDescriptor): js.Any = js.native
    @JSImport("mobx", "observable")
    @js.native
    def apply(value: String): scala.Nothing = js.native
    @JSImport("mobx", "observable")
    @js.native
    def apply(value: Boolean): scala.Nothing = js.native
    @JSImport("mobx", "observable")
    @js.native
    def apply(value: Double): scala.Nothing = js.native
    @JSImport("mobx", "observable")
    @js.native
    def apply[T /* <: js.Object */](value: T): T with IObservableObject = js.native
    @JSImport("mobx", "observable")
    @js.native
    def apply[T /* <: js.Object */](
      value: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.apply with TopLevel[js.Any]
    ): T with IObservableObject = js.native
    @JSImport("mobx", "observable")
    @js.native
    def apply[T /* <: js.Object */](
      value: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.apply with TopLevel[js.Any],
      options: CreateObservableOptions
    ): T with IObservableObject = js.native
    @JSImport("mobx", "observable")
    @js.native
    def apply[T /* <: js.Object */](value: T, decorators: js.UndefOr[scala.Nothing], options: CreateObservableOptions): T with IObservableObject = js.native
    @JSImport("mobx", "observable")
    @js.native
    def apply[T](value: js.Array[T]): IObservableArray[T] = js.native
    @JSImport("mobx", "observable")
    @js.native
    def apply[T](value: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = js.native
    @JSImport("mobx", "observable")
    @js.native
    def apply[T](value: Set[T]): typings.mobx.internalMod.ObservableSet[T] = js.native
    @JSImport("mobx", "observable")
    @js.native
    def apply[T](value: Set[T], options: CreateObservableOptions): typings.mobx.internalMod.ObservableSet[T] = js.native
    @JSImport("mobx", "observable")
    @js.native
    def apply[K, V](value: Map[K, V]): typings.mobx.internalMod.ObservableMap[K, V] = js.native
    @JSImport("mobx", "observable")
    @js.native
    def apply[K, V](value: Map[K, V], options: CreateObservableOptions): typings.mobx.internalMod.ObservableMap[K, V] = js.native
    @JSImport("mobx", "observable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx", "observable.array")
    @js.native
    def array[T](): IObservableArray[T] = js.native
    @JSImport("mobx", "observable.array")
    @js.native
    def array[T](initialValues: js.UndefOr[scala.Nothing], options: CreateObservableOptions): IObservableArray[T] = js.native
    @JSImport("mobx", "observable.array")
    @js.native
    def array[T](initialValues: js.Array[T]): IObservableArray[T] = js.native
    @JSImport("mobx", "observable.array")
    @js.native
    def array[T](initialValues: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = js.native
    
    @JSImport("mobx", "observable.box")
    @js.native
    def box[T](): IObservableValue[T] = js.native
    @JSImport("mobx", "observable.box")
    @js.native
    def box[T](value: T): IObservableValue[T] = js.native
    @JSImport("mobx", "observable.box")
    @js.native
    def box[T](value: T, options: CreateObservableOptions): IObservableValue[T] = js.native
    @JSImport("mobx", "observable.box")
    @js.native
    def box[T](value: js.UndefOr[scala.Nothing], options: CreateObservableOptions): IObservableValue[T] = js.native
    
    @JSImport("mobx", "observable.deep")
    @js.native
    def deep: IObservableDecorator = js.native
    @JSImport("mobx", "observable.deep")
    @js.native
    def deep(target: js.Object, property: String): Unit = js.native
    @JSImport("mobx", "observable.deep")
    @js.native
    def deep(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
    @JSImport("mobx", "observable.deep")
    @js.native
    def deep(target: js.Object, property: js.Symbol): Unit = js.native
    @JSImport("mobx", "observable.deep")
    @js.native
    def deep(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
    @scala.inline
    def deep_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deep")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx", "observable.enhancer")
    @js.native
    def enhancer: IEnhancer[js.Any] = js.native
    @JSImport("mobx", "observable.enhancer")
    @js.native
    def enhancer(newValue: js.Any, oldValue: js.UndefOr[scala.Nothing], name: String): js.Any = js.native
    @JSImport("mobx", "observable.enhancer")
    @js.native
    def enhancer(newValue: js.Any, oldValue: js.Any, name: String): js.Any = js.native
    @scala.inline
    def enhancer_=(x: IEnhancer[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enhancer")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx", "observable.map")
    @js.native
    def map[K, V](): typings.mobx.internalMod.ObservableMap[K, V] = js.native
    @JSImport("mobx", "observable.map")
    @js.native
    def map[K, V](initialValues: js.UndefOr[IObservableMapInitialValues[K, V]], options: CreateObservableOptions): typings.mobx.internalMod.ObservableMap[K, V] = js.native
    @JSImport("mobx", "observable.map")
    @js.native
    def map[K, V](initialValues: IObservableMapInitialValues[K, V]): typings.mobx.internalMod.ObservableMap[K, V] = js.native
    
    /**
      * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
      */
    @JSImport("mobx", "observable.ref")
    @js.native
    def ref: IObservableDecorator = js.native
    /**
      * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
      */
    @JSImport("mobx", "observable.ref")
    @js.native
    def ref(target: js.Object, property: String): Unit = js.native
    @JSImport("mobx", "observable.ref")
    @js.native
    def ref(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
    @JSImport("mobx", "observable.ref")
    @js.native
    def ref(target: js.Object, property: js.Symbol): Unit = js.native
    @JSImport("mobx", "observable.ref")
    @js.native
    def ref(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
    @scala.inline
    def ref_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ref")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx", "observable.set")
    @js.native
    def set[T](): typings.mobx.internalMod.ObservableSet[T] = js.native
    @JSImport("mobx", "observable.set")
    @js.native
    def set[T](initialValues: js.UndefOr[IObservableSetInitialValues[T]], options: CreateObservableOptions): typings.mobx.internalMod.ObservableSet[T] = js.native
    @JSImport("mobx", "observable.set")
    @js.native
    def set[T](initialValues: IObservableSetInitialValues[T]): typings.mobx.internalMod.ObservableSet[T] = js.native
    
    /**
      * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
      */
    @JSImport("mobx", "observable.shallow")
    @js.native
    def shallow: IObservableDecorator = js.native
    /**
      * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
      */
    @JSImport("mobx", "observable.shallow")
    @js.native
    def shallow(target: js.Object, property: String): Unit = js.native
    @JSImport("mobx", "observable.shallow")
    @js.native
    def shallow(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
    @JSImport("mobx", "observable.shallow")
    @js.native
    def shallow(target: js.Object, property: js.Symbol): Unit = js.native
    @JSImport("mobx", "observable.shallow")
    @js.native
    def shallow(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
    @scala.inline
    def shallow_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shallow")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx", "observable.struct")
    @js.native
    def struct: IObservableDecorator = js.native
    @JSImport("mobx", "observable.struct")
    @js.native
    def struct(target: js.Object, property: String): Unit = js.native
    @JSImport("mobx", "observable.struct")
    @js.native
    def struct(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
    @JSImport("mobx", "observable.struct")
    @js.native
    def struct(target: js.Object, property: js.Symbol): Unit = js.native
    @JSImport("mobx", "observable.struct")
    @js.native
    def struct(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
    @scala.inline
    def struct_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("struct")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx", "observable.object")
    @js.native
    def `object`[T](props: T): T with IObservableObject = js.native
    @JSImport("mobx", "observable.object")
    @js.native
    def `object`[T](
      props: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.`object` with TopLevel[js.Any]
    ): T with IObservableObject = js.native
    @JSImport("mobx", "observable.object")
    @js.native
    def `object`[T](
      props: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.`object` with TopLevel[js.Any],
      options: CreateObservableOptions
    ): T with IObservableObject = js.native
    @JSImport("mobx", "observable.object")
    @js.native
    def `object`[T](props: T, decorators: js.UndefOr[scala.Nothing], options: CreateObservableOptions): T with IObservableObject = js.native
  }
  
  @JSImport("mobx", "observe")
  @js.native
  def observe(`object`: js.Object, listener: js.Function1[/* change */ IObjectDidChange[_], Unit]): Lambda = js.native
  @JSImport("mobx", "observe")
  @js.native
  def observe(
    `object`: js.Object,
    listener: js.Function1[/* change */ IObjectDidChange[_], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx", "observe")
  @js.native
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = js.native
  @JSImport("mobx", "observe")
  @js.native
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx", "observe")
  @js.native
  def observe[V](
    observableMap: typings.mobx.internalMod.ObservableSet[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit]
  ): Lambda = js.native
  @JSImport("mobx", "observe")
  @js.native
  def observe[V](
    observableMap: typings.mobx.internalMod.ObservableSet[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx", "observe")
  @js.native
  def observe[T](value: IComputedValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  @JSImport("mobx", "observe")
  @js.native
  def observe[T](
    value: IComputedValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx", "observe")
  @js.native
  def observe[T](value: IObservableValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  @JSImport("mobx", "observe")
  @js.native
  def observe[T](
    value: IObservableValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx", "observe")
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
  @JSImport("mobx", "observe")
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
  @JSImport("mobx", "observe")
  @js.native
  def observe[K, V](
    observableMap: typings.mobx.internalMod.ObservableMap[K, V],
    listener: js.Function1[/* change */ IMapDidChange[K, V], Unit]
  ): Lambda = js.native
  @JSImport("mobx", "observe")
  @js.native
  def observe[K, V](
    observableMap: typings.mobx.internalMod.ObservableMap[K, V],
    listener: js.Function1[/* change */ IMapDidChange[K, V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx", "observe")
  @js.native
  def observe[K, V](
    observableMap: typings.mobx.internalMod.ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit]
  ): Lambda = js.native
  @JSImport("mobx", "observe")
  @js.native
  def observe[K, V](
    observableMap: typings.mobx.internalMod.ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  
  @JSImport("mobx", "onBecomeObserved")
  @js.native
  def onBecomeObserved(value: IComputedValue[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx", "onBecomeObserved")
  @js.native
  def onBecomeObserved(value: IObservable, listener: Lambda): Lambda = js.native
  @JSImport("mobx", "onBecomeObserved")
  @js.native
  def onBecomeObserved(value: typings.mobx.internalMod.ObservableMap[_, _], listener: Lambda): Lambda = js.native
  @JSImport("mobx", "onBecomeObserved")
  @js.native
  def onBecomeObserved(value: typings.mobx.internalMod.ObservableSet[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx", "onBecomeObserved")
  @js.native
  def onBecomeObserved(value: IObservableArray[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx", "onBecomeObserved")
  @js.native
  def onBecomeObserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = js.native
  @JSImport("mobx", "onBecomeObserved")
  @js.native
  def onBecomeObserved[K, V](value: typings.mobx.internalMod.ObservableMap[K, V], property: K, listener: Lambda): Lambda = js.native
  
  @JSImport("mobx", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved(value: IComputedValue[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved(value: IObservable, listener: Lambda): Lambda = js.native
  @JSImport("mobx", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved(value: typings.mobx.internalMod.ObservableMap[_, _], listener: Lambda): Lambda = js.native
  @JSImport("mobx", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved(value: typings.mobx.internalMod.ObservableSet[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved(value: IObservableArray[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = js.native
  @JSImport("mobx", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved[K, V](value: typings.mobx.internalMod.ObservableMap[K, V], property: K, listener: Lambda): Lambda = js.native
  
  @JSImport("mobx", "onReactionError")
  @js.native
  def onReactionError(handler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit]): Lambda = js.native
  
  @JSImport("mobx", "reaction")
  @js.native
  def reaction[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit]
  ): IReactionDisposer = js.native
  @JSImport("mobx", "reaction")
  @js.native
  def reaction[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit],
    opts: IReactionOptions
  ): IReactionDisposer = js.native
  
  @JSImport("mobx", "remove")
  @js.native
  def remove[T /* <: js.Object */](obj: T, key: String): js.Any = js.native
  @JSImport("mobx", "remove")
  @js.native
  def remove[T](obj: typings.mobx.internalMod.ObservableSet[T], key: T): js.Any = js.native
  @JSImport("mobx", "remove")
  @js.native
  def remove[T](obj: IObservableArray[T], index: Double): js.Any = js.native
  @JSImport("mobx", "remove")
  @js.native
  def remove[K, V](obj: typings.mobx.internalMod.ObservableMap[K, V], key: K): js.Any = js.native
  
  @JSImport("mobx", "_resetGlobalState")
  @js.native
  def resetGlobalState(): Unit = js.native
  
  @JSImport("mobx", "runInAction")
  @js.native
  def runInAction[T](block: js.Function0[T]): T = js.native
  @JSImport("mobx", "runInAction")
  @js.native
  def runInAction[T](name: String, block: js.Function0[T]): T = js.native
  
  @JSImport("mobx", "set")
  @js.native
  def set[T /* <: js.Object */](obj: T, key: PropertyKey, value: js.Any): js.Any = js.native
  @JSImport("mobx", "set")
  @js.native
  def set[T /* <: js.Object */](obj: T, values: StringDictionary[js.Any]): js.Any = js.native
  @JSImport("mobx", "set")
  @js.native
  def set[V](obj: typings.mobx.internalMod.ObservableMap[PropertyKey, V], values: StringDictionary[V]): js.Any = js.native
  @JSImport("mobx", "set")
  @js.native
  def set[T](obj: typings.mobx.internalMod.ObservableSet[T], value: T): js.Any = js.native
  @JSImport("mobx", "set")
  @js.native
  def set[T](obj: IObservableArray[T], index: Double, value: T): js.Any = js.native
  @JSImport("mobx", "set")
  @js.native
  def set[K, V](obj: typings.mobx.internalMod.ObservableMap[K, V], key: K, value: V): js.Any = js.native
  
  @JSImport("mobx", "spy")
  @js.native
  def spy(listener: js.Function1[/* change */ js.Any, Unit]): Lambda = js.native
  
  @JSImport("mobx", "_startAction")
  @js.native
  def startAction(actionName: String, scope: js.Any): IActionRunInfo = js.native
  @JSImport("mobx", "_startAction")
  @js.native
  def startAction(actionName: String, scope: js.Any, args: IArguments): IActionRunInfo = js.native
  
  @JSImport("mobx", "toJS")
  @js.native
  def toJS(source: js.Any): js.Any = js.native
  @JSImport("mobx", "toJS")
  @js.native
  def toJS(source: js.Any, options: ToJSOptions): js.Any = js.native
  @JSImport("mobx", "toJS")
  @js.native
  def toJS[T](source: T): T = js.native
  @JSImport("mobx", "toJS")
  @js.native
  def toJS[T](source: T, options: ToJSOptions): T = js.native
  
  @JSImport("mobx", "trace")
  @js.native
  def trace(): Unit = js.native
  @JSImport("mobx", "trace")
  @js.native
  def trace(enterBreakPoint: Boolean): Unit = js.native
  @JSImport("mobx", "trace")
  @js.native
  def trace(thing: js.UndefOr[scala.Nothing], enterBreakPoint: Boolean): Unit = js.native
  @JSImport("mobx", "trace")
  @js.native
  def trace(thing: js.UndefOr[scala.Nothing], prop: js.UndefOr[scala.Nothing], enterBreakPoint: Boolean): Unit = js.native
  @JSImport("mobx", "trace")
  @js.native
  def trace(thing: js.UndefOr[scala.Nothing], prop: String): Unit = js.native
  @JSImport("mobx", "trace")
  @js.native
  def trace(thing: js.UndefOr[scala.Nothing], prop: String, enterBreakPoint: Boolean): Unit = js.native
  @JSImport("mobx", "trace")
  @js.native
  def trace(thing: js.Any): Unit = js.native
  @JSImport("mobx", "trace")
  @js.native
  def trace(thing: js.Any, enterBreakPoint: Boolean): Unit = js.native
  @JSImport("mobx", "trace")
  @js.native
  def trace(thing: js.Any, prop: js.UndefOr[scala.Nothing], enterBreakPoint: Boolean): Unit = js.native
  @JSImport("mobx", "trace")
  @js.native
  def trace(thing: js.Any, prop: String): Unit = js.native
  @JSImport("mobx", "trace")
  @js.native
  def trace(thing: js.Any, prop: String, enterBreakPoint: Boolean): Unit = js.native
  
  @JSImport("mobx", "transaction")
  @js.native
  def transaction[T](action: js.Function0[T], thisArg: js.UndefOr[scala.Nothing]): T = js.native
  
  @JSImport("mobx", "untracked")
  @js.native
  def untracked[T](action: js.Function0[T]): T = js.native
  
  @JSImport("mobx", "values")
  @js.native
  def values[T](ar: IObservableArray[T]): js.Array[T] = js.native
  @JSImport("mobx", "values")
  @js.native
  def values[T](obj: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSImport("mobx", "values")
  @js.native
  def values[T](set: typings.mobx.internalMod.ObservableSet[T]): js.Array[T] = js.native
  @JSImport("mobx", "values")
  @js.native
  def values[K, T](map: typings.mobx.internalMod.ObservableMap[K, T]): js.Array[T] = js.native
  
  @JSImport("mobx", "when")
  @js.native
  def when(predicate: js.Function0[Boolean]): Promisevoidcancelvoid = js.native
  @JSImport("mobx", "when")
  @js.native
  def when(predicate: js.Function0[Boolean], effect: Lambda): IReactionDisposer = js.native
  @JSImport("mobx", "when")
  @js.native
  def when(predicate: js.Function0[Boolean], effect: Lambda, opts: IWhenOptions): IReactionDisposer = js.native
  @JSImport("mobx", "when")
  @js.native
  def when(predicate: js.Function0[Boolean], opts: IWhenOptions): Promisevoidcancelvoid = js.native
}
