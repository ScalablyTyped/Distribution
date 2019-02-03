package typings
package mobxLib.libApiObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableFactories extends js.Object {
  @JSName("deep")
  var deep_Original: mobxLib.libApiObservabledecoratorMod.IObservableDecorator = js.native
  /**
    * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
    */
  @JSName("ref")
  var ref_Original: mobxLib.libApiObservabledecoratorMod.IObservableDecorator = js.native
  /**
    * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
    */
  @JSName("shallow")
  var shallow_Original: mobxLib.libApiObservabledecoratorMod.IObservableDecorator = js.native
  @JSName("struct")
  var struct_Original: mobxLib.libApiObservabledecoratorMod.IObservableDecorator = js.native
  def array[T](): mobxLib.libTypesObservablearrayMod.IObservableArray[T] = js.native
  def array[T](initialValues: js.Array[T]): mobxLib.libTypesObservablearrayMod.IObservableArray[T] = js.native
  def array[T](initialValues: js.Array[T], options: CreateObservableOptions): mobxLib.libTypesObservablearrayMod.IObservableArray[T] = js.native
  def box[T](): mobxLib.libTypesObservablevalueMod.IObservableValue[T] = js.native
  def box[T](value: T): mobxLib.libTypesObservablevalueMod.IObservableValue[T] = js.native
  def box[T](value: T, options: CreateObservableOptions): mobxLib.libTypesObservablevalueMod.IObservableValue[T] = js.native
  def deep(target: js.Object, property: java.lang.String): scala.Unit = js.native
  def deep(target: js.Object, property: java.lang.String, descriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
  def deep(target: js.Object, property: js.Symbol): scala.Unit = js.native
  def deep(target: js.Object, property: js.Symbol, descriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
  def map[K, V](): mobxLib.libInternalMod.ObservableMap[K, V] = js.native
  def map[K, V](initialValues: mobxLib.libTypesObservablemapMod.IObservableMapInitialValues[K, V]): mobxLib.libInternalMod.ObservableMap[K, V] = js.native
  def map[K, V](
    initialValues: mobxLib.libTypesObservablemapMod.IObservableMapInitialValues[K, V],
    options: CreateObservableOptions
  ): mobxLib.libInternalMod.ObservableMap[K, V] = js.native
  def `object`[T](props: T): T with mobxLib.libTypesObservableobjectMod.IObservableObject = js.native
  def `object`[T](
    props: T,
    decorators: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? std.Function}
    */ mobxLib.mobxLibStrings.IObservableFactories with js.Any
  ): T with mobxLib.libTypesObservableobjectMod.IObservableObject = js.native
  def `object`[T](
    props: T,
    decorators: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? std.Function}
    */ mobxLib.mobxLibStrings.IObservableFactories with js.Any,
    options: CreateObservableOptions
  ): T with mobxLib.libTypesObservableobjectMod.IObservableObject = js.native
  /**
    * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
    */
  def ref(target: js.Object, property: java.lang.String): scala.Unit = js.native
  def ref(target: js.Object, property: java.lang.String, descriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
  def ref(target: js.Object, property: js.Symbol): scala.Unit = js.native
  def ref(target: js.Object, property: js.Symbol, descriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
  def set[T](): mobxLib.libInternalMod.ObservableSet[T] = js.native
  def set[T](initialValues: mobxLib.libTypesObservablesetMod.IObservableSetInitialValues[T]): mobxLib.libInternalMod.ObservableSet[T] = js.native
  def set[T](
    initialValues: mobxLib.libTypesObservablesetMod.IObservableSetInitialValues[T],
    options: CreateObservableOptions
  ): mobxLib.libInternalMod.ObservableSet[T] = js.native
  /**
    * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
    */
  def shallow(target: js.Object, property: java.lang.String): scala.Unit = js.native
  def shallow(target: js.Object, property: java.lang.String, descriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
  def shallow(target: js.Object, property: js.Symbol): scala.Unit = js.native
  def shallow(target: js.Object, property: js.Symbol, descriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
  def struct(target: js.Object, property: java.lang.String): scala.Unit = js.native
  def struct(target: js.Object, property: java.lang.String, descriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
  def struct(target: js.Object, property: js.Symbol): scala.Unit = js.native
  def struct(target: js.Object, property: js.Symbol, descriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
}

