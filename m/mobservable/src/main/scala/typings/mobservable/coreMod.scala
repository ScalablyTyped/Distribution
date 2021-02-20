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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
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
    def apply(value: Double): js.UndefOr[ValueMode with Double] = js.native
    
    @js.native
    sealed trait Flat extends ValueMode
    /* 3 */ val Flat: typings.mobservable.coreMod.ValueMode.Flat with Double = js.native
    
    @js.native
    sealed trait Recursive extends ValueMode
    /* 0 */ val Recursive: typings.mobservable.coreMod.ValueMode.Recursive with Double = js.native
    
    @js.native
    sealed trait Reference extends ValueMode
    /* 1 */ val Reference: typings.mobservable.coreMod.ValueMode.Reference with Double = js.native
    
    @js.native
    sealed trait Structure extends ValueMode
    /* 2 */ val Structure: typings.mobservable.coreMod.ValueMode.Structure with Double = js.native
  }
  
  @js.native
  sealed trait ValueType extends StObject
  @JSImport("mobservable/lib/core", "ValueType")
  @js.native
  object ValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ValueType with Double] = js.native
    
    @js.native
    sealed trait Array extends ValueType
    /* 3 */ val Array: typings.mobservable.coreMod.ValueType.Array with Double = js.native
    
    @js.native
    sealed trait ComplexFunction extends ValueType
    /* 5 */ val ComplexFunction: typings.mobservable.coreMod.ValueType.ComplexFunction with Double = js.native
    
    @js.native
    sealed trait ComplexObject extends ValueType
    /* 2 */ val ComplexObject: typings.mobservable.coreMod.ValueType.ComplexObject with Double = js.native
    
    @js.native
    sealed trait PlainObject extends ValueType
    /* 1 */ val PlainObject: typings.mobservable.coreMod.ValueType.PlainObject with Double = js.native
    
    @js.native
    sealed trait Reference extends ValueType
    /* 0 */ val Reference: typings.mobservable.coreMod.ValueType.Reference with Double = js.native
    
    @js.native
    sealed trait ViewFunction extends ValueType
    /* 4 */ val ViewFunction: typings.mobservable.coreMod.ValueType.ViewFunction with Double = js.native
  }
  
  @JSImport("mobservable/lib/core", "asFlat")
  @js.native
  def asFlat[T](value: T): T = js.native
  
  @JSImport("mobservable/lib/core", "asReference")
  @js.native
  def asReference[T](value: T): T = js.native
  
  @JSImport("mobservable/lib/core", "asStructure")
  @js.native
  def asStructure[T](value: T): T = js.native
  
  @JSImport("mobservable/lib/core", "assertUnwrapped")
  @js.native
  def assertUnwrapped(value: js.Any, message: js.Any): Unit = js.native
  
  @JSImport("mobservable/lib/core", "autorun")
  @js.native
  def autorun(view: Lambda): Lambda = js.native
  @JSImport("mobservable/lib/core", "autorun")
  @js.native
  def autorun(view: Lambda, scope: js.Any): Lambda = js.native
  
  @JSImport("mobservable/lib/core", "autorunAsync")
  @js.native
  def autorunAsync(func: Lambda): Lambda = js.native
  @JSImport("mobservable/lib/core", "autorunAsync")
  @js.native
  def autorunAsync(func: Lambda, delay: js.UndefOr[scala.Nothing], scope: js.Any): Lambda = js.native
  @JSImport("mobservable/lib/core", "autorunAsync")
  @js.native
  def autorunAsync(func: Lambda, delay: Double): Lambda = js.native
  @JSImport("mobservable/lib/core", "autorunAsync")
  @js.native
  def autorunAsync(func: Lambda, delay: Double, scope: js.Any): Lambda = js.native
  @JSImport("mobservable/lib/core", "autorunAsync")
  @js.native
  def autorunAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit]): Lambda = js.native
  @JSImport("mobservable/lib/core", "autorunAsync")
  @js.native
  def autorunAsync[T](
    view: js.Function0[T],
    effect: js.Function1[/* latestValue */ T, Unit],
    delay: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): Lambda = js.native
  @JSImport("mobservable/lib/core", "autorunAsync")
  @js.native
  def autorunAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Double): Lambda = js.native
  @JSImport("mobservable/lib/core", "autorunAsync")
  @js.native
  def autorunAsync[T](
    view: js.Function0[T],
    effect: js.Function1[/* latestValue */ T, Unit],
    delay: Double,
    scope: js.Any
  ): Lambda = js.native
  
  @JSImport("mobservable/lib/core", "autorunUntil")
  @js.native
  def autorunUntil(predicate: js.Function0[Boolean], effect: Lambda): Lambda = js.native
  @JSImport("mobservable/lib/core", "autorunUntil")
  @js.native
  def autorunUntil(predicate: js.Function0[Boolean], effect: Lambda, scope: js.Any): Lambda = js.native
  
  @JSImport("mobservable/lib/core", "expr")
  @js.native
  def expr[T](expr: js.Function0[T]): T = js.native
  @JSImport("mobservable/lib/core", "expr")
  @js.native
  def expr[T](expr: js.Function0[T], scope: js.Any): T = js.native
  
  @JSImport("mobservable/lib/core", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B*): A with B = js.native
  
  @JSImport("mobservable/lib/core", "extendObservableHelper")
  @js.native
  def extendObservableHelper(target: js.Any, properties: js.Any, mode: ValueMode, context: IContextInfoStruct): js.Object = js.native
  
  @JSImport("mobservable/lib/core", "fastArray")
  @js.native
  def fastArray[V](): IObservableArray[V] = js.native
  @JSImport("mobservable/lib/core", "fastArray")
  @js.native
  def fastArray[V](initialValues: js.Array[V]): IObservableArray[V] = js.native
  
  @JSImport("mobservable/lib/core", "getStrict")
  @js.native
  def getStrict(): Boolean = js.native
  
  @JSImport("mobservable/lib/core", "getTypeOfValue")
  @js.native
  def getTypeOfValue(value: js.Any): ValueType = js.native
  
  @JSImport("mobservable/lib/core", "getValueModeFromModifierFunc")
  @js.native
  def getValueModeFromModifierFunc(): ValueMode = js.native
  @JSImport("mobservable/lib/core", "getValueModeFromModifierFunc")
  @js.native
  def getValueModeFromModifierFunc(func: js.Function): ValueMode = js.native
  
  @JSImport("mobservable/lib/core", "getValueModeFromValue")
  @js.native
  def getValueModeFromValue(value: js.Any, defaultMode: ValueMode): js.Tuple2[ValueMode, _] = js.native
  
  @JSImport("mobservable/lib/core", "isObservable")
  @js.native
  def isObservable(value: js.Any): Boolean = js.native
  @JSImport("mobservable/lib/core", "isObservable")
  @js.native
  def isObservable(value: js.Any, property: String): Boolean = js.native
  
  @JSImport("mobservable/lib/core", "isObservableArray")
  @js.native
  def isObservableArray(thing: js.Any): Boolean = js.native
  
  @JSImport("mobservable/lib/core", "isObservableMap")
  @js.native
  def isObservableMap(thing: js.Any): Boolean = js.native
  
  @JSImport("mobservable/lib/core", "isObservableObject")
  @js.native
  def isObservableObject(thing: js.Any): Boolean = js.native
  
  @JSImport("mobservable/lib/core", "makeChildObservable")
  @js.native
  def makeChildObservable(value: js.Any, parentMode: ValueMode, context: js.Any): js.Any = js.native
  
  @JSImport("mobservable/lib/core", "map")
  @js.native
  def map[V](): ObservableMap[V] = js.native
  @JSImport("mobservable/lib/core", "map")
  @js.native
  def map[V](initialValues: js.UndefOr[scala.Nothing], valueModifier: js.Function): ObservableMap[V] = js.native
  @JSImport("mobservable/lib/core", "map")
  @js.native
  def map[V](initialValues: KeyValueMap[V]): ObservableMap[V] = js.native
  @JSImport("mobservable/lib/core", "map")
  @js.native
  def map[V](initialValues: KeyValueMap[V], valueModifier: js.Function): ObservableMap[V] = js.native
  
  @JSImport("mobservable/lib/core", "observable")
  @js.native
  def observable(target: js.Object, key: String): js.Any = js.native
  @JSImport("mobservable/lib/core", "observable")
  @js.native
  def observable(target: js.Object, key: String, baseDescriptor: PropertyDescriptor): js.Any = js.native
  @JSImport("mobservable/lib/core", "observable")
  @js.native
  def observable(value: String): IObservableValue[String] = js.native
  @JSImport("mobservable/lib/core", "observable")
  @js.native
  def observable(value: js.Function): IObservableValue[js.Function] = js.native
  @JSImport("mobservable/lib/core", "observable")
  @js.native
  def observable(value: Boolean): IObservableValue[Boolean] = js.native
  @JSImport("mobservable/lib/core", "observable")
  @js.native
  def observable(value: Double): IObservableValue[Double] = js.native
  @JSImport("mobservable/lib/core", "observable")
  @js.native
  def observable(value: Unit): IObservableValue[Unit] = js.native
  @JSImport("mobservable/lib/core", "observable")
  @js.native
  def observable(value: Date): IObservableValue[Date] = js.native
  @JSImport("mobservable/lib/core", "observable")
  @js.native
  def observable(value: RegExp): IObservableValue[RegExp] = js.native
  @JSImport("mobservable/lib/core", "observable")
  @js.native
  def observable[T /* <: js.Object */](value: T): T = js.native
  @JSImport("mobservable/lib/core", "observable")
  @js.native
  def observable[T](value: js.Array[T]): IObservableArray[T] = js.native
  @JSImport("mobservable/lib/core", "observable")
  @js.native
  def observable[T, S /* <: js.Object */](value: js.Function0[T]): IObservableValue[T] = js.native
  @JSImport("mobservable/lib/core", "observable")
  @js.native
  def observable[T, S /* <: js.Object */](value: js.Function0[T], thisArg: S): IObservableValue[T] = js.native
  
  @JSImport("mobservable/lib/core", "observe")
  @js.native
  def observe(func: js.Function0[Unit]): Lambda = js.native
  @JSImport("mobservable/lib/core", "observe")
  @js.native
  def observe[T /* <: js.Object */](`object`: T, listener: js.Function1[/* change */ IObjectChange[_, T], Unit]): Lambda = js.native
  @JSImport("mobservable/lib/core", "observe")
  @js.native
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = js.native
  @JSImport("mobservable/lib/core", "observe")
  @js.native
  def observe[T](
    observableMap: ObservableMap[T],
    listener: js.Function1[/* change */ IObjectChange[T, ObservableMap[T]], Unit]
  ): Lambda = js.native
  @JSImport("mobservable/lib/core", "observe")
  @js.native
  def observe[T /* <: js.Object */, Y](
    `object`: T,
    prop: String,
    listener: js.Function2[/* newValue */ Y, /* oldValue */ js.UndefOr[Y], Unit]
  ): Lambda = js.native
  
  @JSImport("mobservable/lib/core", "toGetterSetterFunction")
  @js.native
  def toGetterSetterFunction[T](observable: ObservableValue[T]): IObservableValue[T] = js.native
  @JSImport("mobservable/lib/core", "toGetterSetterFunction")
  @js.native
  def toGetterSetterFunction[T](observable: ObservableView[T]): IObservableValue[T] = js.native
  
  @JSImport("mobservable/lib/core", "toJSON")
  @js.native
  def toJSON(source: js.Any): js.Any = js.native
  @JSImport("mobservable/lib/core", "toJSON")
  @js.native
  def toJSON(source: js.Any, detectCycles: js.UndefOr[scala.Nothing], __alreadySeen: js.Array[js.Tuple2[_, _]]): js.Any = js.native
  @JSImport("mobservable/lib/core", "toJSON")
  @js.native
  def toJSON(source: js.Any, detectCycles: Boolean): js.Any = js.native
  @JSImport("mobservable/lib/core", "toJSON")
  @js.native
  def toJSON(source: js.Any, detectCycles: Boolean, __alreadySeen: js.Array[js.Tuple2[_, _]]): js.Any = js.native
  
  @JSImport("mobservable/lib/core", "withStrict")
  @js.native
  def withStrict(newStrict: Boolean, func: Lambda): Unit = js.native
}
