package typings.multiselect

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{afterInit (args : ...any): void, afterSelect (args : ...any): void, afterDeselect (args : ...any): void,   selectableHeader :string | std.HTMLElement,   selectionHeader :string | std.HTMLElement,   selectableFooter :string | std.HTMLElement,   selectionFooter :string | std.HTMLElement,   disabledClass :string,   selectableOptgroup :boolean,   keepOrder :boolean,   dblClick :boolean,   cssClass :string}> */
@js.native
trait Options extends js.Object {
  
  var afterDeselect: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var afterInit: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var afterSelect: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var cssClass: js.UndefOr[String] = js.native
  
  var dblClick: js.UndefOr[Boolean] = js.native
  
  var disabledClass: js.UndefOr[String] = js.native
  
  var keepOrder: js.UndefOr[Boolean] = js.native
  
  var selectableFooter: js.UndefOr[String | HTMLElement] = js.native
  
  var selectableHeader: js.UndefOr[String | HTMLElement] = js.native
  
  var selectableOptgroup: js.UndefOr[Boolean] = js.native
  
  var selectionFooter: js.UndefOr[String | HTMLElement] = js.native
  
  var selectionHeader: js.UndefOr[String | HTMLElement] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAfterDeselect(value: /* repeated */ js.Any => Unit): Self = this.set("afterDeselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterDeselect: Self = this.set("afterDeselect", js.undefined)
    
    @scala.inline
    def setAfterInit(value: /* repeated */ js.Any => Unit): Self = this.set("afterInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterInit: Self = this.set("afterInit", js.undefined)
    
    @scala.inline
    def setAfterSelect(value: /* repeated */ js.Any => Unit): Self = this.set("afterSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterSelect: Self = this.set("afterSelect", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDblClick(value: Boolean): Self = this.set("dblClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDblClick: Self = this.set("dblClick", js.undefined)
    
    @scala.inline
    def setDisabledClass(value: String): Self = this.set("disabledClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledClass: Self = this.set("disabledClass", js.undefined)
    
    @scala.inline
    def setKeepOrder(value: Boolean): Self = this.set("keepOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepOrder: Self = this.set("keepOrder", js.undefined)
    
    @scala.inline
    def setSelectableFooter(value: String | HTMLElement): Self = this.set("selectableFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectableFooter: Self = this.set("selectableFooter", js.undefined)
    
    @scala.inline
    def setSelectableHeader(value: String | HTMLElement): Self = this.set("selectableHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectableHeader: Self = this.set("selectableHeader", js.undefined)
    
    @scala.inline
    def setSelectableOptgroup(value: Boolean): Self = this.set("selectableOptgroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectableOptgroup: Self = this.set("selectableOptgroup", js.undefined)
    
    @scala.inline
    def setSelectionFooter(value: String | HTMLElement): Self = this.set("selectionFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionFooter: Self = this.set("selectionFooter", js.undefined)
    
    @scala.inline
    def setSelectionHeader(value: String | HTMLElement): Self = this.set("selectionHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionHeader: Self = this.set("selectionHeader", js.undefined)
  }
}
