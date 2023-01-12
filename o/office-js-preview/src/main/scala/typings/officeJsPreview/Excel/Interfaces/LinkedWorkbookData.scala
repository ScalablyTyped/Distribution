package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `linkedWorkbook.toJSON()`. */
trait LinkedWorkbookData extends StObject {
  
  /**
    * The original URL pointing to the linked workbook. It is unique across all linked workbooks in the collection.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
}
object LinkedWorkbookData {
  
  inline def apply(): LinkedWorkbookData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedWorkbookData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkedWorkbookData] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
