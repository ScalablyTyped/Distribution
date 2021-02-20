package typings.multiselect

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{afterInit (args : ...any): void, afterSelect (args : ...any): void, afterDeselect (args : ...any): void,   selectableHeader :string | std.HTMLElement,   selectionHeader :string | std.HTMLElement,   selectableFooter :string | std.HTMLElement,   selectionFooter :string | std.HTMLElement,   disabledClass :string,   selectableOptgroup :boolean,   keepOrder :boolean,   dblClick :boolean,   cssClass :string}> */
@js.native
trait Options extends StObject {
  
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
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterDeselect(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "afterDeselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterDeselectUndefined: Self = StObject.set(x, "afterDeselect", js.undefined)
    
    @scala.inline
    def setAfterInit(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "afterInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
    
    @scala.inline
    def setAfterSelect(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "afterSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterSelectUndefined: Self = StObject.set(x, "afterSelect", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    @scala.inline
    def setDblClick(value: Boolean): Self = StObject.set(x, "dblClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblClickUndefined: Self = StObject.set(x, "dblClick", js.undefined)
    
    @scala.inline
    def setDisabledClass(value: String): Self = StObject.set(x, "disabledClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledClassUndefined: Self = StObject.set(x, "disabledClass", js.undefined)
    
    @scala.inline
    def setKeepOrder(value: Boolean): Self = StObject.set(x, "keepOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepOrderUndefined: Self = StObject.set(x, "keepOrder", js.undefined)
    
    @scala.inline
    def setSelectableFooter(value: String | HTMLElement): Self = StObject.set(x, "selectableFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableFooterUndefined: Self = StObject.set(x, "selectableFooter", js.undefined)
    
    @scala.inline
    def setSelectableHeader(value: String | HTMLElement): Self = StObject.set(x, "selectableHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableHeaderUndefined: Self = StObject.set(x, "selectableHeader", js.undefined)
    
    @scala.inline
    def setSelectableOptgroup(value: Boolean): Self = StObject.set(x, "selectableOptgroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableOptgroupUndefined: Self = StObject.set(x, "selectableOptgroup", js.undefined)
    
    @scala.inline
    def setSelectionFooter(value: String | HTMLElement): Self = StObject.set(x, "selectionFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionFooterUndefined: Self = StObject.set(x, "selectionFooter", js.undefined)
    
    @scala.inline
    def setSelectionHeader(value: String | HTMLElement): Self = StObject.set(x, "selectionHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionHeaderUndefined: Self = StObject.set(x, "selectionHeader", js.undefined)
  }
}
