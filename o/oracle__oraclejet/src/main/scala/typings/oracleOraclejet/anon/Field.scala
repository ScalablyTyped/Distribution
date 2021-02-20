package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnsRendererContext
import typings.oracleOraclejet.ojtableMod.ojTable.FooterRendererContext
import typings.oracleOraclejet.ojtableMod.ojTable.HeaderRendererContext
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Field[K, D] extends StObject {
  
  var className: js.UndefOr[String | Null] = js.native
  
  var field: js.UndefOr[String | Null] = js.native
  
  var footerClassName: js.UndefOr[String | Null] = js.native
  
  var footerRenderer: js.UndefOr[(js.Function1[/* context */ FooterRendererContext[K, D], `1` | Unit]) | Null] = js.native
  
  var footerStyle: js.UndefOr[String | Null] = js.native
  
  var footerTemplate: js.UndefOr[ComponentElementElement] = js.native
  
  var headerClassName: js.UndefOr[String | Null] = js.native
  
  var headerRenderer: js.UndefOr[(js.Function1[/* context */ HeaderRendererContext[K, D], `1` | Unit]) | Null] = js.native
  
  var headerStyle: js.UndefOr[String | Null] = js.native
  
  var headerTemplate: js.UndefOr[ComponentElementData] = js.native
  
  var headerText: js.UndefOr[String | Null] = js.native
  
  var id: js.UndefOr[String | Null] = js.native
  
  var renderer: js.UndefOr[(js.Function1[/* context */ ColumnsRendererContext[K, D], `1` | Unit]) | Null] = js.native
  
  var resizable: js.UndefOr[enabled | disabled] = js.native
  
  var sortProperty: js.UndefOr[String | Null] = js.native
  
  var sortable: js.UndefOr[auto | enabled | disabled] = js.native
  
  var style: js.UndefOr[String | Null] = js.native
  
  var template: js.UndefOr[Mode] = js.native
  
  var width: js.UndefOr[Double | Null] = js.native
}
object Field {
  
  @scala.inline
  def apply[K, D](): Field[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Field[K, D]]
  }
  
  @scala.inline
  implicit class FieldMutableBuilder[Self <: Field[_, _], K, D] (val x: Self with (Field[K, D])) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameNull: Self = StObject.set(x, "className", null)
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNull: Self = StObject.set(x, "field", null)
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFooterClassName(value: String): Self = StObject.set(x, "footerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterClassNameNull: Self = StObject.set(x, "footerClassName", null)
    
    @scala.inline
    def setFooterClassNameUndefined: Self = StObject.set(x, "footerClassName", js.undefined)
    
    @scala.inline
    def setFooterRenderer(value: /* context */ FooterRendererContext[K, D] => `1` | Unit): Self = StObject.set(x, "footerRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFooterRendererNull: Self = StObject.set(x, "footerRenderer", null)
    
    @scala.inline
    def setFooterRendererUndefined: Self = StObject.set(x, "footerRenderer", js.undefined)
    
    @scala.inline
    def setFooterStyle(value: String): Self = StObject.set(x, "footerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterStyleNull: Self = StObject.set(x, "footerStyle", null)
    
    @scala.inline
    def setFooterStyleUndefined: Self = StObject.set(x, "footerStyle", js.undefined)
    
    @scala.inline
    def setFooterTemplate(value: ComponentElementElement): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
    
    @scala.inline
    def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderClassNameNull: Self = StObject.set(x, "headerClassName", null)
    
    @scala.inline
    def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
    
    @scala.inline
    def setHeaderRenderer(value: /* context */ HeaderRendererContext[K, D] => `1` | Unit): Self = StObject.set(x, "headerRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderRendererNull: Self = StObject.set(x, "headerRenderer", null)
    
    @scala.inline
    def setHeaderRendererUndefined: Self = StObject.set(x, "headerRenderer", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: String): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStyleNull: Self = StObject.set(x, "headerStyle", null)
    
    @scala.inline
    def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    @scala.inline
    def setHeaderTemplate(value: ComponentElementData): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    @scala.inline
    def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTextNull: Self = StObject.set(x, "headerText", null)
    
    @scala.inline
    def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setRenderer(value: /* context */ ColumnsRendererContext[K, D] => `1` | Unit): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRendererNull: Self = StObject.set(x, "renderer", null)
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setResizable(value: enabled | disabled): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    @scala.inline
    def setSortProperty(value: String): Self = StObject.set(x, "sortProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortPropertyNull: Self = StObject.set(x, "sortProperty", null)
    
    @scala.inline
    def setSortPropertyUndefined: Self = StObject.set(x, "sortProperty", js.undefined)
    
    @scala.inline
    def setSortable(value: auto | enabled | disabled): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTemplate(value: Mode): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthNull: Self = StObject.set(x, "width", null)
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
