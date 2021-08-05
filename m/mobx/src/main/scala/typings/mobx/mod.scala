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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mobx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object FlowCancellationError {
    
    inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
    
    @JSImport("mobx", "FlowCancellationError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx", "FlowCancellationError.prototype")
    @js.native
    def prototype: js.Any = js.native
    inline def prototype_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prototype")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mobx", "IDerivationState")
  @js.native
  object IDerivationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.mobx.derivationMod.IDerivationState & Double] = js.native
    
    /* -1 */ val NOT_TRACKING: typings.mobx.derivationMod.IDerivationState.NOT_TRACKING & Double = js.native
    
    /* 1 */ val POSSIBLY_STALE: typings.mobx.derivationMod.IDerivationState.POSSIBLY_STALE & Double = js.native
    
    /* 2 */ val STALE: typings.mobx.derivationMod.IDerivationState.STALE & Double = js.native
    
    /* 0 */ val UP_TO_DATE: typings.mobx.derivationMod.IDerivationState.UP_TO_DATE & Double = js.native
  }
  
  @JSImport("mobx", "ObservableMap")
  @js.native
  class ObservableMap[K, V] ()
    extends typings.mobx.internalMod.ObservableMap[K, V] {
    def this(initialData: IObservableMapInitialValues[K, V]) = this()
    def this(initialData: Unit, enhancer: IEnhancer[V]) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer: IEnhancer[V]) = this()
    def this(initialData: Unit, enhancer: Unit, name: String) = this()
    def this(initialData: Unit, enhancer: IEnhancer[V], name: String) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer: Unit, name: String) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer: IEnhancer[V], name: String) = this()
  }
  
  @JSImport("mobx", "ObservableSet")
  @js.native
  class ObservableSet[T] ()
    extends typings.mobx.internalMod.ObservableSet[T] {
    def this(initialData: IObservableSetInitialValues[T]) = this()
    def this(initialData: Unit, enhancer: IEnhancer[T]) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T]) = this()
    def this(initialData: Unit, enhancer: Unit, name: String) = this()
    def this(initialData: Unit, enhancer: IEnhancer[T], name: String) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: Unit, name: String) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T], name: String) = this()
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
      errorHandler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit],
      requiresObservable: Boolean
    ) = this()
    def this(name: String, onInvalidate: js.Function0[Unit], errorHandler: Unit, requiresObservable: Boolean) = this()
  }
  
  @JSImport("mobx", "action")
  @js.native
  val action: IActionFactory = js.native
  
  inline def allowStateChanges[T](allowStateChanges: Boolean, func: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("_allowStateChanges")(allowStateChanges.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def allowStateChangesInsideComputed[T](func: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("_allowStateChangesInsideComputed")(func.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def allowStateReadsEnd(prev: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_allowStateReadsEnd")(prev.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def allowStateReadsStart(allowStateReads: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_allowStateReadsStart")(allowStateReads.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def autorun(view: js.Function1[/* r */ IReactionPublic, js.Any]): IReactionDisposer = ^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(view.asInstanceOf[js.Any]).asInstanceOf[IReactionDisposer]
  inline def autorun(view: js.Function1[/* r */ IReactionPublic, js.Any], opts: IAutorunOptions): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(view.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  
  object comparer {
    
    @JSImport("mobx", "comparer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx", "comparer.default")
    @js.native
    def default: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    inline def default(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def default_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx", "comparer.identity")
    @js.native
    def identity: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    inline def identity(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("identity")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def identity_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx", "comparer.shallow")
    @js.native
    def shallow: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    inline def shallow(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def shallow_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shallow")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx", "comparer.structural")
    @js.native
    def structural: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    inline def structural(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("structural")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def structural_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structural")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mobx", "computed")
  @js.native
  val computed: IComputed = js.native
  
  inline def configure(options: ComputedConfigurable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createAtom(name: String): IAtom = ^.asInstanceOf[js.Dynamic].applyDynamic("createAtom")(name.asInstanceOf[js.Any]).asInstanceOf[IAtom]
  inline def createAtom(name: String, onBecomeObservedHandler: js.Function0[Unit]): IAtom = (^.asInstanceOf[js.Dynamic].applyDynamic("createAtom")(name.asInstanceOf[js.Any], onBecomeObservedHandler.asInstanceOf[js.Any])).asInstanceOf[IAtom]
  inline def createAtom(
    name: String,
    onBecomeObservedHandler: js.Function0[Unit],
    onBecomeUnobservedHandler: js.Function0[Unit]
  ): IAtom = (^.asInstanceOf[js.Dynamic].applyDynamic("createAtom")(name.asInstanceOf[js.Any], onBecomeObservedHandler.asInstanceOf[js.Any], onBecomeUnobservedHandler.asInstanceOf[js.Any])).asInstanceOf[IAtom]
  inline def createAtom(name: String, onBecomeObservedHandler: Unit, onBecomeUnobservedHandler: js.Function0[Unit]): IAtom = (^.asInstanceOf[js.Dynamic].applyDynamic("createAtom")(name.asInstanceOf[js.Any], onBecomeObservedHandler.asInstanceOf[js.Any], onBecomeUnobservedHandler.asInstanceOf[js.Any])).asInstanceOf[IAtom]
  
  inline def decorate[T](
    clazz: Instantiable1[/* args (repeated) */ js.Any, T],
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.MethodDecorator | std.PropertyDecorator | std.Array<std.MethodDecorator> | std.Array<std.PropertyDecorator>}
    */ typings.mobx.mobxStrings.decorate & TopLevel[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(clazz.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decorate[T](
    `object`: T,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.MethodDecorator | std.PropertyDecorator | std.Array<std.MethodDecorator> | std.Array<std.PropertyDecorator>}
    */ typings.mobx.mobxStrings.decorate & TopLevel[js.Any]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(`object`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def endAction(runInfo: IActionRunInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_endAction")(runInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def entries[T](ar: IObservableArray[T]): js.Array[js.Tuple2[Double, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(ar.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[Double, T]]]
  inline def entries[T](obj: T): js.Array[
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
  inline def entries[T](set: typings.mobx.internalMod.ObservableSet[T]): js.Array[js.Tuple2[T, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(set.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[T, T]]]
  inline def entries[K, T](map: typings.mobx.internalMod.ObservableMap[K, T]): js.Array[js.Tuple2[K, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(map.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[K, T]]]
  
  inline def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A): A & B = ^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any]).asInstanceOf[A & B]
  inline def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[A & B]
  inline def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable & TopLevel[js.Any]
  ): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[A & B]
  inline def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable & TopLevel[js.Any],
    options: CreateObservableOptions
  ): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[A & B]
  inline def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B, decorators: Unit, options: CreateObservableOptions): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[A & B]
  inline def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: Unit,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable & TopLevel[js.Any]
  ): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[A & B]
  inline def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: Unit,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable & TopLevel[js.Any],
    options: CreateObservableOptions
  ): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[A & B]
  inline def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: Unit, decorators: Unit, options: CreateObservableOptions): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[A & B]
  
  inline def flow[R, Args /* <: js.Array[js.Any] */](
    generator: js.Function1[
      /* args */ Args, 
      (Generator[js.Any, R, js.Any]) | (AsyncGenerator[js.Any, R, js.Any])
    ]
  ): js.Function1[/* args */ Args, CancellablePromise[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flow")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, CancellablePromise[R]]]
  
  inline def get[T /* <: js.Object */](obj: T, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get[T](obj: IObservableArray[T], index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def get[K, V](obj: typings.mobx.internalMod.ObservableMap[K, V], key: K): js.UndefOr[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[V]]
  
  inline def getAdministration(thing: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_getAdministration")(thing.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def getAdministration(thing: js.Any, property: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_getAdministration")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getAtom(thing: js.Any): IDepTreeNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getAtom")(thing.asInstanceOf[js.Any]).asInstanceOf[IDepTreeNode]
  inline def getAtom(thing: js.Any, property: String): IDepTreeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("getAtom")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IDepTreeNode]
  
  inline def getDebugName(thing: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDebugName")(thing.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getDebugName(thing: js.Any, property: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDebugName")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getDependencyTree(thing: js.Any): IDependencyTree = ^.asInstanceOf[js.Dynamic].applyDynamic("getDependencyTree")(thing.asInstanceOf[js.Any]).asInstanceOf[IDependencyTree]
  inline def getDependencyTree(thing: js.Any, property: String): IDependencyTree = (^.asInstanceOf[js.Dynamic].applyDynamic("getDependencyTree")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IDependencyTree]
  
  inline def getGlobalState(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_getGlobalState")().asInstanceOf[js.Any]
  
  inline def getObserverTree(thing: js.Any): IObserverTree = ^.asInstanceOf[js.Dynamic].applyDynamic("getObserverTree")(thing.asInstanceOf[js.Any]).asInstanceOf[IObserverTree]
  inline def getObserverTree(thing: js.Any, property: String): IObserverTree = (^.asInstanceOf[js.Dynamic].applyDynamic("getObserverTree")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IObserverTree]
  
  inline def has[T /* <: js.Object */](obj: T, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def has[K](obj: typings.mobx.internalMod.ObservableMap[K, js.Any], key: K): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def has[T](obj: typings.mobx.internalMod.ObservableSet[T], key: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def has[T](obj: IObservableArray[T], index: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intercept(`object`: js.Object, handler: IInterceptor[IObjectWillChange[js.Any]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(`object`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[T](
    observableArray: IObservableArray[T],
    handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableArray.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[V](observableMap: typings.mobx.internalMod.ObservableSet[V], handler: IInterceptor[ISetWillChange[V]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableMap.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[T](value: IObservableValue[T], handler: IInterceptor[IValueWillChange[T]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(value.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: T, property: K, handler: IInterceptor[IValueWillChange[js.Any]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[K, V](
    observableMap: typings.mobx.internalMod.ObservableMap[K, V],
    handler: IInterceptor[IMapWillChange[K, V]]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableMap.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[K, V](
    observableMap: typings.mobx.internalMod.ObservableMap[K, V],
    property: K,
    handler: IInterceptor[IValueWillChange[V]]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableMap.asInstanceOf[js.Any], property.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  inline def interceptReads(`object`: js.Object, property: String, handler: ReadInterceptor[js.Any]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("_interceptReads")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def interceptReads[T](observableArray: IObservableArray[T], handler: ReadInterceptor[T]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("_interceptReads")(observableArray.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def interceptReads[V](observableSet: typings.mobx.internalMod.ObservableSet[V], handler: ReadInterceptor[V]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("_interceptReads")(observableSet.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def interceptReads[T](value: IObservableValue[T], handler: ReadInterceptor[T]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("_interceptReads")(value.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def interceptReads[K, V](observableMap: typings.mobx.internalMod.ObservableMap[K, V], handler: ReadInterceptor[V]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("_interceptReads")(observableMap.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  inline def isAction(thing: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAction")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isArrayLike(x: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayLike")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBoxedObservable(x: js.Any): /* is mobx.mobx/lib/types/observablevalue.IObservableValue<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoxedObservable")(x.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/types/observablevalue.IObservableValue<any> */ Boolean]
  
  inline def isComputed(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComputed")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isComputedProp(value: js.Any, propName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isComputedProp")(value.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isComputingDerivation(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isComputingDerivation")().asInstanceOf[Boolean]
  
  inline def isFlowCancellationError(error: Error): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlowCancellationError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObservable(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObservableArray(thing: js.Any): /* is mobx.mobx/lib/types/observablearray.IObservableArray<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableArray")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/types/observablearray.IObservableArray<any> */ Boolean]
  
  inline def isObservableMap(thing: js.Any): /* is mobx.mobx/lib/types/observablemap.ObservableMap<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableMap")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/types/observablemap.ObservableMap<any, any> */ Boolean]
  
  inline def isObservableObject(thing: js.Any): /* is mobx.mobx/lib/types/observableobject.IObservableObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableObject")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/types/observableobject.IObservableObject */ Boolean]
  
  inline def isObservableProp(value: js.Any, propName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObservableProp")(value.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isObservableSet(thing: js.Any): /* is mobx.mobx/lib/types/observableset.ObservableSet<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableSet")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/types/observableset.ObservableSet<any> */ Boolean]
  
  inline def keys[T](ar: IObservableArray[T]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(ar.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def keys[K](map: typings.mobx.internalMod.ObservableMap[K, js.Any]): js.Array[K] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(map.asInstanceOf[js.Any]).asInstanceOf[js.Array[K]]
  inline def keys[T /* <: js.Object */](obj: T): js.Array[PropertyKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[PropertyKey]]
  inline def keys[T](set: typings.mobx.internalMod.ObservableSet[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(set.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @JSImport("mobx", "$mobx")
  @js.native
  val mobx: js.Symbol = js.native
  
  /* Inlined mobx.mobx/lib/api/observable.IObservableFactory & mobx.mobx/lib/api/observable.IObservableFactories & {  enhancer :mobx.mobx/lib/internal.IEnhancer<any>} */
  object observable {
    
    inline def apply(): scala.Nothing = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[scala.Nothing]
    inline def apply(target: js.Object, key: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def apply(target: js.Object, key: String, baseDescriptor: PropertyDescriptor): js.Any = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], baseDescriptor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def apply(target: js.Object, key: js.Symbol): js.Any = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def apply(target: js.Object, key: js.Symbol, baseDescriptor: PropertyDescriptor): js.Any = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], baseDescriptor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def apply(value: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
    inline def apply(value: Boolean): scala.Nothing = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
    inline def apply(value: Double): scala.Nothing = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
    inline def apply[T /* <: js.Object */](value: T): T & IObservableObject = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[T & IObservableObject]
    inline def apply[T /* <: js.Object */](
      value: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.apply & TopLevel[js.Any]
    ): T & IObservableObject = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[T & IObservableObject]
    inline def apply[T /* <: js.Object */](
      value: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.apply & TopLevel[js.Any],
      options: CreateObservableOptions
    ): T & IObservableObject = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & IObservableObject]
    inline def apply[T /* <: js.Object */](value: T, decorators: Unit, options: CreateObservableOptions): T & IObservableObject = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & IObservableObject]
    inline def apply[T](value: js.Array[T]): IObservableArray[T] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[IObservableArray[T]]
    inline def apply[T](value: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
    inline def apply[T](value: Set[T]): typings.mobx.internalMod.ObservableSet[T] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[typings.mobx.internalMod.ObservableSet[T]]
    inline def apply[T](value: Set[T], options: CreateObservableOptions): typings.mobx.internalMod.ObservableSet[T] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mobx.internalMod.ObservableSet[T]]
    inline def apply[K, V](value: Map[K, V]): typings.mobx.internalMod.ObservableMap[K, V] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[typings.mobx.internalMod.ObservableMap[K, V]]
    inline def apply[K, V](value: Map[K, V], options: CreateObservableOptions): typings.mobx.internalMod.ObservableMap[K, V] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mobx.internalMod.ObservableMap[K, V]]
    
    @JSImport("mobx", "observable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def array[T](): IObservableArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")().asInstanceOf[IObservableArray[T]]
    inline def array[T](initialValues: js.Array[T]): IObservableArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(initialValues.asInstanceOf[js.Any]).asInstanceOf[IObservableArray[T]]
    inline def array[T](initialValues: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(initialValues.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
    inline def array[T](initialValues: Unit, options: CreateObservableOptions): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(initialValues.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
    
    inline def box[T](): IObservableValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("box")().asInstanceOf[IObservableValue[T]]
    inline def box[T](value: T): IObservableValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("box")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[T]]
    inline def box[T](value: T, options: CreateObservableOptions): IObservableValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IObservableValue[T]]
    inline def box[T](value: Unit, options: CreateObservableOptions): IObservableValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IObservableValue[T]]
    
    @JSImport("mobx", "observable.deep")
    @js.native
    def deep: IObservableDecorator = js.native
    inline def deep(target: js.Object, property: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deep")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def deep(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deep")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def deep(target: js.Object, property: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deep")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def deep(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deep")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def deep_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deep")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx", "observable.enhancer")
    @js.native
    def enhancer: IEnhancer[js.Any] = js.native
    inline def enhancer(newValue: js.Any, oldValue: js.Any, name: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enhancer")(newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def enhancer(newValue: js.Any, oldValue: Unit, name: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enhancer")(newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def enhancer_=(x: IEnhancer[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enhancer")(x.asInstanceOf[js.Any])
    
    inline def map[K, V](): typings.mobx.internalMod.ObservableMap[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")().asInstanceOf[typings.mobx.internalMod.ObservableMap[K, V]]
    inline def map[K, V](initialValues: Unit, options: CreateObservableOptions): typings.mobx.internalMod.ObservableMap[K, V] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(initialValues.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mobx.internalMod.ObservableMap[K, V]]
    inline def map[K, V](initialValues: IObservableMapInitialValues[K, V]): typings.mobx.internalMod.ObservableMap[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(initialValues.asInstanceOf[js.Any]).asInstanceOf[typings.mobx.internalMod.ObservableMap[K, V]]
    inline def map[K, V](initialValues: IObservableMapInitialValues[K, V], options: CreateObservableOptions): typings.mobx.internalMod.ObservableMap[K, V] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(initialValues.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mobx.internalMod.ObservableMap[K, V]]
    
    inline def `object`[T](props: T): T & IObservableObject = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(props.asInstanceOf[js.Any]).asInstanceOf[T & IObservableObject]
    inline def `object`[T](
      props: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.`object` & TopLevel[js.Any]
    ): T & IObservableObject = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(props.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[T & IObservableObject]
    inline def `object`[T](
      props: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.`object` & TopLevel[js.Any],
      options: CreateObservableOptions
    ): T & IObservableObject = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(props.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & IObservableObject]
    inline def `object`[T](props: T, decorators: Unit, options: CreateObservableOptions): T & IObservableObject = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(props.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & IObservableObject]
    
    /**
      * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
      */
    @JSImport("mobx", "observable.ref")
    @js.native
    def ref: IObservableDecorator = js.native
    /**
      * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
      */
    inline def ref(target: js.Object, property: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ref(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ref(target: js.Object, property: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ref(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ref_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ref")(x.asInstanceOf[js.Any])
    
    inline def set[T](): typings.mobx.internalMod.ObservableSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")().asInstanceOf[typings.mobx.internalMod.ObservableSet[T]]
    inline def set[T](initialValues: Unit, options: CreateObservableOptions): typings.mobx.internalMod.ObservableSet[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(initialValues.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mobx.internalMod.ObservableSet[T]]
    inline def set[T](initialValues: IObservableSetInitialValues[T]): typings.mobx.internalMod.ObservableSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(initialValues.asInstanceOf[js.Any]).asInstanceOf[typings.mobx.internalMod.ObservableSet[T]]
    inline def set[T](initialValues: IObservableSetInitialValues[T], options: CreateObservableOptions): typings.mobx.internalMod.ObservableSet[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(initialValues.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mobx.internalMod.ObservableSet[T]]
    
    /**
      * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
      */
    @JSImport("mobx", "observable.shallow")
    @js.native
    def shallow: IObservableDecorator = js.native
    /**
      * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
      */
    inline def shallow(target: js.Object, property: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def shallow(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def shallow(target: js.Object, property: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def shallow(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def shallow_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shallow")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx", "observable.struct")
    @js.native
    def struct: IObservableDecorator = js.native
    inline def struct(target: js.Object, property: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("struct")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def struct(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("struct")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def struct(target: js.Object, property: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("struct")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def struct(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("struct")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def struct_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("struct")(x.asInstanceOf[js.Any])
  }
  
  inline def observe(`object`: js.Object, listener: js.Function1[/* change */ IObjectDidChange[js.Any], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe(
    `object`: js.Object,
    listener: js.Function1[/* change */ IObjectDidChange[js.Any], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableArray.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableArray.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[V](
    observableMap: typings.mobx.internalMod.ObservableSet[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[V](
    observableMap: typings.mobx.internalMod.ObservableSet[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](value: IComputedValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](
    value: IComputedValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](value: IObservableValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](
    value: IObservableValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T, K /* <: /* keyof T */ String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ IValueDidChange[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      Unit
    ]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T, K /* <: /* keyof T */ String */](
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
  inline def observe[K, V](
    observableMap: typings.mobx.internalMod.ObservableMap[K, V],
    listener: js.Function1[/* change */ IMapDidChange[K, V], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[K, V](
    observableMap: typings.mobx.internalMod.ObservableMap[K, V],
    listener: js.Function1[/* change */ IMapDidChange[K, V], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[K, V](
    observableMap: typings.mobx.internalMod.ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[K, V](
    observableMap: typings.mobx.internalMod.ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  inline def onBecomeObserved(value: IComputedValue[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved(value: IObservable, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved(value: typings.mobx.internalMod.ObservableMap[js.Any, js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved(value: typings.mobx.internalMod.ObservableSet[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved(value: IObservableArray[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved[K, V](value: typings.mobx.internalMod.ObservableMap[K, V], property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  inline def onBecomeUnobserved(value: IComputedValue[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved(value: IObservable, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved(value: typings.mobx.internalMod.ObservableMap[js.Any, js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved(value: typings.mobx.internalMod.ObservableSet[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved(value: IObservableArray[js.Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved[K, V](value: typings.mobx.internalMod.ObservableMap[K, V], property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  inline def onReactionError(handler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit]): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("onReactionError")(handler.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  
  inline def reaction[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit]
  ): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("reaction")(expression.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  inline def reaction[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit],
    opts: IReactionOptions
  ): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("reaction")(expression.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  
  inline def remove[T /* <: js.Object */](obj: T, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def remove[T](obj: typings.mobx.internalMod.ObservableSet[T], key: T): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def remove[T](obj: IObservableArray[T], index: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(obj.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def remove[K, V](obj: typings.mobx.internalMod.ObservableMap[K, V], key: K): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def resetGlobalState(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_resetGlobalState")().asInstanceOf[Unit]
  
  inline def runInAction[T](block: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("runInAction")(block.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def runInAction[T](name: String, block: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("runInAction")(name.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def set[T /* <: js.Object */](obj: T, key: PropertyKey, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def set[T /* <: js.Object */](obj: T, values: StringDictionary[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def set[V](obj: typings.mobx.internalMod.ObservableMap[PropertyKey, V], values: StringDictionary[V]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def set[T](obj: typings.mobx.internalMod.ObservableSet[T], value: T): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def set[T](obj: IObservableArray[T], index: Double, value: T): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def set[K, V](obj: typings.mobx.internalMod.ObservableMap[K, V], key: K, value: V): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def spy(listener: js.Function1[/* change */ js.Any, Unit]): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(listener.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  
  inline def startAction(actionName: String, scope: js.Any): IActionRunInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("_startAction")(actionName.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IActionRunInfo]
  inline def startAction(actionName: String, scope: js.Any, args: IArguments): IActionRunInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("_startAction")(actionName.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[IActionRunInfo]
  
  inline def toJS(source: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def toJS(source: js.Any, options: ToJSOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def toJS[T](source: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def toJS[T](source: T, options: ToJSOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def trace(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")().asInstanceOf[Unit]
  inline def trace(enterBreakPoint: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(enterBreakPoint.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def trace(thing: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def trace(thing: js.Any, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trace(thing: js.Any, prop: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trace(thing: js.Any, prop: String, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trace(thing: js.Any, prop: Unit, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trace(thing: Unit, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trace(thing: Unit, prop: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trace(thing: Unit, prop: String, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trace(thing: Unit, prop: Unit, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def transaction[T](action: js.Function0[T], thisArg: Unit): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transaction")(action.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def untracked[T](action: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("untracked")(action.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def values[T](ar: IObservableArray[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(ar.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def values[T](obj: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]]
  inline def values[T](set: typings.mobx.internalMod.ObservableSet[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(set.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def values[K, T](map: typings.mobx.internalMod.ObservableMap[K, T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(map.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def when(predicate: js.Function0[Boolean]): Promisevoidcancelvoid = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any]).asInstanceOf[Promisevoidcancelvoid]
  inline def when(predicate: js.Function0[Boolean], effect: Lambda): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  inline def when(predicate: js.Function0[Boolean], effect: Lambda, opts: IWhenOptions): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  inline def when(predicate: js.Function0[Boolean], opts: IWhenOptions): Promisevoidcancelvoid = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Promisevoidcancelvoid]
}
