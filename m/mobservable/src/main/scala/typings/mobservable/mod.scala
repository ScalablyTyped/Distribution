package typings.mobservable

import org.scalablytyped.runtime.Instantiable0
import typings.mobservable.interfacesMod.IArrayChange
import typings.mobservable.interfacesMod.IArraySplice
import typings.mobservable.interfacesMod.IDependencyTree
import typings.mobservable.interfacesMod.IObjectChange
import typings.mobservable.interfacesMod.IObservableArray
import typings.mobservable.interfacesMod.IObservableValue
import typings.mobservable.interfacesMod.IObserverTree
import typings.mobservable.interfacesMod.ITransitionEvent
import typings.mobservable.interfacesMod.Lambda
import typings.mobservable.observablemapMod.Entries
import typings.mobservable.observablemapMod.KeyValueMap
import typings.mobservable.simpleeventemitterMod.default
import typings.mobservable.transformMod.ITransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mobservable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobservable", "ObservableMap")
  @js.native
  open class ObservableMap[V] ()
    extends typings.mobservable.observablemapMod.ObservableMap[V] {
    def this(initialData: Entries[V]) = this()
    def this(initialData: KeyValueMap[V]) = this()
    def this(initialData: Unit, valueModeFunc: js.Function) = this()
    def this(initialData: Entries[V], valueModeFunc: js.Function) = this()
    def this(initialData: KeyValueMap[V], valueModeFunc: js.Function) = this()
  }
  
  object _underscore {
    
    @JSImport("mobservable", "_")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isComputingView(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComputingView")().asInstanceOf[Boolean]
    
    inline def quickDiff[T](current: js.Array[T], base: js.Array[T]): js.Tuple2[js.Array[T], js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickDiff")(current.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[T], js.Array[T]]]
  }
  
  inline def asFlat[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("asFlat")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def asReference[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("asReference")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def asStructure[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("asStructure")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def autorun(view: Lambda): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(view.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  inline def autorun(view: Lambda, scope: Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(view.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  inline def autorunAsync(func: Lambda): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("autorunAsync")(func.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  inline def autorunAsync(func: Lambda, delay: Double): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunAsync")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def autorunAsync(func: Lambda, delay: Double, scope: Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunAsync")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def autorunAsync(func: Lambda, delay: Unit, scope: Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunAsync")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def autorunAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunAsync")(view.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def autorunAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Double): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunAsync")(view.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def autorunAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Double, scope: Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunAsync")(view.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def autorunAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Unit, scope: Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunAsync")(view.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  inline def autorunUntil(predicate: js.Function0[Boolean], effect: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunUntil")(predicate.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def autorunUntil(predicate: js.Function0[Boolean], effect: Lambda, scope: Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunUntil")(predicate.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  inline def createTransformer[A, B](transformer: ITransformer[A, B]): ITransformer[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(transformer.asInstanceOf[js.Any]).asInstanceOf[ITransformer[A, B]]
  inline def createTransformer[A, B](
    transformer: ITransformer[A, B],
    onCleanup: js.Function2[/* resultObject */ B, /* sourceObject */ js.UndefOr[A], Unit]
  ): ITransformer[A, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(transformer.asInstanceOf[js.Any], onCleanup.asInstanceOf[js.Any])).asInstanceOf[ITransformer[A, B]]
  
  inline def expr[T](expr: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("expr")(expr.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def expr[T](expr: js.Function0[T], scope: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("expr")(expr.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B*): A & B = ^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(List(target.asInstanceOf[js.Any]).`++`(properties.asInstanceOf[Seq[js.Any]])*).asInstanceOf[A & B]
  
  inline def extendReactive[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B*): A & B = ^.asInstanceOf[js.Dynamic].applyDynamic("extendReactive")(List(target.asInstanceOf[js.Any]).`++`(properties.asInstanceOf[Seq[js.Any]])*).asInstanceOf[A & B]
  
  object extras {
    
    @JSImport("mobservable", "extras")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("mobservable", "extras.SimpleEventEmitter")
    @js.native
    open class SimpleEventEmitter () extends default
    @JSImport("mobservable", "extras.SimpleEventEmitter")
    @js.native
    def SimpleEventEmitter: Instantiable0[default] = js.native
    inline def SimpleEventEmitter_=(x: Instantiable0[default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SimpleEventEmitter")(x.asInstanceOf[js.Any])
    
    inline def getDNode(thing: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDNode")(thing.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getDependencyTree(thing: Any): IDependencyTree = ^.asInstanceOf[js.Dynamic].applyDynamic("getDependencyTree")(thing.asInstanceOf[js.Any]).asInstanceOf[IDependencyTree]
    inline def getDependencyTree(thing: Any, property: String): IDependencyTree = (^.asInstanceOf[js.Dynamic].applyDynamic("getDependencyTree")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IDependencyTree]
    
    inline def getObserverTree(thing: Any): IObserverTree = ^.asInstanceOf[js.Dynamic].applyDynamic("getObserverTree")(thing.asInstanceOf[js.Any]).asInstanceOf[IObserverTree]
    inline def getObserverTree(thing: Any, property: String): IObserverTree = (^.asInstanceOf[js.Dynamic].applyDynamic("getObserverTree")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IObserverTree]
    
    inline def trackTransitions(): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("trackTransitions")().asInstanceOf[Lambda]
    inline def trackTransitions(extensive: Boolean): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("trackTransitions")(extensive.asInstanceOf[js.Any]).asInstanceOf[Lambda]
    inline def trackTransitions(extensive: Boolean, onReport: js.Function1[/* lines */ ITransitionEvent, Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("trackTransitions")(extensive.asInstanceOf[js.Any], onReport.asInstanceOf[js.Any])).asInstanceOf[Lambda]
    inline def trackTransitions(extensive: Unit, onReport: js.Function1[/* lines */ ITransitionEvent, Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("trackTransitions")(extensive.asInstanceOf[js.Any], onReport.asInstanceOf[js.Any])).asInstanceOf[Lambda]
    
    inline def withStrict(newStrict: Boolean, func: Lambda): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("withStrict")(newStrict.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def fastArray[V](): IObservableArray[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("fastArray")().asInstanceOf[IObservableArray[V]]
  inline def fastArray[V](initialValues: js.Array[V]): IObservableArray[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("fastArray")(initialValues.asInstanceOf[js.Any]).asInstanceOf[IObservableArray[V]]
  
  inline def isObservable(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isObservable(value: Any, property: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isObservableArray(thing: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableArray")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObservableMap(thing: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableMap")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObservableObject(thing: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableObject")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isReactive(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactive")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isReactive(value: Any, property: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReactive")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def makeReactive(target: js.Object, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeReactive(target: js.Object, key: String, baseDescriptor: js.PropertyDescriptor): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], baseDescriptor.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeReactive(value: String): IObservableValue[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[String]]
  inline def makeReactive(value: js.Date): IObservableValue[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[js.Date]]
  inline def makeReactive(value: js.Function): IObservableValue[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[js.Function]]
  inline def makeReactive(value: js.RegExp): IObservableValue[js.RegExp] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[js.RegExp]]
  inline def makeReactive(value: Boolean): IObservableValue[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[Boolean]]
  inline def makeReactive(value: Double): IObservableValue[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[Double]]
  inline def makeReactive(value: Unit): IObservableValue[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[Unit]]
  inline def makeReactive[T /* <: js.Object */](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def makeReactive[T](value: js.Array[T]): IObservableArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableArray[T]]
  inline def makeReactive[T, S /* <: js.Object */](value: js.Function0[T]): IObservableValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[T]]
  inline def makeReactive[T, S /* <: js.Object */](value: js.Function0[T], thisArg: S): IObservableValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[IObservableValue[T]]
  
  inline def map[V](): typings.mobservable.observablemapMod.ObservableMap[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")().asInstanceOf[typings.mobservable.observablemapMod.ObservableMap[V]]
  inline def map[V](initialValues: Unit, valueModifier: js.Function): typings.mobservable.observablemapMod.ObservableMap[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(initialValues.asInstanceOf[js.Any], valueModifier.asInstanceOf[js.Any])).asInstanceOf[typings.mobservable.observablemapMod.ObservableMap[V]]
  inline def map[V](initialValues: KeyValueMap[V]): typings.mobservable.observablemapMod.ObservableMap[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(initialValues.asInstanceOf[js.Any]).asInstanceOf[typings.mobservable.observablemapMod.ObservableMap[V]]
  inline def map[V](initialValues: KeyValueMap[V], valueModifier: js.Function): typings.mobservable.observablemapMod.ObservableMap[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(initialValues.asInstanceOf[js.Any], valueModifier.asInstanceOf[js.Any])).asInstanceOf[typings.mobservable.observablemapMod.ObservableMap[V]]
  
  inline def observable(target: js.Object, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("observable")(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def observable(target: js.Object, key: String, baseDescriptor: js.PropertyDescriptor): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("observable")(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], baseDescriptor.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def observable(value: String): IObservableValue[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[String]]
  inline def observable(value: js.Date): IObservableValue[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[js.Date]]
  inline def observable(value: js.Function): IObservableValue[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[js.Function]]
  inline def observable(value: js.RegExp): IObservableValue[js.RegExp] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[js.RegExp]]
  inline def observable(value: Boolean): IObservableValue[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[Boolean]]
  inline def observable(value: Double): IObservableValue[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[Double]]
  inline def observable(value: Unit): IObservableValue[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[Unit]]
  inline def observable[T /* <: js.Object */](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def observable[T](value: js.Array[T]): IObservableArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableArray[T]]
  inline def observable[T, S /* <: js.Object */](value: js.Function0[T]): IObservableValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[T]]
  inline def observable[T, S /* <: js.Object */](value: js.Function0[T], thisArg: S): IObservableValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[IObservableValue[T]]
  
  inline def observe(func: js.Function0[Unit]): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(func.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  inline def observe[T /* <: js.Object */](`object`: T, listener: js.Function1[/* change */ IObjectChange[Any, T], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableArray.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](
    observableMap: typings.mobservable.observablemapMod.ObservableMap[T],
    listener: js.Function1[
      /* change */ IObjectChange[T, typings.mobservable.observablemapMod.ObservableMap[T]], 
      Unit
    ]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T /* <: js.Object */, Y](
    `object`: T,
    prop: String,
    listener: js.Function2[/* newValue */ Y, /* oldValue */ js.UndefOr[Y], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  inline def observeAsync(func: Lambda): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("observeAsync")(func.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  inline def observeAsync(func: Lambda, delay: Double): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeAsync")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observeAsync(func: Lambda, delay: Double, scope: Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeAsync")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observeAsync(func: Lambda, delay: Unit, scope: Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeAsync")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observeAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeAsync")(view.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observeAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Double): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeAsync")(view.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observeAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Double, scope: Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeAsync")(view.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observeAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Unit, scope: Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeAsync")(view.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  inline def observeUntil(predicate: js.Function0[Boolean], effect: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeUntil")(predicate.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observeUntil(predicate: js.Function0[Boolean], effect: Lambda, scope: Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeUntil")(predicate.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  inline def toJSON(source: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(source.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def toJSON(source: Any, detectCycles: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(source.asInstanceOf[js.Any], detectCycles.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toJSON(source: Any, detectCycles: Boolean, __alreadySeen: js.Array[js.Tuple2[Any, Any]]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(source.asInstanceOf[js.Any], detectCycles.asInstanceOf[js.Any], __alreadySeen.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toJSON(source: Any, detectCycles: Unit, __alreadySeen: js.Array[js.Tuple2[Any, Any]]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(source.asInstanceOf[js.Any], detectCycles.asInstanceOf[js.Any], __alreadySeen.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def transaction[T](action: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("transaction")(action.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def transaction[T](action: js.Function0[T], thisArg: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transaction")(action.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def untracked[T](action: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("untracked")(action.asInstanceOf[js.Any]).asInstanceOf[T]
}
