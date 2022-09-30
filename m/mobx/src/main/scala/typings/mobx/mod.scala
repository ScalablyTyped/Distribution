package typings.mobx

import org.scalablytyped.runtime.StringDictionary
import typings.mobx.actionMod.IActionFactory
import typings.mobx.annotationMod.Annotation
import typings.mobx.annotationMod.AnnotationsMap
import typings.mobx.anon.ComputedRequiresReaction
import typings.mobx.anon.Promisevoidcancelvoid
import typings.mobx.atomMod.IAtom
import typings.mobx.autorunMod.IAutorunOptions
import typings.mobx.autorunMod.IReactionOptions
import typings.mobx.computedMod.IComputedFactory
import typings.mobx.computedvalueMod.IComputedValue
import typings.mobx.coreActionMod.IActionRunInfo
import typings.mobx.coreObservableMod.IDepTreeNode
import typings.mobx.coreObservableMod.IObservable
import typings.mobx.derivationMod.IDerivation
import typings.mobx.extrasMod.IDependencyTree
import typings.mobx.extrasMod.IObserverTree
import typings.mobx.flowMod.CancellablePromise
import typings.mobx.flowMod.Flow_
import typings.mobx.interceptReadMod.ReadInterceptor
import typings.mobx.interceptUtilsMod.IInterceptor
import typings.mobx.makeObservableMod.NoInfer
import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.observableMod.CreateObservableOptions
import typings.mobx.observableMod.IObservableFactory
import typings.mobx.observablearrayMod.IArrayDidChange
import typings.mobx.observablearrayMod.IArrayWillChange
import typings.mobx.observablearrayMod.IArrayWillSplice
import typings.mobx.observablearrayMod.IObservableArray
import typings.mobx.observablemapMod.IMapDidChange
import typings.mobx.observablemapMod.IMapWillChange
import typings.mobx.observablemapMod.IObservableMapInitialValues
import typings.mobx.observableobjectMod.IObjectDidChange
import typings.mobx.observableobjectMod.IObjectWillChange
import typings.mobx.observablesetMod.IObservableSetInitialValues
import typings.mobx.observablesetMod.ISetDidChange
import typings.mobx.observablesetMod.ISetWillChange
import typings.mobx.observablevalueMod.IObservableValue
import typings.mobx.observablevalueMod.IValueDidChange
import typings.mobx.observablevalueMod.IValueWillChange
import typings.mobx.reactionMod.IReactionDisposer
import typings.mobx.reactionMod.IReactionPublic
import typings.mobx.spyMod.SpyEvent
import typings.mobx.utilsMod.Lambda
import typings.mobx.whenMod.IWhenOptions
import typings.std.IArguments
import typings.std.Map
import typings.std.PropertyDecorator
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
    def prototype: Any = js.native
    inline def prototype_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prototype")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mobx", "ObservableMap")
  @js.native
  open class ObservableMap[K, V] ()
    extends typings.mobx.internalMod.ObservableMap[K, V] {
    def this(initialData: IObservableMapInitialValues[K, V]) = this()
    def this(initialData: Unit, enhancer_ : IEnhancer[V]) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer_ : IEnhancer[V]) = this()
    def this(initialData: Unit, enhancer_ : Unit, name_ : String) = this()
    def this(initialData: Unit, enhancer_ : IEnhancer[V], name_ : String) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer_ : Unit, name_ : String) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer_ : IEnhancer[V], name_ : String) = this()
  }
  
  @JSImport("mobx", "ObservableSet")
  @js.native
  open class ObservableSet[T] ()
    extends typings.mobx.internalMod.ObservableSet[T] {
    def this(initialData: IObservableSetInitialValues[T]) = this()
    def this(initialData: Unit, enhancer: IEnhancer[T]) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T]) = this()
    def this(initialData: Unit, enhancer: Unit, name_ : String) = this()
    def this(initialData: Unit, enhancer: IEnhancer[T], name_ : String) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: Unit, name_ : String) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T], name_ : String) = this()
  }
  
  @JSImport("mobx", "Reaction")
  @js.native
  open class Reaction_ protected ()
    extends typings.mobx.internalMod.Reaction_ {
    def this(name_ : String, onInvalidate_ : js.Function0[Unit]) = this()
    def this(
      name_ : String,
      onInvalidate_ : js.Function0[Unit],
      errorHandler_ : js.Function2[/* error */ Any, /* derivation */ IDerivation, Unit]
    ) = this()
    def this(
      name_ : String,
      onInvalidate_ : js.Function0[Unit],
      errorHandler_ : js.Function2[/* error */ Any, /* derivation */ IDerivation, Unit],
      requiresObservable_ : Any
    ) = this()
    def this(
      name_ : String,
      onInvalidate_ : js.Function0[Unit],
      errorHandler_ : Unit,
      requiresObservable_ : Any
    ) = this()
  }
  
  @JSImport("mobx", "action")
  @js.native
  val action: IActionFactory = js.native
  
  inline def allowStateChanges[T](allowStateChanges: Boolean, func: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("_allowStateChanges")(allowStateChanges.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def allowStateChangesInsideComputed[T](fn: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("_allowStateChangesInsideComputed")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def allowStateReadsEnd(prev: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_allowStateReadsEnd")(prev.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def allowStateReadsStart(allowStateReads: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_allowStateReadsStart")(allowStateReads.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("mobx", "_autoAction")
  @js.native
  val autoAction: IActionFactory = js.native
  
  inline def autorun(view: js.Function1[/* r */ IReactionPublic, Any]): IReactionDisposer = ^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(view.asInstanceOf[js.Any]).asInstanceOf[IReactionDisposer]
  inline def autorun(view: js.Function1[/* r */ IReactionPublic, Any], opts: IAutorunOptions): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(view.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  
  object comparer {
    
    @JSImport("mobx", "comparer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx", "comparer.default")
    @js.native
    def default: js.Function2[/* a */ Any, /* b */ Any, Boolean] = js.native
    inline def default(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def default_=(x: js.Function2[/* a */ Any, /* b */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx", "comparer.identity")
    @js.native
    def identity: js.Function2[/* a */ Any, /* b */ Any, Boolean] = js.native
    inline def identity(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("identity")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def identity_=(x: js.Function2[/* a */ Any, /* b */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx", "comparer.shallow")
    @js.native
    def shallow: js.Function2[/* a */ Any, /* b */ Any, Boolean] = js.native
    inline def shallow(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def shallow_=(x: js.Function2[/* a */ Any, /* b */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shallow")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx", "comparer.structural")
    @js.native
    def structural: js.Function2[/* a */ Any, /* b */ Any, Boolean] = js.native
    inline def structural(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("structural")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def structural_=(x: js.Function2[/* a */ Any, /* b */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structural")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mobx", "computed")
  @js.native
  val computed: IComputedFactory = js.native
  
  inline def configure(options: ComputedRequiresReaction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createAtom(name: String): IAtom = ^.asInstanceOf[js.Dynamic].applyDynamic("createAtom")(name.asInstanceOf[js.Any]).asInstanceOf[IAtom]
  inline def createAtom(name: String, onBecomeObservedHandler: js.Function0[Unit]): IAtom = (^.asInstanceOf[js.Dynamic].applyDynamic("createAtom")(name.asInstanceOf[js.Any], onBecomeObservedHandler.asInstanceOf[js.Any])).asInstanceOf[IAtom]
  inline def createAtom(
    name: String,
    onBecomeObservedHandler: js.Function0[Unit],
    onBecomeUnobservedHandler: js.Function0[Unit]
  ): IAtom = (^.asInstanceOf[js.Dynamic].applyDynamic("createAtom")(name.asInstanceOf[js.Any], onBecomeObservedHandler.asInstanceOf[js.Any], onBecomeUnobservedHandler.asInstanceOf[js.Any])).asInstanceOf[IAtom]
  inline def createAtom(name: String, onBecomeObservedHandler: Unit, onBecomeUnobservedHandler: js.Function0[Unit]): IAtom = (^.asInstanceOf[js.Dynamic].applyDynamic("createAtom")(name.asInstanceOf[js.Any], onBecomeObservedHandler.asInstanceOf[js.Any], onBecomeUnobservedHandler.asInstanceOf[js.Any])).asInstanceOf[IAtom]
  
  inline def defineProperty(obj: js.Object, key: PropertyKey, descriptor: js.PropertyDescriptor): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  
  inline def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[A & B]
  inline def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B, annotations: Unit, options: CreateObservableOptions): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[A & B]
  inline def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B, annotations: AnnotationsMap[B, scala.Nothing]): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any])).asInstanceOf[A & B]
  inline def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    annotations: AnnotationsMap[B, scala.Nothing],
    options: CreateObservableOptions
  ): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[A & B]
  
  @JSImport("mobx", "flow")
  @js.native
  val flow: Flow_ = js.native
  
  inline def flowResult[T](result: T): T | CancellablePromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flowResult")(result.asInstanceOf[js.Any]).asInstanceOf[T | CancellablePromise[Any]]
  
  inline def get[T /* <: js.Object */](obj: T, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def get[T](obj: IObservableArray[T], index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def get[K, V](obj: typings.mobx.internalMod.ObservableMap[K, V], key: K): js.UndefOr[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[V]]
  
  inline def getAdministration(thing: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_getAdministration")(thing.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getAdministration(thing: Any, property: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_getAdministration")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getAtom(thing: Any): IDepTreeNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getAtom")(thing.asInstanceOf[js.Any]).asInstanceOf[IDepTreeNode]
  inline def getAtom(thing: Any, property: PropertyKey): IDepTreeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("getAtom")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IDepTreeNode]
  
  inline def getDebugName(thing: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDebugName")(thing.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getDebugName(thing: Any, property: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDebugName")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getDependencyTree(thing: Any): IDependencyTree = ^.asInstanceOf[js.Dynamic].applyDynamic("getDependencyTree")(thing.asInstanceOf[js.Any]).asInstanceOf[IDependencyTree]
  inline def getDependencyTree(thing: Any, property: String): IDependencyTree = (^.asInstanceOf[js.Dynamic].applyDynamic("getDependencyTree")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IDependencyTree]
  
  inline def getGlobalState(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_getGlobalState")().asInstanceOf[Any]
  
  inline def getObserverTree(thing: Any): IObserverTree = ^.asInstanceOf[js.Dynamic].applyDynamic("getObserverTree")(thing.asInstanceOf[js.Any]).asInstanceOf[IObserverTree]
  inline def getObserverTree(thing: Any, property: String): IObserverTree = (^.asInstanceOf[js.Dynamic].applyDynamic("getObserverTree")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IObserverTree]
  
  inline def has[T /* <: js.Object */](obj: T, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def has[K](obj: typings.mobx.internalMod.ObservableMap[K, Any], key: K): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def has[T](obj: typings.mobx.internalMod.ObservableSet[T], key: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def has[T](obj: IObservableArray[T], index: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intercept(`object`: js.Object, handler: IInterceptor[IObjectWillChange[Any]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(`object`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[T](observableArray: js.Array[T], handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableArray.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[T](
    observableArray: IObservableArray[T],
    handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableArray.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[V](observableSet: typings.mobx.internalMod.ObservableSet[V], handler: IInterceptor[ISetWillChange[V]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableSet.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[V](observableSet: Set[V], handler: IInterceptor[ISetWillChange[V]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableSet.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[T](value: IObservableValue[T], handler: IInterceptor[IValueWillChange[T]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(value.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[T /* <: js.Object */, K /* <: /* keyof T */ String */](
    `object`: T,
    property: K,
    handler: IInterceptor[
      IValueWillChange[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ]
    ]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[K, V](
    observableMap: typings.mobx.internalMod.ObservableMap[K, V],
    handler: IInterceptor[IMapWillChange[K, V]]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableMap.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[K, V](
    observableMap: typings.mobx.internalMod.ObservableMap[K, V],
    property: K,
    handler: IInterceptor[IValueWillChange[V]]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableMap.asInstanceOf[js.Any], property.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[K, V](observableMap: Map[K, V], handler: IInterceptor[IMapWillChange[K, V]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableMap.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[K, V](observableMap: Map[K, V], property: K, handler: IInterceptor[IValueWillChange[V]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableMap.asInstanceOf[js.Any], property.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  inline def interceptReads(`object`: js.Object, property: String, handler: ReadInterceptor[Any]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("_interceptReads")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def interceptReads[T](observableArray: IObservableArray[T], handler: ReadInterceptor[T]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("_interceptReads")(observableArray.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def interceptReads[V](observableSet: typings.mobx.internalMod.ObservableSet[V], handler: ReadInterceptor[V]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("_interceptReads")(observableSet.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def interceptReads[T](value: IObservableValue[T], handler: ReadInterceptor[T]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("_interceptReads")(value.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def interceptReads[K, V](observableMap: typings.mobx.internalMod.ObservableMap[K, V], handler: ReadInterceptor[V]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("_interceptReads")(observableMap.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  inline def isAction(thing: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAction")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBoxedObservable(x: Any): /* is mobx.mobx/dist/types/observablevalue.IObservableValue<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoxedObservable")(x.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/dist/types/observablevalue.IObservableValue<any> */ Boolean]
  
  inline def isComputed(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComputed")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isComputedProp(value: Any, propName: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isComputedProp")(value.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isComputingDerivation(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isComputingDerivation")().asInstanceOf[Boolean]
  
  inline def isFlow(fn: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlow")(fn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFlowCancellationError(error: js.Error): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlowCancellationError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObservable(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObservableArray(thing: Any): /* is mobx.mobx/dist/types/observablearray.IObservableArray<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableArray")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/dist/types/observablearray.IObservableArray<any> */ Boolean]
  
  @JSImport("mobx", "isObservableMap")
  @js.native
  def isObservableMap: js.Function1[
    /* thing */ Any, 
    /* is mobx.mobx/dist/types/observablemap.ObservableMap<any, any> */ Boolean
  ] = js.native
  inline def isObservableMap_=(
    x: js.Function1[
      /* thing */ Any, 
      /* is mobx.mobx/dist/types/observablemap.ObservableMap<any, any> */ Boolean
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isObservableMap")(x.asInstanceOf[js.Any])
  
  inline def isObservableObject(thing: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableObject")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObservableProp(value: Any, propName: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObservableProp")(value.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("mobx", "isObservableSet")
  @js.native
  def isObservableSet: js.Function1[
    /* thing */ Any, 
    /* is mobx.mobx/dist/types/observableset.ObservableSet<any> */ Boolean
  ] = js.native
  inline def isObservableSet_=(
    x: js.Function1[
      /* thing */ Any, 
      /* is mobx.mobx/dist/types/observableset.ObservableSet<any> */ Boolean
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isObservableSet")(x.asInstanceOf[js.Any])
  
  inline def keys[T](ar: IObservableArray[T]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(ar.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def keys[K](map: typings.mobx.internalMod.ObservableMap[K, Any]): js.Array[K] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(map.asInstanceOf[js.Any]).asInstanceOf[js.Array[K]]
  inline def keys[T /* <: js.Object */](obj: T): js.Array[PropertyKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[PropertyKey]]
  inline def keys[T](set: typings.mobx.internalMod.ObservableSet[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(set.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def makeAutoObservable[T /* <: js.Object */, AdditionalKeys /* <: PropertyKey */](target: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeAutoObservable")(target.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def makeAutoObservable[T /* <: js.Object */, AdditionalKeys /* <: PropertyKey */](target: T, overrides: Unit, options: CreateObservableOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAutoObservable")(target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def makeAutoObservable[T /* <: js.Object */, AdditionalKeys /* <: PropertyKey */](target: T, overrides: AnnotationsMap[T, NoInfer[AdditionalKeys]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAutoObservable")(target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def makeAutoObservable[T /* <: js.Object */, AdditionalKeys /* <: PropertyKey */](target: T, overrides: AnnotationsMap[T, NoInfer[AdditionalKeys]], options: CreateObservableOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAutoObservable")(target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def makeObservable[T /* <: js.Object */, AdditionalKeys /* <: PropertyKey */](target: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeObservable")(target.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def makeObservable[T /* <: js.Object */, AdditionalKeys /* <: PropertyKey */](target: T, annotations: Unit, options: CreateObservableOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObservable")(target.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def makeObservable[T /* <: js.Object */, AdditionalKeys /* <: PropertyKey */](target: T, annotations: AnnotationsMap[T, NoInfer[AdditionalKeys]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObservable")(target.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def makeObservable[T /* <: js.Object */, AdditionalKeys /* <: PropertyKey */](
    target: T,
    annotations: AnnotationsMap[T, NoInfer[AdditionalKeys]],
    options: CreateObservableOptions
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObservable")(target.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("mobx", "$mobx")
  @js.native
  val mobx: js.Symbol = js.native
  
  @JSImport("mobx", "observable")
  @js.native
  def observable: IObservableFactory = js.native
  inline def observable_=(x: IObservableFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observable")(x.asInstanceOf[js.Any])
  
  inline def observe(`object`: js.Object, listener: js.Function1[/* change */ IObjectDidChange[Any], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe(
    `object`: js.Object,
    listener: js.Function1[/* change */ IObjectDidChange[Any], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](observableArray: js.Array[T], listener: js.Function1[/* change */ IArrayDidChange[T], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableArray.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](
    observableArray: js.Array[T],
    listener: js.Function1[/* change */ IArrayDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableArray.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayDidChange[T], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableArray.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableArray.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[V](
    observableSet: typings.mobx.internalMod.ObservableSet[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableSet.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[V](
    observableSet: typings.mobx.internalMod.ObservableSet[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableSet.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[V](observableSet: Set[V], listener: js.Function1[/* change */ ISetDidChange[V], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableSet.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[V](
    observableSet: Set[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableSet.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
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
  inline def observe[K, V](observableMap: Map[K, V], listener: js.Function1[/* change */ IMapDidChange[K, V], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[K, V](
    observableMap: Map[K, V],
    listener: js.Function1[/* change */ IMapDidChange[K, V], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[K, V](
    observableMap: Map[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[K, V](
    observableMap: Map[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  inline def onBecomeObserved(value: IComputedValue[Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved(value: IObservable, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved(value: typings.mobx.internalMod.ObservableMap[Any, Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved(value: typings.mobx.internalMod.ObservableSet[Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved(value: IObservableArray[Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved(value: IObservableValue[Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved[K, V](value: typings.mobx.internalMod.ObservableMap[K, V], property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  inline def onBecomeUnobserved(value: IComputedValue[Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved(value: IObservable, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved(value: typings.mobx.internalMod.ObservableMap[Any, Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved(value: typings.mobx.internalMod.ObservableSet[Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved(value: IObservableArray[Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved(value: IObservableValue[Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved[K, V](value: typings.mobx.internalMod.ObservableMap[K, V], property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  inline def onReactionError(handler: js.Function2[/* error */ Any, /* derivation */ IDerivation, Unit]): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("onReactionError")(handler.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  
  @JSImport("mobx", "override")
  @js.native
  val `override`: Annotation & PropertyDecorator = js.native
  
  inline def ownKeys(obj: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ownKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def reaction_true[T, FireImmediately /* <: Boolean */](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function3[/* arg */ T, /* prev */ js.UndefOr[T], /* r */ IReactionPublic, Unit]
  ): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("reaction")(expression.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  inline def reaction_true[T, FireImmediately /* <: Boolean */](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function3[/* arg */ T, /* prev */ js.UndefOr[T], /* r */ IReactionPublic, Unit],
    opts: IReactionOptions[T, FireImmediately]
  ): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("reaction")(expression.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  
  inline def remove[T /* <: js.Object */](obj: T, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def remove[T](obj: typings.mobx.internalMod.ObservableSet[T], key: T): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def remove[T](obj: IObservableArray[T], index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(obj.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def remove[K, V](obj: typings.mobx.internalMod.ObservableMap[K, V], key: K): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def resetGlobalState(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_resetGlobalState")().asInstanceOf[Unit]
  
  inline def runInAction[T](fn: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("runInAction")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def set[T /* <: js.Object */](obj: T, key: PropertyKey, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def set[T /* <: js.Object */](obj: T, values: StringDictionary[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def set[V](obj: typings.mobx.internalMod.ObservableMap[PropertyKey, V], values: StringDictionary[V]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def set[T](obj: typings.mobx.internalMod.ObservableSet[T], value: T): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def set[T](obj: IObservableArray[T], index: Double, value: T): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def set[K, V](obj: typings.mobx.internalMod.ObservableMap[K, V], key: K, value: V): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def spy(listener: js.Function1[/* change */ SpyEvent, Unit]): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(listener.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  
  inline def startAction(actionName: String, canRunAsDerivation: Boolean, // true for autoAction
  scope: Any): IActionRunInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("_startAction")(actionName.asInstanceOf[js.Any], canRunAsDerivation.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IActionRunInfo]
  inline def startAction(
    actionName: String,
    canRunAsDerivation: Boolean,
    // true for autoAction
  scope: Any,
    args: IArguments
  ): IActionRunInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("_startAction")(actionName.asInstanceOf[js.Any], canRunAsDerivation.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[IActionRunInfo]
  
  inline def toJS[T](source: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def toJS[T](source: T, options: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def trace(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")().asInstanceOf[Unit]
  inline def trace(enterBreakPoint: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(enterBreakPoint.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def trace(thing: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def trace(thing: Any, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trace(thing: Any, prop: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trace(thing: Any, prop: String, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trace(thing: Any, prop: Unit, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
