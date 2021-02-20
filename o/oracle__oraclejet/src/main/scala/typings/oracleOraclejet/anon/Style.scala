package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.LabelContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Style[K, D] extends StObject {
  
  var className: js.UndefOr[
    (js.Function1[/* context */ LabelContext[K, D], String | Unit | Null]) | String | Null
  ] = js.native
  
  var renderer: js.UndefOr[(js.Function1[/* context */ LabelContext[K, D], `1` | Unit | Null]) | Null] = js.native
  
  var style: js.UndefOr[
    (js.Function1[/* context */ LabelContext[K, D], String | Unit | Null]) | String | Null
  ] = js.native
}
object Style {
  
  @scala.inline
  def apply[K, D](): Style[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style[K, D]]
  }
  
  @scala.inline
  implicit class StyleMutableBuilder[Self <: Style[_, _], K, D] (val x: Self with (Style[K, D])) extends AnyVal {
    
    @scala.inline
    def setClassName(value: (js.Function1[/* context */ LabelContext[K, D], String | Unit | Null]) | String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameFunction1(value: /* context */ LabelContext[K, D] => String | Unit | Null): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClassNameNull: Self = StObject.set(x, "className", null)
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setRenderer(value: /* context */ LabelContext[K, D] => `1` | Unit | Null): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRendererNull: Self = StObject.set(x, "renderer", null)
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setStyle(value: (js.Function1[/* context */ LabelContext[K, D], String | Unit | Null]) | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleFunction1(value: /* context */ LabelContext[K, D] => String | Unit | Null): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
