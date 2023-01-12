package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.WorkbookLinksRefreshMode
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.Manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the LinkedWorkbookCollection object, for use in `linkedWorkbookCollection.set({ ... })`. */
trait LinkedWorkbookCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[LinkedWorkbookData]] = js.undefined
  
  /**
    * Represents the update mode of the workbook links. The mode is same for all of the workbook links present in the workbook.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var workbookLinksRefreshMode: js.UndefOr[WorkbookLinksRefreshMode | Manual | Automatic] = js.undefined
}
object LinkedWorkbookCollectionUpdateData {
  
  inline def apply(): LinkedWorkbookCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedWorkbookCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkedWorkbookCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[LinkedWorkbookData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: LinkedWorkbookData*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setWorkbookLinksRefreshMode(value: WorkbookLinksRefreshMode | Manual | Automatic): Self = StObject.set(x, "workbookLinksRefreshMode", value.asInstanceOf[js.Any])
    
    inline def setWorkbookLinksRefreshModeUndefined: Self = StObject.set(x, "workbookLinksRefreshMode", js.undefined)
  }
}
