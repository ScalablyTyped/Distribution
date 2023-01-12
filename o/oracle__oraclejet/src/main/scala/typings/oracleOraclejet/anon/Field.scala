package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnsRendererContext
import typings.oracleOraclejet.ojtableMod.ojTable.FooterRendererContext
import typings.oracleOraclejet.ojtableMod.ojTable.HeaderRendererContext
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field[K, D] extends StObject {
  
  var className: js.UndefOr[String | Null] = js.undefined
  
  var field: js.UndefOr[String | Null] = js.undefined
  
  var footerClassName: js.UndefOr[String | Null] = js.undefined
  
  var footerRenderer: js.UndefOr[(js.Function1[/* context */ FooterRendererContext[K, D], `1` | Unit]) | Null] = js.undefined
  
  var footerStyle: js.UndefOr[String | Null] = js.undefined
  
  var footerTemplate: js.UndefOr[ComponentElementElement] = js.undefined
  
  var headerClassName: js.UndefOr[String | Null] = js.undefined
  
  var headerRenderer: js.UndefOr[(js.Function1[/* context */ HeaderRendererContext[K, D], `1` | Unit]) | Null] = js.undefined
  
  var headerStyle: js.UndefOr[String | Null] = js.undefined
  
  var headerTemplate: js.UndefOr[ComponentElementData] = js.undefined
  
  var headerText: js.UndefOr[String | Null] = js.undefined
  
  var id: js.UndefOr[String | Null] = js.undefined
  
  var renderer: js.UndefOr[(js.Function1[/* context */ ColumnsRendererContext[K, D], `1` | Unit]) | Null] = js.undefined
  
  var resizable: js.UndefOr[enabled | disabled] = js.undefined
  
  var sortProperty: js.UndefOr[String | Null] = js.undefined
  
  var sortable: js.UndefOr[auto | enabled | disabled] = js.undefined
  
  var style: js.UndefOr[String | Null] = js.undefined
  
  var template: js.UndefOr[Mode] = js.undefined
  
  var width: js.UndefOr[Double | Null] = js.undefined
}
object Field {
  
  inline def apply[K, D](): Field[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Field[K, D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Field[?, ?], K, D] (val x: Self & (Field[K, D])) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameNull: Self = StObject.set(x, "className", null)
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldNull: Self = StObject.set(x, "field", null)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFooterClassName(value: String): Self = StObject.set(x, "footerClassName", value.asInstanceOf[js.Any])
    
    inline def setFooterClassNameNull: Self = StObject.set(x, "footerClassName", null)
    
    inline def setFooterClassNameUndefined: Self = StObject.set(x, "footerClassName", js.undefined)
    
    inline def setFooterRenderer(value: /* context */ FooterRendererContext[K, D] => `1` | Unit): Self = StObject.set(x, "footerRenderer", js.Any.fromFunction1(value))
    
    inline def setFooterRendererNull: Self = StObject.set(x, "footerRenderer", null)
    
    inline def setFooterRendererUndefined: Self = StObject.set(x, "footerRenderer", js.undefined)
    
    inline def setFooterStyle(value: String): Self = StObject.set(x, "footerStyle", value.asInstanceOf[js.Any])
    
    inline def setFooterStyleNull: Self = StObject.set(x, "footerStyle", null)
    
    inline def setFooterStyleUndefined: Self = StObject.set(x, "footerStyle", js.undefined)
    
    inline def setFooterTemplate(value: ComponentElementElement): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    inline def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
    
    inline def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
    
    inline def setHeaderClassNameNull: Self = StObject.set(x, "headerClassName", null)
    
    inline def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
    
    inline def setHeaderRenderer(value: /* context */ HeaderRendererContext[K, D] => `1` | Unit): Self = StObject.set(x, "headerRenderer", js.Any.fromFunction1(value))
    
    inline def setHeaderRendererNull: Self = StObject.set(x, "headerRenderer", null)
    
    inline def setHeaderRendererUndefined: Self = StObject.set(x, "headerRenderer", js.undefined)
    
    inline def setHeaderStyle(value: String): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    inline def setHeaderStyleNull: Self = StObject.set(x, "headerStyle", null)
    
    inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    inline def setHeaderTemplate(value: ComponentElementData): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    inline def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
    
    inline def setHeaderTextNull: Self = StObject.set(x, "headerText", null)
    
    inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRenderer(value: /* context */ ColumnsRendererContext[K, D] => `1` | Unit): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    inline def setRendererNull: Self = StObject.set(x, "renderer", null)
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setResizable(value: enabled | disabled): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    inline def setSortProperty(value: String): Self = StObject.set(x, "sortProperty", value.asInstanceOf[js.Any])
    
    inline def setSortPropertyNull: Self = StObject.set(x, "sortProperty", null)
    
    inline def setSortPropertyUndefined: Self = StObject.set(x, "sortProperty", js.undefined)
    
    inline def setSortable(value: auto | enabled | disabled): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTemplate(value: Mode): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
