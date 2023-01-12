package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ItemContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RendererSelectable[K, D] extends StObject {
  
  var renderer: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Unit]) | Null] = js.undefined
  
  var selectable: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean] = js.undefined
}
object RendererSelectable {
  
  inline def apply[K, D](): RendererSelectable[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererSelectable[K, D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RendererSelectable[?, ?], K, D] (val x: Self & (RendererSelectable[K, D])) extends AnyVal {
    
    inline def setRenderer(value: /* context */ ItemContext[K, D] => Unit): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    inline def setRendererNull: Self = StObject.set(x, "renderer", null)
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setSelectable(value: (js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableFunction1(value: /* context */ ItemContext[K, D] => Boolean): Self = StObject.set(x, "selectable", js.Any.fromFunction1(value))
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
  }
}
