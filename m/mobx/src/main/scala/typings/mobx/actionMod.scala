package typings.mobx

import typings.mobx.coreActionMod.IAction
import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/api/action", JSImport.Namespace)
@js.native
object actionMod extends js.Object {
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
    def apply[T /* <: js.UndefOr[js.Function | Null] */](fn: T): T with IAction = js.native
    def apply[T /* <: js.UndefOr[js.Function | Null] */](name: String, fn: T): T with IAction = js.native
    def bound(target: js.Object, propertyKey: String): Unit = js.native
    def bound(target: js.Object, propertyKey: String, descriptor: PropertyDescriptor): Unit = js.native
    def bound(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    def bound(target: js.Object, propertyKey: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
  }
  
  val action: IActionFactory = js.native
  def defineBoundAction(target: js.Any, propertyName: String, fn: js.Function): Unit = js.native
  def isAction(thing: js.Any): Boolean = js.native
  def runInAction[T](block: js.Function0[T]): T = js.native
  def runInAction[T](name: String, block: js.Function0[T]): T = js.native
}

