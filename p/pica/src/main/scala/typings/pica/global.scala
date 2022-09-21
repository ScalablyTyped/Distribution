package typings.pica

import org.scalablytyped.runtime.Shortcut
import typings.pica.mod.Pica
import typings.pica.mod.PicaOptions
import typings.pica.mod.PicaStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object pica extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("pica")
    @js.native
    open class ^ ()
      extends StObject
         with Pica {
      def this(config: PicaOptions) = this()
    }
    
    @JSGlobal("pica")
    @js.native
    val ^ : js.Object & PicaStatic = js.native
    
    type _To = js.Object & PicaStatic
    
    /* This means you don't have to write `^`, but can instead just say `pica.foo` */
    override def _to: js.Object & PicaStatic = ^
  }
}
