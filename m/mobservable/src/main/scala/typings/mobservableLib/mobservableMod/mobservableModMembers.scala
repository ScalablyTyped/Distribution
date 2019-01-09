package typings
package mobservableLib.mobservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable", JSImport.Namespace)
@js.native
object mobservableModMembers extends js.Object {
  val `_`: mobservableLib.Anon_Base = js.native
  val extras: mobservableLib.Anon_Extensive = js.native
  def asFlat[T](value: T): T = js.native
  def asReference[T](value: T): T = js.native
  def asStructure[T](value: T): T = js.native
  def autorun(view: mobservableLib.libInterfacesMod.Lambda): mobservableLib.libInterfacesMod.Lambda = js.native
  def autorun(view: mobservableLib.libInterfacesMod.Lambda, scope: js.Any): mobservableLib.libInterfacesMod.Lambda = js.native
  def autorunAsync(func: mobservableLib.libInterfacesMod.Lambda): mobservableLib.libInterfacesMod.Lambda = js.native
  def autorunAsync(func: mobservableLib.libInterfacesMod.Lambda, delay: scala.Double): mobservableLib.libInterfacesMod.Lambda = js.native
  def autorunAsync(func: mobservableLib.libInterfacesMod.Lambda, delay: scala.Double, scope: js.Any): mobservableLib.libInterfacesMod.Lambda = js.native
  def autorunAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, scala.Unit]): mobservableLib.libInterfacesMod.Lambda = js.native
  def autorunAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, scala.Unit], delay: scala.Double): mobservableLib.libInterfacesMod.Lambda = js.native
  def autorunAsync[T](
    view: js.Function0[T],
    effect: js.Function1[/* latestValue */ T, scala.Unit],
    delay: scala.Double,
    scope: js.Any
  ): mobservableLib.libInterfacesMod.Lambda = js.native
  def autorunUntil(predicate: js.Function0[scala.Boolean], effect: mobservableLib.libInterfacesMod.Lambda): mobservableLib.libInterfacesMod.Lambda = js.native
  def autorunUntil(
    predicate: js.Function0[scala.Boolean],
    effect: mobservableLib.libInterfacesMod.Lambda,
    scope: js.Any
  ): mobservableLib.libInterfacesMod.Lambda = js.native
  def createTransformer[A, B](transformer: mobservableLib.libTransformMod.ITransformer[A, B]): mobservableLib.libTransformMod.ITransformer[A, B] = js.native
  def createTransformer[A, B](
    transformer: mobservableLib.libTransformMod.ITransformer[A, B],
    onCleanup: js.Function2[/* resultObject */ B, /* sourceObject */ js.UndefOr[A], scala.Unit]
  ): mobservableLib.libTransformMod.ITransformer[A, B] = js.native
  def expr[T](expr: js.Function0[T]): T = js.native
  def expr[T](expr: js.Function0[T], scope: js.Any): T = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B*): A with B = js.native
  def extendReactive[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B*): A with B = js.native
  def fastArray[V](): mobservableLib.libInterfacesMod.IObservableArray[V] = js.native
  def fastArray[V](initialValues: js.Array[V]): mobservableLib.libInterfacesMod.IObservableArray[V] = js.native
  def isObservable(value: js.Any): scala.Boolean = js.native
  def isObservable(value: js.Any, property: java.lang.String): scala.Boolean = js.native
  def isObservableArray(thing: js.Any): scala.Boolean = js.native
  def isObservableMap(thing: js.Any): scala.Boolean = js.native
  def isObservableObject(thing: js.Any): scala.Boolean = js.native
  def isReactive(value: js.Any): scala.Boolean = js.native
  def isReactive(value: js.Any, property: java.lang.String): scala.Boolean = js.native
  def makeReactive(target: js.Object, key: java.lang.String): js.Any = js.native
  def makeReactive(target: js.Object, key: java.lang.String, baseDescriptor: stdLib.PropertyDescriptor): js.Any = js.native
  def makeReactive[T /* <: java.lang.String | scala.Double | scala.Boolean | stdLib.Date | stdLib.RegExp | js.Function | scala.Unit */](value: T): mobservableLib.libInterfacesMod.IObservableValue[T] = js.native
  def makeReactive[T](value: js.Array[T]): mobservableLib.libInterfacesMod.IObservableArray[T] = js.native
  def makeReactive[T, S /* <: js.Object */](value: js.Function0[T]): mobservableLib.libInterfacesMod.IObservableValue[T] = js.native
  def makeReactive[T, S /* <: js.Object */](value: js.Function0[T], thisArg: S): mobservableLib.libInterfacesMod.IObservableValue[T] = js.native
  @JSName("makeReactive")
  def makeReactive_TObjectT[T /* <: js.Object */](value: T): T = js.native
  def map[V](): mobservableLib.libObservablemapMod.ObservableMap[V] = js.native
  def map[V](initialValues: mobservableLib.libObservablemapMod.KeyValueMap[V]): mobservableLib.libObservablemapMod.ObservableMap[V] = js.native
  def map[V](initialValues: mobservableLib.libObservablemapMod.KeyValueMap[V], valueModifier: js.Function): mobservableLib.libObservablemapMod.ObservableMap[V] = js.native
  def observable(target: js.Object, key: java.lang.String): js.Any = js.native
  def observable(target: js.Object, key: java.lang.String, baseDescriptor: stdLib.PropertyDescriptor): js.Any = js.native
  def observable[T /* <: java.lang.String | scala.Double | scala.Boolean | stdLib.Date | stdLib.RegExp | js.Function | scala.Unit */](value: T): mobservableLib.libInterfacesMod.IObservableValue[T] = js.native
  def observable[T](value: js.Array[T]): mobservableLib.libInterfacesMod.IObservableArray[T] = js.native
  def observable[T, S /* <: js.Object */](value: js.Function0[T]): mobservableLib.libInterfacesMod.IObservableValue[T] = js.native
  def observable[T, S /* <: js.Object */](value: js.Function0[T], thisArg: S): mobservableLib.libInterfacesMod.IObservableValue[T] = js.native
  @JSName("observable")
  def observable_TObjectT[T /* <: js.Object */](value: T): T = js.native
  def observe(func: js.Function0[scala.Unit]): mobservableLib.libInterfacesMod.Lambda = js.native
  def observe[T /* <: js.Object */](
    `object`: T,
    listener: js.Function1[/* change */ mobservableLib.libInterfacesMod.IObjectChange[_, T], scala.Unit]
  ): mobservableLib.libInterfacesMod.Lambda = js.native
  def observe[T](
    observableArray: mobservableLib.libInterfacesMod.IObservableArray[T],
    listener: js.Function1[
      /* change */ mobservableLib.libInterfacesMod.IArrayChange[T] | mobservableLib.libInterfacesMod.IArraySplice[T], 
      scala.Unit
    ]
  ): mobservableLib.libInterfacesMod.Lambda = js.native
  def observe[T](
    observableMap: mobservableLib.libObservablemapMod.ObservableMap[T],
    listener: js.Function1[
      /* change */ mobservableLib.libInterfacesMod.IObjectChange[T, mobservableLib.libObservablemapMod.ObservableMap[T]], 
      scala.Unit
    ]
  ): mobservableLib.libInterfacesMod.Lambda = js.native
  def observe[T /* <: js.Object */, Y](
    `object`: T,
    prop: java.lang.String,
    listener: js.Function2[/* newValue */ Y, /* oldValue */ js.UndefOr[Y], scala.Unit]
  ): mobservableLib.libInterfacesMod.Lambda = js.native
  def observeAsync(func: mobservableLib.libInterfacesMod.Lambda): mobservableLib.libInterfacesMod.Lambda = js.native
  def observeAsync(func: mobservableLib.libInterfacesMod.Lambda, delay: scala.Double): mobservableLib.libInterfacesMod.Lambda = js.native
  def observeAsync(func: mobservableLib.libInterfacesMod.Lambda, delay: scala.Double, scope: js.Any): mobservableLib.libInterfacesMod.Lambda = js.native
  def observeAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, scala.Unit]): mobservableLib.libInterfacesMod.Lambda = js.native
  def observeAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, scala.Unit], delay: scala.Double): mobservableLib.libInterfacesMod.Lambda = js.native
  def observeAsync[T](
    view: js.Function0[T],
    effect: js.Function1[/* latestValue */ T, scala.Unit],
    delay: scala.Double,
    scope: js.Any
  ): mobservableLib.libInterfacesMod.Lambda = js.native
  def observeUntil(predicate: js.Function0[scala.Boolean], effect: mobservableLib.libInterfacesMod.Lambda): mobservableLib.libInterfacesMod.Lambda = js.native
  def observeUntil(
    predicate: js.Function0[scala.Boolean],
    effect: mobservableLib.libInterfacesMod.Lambda,
    scope: js.Any
  ): mobservableLib.libInterfacesMod.Lambda = js.native
  def toJSON(source: js.Any): js.Any = js.native
  def toJSON(source: js.Any, detectCycles: scala.Boolean): js.Any = js.native
  def toJSON(source: js.Any, detectCycles: scala.Boolean, __alreadySeen: js.Array[js.Tuple2[_, _]]): js.Any = js.native
  def transaction[T](action: js.Function0[T]): T = js.native
  def transaction[T](action: js.Function0[T], thisArg: js.Any): T = js.native
  def untracked[T](action: js.Function0[T]): T = js.native
}

