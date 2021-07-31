package typings.mobx

import typings.mobx.computedvalueMod.IComputedValue
import typings.mobx.computedvalueMod.IComputedValueOptions
import typings.std.PropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computedMod {
  
  @JSImport("mobx/lib/api/computed", "computed")
  @js.native
  val computed: IComputed = js.native
  
  @JSImport("mobx/lib/api/computed", "computedDecorator")
  @js.native
  val computedDecorator: js.Function = js.native
  
  @js.native
  trait IComputed extends StObject {
    
    def apply(target: js.Object, key: String): Unit = js.native
    def apply(target: js.Object, key: String, baseDescriptor: PropertyDescriptor): Unit = js.native
    def apply(target: js.Object, key: js.Symbol): Unit = js.native
    def apply(target: js.Object, key: js.Symbol, baseDescriptor: PropertyDescriptor): Unit = js.native
    def apply[T](func: js.Function0[T]): IComputedValue[T] = js.native
    def apply[T](func: js.Function0[T], options: IComputedValueOptions[T]): IComputedValue[T] = js.native
    def apply[T](func: js.Function0[T], setter: js.Function1[/* v */ T, Unit]): IComputedValue[T] = js.native
    def apply[T](options: IComputedValueOptions[T]): js.Any = js.native
    
    def struct(target: js.Object, key: String): Unit = js.native
    def struct(target: js.Object, key: String, baseDescriptor: PropertyDescriptor): Unit = js.native
    def struct(target: js.Object, key: js.Symbol): Unit = js.native
    def struct(target: js.Object, key: js.Symbol, baseDescriptor: PropertyDescriptor): Unit = js.native
  }
}
