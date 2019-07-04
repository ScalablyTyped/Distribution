package typings
package mobxLib.libApiObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableFactory extends js.Object {
  def apply(): scala.Nothing = js.native
  def apply(target: js.Object, key: java.lang.String): js.Any = js.native
  def apply(target: js.Object, key: java.lang.String, baseDescriptor: stdLib.PropertyDescriptor): js.Any = js.native
  def apply(target: js.Object, key: js.Symbol): js.Any = js.native
  def apply(target: js.Object, key: js.Symbol, baseDescriptor: stdLib.PropertyDescriptor): js.Any = js.native
  def apply(value: java.lang.String): scala.Nothing = js.native
  def apply(value: scala.Boolean): scala.Nothing = js.native
  def apply(value: scala.Double): scala.Nothing = js.native
  def apply[T /* <: js.Object */](value: T): T with mobxLib.libTypesObservableobjectMod.IObservableObject = js.native
  def apply[T /* <: js.Object */](
    value: T,
    decorators: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? std.Function}
    */ mobxLib.mobxLibStrings.IObservableFactory with js.Any
  ): T with mobxLib.libTypesObservableobjectMod.IObservableObject = js.native
  def apply[T /* <: js.Object */](
    value: T,
    decorators: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? std.Function}
    */ mobxLib.mobxLibStrings.IObservableFactory with js.Any,
    options: CreateObservableOptions
  ): T with mobxLib.libTypesObservableobjectMod.IObservableObject = js.native
  def apply[T](value: js.Array[T]): mobxLib.libTypesObservablearrayMod.IObservableArray[T] = js.native
  def apply[T](value: js.Array[T], options: CreateObservableOptions): mobxLib.libTypesObservablearrayMod.IObservableArray[T] = js.native
  def apply[T](value: stdLib.Set[T]): mobxLib.libInternalMod.ObservableSet[T] = js.native
  def apply[T](value: stdLib.Set[T], options: CreateObservableOptions): mobxLib.libInternalMod.ObservableSet[T] = js.native
  def apply[K, V](value: stdLib.Map[K, V]): mobxLib.libInternalMod.ObservableMap[K, V] = js.native
  def apply[K, V](value: stdLib.Map[K, V], options: CreateObservableOptions): mobxLib.libInternalMod.ObservableMap[K, V] = js.native
}

