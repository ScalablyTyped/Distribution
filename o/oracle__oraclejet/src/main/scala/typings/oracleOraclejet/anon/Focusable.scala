package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojlistviewMod.ojListView.ItemContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Focusable[K, D] extends StObject {
  
  var focusable: js.UndefOr[(js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean] = js.native
  
  var renderer: js.UndefOr[(js.Function1[/* param0 */ ItemContext[K, D], js.UndefOr[Insert]]) | Null] = js.native
  
  var selectable: js.UndefOr[(js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean] = js.native
}
object Focusable {
  
  @scala.inline
  def apply[K, D](): Focusable[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Focusable[K, D]]
  }
  
  @scala.inline
  implicit class FocusableMutableBuilder[Self <: Focusable[_, _], K, D] (val x: Self with (Focusable[K, D])) extends AnyVal {
    
    @scala.inline
    def setFocusable(value: (js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusableFunction1(value: /* param0 */ ItemContext[K, D] => Boolean): Self = StObject.set(x, "focusable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    @scala.inline
    def setRenderer(value: /* param0 */ ItemContext[K, D] => js.UndefOr[Insert]): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRendererNull: Self = StObject.set(x, "renderer", null)
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setSelectable(value: (js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableFunction1(value: /* param0 */ ItemContext[K, D] => Boolean): Self = StObject.set(x, "selectable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
  }
}
