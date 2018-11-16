package typings
package mobxLib.libApiComputedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComputed extends js.Object {
  def apply(target: js.Object, key: java.lang.String): scala.Unit = js.native
  def apply(target: js.Object, key: java.lang.String, baseDescriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
  def apply(target: js.Object, key: js.Symbol): scala.Unit = js.native
  def apply(target: js.Object, key: js.Symbol, baseDescriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
  def apply[T](func: js.Function0[T]): mobxLib.libCoreComputedvalueMod.IComputedValue[T] = js.native
  def apply[T](func: js.Function0[T], options: mobxLib.libCoreComputedvalueMod.IComputedValueOptions[T]): mobxLib.libCoreComputedvalueMod.IComputedValue[T] = js.native
  def apply[T](func: js.Function0[T], setter: js.Function1[/* v */ T, scala.Unit]): mobxLib.libCoreComputedvalueMod.IComputedValue[T] = js.native
  def apply[T](options: mobxLib.libCoreComputedvalueMod.IComputedValueOptions[T]): js.Any = js.native
  def struct(target: js.Object, key: java.lang.String): scala.Unit = js.native
  def struct(target: js.Object, key: java.lang.String, baseDescriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
  def struct(target: js.Object, key: js.Symbol): scala.Unit = js.native
  def struct(target: js.Object, key: js.Symbol, baseDescriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
}

