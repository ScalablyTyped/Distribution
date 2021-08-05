package typings.popperjsCore

import org.scalablytyped.runtime.Shortcut
import typings.popperjsCore.popperjsCoreStrings.arrow
import typings.popperjsCore.typesMod.Modifier
import typings.popperjsCore.typesMod.Padding
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowMod extends Shortcut {
  
  @JSImport("@popperjs/core/lib/modifiers/arrow", JSImport.Default)
  @js.native
  val default: Modifier[arrow, Options] = js.native
  
  type ArrowModifier = Modifier[arrow, Options]
  
  trait Options extends StObject {
    
    var element: HTMLElement | String | Null
    
    var padding: Padding
  }
  object Options {
    
    inline def apply(padding: Padding): Options = {
      val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], element = null)
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setElement(value: HTMLElement | String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Modifier[arrow, Options]
  
  /* This means you don't have to write `default`, but can instead just say `arrowMod.foo` */
  override def _to: Modifier[arrow, Options] = default
}
