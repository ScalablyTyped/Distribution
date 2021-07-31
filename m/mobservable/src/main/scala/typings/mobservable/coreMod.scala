package typings.mobservable

import typings.mobservable.interfacesMod.IArrayChange
import typings.mobservable.interfacesMod.IArraySplice
import typings.mobservable.interfacesMod.IContextInfoStruct
import typings.mobservable.interfacesMod.IObjectChange
import typings.mobservable.interfacesMod.IObservableArray
import typings.mobservable.interfacesMod.IObservableValue
import typings.mobservable.interfacesMod.Lambda
import typings.mobservable.observablemapMod.KeyValueMap
import typings.mobservable.observablemapMod.ObservableMap
import typings.mobservable.observablevalueMod.ObservableValue
import typings.mobservable.observableviewMod.ObservableView
import typings.std.Date
import typings.std.PropertyDescriptor
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("mobservable/lib/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobservable/lib/core", "AsFlat")
  @js.native
  class AsFlat_ protected () extends StObject {
    def this(value: js.Any) = this()
    
    var value: js.Any = js.native
  }
  
  @JSImport("mobservable/lib/core", "AsReference")
  @js.native
  class AsReference_ protected () extends StObject {
    def this(value: js.Any) = this()
    
    var value: js.Any = js.native
  }
  
  @JSImport("mobservable/lib/core", "AsStructure")
  @js.native
  class AsStructure_ protected () extends StObject {
    def this(value: js.Any) = this()
    
    var value: js.Any = js.native
  }
  
  @js.native
  sealed trait ValueMode extends StObject
  @JSImport("mobservable/lib/core", "ValueMode")
  @js.native
  object ValueMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ValueMode & Double] = js.native
    
    @js.native
    sealed trait Flat
      extends StObject
         with ValueMode
    /* 3 */ val Flat: typings.mobservable.coreMod.ValueMode.Flat & Double = js.native
    
    @js.native
    sealed trait Recursive
      extends StObject
         with ValueMode
    /* 0 */ val Recursive: typings.mobservable.coreMod.ValueMode.Recursive & Double = js.native
    
    @js.native
    sealed trait Reference
      extends StObject
         with ValueMode
    /* 1 */ val Reference: typings.mobservable.coreMod.ValueMode.Reference & Double = js.native
    
    @js.native
    sealed trait Structure
      extends StObject
         with ValueMode
    /* 2 */ val Structure: typings.mobservable.coreMod.ValueMode.Structure & Double = js.native
  }
  
  @js.native
  sealed trait ValueType extends StObject
  @JSImport("mobservable/lib/core", "ValueType")
  @js.native
  object ValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ValueType & Double] = js.native
    
    @js.native
    sealed trait Array
      extends StObject
         with ValueType
    /* 3 */ val Array: typings.mobservable.coreMod.ValueType.Array & Double = js.native
    
    @js.native
    sealed trait ComplexFunction
      extends StObject
         with ValueType
    /* 5 */ val ComplexFunction: typings.mobservable.coreMod.ValueType.ComplexFunction & Double = js.native
    
    @js.native
    sealed trait ComplexObject
      extends StObject
         with ValueType
    /* 2 */ val ComplexObject: typings.mobservable.coreMod.ValueType.ComplexObject & Double = js.native
    
    @js.native
    sealed trait PlainObject
      extends StObject
         with ValueType
    /* 1 */ val PlainObject: typings.mobservable.coreMod.ValueType.PlainObject & Double = js.native
    
    @js.native
    sealed trait Reference
      extends StObject
         with ValueType
    /* 0 */ val Reference: typings.mobservable.coreMod.ValueType.Reference & Double = js.native
    
    @js.native
    sealed trait ViewFunction
      extends StObject
         with ValueType
    /* 4 */ val ViewFunction: typings.mobservable.coreMod.ValueType.ViewFunction & Double = js.native
  }
  
  @scala.inline
  def asFlat[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("asFlat")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def asReference[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("asReference")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def asStructure[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("asStructure")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def assertUnwrapped(value: js.Any, message: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertUnwrapped")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  def expr[T](expr: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("expr")(expr.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def expr[T](expr: js.Function0[T], scope: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("expr")(expr.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B*): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[A & B]
  
  @scala.inline
  def extendObservableHelper(target: js.Any, properties: js.Any, mode: ValueMode, context: IContextInfoStruct): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservableHelper")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def fastArray[V](): IObservableArray[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("fastArray")().asInstanceOf[IObservableArray[V]]
  @scala.inline
  def fastArray[V](initialValues: js.Array[V]): IObservableArray[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("fastArray")(initialValues.asInstanceOf[js.Any]).asInstanceOf[IObservableArray[V]]
  
  @scala.inline
  def getStrict(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getStrict")().asInstanceOf[Boolean]
  
  @scala.inline
  def getTypeOfValue(value: js.Any): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeOfValue")(value.asInstanceOf[js.Any]).asInstanceOf[ValueType]
  
  @scala.inline
  def getValueModeFromModifierFunc(): ValueMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueModeFromModifierFunc")().asInstanceOf[ValueMode]
  @scala.inline
  def getValueModeFromModifierFunc(func: js.Function): ValueMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueModeFromModifierFunc")(func.asInstanceOf[js.Any]).asInstanceOf[ValueMode]
  
  @scala.inline
  def getValueModeFromValue(value: js.Any, defaultMode: ValueMode): js.Tuple2[ValueMode, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueModeFromValue")(value.asInstanceOf[js.Any], defaultMode.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ValueMode, js.Any]]
  
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
  def makeChildObservable(value: js.Any, parentMode: ValueMode, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeChildObservable")(value.asInstanceOf[js.Any], parentMode.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def map[V](): ObservableMap[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")().asInstanceOf[ObservableMap[V]]
  @scala.inline
  def map[V](initialValues: Unit, valueModifier: js.Function): ObservableMap[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(initialValues.asInstanceOf[js.Any], valueModifier.asInstanceOf[js.Any])).asInstanceOf[ObservableMap[V]]
  @scala.inline
  def map[V](initialValues: KeyValueMap[V]): ObservableMap[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(initialValues.asInstanceOf[js.Any]).asInstanceOf[ObservableMap[V]]
  @scala.inline
  def map[V](initialValues: KeyValueMap[V], valueModifier: js.Function): ObservableMap[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(initialValues.asInstanceOf[js.Any], valueModifier.asInstanceOf[js.Any])).asInstanceOf[ObservableMap[V]]
  
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
    observableMap: ObservableMap[T],
    listener: js.Function1[/* change */ IObjectChange[T, ObservableMap[T]], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def observe[T /* <: js.Object */, Y](
    `object`: T,
    prop: String,
    listener: js.Function2[/* newValue */ Y, /* oldValue */ js.UndefOr[Y], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  @scala.inline
  def toGetterSetterFunction[T](observable: ObservableValue[T]): IObservableValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toGetterSetterFunction")(observable.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[T]]
  @scala.inline
  def toGetterSetterFunction[T](observable: ObservableView[T]): IObservableValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toGetterSetterFunction")(observable.asInstanceOf[js.Any]).asInstanceOf[IObservableValue[T]]
  
  @scala.inline
  def toJSON(source: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(source.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def toJSON(source: js.Any, detectCycles: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(source.asInstanceOf[js.Any], detectCycles.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def toJSON(source: js.Any, detectCycles: Boolean, __alreadySeen: js.Array[js.Tuple2[js.Any, js.Any]]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(source.asInstanceOf[js.Any], detectCycles.asInstanceOf[js.Any], __alreadySeen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def toJSON(source: js.Any, detectCycles: Unit, __alreadySeen: js.Array[js.Tuple2[js.Any, js.Any]]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(source.asInstanceOf[js.Any], detectCycles.asInstanceOf[js.Any], __alreadySeen.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def withStrict(newStrict: Boolean, func: Lambda): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("withStrict")(newStrict.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
