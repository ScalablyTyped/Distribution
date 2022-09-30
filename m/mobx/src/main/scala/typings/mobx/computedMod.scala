package typings.mobx

import typings.mobx.annotationMod.Annotation
import typings.mobx.computedvalueMod.IComputedValue
import typings.mobx.computedvalueMod.IComputedValueOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computedMod {
  
  @JSImport("mobx/dist/api/computed", "COMPUTED")
  @js.native
  val COMPUTED_ : /* "computed" */ String = js.native
  
  @JSImport("mobx/dist/api/computed", "COMPUTED_STRUCT")
  @js.native
  val COMPUTED_STRUCT: /* "computed.struct" */ String = js.native
  
  @JSImport("mobx/dist/api/computed", "computed")
  @js.native
  val computed: IComputedFactory = js.native
  
  @js.native
  trait IComputedFactory
    extends PropertyDecorator
       with Annotation {
    
    def apply[T](func: js.Function0[T]): IComputedValue[T] = js.native
    def apply[T](func: js.Function0[T], options: IComputedValueOptions[T]): IComputedValue[T] = js.native
    def apply[T](options: IComputedValueOptions[T]): Annotation & PropertyDecorator = js.native
    
    /* InferMemberOverrides */
    override def apply(arg1: /* target */ js.Object, arg2: /* propertyKey */ String | js.Symbol): Unit = js.native
    
    def struct(target: js.Object, propertyKey: String): Unit = js.native
    def struct(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    @JSName("struct")
    var struct_Original: Annotation & PropertyDecorator = js.native
  }
}
