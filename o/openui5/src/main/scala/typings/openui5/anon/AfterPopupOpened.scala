package typings.openui5.anon

import typings.openui5.sapUiUnifiedDateRangeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterPopupOpened extends StObject {
  
  /**
    * Indicates if the event is fired, due to popup being opened.
    */
  var afterPopupOpened: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Date range containing the start and end date displayed in the `Calendar` popup.
    */
  var dateRange: js.UndefOr[default] = js.undefined
}
object AfterPopupOpened {
  
  inline def apply(): AfterPopupOpened = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AfterPopupOpened]
  }
  
  extension [Self <: AfterPopupOpened](x: Self) {
    
    inline def setAfterPopupOpened(value: Boolean): Self = StObject.set(x, "afterPopupOpened", value.asInstanceOf[js.Any])
    
    inline def setAfterPopupOpenedUndefined: Self = StObject.set(x, "afterPopupOpened", js.undefined)
    
    inline def setDateRange(value: default): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
  }
}
