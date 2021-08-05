package typings.popperjsCore.anon

import typings.popperjsCore.typesMod.Padding
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/arrow.Options> */
trait PartialOptionsElement extends StObject {
  
  var element: js.UndefOr[HTMLElement | String | Null] = js.undefined
  
  var padding: js.UndefOr[Padding] = js.undefined
}
object PartialOptionsElement {
  
  inline def apply(): PartialOptionsElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsElement]
  }
  
  extension [Self <: PartialOptionsElement](x: Self) {
    
    inline def setElement(value: HTMLElement | String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementNull: Self = StObject.set(x, "element", null)
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
