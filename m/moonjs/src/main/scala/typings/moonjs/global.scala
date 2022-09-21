package typings.moonjs

import org.scalablytyped.runtime.Shortcut
import typings.moonjs.mod.ConstructorOptions
import typings.moonjs.mod.Instance
import typings.moonjs.mod.MoonStatic
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Moon extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Moon")
    @js.native
    open class ^[Props /* <: String */, Data, Methods] ()
      extends StObject
         with Instance[Data & Methods & (Record[Props, Any])] {
      def this(options: ConstructorOptions[Props, Data, Methods]) = this()
    }
    
    @JSGlobal("Moon")
    @js.native
    val ^ : MoonStatic = js.native
    
    type _To = MoonStatic
    
    /* This means you don't have to write `^`, but can instead just say `Moon.foo` */
    override def _to: MoonStatic = ^
  }
}
