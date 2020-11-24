package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnsRendererContext
import typings.oracleOraclejet.ojtableMod.ojTable.FooterRendererContext
import typings.oracleOraclejet.ojtableMod.ojTable.HeaderRendererContext
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FooterClassName[K, D] extends js.Object {
  
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
  
  var renderer: js.UndefOr[(js.Function1[/* context */ ColumnsRendererContext[K, D], `1` | Unit]) | Null] = js.native
  
  var resizable: js.UndefOr[enabled | disabled] = js.native
  
  var sortProperty: js.UndefOr[String | Null] = js.native
  
  var sortable: js.UndefOr[auto | enabled | disabled] = js.native
  
  var style: js.UndefOr[String | Null] = js.native
  
  var template: js.UndefOr[Mode] = js.native
  
  var width: js.UndefOr[Double | Null] = js.native
}
object FooterClassName {
  
  @scala.inline
  def apply[K, D](): FooterClassName[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FooterClassName[K, D]]
  }
  
  @scala.inline
  implicit class FooterClassNameOps[Self <: FooterClassName[_, _], K, D] (val x: Self with (FooterClassName[K, D])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClassNameNull: Self = this.set("className", null)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFieldNull: Self = this.set("field", null)
    
    @scala.inline
    def setFooterClassName(value: String): Self = this.set("footerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterClassName: Self = this.set("footerClassName", js.undefined)
    
    @scala.inline
    def setFooterClassNameNull: Self = this.set("footerClassName", null)
    
    @scala.inline
    def setFooterRenderer(value: /* context */ FooterRendererContext[K, D] => `1` | Unit): Self = this.set("footerRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFooterRenderer: Self = this.set("footerRenderer", js.undefined)
    
    @scala.inline
    def setFooterRendererNull: Self = this.set("footerRenderer", null)
    
    @scala.inline
    def setFooterStyle(value: String): Self = this.set("footerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterStyle: Self = this.set("footerStyle", js.undefined)
    
    @scala.inline
    def setFooterStyleNull: Self = this.set("footerStyle", null)
    
    @scala.inline
    def setFooterTemplate(value: ComponentElementElement): Self = this.set("footerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterTemplate: Self = this.set("footerTemplate", js.undefined)
    
    @scala.inline
    def setHeaderClassName(value: String): Self = this.set("headerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderClassName: Self = this.set("headerClassName", js.undefined)
    
    @scala.inline
    def setHeaderClassNameNull: Self = this.set("headerClassName", null)
    
    @scala.inline
    def setHeaderRenderer(value: /* context */ HeaderRendererContext[K, D] => `1` | Unit): Self = this.set("headerRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeaderRenderer: Self = this.set("headerRenderer", js.undefined)
    
    @scala.inline
    def setHeaderRendererNull: Self = this.set("headerRenderer", null)
    
    @scala.inline
    def setHeaderStyle(value: String): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    
    @scala.inline
    def setHeaderStyleNull: Self = this.set("headerStyle", null)
    
    @scala.inline
    def setHeaderTemplate(value: ComponentElementData): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    
    @scala.inline
    def setHeaderText(value: String): Self = this.set("headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderText: Self = this.set("headerText", js.undefined)
    
    @scala.inline
    def setHeaderTextNull: Self = this.set("headerText", null)
    
    @scala.inline
    def setRenderer(value: /* context */ ColumnsRendererContext[K, D] => `1` | Unit): Self = this.set("renderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setRendererNull: Self = this.set("renderer", null)
    
    @scala.inline
    def setResizable(value: enabled | disabled): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setSortProperty(value: String): Self = this.set("sortProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortProperty: Self = this.set("sortProperty", js.undefined)
    
    @scala.inline
    def setSortPropertyNull: Self = this.set("sortProperty", null)
    
    @scala.inline
    def setSortable(value: auto | enabled | disabled): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setTemplate(value: Mode): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWidthNull: Self = this.set("width", null)
  }
}
