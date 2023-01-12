package typings.multiselect

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{afterInit (args : ...any): void, afterSelect (args : ...any): void, afterDeselect (args : ...any): void,   selectableHeader :string | std.HTMLElement,   selectionHeader :string | std.HTMLElement,   selectableFooter :string | std.HTMLElement,   selectionFooter :string | std.HTMLElement,   disabledClass :string,   selectableOptgroup :boolean,   keepOrder :boolean,   dblClick :boolean,   cssClass :string}> */
trait Options extends StObject {
  
  var afterDeselect: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  var afterInit: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  var afterSelect: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  var cssClass: js.UndefOr[String] = js.undefined
  
  var dblClick: js.UndefOr[Boolean] = js.undefined
  
  var disabledClass: js.UndefOr[String] = js.undefined
  
  var keepOrder: js.UndefOr[Boolean] = js.undefined
  
  var selectableFooter: js.UndefOr[String | HTMLElement] = js.undefined
  
  var selectableHeader: js.UndefOr[String | HTMLElement] = js.undefined
  
  var selectableOptgroup: js.UndefOr[Boolean] = js.undefined
  
  var selectionFooter: js.UndefOr[String | HTMLElement] = js.undefined
  
  var selectionHeader: js.UndefOr[String | HTMLElement] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setAfterDeselect(value: /* repeated */ Any => Unit): Self = StObject.set(x, "afterDeselect", js.Any.fromFunction1(value))
    
    inline def setAfterDeselectUndefined: Self = StObject.set(x, "afterDeselect", js.undefined)
    
    inline def setAfterInit(value: /* repeated */ Any => Unit): Self = StObject.set(x, "afterInit", js.Any.fromFunction1(value))
    
    inline def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
    
    inline def setAfterSelect(value: /* repeated */ Any => Unit): Self = StObject.set(x, "afterSelect", js.Any.fromFunction1(value))
    
    inline def setAfterSelectUndefined: Self = StObject.set(x, "afterSelect", js.undefined)
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setDblClick(value: Boolean): Self = StObject.set(x, "dblClick", value.asInstanceOf[js.Any])
    
    inline def setDblClickUndefined: Self = StObject.set(x, "dblClick", js.undefined)
    
    inline def setDisabledClass(value: String): Self = StObject.set(x, "disabledClass", value.asInstanceOf[js.Any])
    
    inline def setDisabledClassUndefined: Self = StObject.set(x, "disabledClass", js.undefined)
    
    inline def setKeepOrder(value: Boolean): Self = StObject.set(x, "keepOrder", value.asInstanceOf[js.Any])
    
    inline def setKeepOrderUndefined: Self = StObject.set(x, "keepOrder", js.undefined)
    
    inline def setSelectableFooter(value: String | HTMLElement): Self = StObject.set(x, "selectableFooter", value.asInstanceOf[js.Any])
    
    inline def setSelectableFooterUndefined: Self = StObject.set(x, "selectableFooter", js.undefined)
    
    inline def setSelectableHeader(value: String | HTMLElement): Self = StObject.set(x, "selectableHeader", value.asInstanceOf[js.Any])
    
    inline def setSelectableHeaderUndefined: Self = StObject.set(x, "selectableHeader", js.undefined)
    
    inline def setSelectableOptgroup(value: Boolean): Self = StObject.set(x, "selectableOptgroup", value.asInstanceOf[js.Any])
    
    inline def setSelectableOptgroupUndefined: Self = StObject.set(x, "selectableOptgroup", js.undefined)
    
    inline def setSelectionFooter(value: String | HTMLElement): Self = StObject.set(x, "selectionFooter", value.asInstanceOf[js.Any])
    
    inline def setSelectionFooterUndefined: Self = StObject.set(x, "selectionFooter", js.undefined)
    
    inline def setSelectionHeader(value: String | HTMLElement): Self = StObject.set(x, "selectionHeader", value.asInstanceOf[js.Any])
    
    inline def setSelectionHeaderUndefined: Self = StObject.set(x, "selectionHeader", js.undefined)
  }
}
