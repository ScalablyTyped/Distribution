package typings
package mobservableLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def asFlat[T](value: T): T = js.native
  def asReference[T](value: T): T = js.native
  def asStructure[T](value: T): T = js.native
  def assertUnwrapped(value: js.Any, message: js.Any): scala.Unit = js.native
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
  def expr[T](expr: js.Function0[T]): T = js.native
  def expr[T](expr: js.Function0[T], scope: js.Any): T = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B*): A with B = js.native
  def extendObservableHelper(
    target: js.Any,
    properties: js.Any,
    mode: ValueMode,
    context: mobservableLib.libInterfacesMod.IContextInfoStruct
  ): js.Object = js.native
  def fastArray[V](): mobservableLib.libInterfacesMod.IObservableArray[V] = js.native
  def fastArray[V](initialValues: js.Array[V]): mobservableLib.libInterfacesMod.IObservableArray[V] = js.native
  def getStrict(): scala.Boolean = js.native
  def getTypeOfValue(value: js.Any): ValueType = js.native
  def getValueModeFromModifierFunc(): ValueMode = js.native
  def getValueModeFromModifierFunc(func: js.Function): ValueMode = js.native
  def getValueModeFromValue(value: js.Any, defaultMode: ValueMode): js.Tuple2[ValueMode, _] = js.native
  def isObservable(value: js.Any): scala.Boolean = js.native
  def isObservable(value: js.Any, property: java.lang.String): scala.Boolean = js.native
  def isObservableArray(thing: js.Any): scala.Boolean = js.native
  def isObservableMap(thing: js.Any): scala.Boolean = js.native
  def isObservableObject(thing: js.Any): scala.Boolean = js.native
  def makeChildObservable(value: js.Any, parentMode: ValueMode, context: js.Any): js.Any = js.native
  def map[V](): mobservableLib.libObservablemapMod.ObservableMap[V] = js.native
  def map[V](initialValues: mobservableLib.libObservablemapMod.KeyValueMap[V]): mobservableLib.libObservablemapMod.ObservableMap[V] = js.native
  def map[V](initialValues: mobservableLib.libObservablemapMod.KeyValueMap[V], valueModifier: js.Function): mobservableLib.libObservablemapMod.ObservableMap[V] = js.native
  def observable(target: js.Object, key: java.lang.String): js.Any = js.native
  def observable(target: js.Object, key: java.lang.String, baseDescriptor: stdLib.PropertyDescriptor): js.Any = js.native
  def observable(value: java.lang.String): mobservableLib.libInterfacesMod.IObservableValue[java.lang.String] = js.native
  def observable(value: js.Function): mobservableLib.libInterfacesMod.IObservableValue[js.Function] = js.native
  def observable(value: scala.Boolean): mobservableLib.libInterfacesMod.IObservableValue[scala.Boolean] = js.native
  def observable(value: scala.Double): mobservableLib.libInterfacesMod.IObservableValue[scala.Double] = js.native
  def observable(value: scala.Unit): mobservableLib.libInterfacesMod.IObservableValue[scala.Unit] = js.native
  def observable(value: stdLib.Date): mobservableLib.libInterfacesMod.IObservableValue[stdLib.Date] = js.native
  def observable(value: stdLib.RegExp): mobservableLib.libInterfacesMod.IObservableValue[stdLib.RegExp] = js.native
  def observable[T /* <: js.Object */](value: T): T = js.native
  def observable[T](value: js.Array[T]): mobservableLib.libInterfacesMod.IObservableArray[T] = js.native
  def observable[T, S /* <: js.Object */](value: js.Function0[T]): mobservableLib.libInterfacesMod.IObservableValue[T] = js.native
  def observable[T, S /* <: js.Object */](value: js.Function0[T], thisArg: S): mobservableLib.libInterfacesMod.IObservableValue[T] = js.native
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
  def toGetterSetterFunction[T](observable: mobservableLib.libObservablevalueMod.ObservableValue[T]): mobservableLib.libInterfacesMod.IObservableValue[T] = js.native
  def toGetterSetterFunction[T](observable: mobservableLib.libObservableviewMod.ObservableView[T]): mobservableLib.libInterfacesMod.IObservableValue[T] = js.native
  def toJSON(source: js.Any): js.Any = js.native
  def toJSON(source: js.Any, detectCycles: scala.Boolean): js.Any = js.native
  def toJSON(source: js.Any, detectCycles: scala.Boolean, __alreadySeen: js.Array[js.Tuple2[_, _]]): js.Any = js.native
  def withStrict(newStrict: scala.Boolean, func: mobservableLib.libInterfacesMod.Lambda): scala.Unit = js.native
}

