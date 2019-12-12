package typings.mobservable

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typings.mobservable.libInterfacesMod.IArrayChange
import typings.mobservable.libInterfacesMod.IArraySplice
import typings.mobservable.libInterfacesMod.IDependencyTree
import typings.mobservable.libInterfacesMod.IObjectChange
import typings.mobservable.libInterfacesMod.IObservableArray
import typings.mobservable.libInterfacesMod.IObservableValue
import typings.mobservable.libInterfacesMod.IObserverTree
import typings.mobservable.libInterfacesMod.ITransitionEvent
import typings.mobservable.libInterfacesMod.Lambda
import typings.mobservable.libObservablemapMod.Entries
import typings.mobservable.libObservablemapMod.KeyValueMap
import typings.mobservable.libSimpleeventemitterMod.default
import typings.mobservable.libTransformMod.ITransformer
import typings.std.Date
import typings.std.PropertyDescriptor
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable", JSImport.Namespace)
@js.native
object mobservableMod extends js.Object {
  @js.native
  class ObservableMap[V] ()
    extends typings.mobservable.libObservablemapMod.ObservableMap[V] {
    def this(initialData: Entries[V]) = this()
    def this(initialData: KeyValueMap[V]) = this()
    def this(initialData: Entries[V], valueModeFunc: js.Function) = this()
    def this(initialData: KeyValueMap[V], valueModeFunc: js.Function) = this()
  }
  
