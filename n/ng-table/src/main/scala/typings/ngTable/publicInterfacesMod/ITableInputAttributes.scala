package typings.ngTable.publicInterfacesMod

import typings.angular.mod.IAttributes
import typings.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITableInputAttributes extends IAttributes {
  
  var disableFilter: js.UndefOr[String] = js.native
  
  var ngTable: js.UndefOr[String] = js.native
  
  var ngTableDynamic: js.UndefOr[String] = js.native
  
  var showFilter: js.UndefOr[String] = js.native
  
  var showGroup: js.UndefOr[String] = js.native
  
  var templateHeader: js.UndefOr[String] = js.native
  
  var templatePagination: js.UndefOr[String] = js.native
}
object ITableInputAttributes {
  
  @scala.inline
  def apply(
    $addClass: String => Unit,
    $attr: js.Object,
    $normalize: String => String,
    $observe: (String, js.Function1[/* value */ js.UndefOr[js.Any], _]) => Function,
    $removeClass: String => Unit,
    $set: (String, js.Any) => Unit,
    $updateClass: (String, String) => Unit
  ): ITableInputAttributes = {
    val __obj = js.Dynamic.literal($addClass = js.Any.fromFunction1($addClass), $attr = $attr.asInstanceOf[js.Any], $normalize = js.Any.fromFunction1($normalize), $observe = js.Any.fromFunction2($observe), $removeClass = js.Any.fromFunction1($removeClass), $set = js.Any.fromFunction2($set), $updateClass = js.Any.fromFunction2($updateClass))
    __obj.asInstanceOf[ITableInputAttributes]
  }
  
  @scala.inline
  implicit class ITableInputAttributesOps[Self <: ITableInputAttributes] (val x: Self) extends AnyVal {
    
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
    def setDisableFilter(value: String): Self = this.set("disableFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFilter: Self = this.set("disableFilter", js.undefined)
    
    @scala.inline
    def setNgTable(value: String): Self = this.set("ngTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNgTable: Self = this.set("ngTable", js.undefined)
    
    @scala.inline
    def setNgTableDynamic(value: String): Self = this.set("ngTableDynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNgTableDynamic: Self = this.set("ngTableDynamic", js.undefined)
    
    @scala.inline
    def setShowFilter(value: String): Self = this.set("showFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFilter: Self = this.set("showFilter", js.undefined)
    
    @scala.inline
    def setShowGroup(value: String): Self = this.set("showGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGroup: Self = this.set("showGroup", js.undefined)
    
    @scala.inline
    def setTemplateHeader(value: String): Self = this.set("templateHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateHeader: Self = this.set("templateHeader", js.undefined)
    
    @scala.inline
    def setTemplatePagination(value: String): Self = this.set("templatePagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplatePagination: Self = this.set("templatePagination", js.undefined)
  }
}
