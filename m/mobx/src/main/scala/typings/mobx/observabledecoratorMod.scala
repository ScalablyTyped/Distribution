package typings.mobx

import typings.mobx.modifiersMod.IEnhancer
import typings.std.PropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observabledecoratorMod {
  
  @JSImport("mobx/lib/api/observabledecorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDecoratorForEnhancer(enhancer: IEnhancer[js.Any]): IObservableDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecoratorForEnhancer")(enhancer.asInstanceOf[js.Any]).asInstanceOf[IObservableDecorator]
  
  @js.native
  trait IObservableDecorator extends StObject {
    
    def apply(target: js.Object, property: String): Unit = js.native
    def apply(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
    def apply(target: js.Object, property: js.Symbol): Unit = js.native
    def apply(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
    
    def enhancer(newValue: js.Any, oldValue: js.Any, name: String): js.Any = js.native
    def enhancer(newValue: js.Any, oldValue: Unit, name: String): js.Any = js.native
    @JSName("enhancer")
    var enhancer_Original: IEnhancer[js.Any] = js.native
  }
}
