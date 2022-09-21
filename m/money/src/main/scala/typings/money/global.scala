package typings.money

import org.scalablytyped.runtime.Shortcut
import typings.money.mod.FX
import typings.money.mod.Value
import typings.money.mod.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object fx extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("fx")
    @js.native
    open class ^[T_VAL /* <: Value */] protected ()
      extends StObject
         with Wrapper[T_VAL] {
      def this(`val`: T_VAL) = this()
    }
    
    @JSGlobal("fx")
    @js.native
    val ^ : FX = js.native
    
    type _To = FX
    
    /* This means you don't have to write `^`, but can instead just say `fx.foo` */
    override def _to: FX = ^
  }
}
