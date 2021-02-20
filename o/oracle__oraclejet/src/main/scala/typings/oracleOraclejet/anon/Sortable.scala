package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sortable[K, D] extends StObject {
  
  var className: js.UndefOr[
    (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String | Null
  ] = js.native
  
  var label: Style[K, D] = js.native
  
  var renderer: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], `1` | Unit | Null]) | Null] = js.native
  
  var resizable: Width[K, D] = js.native
  
  var sortable: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], String]) | String | Null] = js.native
  
  var style: js.UndefOr[
    (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String | Null
  ] = js.native
}
object Sortable {
  
  @scala.inline
  def apply[K, D](label: Style[K, D], resizable: Width[K, D]): Sortable[K, D] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sortable[K, D]]
  }
  
  @scala.inline
  implicit class SortableMutableBuilder[Self <: Sortable[_, _], K, D] (val x: Self with (Sortable[K, D])) extends AnyVal {
    
    @scala.inline
    def setClassName(value: (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameFunction1(value: /* context */ HeaderContext[K, D] => String | Unit | Null): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClassNameNull: Self = StObject.set(x, "className", null)
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setLabel(value: Style[K, D]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderer(value: /* context */ HeaderContext[K, D] => `1` | Unit | Null): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRendererNull: Self = StObject.set(x, "renderer", null)
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setResizable(value: Width[K, D]): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortable(value: (js.Function1[/* context */ HeaderContext[K, D], String]) | String): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortableFunction1(value: /* context */ HeaderContext[K, D] => String): Self = StObject.set(x, "sortable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortableNull: Self = StObject.set(x, "sortable", null)
    
    @scala.inline
    def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    @scala.inline
    def setStyle(value: (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleFunction1(value: /* context */ HeaderContext[K, D] => String | Unit | Null): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