  def asFlat[T](value: T): T = js.native
  def asReference[T](value: T): T = js.native
  def asStructure[T](value: T): T = js.native
  def autorun(view: Lambda): Lambda = js.native
  def autorun(view: Lambda, scope: js.Any): Lambda = js.native
  def autorunAsync(func: Lambda): Lambda = js.native
  def autorunAsync(func: Lambda, delay: Double): Lambda = js.native
  def autorunAsync(func: Lambda, delay: Double, scope: js.Any): Lambda = js.native
  def autorunAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit]): Lambda = js.native
  def autorunAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Double): Lambda = js.native
  def autorunAsync[T](
    view: js.Function0[T],
    effect: js.Function1[/* latestValue */ T, Unit],
    delay: Double,
    scope: js.Any
  ): Lambda = js.native
  def autorunUntil(predicate: js.Function0[Boolean], effect: Lambda): Lambda = js.native
  def autorunUntil(predicate: js.Function0[Boolean], effect: Lambda, scope: js.Any): Lambda = js.native
  def createTransformer[A, B](transformer: ITransformer[A, B]): ITransformer[A, B] = js.native
  def createTransformer[A, B](
    transformer: ITransformer[A, B],
    onCleanup: js.Function2[/* resultObject */ B, /* sourceObject */ js.UndefOr[A], Unit]
  ): ITransformer[A, B] = js.native
  def expr[T](expr: js.Function0[T]): T = js.native
  def expr[T](expr: js.Function0[T], scope: js.Any): T = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B*): A with B = js.native
  def extendReactive[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B*): A with B = js.native
  def fastArray[V](): IObservableArray[V] = js.native
  def fastArray[V](initialValues: js.Array[V]): IObservableArray[V] = js.native
  def isObservable(value: js.Any): Boolean = js.native
  def isObservable(value: js.Any, property: String): Boolean = js.native
  def isObservableArray(thing: js.Any): Boolean = js.native
  def isObservableMap(thing: js.Any): Boolean = js.native
  def isObservableObject(thing: js.Any): Boolean = js.native
  def isReactive(value: js.Any): Boolean = js.native
  def isReactive(value: js.Any, property: String): Boolean = js.native
  def makeReactive(target: js.Object, key: String): js.Any = js.native
  def makeReactive(target: js.Object, key: String, baseDescriptor: PropertyDescriptor): js.Any = js.native
  def makeReactive(value: String): IObservableValue[String] = js.native
  def makeReactive(value: js.Function): IObservableValue[js.Function] = js.native
  def makeReactive(value: Boolean): IObservableValue[Boolean] = js.native
  def makeReactive(value: Double): IObservableValue[Double] = js.native
  def makeReactive(value: Unit): IObservableValue[Unit] = js.native
  def makeReactive(value: Date): IObservableValue[Date] = js.native
  def makeReactive(value: RegExp): IObservableValue[RegExp] = js.native
  def makeReactive[T /* <: js.Object */](value: T): T = js.native
  def makeReactive[T](value: js.Array[T]): IObservableArray[T] = js.native
  def makeReactive[T, S /* <: js.Object */](value: js.Function0[T]): IObservableValue[T] = js.native
  def makeReactive[T, S /* <: js.Object */](value: js.Function0[T], thisArg: S): IObservableValue[T] = js.native
  def map[V](): typings.mobservable.libObservablemapMod.ObservableMap[V] = js.native
  def map[V](initialValues: KeyValueMap[V]): typings.mobservable.libObservablemapMod.ObservableMap[V] = js.native
  def map[V](initialValues: KeyValueMap[V], valueModifier: js.Function): typings.mobservable.libObservablemapMod.ObservableMap[V] = js.native
  def observable(target: js.Object, key: String): js.Any = js.native
  def observable(target: js.Object, key: String, baseDescriptor: PropertyDescriptor): js.Any = js.native
  def observable(value: String): IObservableValue[String] = js.native
  def observable(value: js.Function): IObservableValue[js.Function] = js.native
  def observable(value: Boolean): IObservableValue[Boolean] = js.native
  def observable(value: Double): IObservableValue[Double] = js.native
  def observable(value: Unit): IObservableValue[Unit] = js.native
  def observable(value: Date): IObservableValue[Date] = js.native
  def observable(value: RegExp): IObservableValue[RegExp] = js.native
  def observable[T /* <: js.Object */](value: T): T = js.native
  def observable[T](value: js.Array[T]): IObservableArray[T] = js.native
  def observable[T, S /* <: js.Object */](value: js.Function0[T]): IObservableValue[T] = js.native
  def observable[T, S /* <: js.Object */](value: js.Function0[T], thisArg: S): IObservableValue[T] = js.native
  def observe(func: js.Function0[Unit]): Lambda = js.native
  def observe[T /* <: js.Object */](`object`: T, listener: js.Function1[/* change */ IObjectChange[_, T], Unit]): Lambda = js.native
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = js.native
  def observe[T](
    observableMap: typings.mobservable.libObservablemapMod.ObservableMap[T],
    listener: js.Function1[
      /* change */ IObjectChange[T, typings.mobservable.libObservablemapMod.ObservableMap[T]], 
      Unit
    ]
  ): Lambda = js.native
  def observe[T /* <: js.Object */, Y](
    `object`: T,
    prop: String,
    listener: js.Function2[/* newValue */ Y, /* oldValue */ js.UndefOr[Y], Unit]
  ): Lambda = js.native
  def observeAsync(func: Lambda): Lambda = js.native
  def observeAsync(func: Lambda, delay: Double): Lambda = js.native
  def observeAsync(func: Lambda, delay: Double, scope: js.Any): Lambda = js.native
  def observeAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit]): Lambda = js.native
  def observeAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Double): Lambda = js.native
  def observeAsync[T](
    view: js.Function0[T],
    effect: js.Function1[/* latestValue */ T, Unit],
    delay: Double,
    scope: js.Any
  ): Lambda = js.native
  def observeUntil(predicate: js.Function0[Boolean], effect: Lambda): Lambda = js.native
  def observeUntil(predicate: js.Function0[Boolean], effect: Lambda, scope: js.Any): Lambda = js.native
  def toJSON(source: js.Any): js.Any = js.native
  def toJSON(source: js.Any, detectCycles: Boolean): js.Any = js.native
  def toJSON(source: js.Any, detectCycles: Boolean, __alreadySeen: js.Array[js.Tuple2[_, _]]): js.Any = js.native
  def transaction[T](action: js.Function0[T]): T = js.native
  def transaction[T](action: js.Function0[T], thisArg: js.Any): T = js.native
  def untracked[T](action: js.Function0[T]): T = js.native
  @js.native
  object `_` extends js.Object {
    def isComputingView(): Boolean = js.native
    def quickDiff[T](current: js.Array[T], base: js.Array[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  }
  
  @js.native
  object extras extends js.Object {
    @js.native
    class SimpleEventEmitter () extends default
    
    def getDNode(thing: js.Any): js.Any = js.native
    def getDependencyTree(thing: js.Any): IDependencyTree = js.native
    def getDependencyTree(thing: js.Any, property: String): IDependencyTree = js.native
    def getObserverTree(thing: js.Any): IObserverTree = js.native
    def getObserverTree(thing: js.Any, property: String): IObserverTree = js.native
    def trackTransitions(): Lambda = js.native
    def trackTransitions(extensive: Boolean): Lambda = js.native
    def trackTransitions(extensive: Boolean, onReport: js.Function1[/* lines */ ITransitionEvent, Unit]): Lambda = js.native
    def withStrict(newStrict: Boolean, func: Lambda): Unit = js.native
    @js.native
    object SimpleEventEmitter extends TopLevel[Instantiable0[default]]
    
  }
  
}

