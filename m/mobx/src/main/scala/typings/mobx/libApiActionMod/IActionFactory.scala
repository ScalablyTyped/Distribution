package typings.mobx.libApiActionMod

import typings.mobx.libCoreActionMod.IAction
import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionFactory extends js.Object {
  def apply(customName: String): js.Function3[
    /* target */ js.Object, 
    /* key */ String | js.Symbol, 
    /* baseDescriptor */ js.UndefOr[PropertyDescriptor], 
    Unit
  ] = js.native
  def apply(target: js.Object, propertyKey: String): Unit = js.native
  def apply(target: js.Object, propertyKey: String, descriptor: PropertyDescriptor): Unit = js.native
  def apply(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  def apply(target: js.Object, propertyKey: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
  def apply[T /* <: js.Function */](fn: T): T with IAction = js.native
  def apply[T /* <: js.Function */](name: String, fn: T): T with IAction = js.native
  def bound(target: js.Object, propertyKey: String): Unit = js.native
  def bound(target: js.Object, propertyKey: String, descriptor: PropertyDescriptor): Unit = js.native
  def bound(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  def bound(target: js.Object, propertyKey: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
}

