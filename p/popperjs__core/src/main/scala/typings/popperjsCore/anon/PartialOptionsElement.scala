package typings.popperjsCore.anon

import typings.popperjsCore.libTypesMod.Padding
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/arrow.Options> */
trait PartialOptionsElement extends StObject {
  
  var element: js.UndefOr[HTMLElement | String | Null] = js.undefined
  
  var padding: js.UndefOr[Padding | (js.Function1[/* arg0 */ Placement, Padding])] = js.undefined
}
object PartialOptionsElement {
  
  inline def apply(): PartialOptionsElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialOptionsElement] (val x: Self) extends AnyVal {
    
    inline def setElement(value: HTMLElement | String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementNull: Self = StObject.set(x, "element", null)
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setPadding(value: Padding | (js.Function1[/* arg0 */ Placement, Padding])): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingFunction1(value: /* arg0 */ Placement => Padding): Self = StObject.set(x, "padding", js.Any.fromFunction1(value))
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
