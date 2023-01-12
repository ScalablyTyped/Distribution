package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojlistviewMod.ojListView.ItemContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focusable[K, D] extends StObject {
  
  var focusable: js.UndefOr[(js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean] = js.undefined
  
  var renderer: js.UndefOr[(js.Function1[/* param0 */ ItemContext[K, D], js.UndefOr[Insert]]) | Null] = js.undefined
  
  var selectable: js.UndefOr[(js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean] = js.undefined
}
object Focusable {
  
  inline def apply[K, D](): Focusable[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Focusable[K, D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Focusable[?, ?], K, D] (val x: Self & (Focusable[K, D])) extends AnyVal {
    
    inline def setFocusable(value: (js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableFunction1(value: /* param0 */ ItemContext[K, D] => Boolean): Self = StObject.set(x, "focusable", js.Any.fromFunction1(value))
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setRenderer(value: /* param0 */ ItemContext[K, D] => js.UndefOr[Insert]): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    inline def setRendererNull: Self = StObject.set(x, "renderer", null)
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setSelectable(value: (js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableFunction1(value: /* param0 */ ItemContext[K, D] => Boolean): Self = StObject.set(x, "selectable", js.Any.fromFunction1(value))
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
  }
}
