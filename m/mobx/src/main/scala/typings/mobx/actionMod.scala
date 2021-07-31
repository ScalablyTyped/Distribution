package typings.mobx

import typings.mobx.coreActionMod.IAction
import typings.std.PropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionMod {
  
  @JSImport("mobx/lib/api/action", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/lib/api/action", "action")
  @js.native
  val action: IActionFactory = js.native
  
  @scala.inline
  def defineBoundAction(target: js.Any, propertyName: String, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineBoundAction")(target.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def isAction(thing: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAction")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def runInAction[T](block: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("runInAction")(block.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def runInAction[T](name: String, block: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("runInAction")(name.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @js.native
  trait IActionFactory extends StObject {
    
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
    def apply[T /* <: js.UndefOr[js.Function | Null] */](fn: T): T & IAction = js.native
    def apply[T /* <: js.UndefOr[js.Function | Null] */](name: String, fn: T): T & IAction = js.native
    
    def bound(target: js.Object, propertyKey: String): Unit = js.native
    def bound(target: js.Object, propertyKey: String, descriptor: PropertyDescriptor): Unit = js.native
    def bound(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    def bound(target: js.Object, propertyKey: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
  }
}
