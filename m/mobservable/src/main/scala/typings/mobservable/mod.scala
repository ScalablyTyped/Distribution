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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mobservable", "ObservableMap")
  @js.native
  class ObservableMap[V] ()
    extends typings.mobservable.observablemapMod.ObservableMap[V] {
    def this(initialData: Entries[V]) = this()
    def this(initialData: KeyValueMap[V]) = this()
    def this(initialData: js.UndefOr[scala.Nothing], valueModeFunc: js.Function) = this()
    def this(initialData: Entries[V], valueModeFunc: js.Function) = this()
    def this(initialData: KeyValueMap[V], valueModeFunc: js.Function) = this()
  }
  
  object _underscore {
    
    @JSImport("mobservable", "_.isComputingView")
    @js.native
    def isComputingView(): Boolean = js.native
    
    @JSImport("mobservable", "_.quickDiff")
    @js.native
    def quickDiff[T](current: js.Array[T], base: js.Array[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  }
  
  @JSImport("mobservable", "asFlat")
  @js.native
  def asFlat[T](value: T): T = js.native
  
  @JSImport("mobservable", "asReference")
  @js.native
  def asReference[T](value: T): T = js.native
  
  @JSImport("mobservable", "asStructure")
  @js.native
  def asStructure[T](value: T): T = js.native
  
  @JSImport("mobservable", "autorun")
  @js.native
  def autorun(view: Lambda): Lambda = js.native
  @JSImport("mobservable", "autorun")
  @js.native
  def autorun(view: Lambda, scope: js.Any): Lambda = js.native
  
  @JSImport("mobservable", "autorunAsync")
  @js.native
  def autorunAsync(func: Lambda): Lambda = js.native
  @JSImport("mobservable", "autorunAsync")
  @js.native
  def autorunAsync(func: Lambda, delay: js.UndefOr[scala.Nothing], scope: js.Any): Lambda = js.native
  @JSImport("mobservable", "autorunAsync")
  @js.native
  def autorunAsync(func: Lambda, delay: Double): Lambda = js.native
  @JSImport("mobservable", "autorunAsync")
  @js.native
  def autorunAsync(func: Lambda, delay: Double, scope: js.Any): Lambda = js.native
  @JSImport("mobservable", "autorunAsync")
  @js.native
  def autorunAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit]): Lambda = js.native
  @JSImport("mobservable", "autorunAsync")
  @js.native
  def autorunAsync[T](
    view: js.Function0[T],
    effect: js.Function1[/* latestValue */ T, Unit],
    delay: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): Lambda = js.native
  @JSImport("mobservable", "autorunAsync")
  @js.native
  def autorunAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Double): Lambda = js.native
  @JSImport("mobservable", "autorunAsync")
  @js.native
  def autorunAsync[T](
    view: js.Function0[T],
    effect: js.Function1[/* latestValue */ T, Unit],
    delay: Double,
    scope: js.Any
  ): Lambda = js.native
  
  @JSImport("mobservable", "autorunUntil")
  @js.native
  def autorunUntil(predicate: js.Function0[Boolean], effect: Lambda): Lambda = js.native
  @JSImport("mobservable", "autorunUntil")
  @js.native
  def autorunUntil(predicate: js.Function0[Boolean], effect: Lambda, scope: js.Any): Lambda = js.native
  
  @JSImport("mobservable", "createTransformer")
  @js.native
  def createTransformer[A, B](transformer: ITransformer[A, B]): ITransformer[A, B] = js.native
  @JSImport("mobservable", "createTransformer")
  @js.native
  def createTransformer[A, B](
    transformer: ITransformer[A, B],
    onCleanup: js.Function2[/* resultObject */ B, /* sourceObject */ js.UndefOr[A], Unit]
  ): ITransformer[A, B] = js.native
  
  @JSImport("mobservable", "expr")
  @js.native
  def expr[T](expr: js.Function0[T]): T = js.native
  @JSImport("mobservable", "expr")
  @js.native
  def expr[T](expr: js.Function0[T], scope: js.Any): T = js.native
  
  @JSImport("mobservable", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B*): A with B = js.native
  
  @JSImport("mobservable", "extendReactive")
  @js.native
  def extendReactive[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B*): A with B = js.native
  
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
    
    @JSImport("mobservable", "extras.getDNode")
    @js.native
    def getDNode(thing: js.Any): js.Any = js.native
    
    @JSImport("mobservable", "extras.getDependencyTree")
    @js.native
    def getDependencyTree(thing: js.Any): IDependencyTree = js.native
    @JSImport("mobservable", "extras.getDependencyTree")
    @js.native
    def getDependencyTree(thing: js.Any, property: String): IDependencyTree = js.native
    
    @JSImport("mobservable", "extras.getObserverTree")
    @js.native
    def getObserverTree(thing: js.Any): IObserverTree = js.native
    @JSImport("mobservable", "extras.getObserverTree")
    @js.native
    def getObserverTree(thing: js.Any, property: String): IObserverTree = js.native
    
    @JSImport("mobservable", "extras.trackTransitions")
    @js.native
    def trackTransitions(): Lambda = js.native
    @JSImport("mobservable", "extras.trackTransitions")
    @js.native
    def trackTransitions(extensive: js.UndefOr[scala.Nothing], onReport: js.Function1[/* lines */ ITransitionEvent, Unit]): Lambda = js.native
    @JSImport("mobservable", "extras.trackTransitions")
    @js.native
    def trackTransitions(extensive: Boolean): Lambda = js.native
    @JSImport("mobservable", "extras.trackTransitions")
    @js.native
    def trackTransitions(extensive: Boolean, onReport: js.Function1[/* lines */ ITransitionEvent, Unit]): Lambda = js.native
    
    @JSImport("mobservable", "extras.withStrict")
    @js.native
    def withStrict(newStrict: Boolean, func: Lambda): Unit = js.native
  }
  
  @JSImport("mobservable", "fastArray")
  @js.native
  def fastArray[V](): IObservableArray[V] = js.native
  @JSImport("mobservable", "fastArray")
  @js.native
  def fastArray[V](initialValues: js.Array[V]): IObservableArray[V] = js.native
  
  @JSImport("mobservable", "isObservable")
  @js.native
  def isObservable(value: js.Any): Boolean = js.native
  @JSImport("mobservable", "isObservable")
  @js.native
  def isObservable(value: js.Any, property: String): Boolean = js.native
  
  @JSImport("mobservable", "isObservableArray")
  @js.native
  def isObservableArray(thing: js.Any): Boolean = js.native
  
  @JSImport("mobservable", "isObservableMap")
  @js.native
  def isObservableMap(thing: js.Any): Boolean = js.native
  
  @JSImport("mobservable", "isObservableObject")
  @js.native
  def isObservableObject(thing: js.Any): Boolean = js.native
  
  @JSImport("mobservable", "isReactive")
  @js.native
  def isReactive(value: js.Any): Boolean = js.native
  @JSImport("mobservable", "isReactive")
  @js.native
  def isReactive(value: js.Any, property: String): Boolean = js.native
  
  @JSImport("mobservable", "makeReactive")
  @js.native
  def makeReactive(target: js.Object, key: String): js.Any = js.native
  @JSImport("mobservable", "makeReactive")
  @js.native
  def makeReactive(target: js.Object, key: String, baseDescriptor: PropertyDescriptor): js.Any = js.native
  @JSImport("mobservable", "makeReactive")
  @js.native
  def makeReactive(value: String): IObservableValue[String] = js.native
  @JSImport("mobservable", "makeReactive")
  @js.native
  def makeReactive(value: js.Function): IObservableValue[js.Function] = js.native
  @JSImport("mobservable", "makeReactive")
  @js.native
  def makeReactive(value: Boolean): IObservableValue[Boolean] = js.native
  @JSImport("mobservable", "makeReactive")
  @js.native
  def makeReactive(value: Double): IObservableValue[Double] = js.native
  @JSImport("mobservable", "makeReactive")
  @js.native
  def makeReactive(value: Unit): IObservableValue[Unit] = js.native
  @JSImport("mobservable", "makeReactive")
  @js.native
  def makeReactive(value: Date): IObservableValue[Date] = js.native
  @JSImport("mobservable", "makeReactive")
  @js.native
  def makeReactive(value: RegExp): IObservableValue[RegExp] = js.native
  @JSImport("mobservable", "makeReactive")
  @js.native
  def makeReactive[T /* <: js.Object */](value: T): T = js.native
  @JSImport("mobservable", "makeReactive")
  @js.native
  def makeReactive[T](value: js.Array[T]): IObservableArray[T] = js.native
  @JSImport("mobservable", "makeReactive")
  @js.native
  def makeReactive[T, S /* <: js.Object */](value: js.Function0[T]): IObservableValue[T] = js.native
  @JSImport("mobservable", "makeReactive")
  @js.native
  def makeReactive[T, S /* <: js.Object */](value: js.Function0[T], thisArg: S): IObservableValue[T] = js.native
  
  @JSImport("mobservable", "map")
  @js.native
  def map[V](): typings.mobservable.observablemapMod.ObservableMap[V] = js.native
  @JSImport("mobservable", "map")
  @js.native
  def map[V](initialValues: js.UndefOr[scala.Nothing], valueModifier: js.Function): typings.mobservable.observablemapMod.ObservableMap[V] = js.native
  @JSImport("mobservable", "map")
  @js.native
  def map[V](initialValues: KeyValueMap[V]): typings.mobservable.observablemapMod.ObservableMap[V] = js.native
  @JSImport("mobservable", "map")
  @js.native
  def map[V](initialValues: KeyValueMap[V], valueModifier: js.Function): typings.mobservable.observablemapMod.ObservableMap[V] = js.native
  
  @JSImport("mobservable", "observable")
  @js.native
  def observable(target: js.Object, key: String): js.Any = js.native
  @JSImport("mobservable", "observable")
  @js.native
  def observable(target: js.Object, key: String, baseDescriptor: PropertyDescriptor): js.Any = js.native
  @JSImport("mobservable", "observable")
  @js.native
  def observable(value: String): IObservableValue[String] = js.native
  @JSImport("mobservable", "observable")
  @js.native
  def observable(value: js.Function): IObservableValue[js.Function] = js.native
  @JSImport("mobservable", "observable")
  @js.native
  def observable(value: Boolean): IObservableValue[Boolean] = js.native
  @JSImport("mobservable", "observable")
  @js.native
  def observable(value: Double): IObservableValue[Double] = js.native
  @JSImport("mobservable", "observable")
  @js.native
  def observable(value: Unit): IObservableValue[Unit] = js.native
  @JSImport("mobservable", "observable")
  @js.native
  def observable(value: Date): IObservableValue[Date] = js.native
  @JSImport("mobservable", "observable")
  @js.native
  def observable(value: RegExp): IObservableValue[RegExp] = js.native
  @JSImport("mobservable", "observable")
  @js.native
  def observable[T /* <: js.Object */](value: T): T = js.native
  @JSImport("mobservable", "observable")
  @js.native
  def observable[T](value: js.Array[T]): IObservableArray[T] = js.native
  @JSImport("mobservable", "observable")
  @js.native
  def observable[T, S /* <: js.Object */](value: js.Function0[T]): IObservableValue[T] = js.native
  @JSImport("mobservable", "observable")
  @js.native
  def observable[T, S /* <: js.Object */](value: js.Function0[T], thisArg: S): IObservableValue[T] = js.native
  
  @JSImport("mobservable", "observe")
  @js.native
  def observe(func: js.Function0[Unit]): Lambda = js.native
  @JSImport("mobservable", "observe")
  @js.native
  def observe[T /* <: js.Object */](`object`: T, listener: js.Function1[/* change */ IObjectChange[_, T], Unit]): Lambda = js.native
  @JSImport("mobservable", "observe")
  @js.native
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = js.native
  @JSImport("mobservable", "observe")
  @js.native
  def observe[T](
    observableMap: typings.mobservable.observablemapMod.ObservableMap[T],
    listener: js.Function1[
      /* change */ IObjectChange[T, typings.mobservable.observablemapMod.ObservableMap[T]], 
      Unit
    ]
  ): Lambda = js.native
  @JSImport("mobservable", "observe")
  @js.native
  def observe[T /* <: js.Object */, Y](
    `object`: T,
    prop: String,
    listener: js.Function2[/* newValue */ Y, /* oldValue */ js.UndefOr[Y], Unit]
  ): Lambda = js.native
  
  @JSImport("mobservable", "observeAsync")
  @js.native
  def observeAsync(func: Lambda): Lambda = js.native
  @JSImport("mobservable", "observeAsync")
  @js.native
  def observeAsync(func: Lambda, delay: js.UndefOr[scala.Nothing], scope: js.Any): Lambda = js.native
  @JSImport("mobservable", "observeAsync")
  @js.native
  def observeAsync(func: Lambda, delay: Double): Lambda = js.native
  @JSImport("mobservable", "observeAsync")
  @js.native
  def observeAsync(func: Lambda, delay: Double, scope: js.Any): Lambda = js.native
  @JSImport("mobservable", "observeAsync")
  @js.native
  def observeAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit]): Lambda = js.native
  @JSImport("mobservable", "observeAsync")
  @js.native
  def observeAsync[T](
    view: js.Function0[T],
    effect: js.Function1[/* latestValue */ T, Unit],
    delay: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): Lambda = js.native
  @JSImport("mobservable", "observeAsync")
  @js.native
  def observeAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Double): Lambda = js.native
  @JSImport("mobservable", "observeAsync")
  @js.native
  def observeAsync[T](
    view: js.Function0[T],
    effect: js.Function1[/* latestValue */ T, Unit],
    delay: Double,
    scope: js.Any
  ): Lambda = js.native
  
  @JSImport("mobservable", "observeUntil")
  @js.native
  def observeUntil(predicate: js.Function0[Boolean], effect: Lambda): Lambda = js.native
  @JSImport("mobservable", "observeUntil")
  @js.native
  def observeUntil(predicate: js.Function0[Boolean], effect: Lambda, scope: js.Any): Lambda = js.native
  
  @JSImport("mobservable", "toJSON")
  @js.native
  def toJSON(source: js.Any): js.Any = js.native
  @JSImport("mobservable", "toJSON")
  @js.native
  def toJSON(source: js.Any, detectCycles: js.UndefOr[scala.Nothing], __alreadySeen: js.Array[js.Tuple2[_, _]]): js.Any = js.native
  @JSImport("mobservable", "toJSON")
  @js.native
  def toJSON(source: js.Any, detectCycles: Boolean): js.Any = js.native
  @JSImport("mobservable", "toJSON")
  @js.native
  def toJSON(source: js.Any, detectCycles: Boolean, __alreadySeen: js.Array[js.Tuple2[_, _]]): js.Any = js.native
  
  @JSImport("mobservable", "transaction")
  @js.native
  def transaction[T](action: js.Function0[T]): T = js.native
  @JSImport("mobservable", "transaction")
  @js.native
  def transaction[T](action: js.Function0[T], thisArg: js.Any): T = js.native
  
  @JSImport("mobservable", "untracked")
  @js.native
  def untracked[T](action: js.Function0[T]): T = js.native
}
