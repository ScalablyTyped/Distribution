package typings
package mobxLib.libApiActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionFactory extends js.Object {
  def apply(customName: java.lang.String): js.Function3[
    /* target */ js.Object, 
    /* key */ java.lang.String | js.Symbol, 
    /* baseDescriptor */ js.UndefOr[stdLib.PropertyDescriptor], 
    scala.Unit
  ] = js.native
  def apply(target: js.Object, propertyKey: java.lang.String): scala.Unit = js.native
  def apply(target: js.Object, propertyKey: java.lang.String, descriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
  def apply(target: js.Object, propertyKey: js.Symbol): scala.Unit = js.native
  def apply(target: js.Object, propertyKey: js.Symbol, descriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
  def apply[T /* <: js.Function */](fn: T): T with mobxLib.libCoreActionMod.IAction = js.native
  def apply[T /* <: js.Function */](name: java.lang.String, fn: T): T with mobxLib.libCoreActionMod.IAction = js.native
  def bound(target: js.Object, propertyKey: java.lang.String): scala.Unit = js.native
  def bound(target: js.Object, propertyKey: java.lang.String, descriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
  def bound(target: js.Object, propertyKey: js.Symbol): scala.Unit = js.native
  def bound(target: js.Object, propertyKey: js.Symbol, descriptor: stdLib.PropertyDescriptor): scala.Unit = js.native
}

