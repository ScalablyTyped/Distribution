package typings.mousetrap

import org.scalablytyped.runtime.Shortcut
import typings.mousetrap.mod.MousetrapInstance
import typings.mousetrap.mod.MousetrapStatic
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /** https://craig.is/killing/mice#extensions.global */
  /** https://craig.is/killing/mice#extensions.pause */
  object Mousetrap extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Mousetrap")
    @js.native
    open class ^ ()
      extends StObject
         with MousetrapInstance {
      def this(el: Element) = this()
    }
    
    @JSGlobal("Mousetrap")
    @js.native
    val ^ : js.Object & MousetrapStatic = js.native
    
    type _To = js.Object & MousetrapStatic
    
    /* This means you don't have to write `^`, but can instead just say `Mousetrap.foo` */
    override def _to: js.Object & MousetrapStatic = ^
  }
}
