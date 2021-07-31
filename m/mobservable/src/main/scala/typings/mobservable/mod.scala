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
import typings.std.Date
import typings.std.PropertyDescriptor
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mobservable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobservable", "ObservableMap")
  @js.native
  class ObservableMap[V] ()
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
    
    @scala.inline
    def isComputingView(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComputingView")().asInstanceOf[Boolean]
    
    @scala.inline
    def quickDiff[T](current: js.Array[T], base: js.Array[T]): js.Tuple2[js.Array[T], js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickDiff")(current.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[T], js.Array[T]]]
  }
  
  @scala.inline
  def asFlat[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("asFlat")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def asReference[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("asReference")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def asStructure[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("asStructure")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def autorun(view: Lambda): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(view.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  @scala.inline
  def autorun(view: Lambda, scope: js.Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(view.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  @scala.inline
  def autorunAsync(func: Lambda): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("autorunAsync")(func.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  @scala.inline
  def autorunAsync(func: Lambda, delay: Double): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunAsync")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def autorunAsync(func: Lambda, delay: Double, scope: js.Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunAsync")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def autorunAsync(func: Lambda, delay: Unit, scope: js.Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunAsync")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def autorunAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunAsync")(view.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def autorunAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Double): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunAsync")(view.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def autorunAsync[T](
    view: js.Function0[T],
    effect: js.Function1[/* latestValue */ T, Unit],
    delay: Double,
    scope: js.Any
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunAsync")(view.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def autorunAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Unit, scope: js.Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunAsync")(view.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  @scala.inline
  def autorunUntil(predicate: js.Function0[Boolean], effect: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunUntil")(predicate.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def autorunUntil(predicate: js.Function0[Boolean], effect: Lambda, scope: js.Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("autorunUntil")(predicate.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  @scala.inline
  def createTransformer[A, B](transformer: ITransformer[A, B]): ITransformer[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(transformer.asInstanceOf[js.Any]).asInstanceOf[ITransformer[A, B]]
  @scala.inline
  def createTransformer[A, B](
    transformer: ITransformer[A, B],
    onCleanup: js.Function2[/* resultObject */ B, /* sourceObject */ js.UndefOr[A], Unit]
  ): ITransformer[A, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(transformer.asInstanceOf[js.Any], onCleanup.asInstanceOf[js.Any])).asInstanceOf[ITransformer[A, B]]
  
  @scala.inline
  def expr[T](expr: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("expr")(expr.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def expr[T](expr: js.Function0[T], scope: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("expr")(expr.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B*): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[A & B]
  
  @scala.inline
  def extendReactive[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B*): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendReactive")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[A & B]
  
  object extras {
    
    @JSImport("mobservable", "extras")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("mobservable", "extras.SimpleEventEmitter")
    @js.native
    class SimpleEventEmitter () extends default
    @JSImport("mobservable", "extras.SimpleEventEmitter")
    @js.native
    def SimpleEventEmitter: Instantiable0[default] = js.native
    @scala.inline
    def SimpleEventEmitter_=(x: Instantiable0[default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SimpleEventEmitter")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getDNode(thing: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDNode")(thing.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def getDependencyTree(thing: js.Any): IDependencyTree = ^.asInstanceOf[js.Dynamic].applyDynamic("getDependencyTree")(thing.asInstanceOf[js.Any]).asInstanceOf[IDependencyTree]
    @scala.inline
    def getDependencyTree(thing: js.Any, property: String): IDependencyTree = (^.asInstanceOf[js.Dynamic].applyDynamic("getDependencyTree")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IDependencyTree]
    
    @scala.inline
    def getObserverTree(thing: js.Any): IObserverTree = ^.asInstanceOf[js.Dynamic].applyDynamic("getObserverTree")(thing.asInstanceOf[js.Any]).asInstanceOf[IObserverTree]
    @scala.inline
    def getObserverTree(thing: js.Any, property: String): IObserverTree = (^.asInstanceOf[js.Dynamic].applyDynamic("getObserverTree")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IObserverTree]
    
    @scala.inline
    def trackTransitions(): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("trackTransitions")().asInstanceOf[Lambda]
    @scala.inline
    def trackTransitions(extensive: Boolean): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("trackTransitions")(extensive.asInstanceOf[js.Any]).asInstanceOf[Lambda]
    @scala.inline
    def trackTransitions(extensive: Boolean, onReport: js.Function1[/* lines */ ITransitionEvent, Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("trackTransitions")(extensive.asInstanceOf[js.Any], onReport.asInstanceOf[js.Any])).asInstanceOf[Lambda]
    @scala.inline
    def trackTransitions(extensive: Unit, onReport: js.Function1[/* lines */ ITransitionEvent, Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("trackTransitions")(extensive.asInstanceOf[js.Any], onReport.asInstanceOf[js.Any])).asInstanceOf[Lambda]
    
    @scala.inline
    def withStrict(newStrict: Boolean, func: Lambda): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("withStrict")(newStrict.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @scala.inline
  def fastArray[V](): IObservableArray[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("fastArray")().asInstanceOf[IObservableArray[V]]
  @scala.inline
  def fastArray[V](initialValues: js.Array[V]): IObservableArray[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("fastArray")(initialValues.asInstanceOf[js.Any]).asInstanceOf[IObservableArray[V]]
  
  @scala.inline
  def isObservable(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isObservable(value: js.Any, property: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isObservableArray(thing: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableArray")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isObservableMap(thing: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableMap")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isObservableObject(thing: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableObject")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isReactive(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactive")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isReactive(value: js.Any, property: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReactive")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def makeReactive(target: js.Object, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def makeReactive(target: js.Object, key: String, baseDescriptor: PropertyDescriptor): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], baseDescriptor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def makeReactive(value: String): IObservableValue[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[String]]
  @scala.inline
  def makeReactive(value: js.Function): IObservableValue[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[js.Function]]
  @scala.inline
  def makeReactive(value: Boolean): IObservableValue[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[Boolean]]
  @scala.inline
  def makeReactive(value: Double): IObservableValue[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[Double]]
  @scala.inline
  def makeReactive(value: Unit): IObservableValue[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[Unit]]
  @scala.inline
  def makeReactive(value: Date): IObservableValue[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[Date]]
  @scala.inline
  def makeReactive(value: RegExp): IObservableValue[RegExp] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[RegExp]]
  @scala.inline
  def makeReactive[T /* <: js.Object */](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def makeReactive[T](value: js.Array[T]): IObservableArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableArray[T]]
  @scala.inline
  def makeReactive[T, S /* <: js.Object */](value: js.Function0[T]): IObservableValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[T]]
  @scala.inline
  def makeReactive[T, S /* <: js.Object */](value: js.Function0[T], thisArg: S): IObservableValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeReactive")(value.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[IObservableValue[T]]
  
  @scala.inline
  def map[V](): typings.mobservable.observablemapMod.ObservableMap[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")().asInstanceOf[typings.mobservable.observablemapMod.ObservableMap[V]]
  @scala.inline
  def map[V](initialValues: Unit, valueModifier: js.Function): typings.mobservable.observablemapMod.ObservableMap[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(initialValues.asInstanceOf[js.Any], valueModifier.asInstanceOf[js.Any])).asInstanceOf[typings.mobservable.observablemapMod.ObservableMap[V]]
  @scala.inline
  def map[V](initialValues: KeyValueMap[V]): typings.mobservable.observablemapMod.ObservableMap[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(initialValues.asInstanceOf[js.Any]).asInstanceOf[typings.mobservable.observablemapMod.ObservableMap[V]]
  @scala.inline
  def map[V](initialValues: KeyValueMap[V], valueModifier: js.Function): typings.mobservable.observablemapMod.ObservableMap[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(initialValues.asInstanceOf[js.Any], valueModifier.asInstanceOf[js.Any])).asInstanceOf[typings.mobservable.observablemapMod.ObservableMap[V]]
  
  @scala.inline
  def observable(target: js.Object, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("observable")(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def observable(target: js.Object, key: String, baseDescriptor: PropertyDescriptor): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("observable")(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], baseDescriptor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def observable(value: String): IObservableValue[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[String]]
  @scala.inline
  def observable(value: js.Function): IObservableValue[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[js.Function]]
  @scala.inline
  def observable(value: Boolean): IObservableValue[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[Boolean]]
  @scala.inline
  def observable(value: Double): IObservableValue[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[Double]]
  @scala.inline
  def observable(value: Unit): IObservableValue[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[Unit]]
  @scala.inline
  def observable(value: Date): IObservableValue[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[Date]]
  @scala.inline
  def observable(value: RegExp): IObservableValue[RegExp] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[RegExp]]
  @scala.inline
  def observable[T /* <: js.Object */](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def observable[T](value: js.Array[T]): IObservableArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableArray[T]]
  @scala.inline
  def observable[T, S /* <: js.Object */](value: js.Function0[T]): IObservableValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[T]]
  @scala.inline
  def observable[T, S /* <: js.Object */](value: js.Function0[T], thisArg: S): IObservableValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[IObservableValue[T]]
  
  @scala.inline
  def observe(func: js.Function0[Unit]): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(func.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  @scala.inline
  def observe[T /* <: js.Object */](`object`: T, listener: js.Function1[/* change */ IObjectChange[js.Any, T], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableArray.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[T](
    observableMap: typings.mobservable.observablemapMod.ObservableMap[T],
    listener: js.Function1[
      /* change */ IObjectChange[T, typings.mobservable.observablemapMod.ObservableMap[T]], 
      Unit
    ]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[T /* <: js.Object */, Y](
    `object`: T,
    prop: String,
    listener: js.Function2[/* newValue */ Y, /* oldValue */ js.UndefOr[Y], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  @scala.inline
  def observeAsync(func: Lambda): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("observeAsync")(func.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  @scala.inline
  def observeAsync(func: Lambda, delay: Double): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeAsync")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observeAsync(func: Lambda, delay: Double, scope: js.Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeAsync")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observeAsync(func: Lambda, delay: Unit, scope: js.Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeAsync")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observeAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeAsync")(view.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observeAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Double): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeAsync")(view.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observeAsync[T](
    view: js.Function0[T],
    effect: js.Function1[/* latestValue */ T, Unit],
    delay: Double,
    scope: js.Any
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeAsync")(view.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observeAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Unit, scope: js.Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeAsync")(view.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  @scala.inline
  def observeUntil(predicate: js.Function0[Boolean], effect: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeUntil")(predicate.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observeUntil(predicate: js.Function0[Boolean], effect: Lambda, scope: js.Any): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observeUntil")(predicate.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  @scala.inline
  def toJSON(source: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(source.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def toJSON(source: js.Any, detectCycles: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(source.asInstanceOf[js.Any], detectCycles.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def toJSON(source: js.Any, detectCycles: Boolean, __alreadySeen: js.Array[js.Tuple2[js.Any, js.Any]]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(source.asInstanceOf[js.Any], detectCycles.asInstanceOf[js.Any], __alreadySeen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def toJSON(source: js.Any, detectCycles: Unit, __alreadySeen: js.Array[js.Tuple2[js.Any, js.Any]]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(source.asInstanceOf[js.Any], detectCycles.asInstanceOf[js.Any], __alreadySeen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def transaction[T](action: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("transaction")(action.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def transaction[T](action: js.Function0[T], thisArg: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transaction")(action.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def untracked[T](action: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("untracked")(action.asInstanceOf[js.Any]).asInstanceOf[T]
}
