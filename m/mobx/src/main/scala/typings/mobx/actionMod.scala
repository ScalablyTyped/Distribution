package typings.mobx

import typings.mobx.annotationMod.Annotation
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionMod {
  
  @JSImport("mobx/dist/api/action", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/dist/api/action", "ACTION")
  @js.native
  val ACTION_ : /* "action" */ String = js.native
  
  @JSImport("mobx/dist/api/action", "ACTION_BOUND")
  @js.native
  val ACTION_BOUND: /* "action.bound" */ String = js.native
  
  @JSImport("mobx/dist/api/action", "AUTOACTION")
  @js.native
  val AUTOACTION_ : /* "autoAction" */ String = js.native
  
  @JSImport("mobx/dist/api/action", "AUTOACTION_BOUND")
  @js.native
  val AUTOACTION_BOUND: /* "autoAction.bound" */ String = js.native
  
  @JSImport("mobx/dist/api/action", "action")
  @js.native
  val action: IActionFactory = js.native
  
  @JSImport("mobx/dist/api/action", "autoAction")
  @js.native
  val autoAction: IActionFactory = js.native
  
  inline def isAction(thing: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAction")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def runInAction[T](fn: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("runInAction")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @js.native
  trait IActionFactory
    extends PropertyDecorator
       with Annotation {
    
    def apply(customName: String): PropertyDecorator & Annotation = js.native
    def apply[T /* <: js.UndefOr[js.Function | Null] */](fn: T): T = js.native
    def apply[T /* <: js.UndefOr[js.Function | Null] */](name: String, fn: T): T = js.native
    
    /* InferMemberOverrides */
    override def apply(arg1: /* target */ js.Object, arg2: /* propertyKey */ String | js.Symbol): Unit = js.native
    
    def bound(target: js.Object, propertyKey: String): Unit = js.native
    def bound(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    @JSName("bound")
    var bound_Original: Annotation & PropertyDecorator = js.native
  }
}
