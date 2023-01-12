package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DuplicateSheetRequest extends StObject {
  
  /** The zero-based index where the new sheet should be inserted. The index of all sheets after this are incremented. */
  var insertSheetIndex: js.UndefOr[Double] = js.undefined
  
  /** If set, the ID of the new sheet. If not set, an ID is chosen. If set, the ID must not conflict with any existing sheet ID. If set, it must be non-negative. */
  var newSheetId: js.UndefOr[Double] = js.undefined
  
  /** The name of the new sheet. If empty, a new name is chosen for you. */
  var newSheetName: js.UndefOr[String] = js.undefined
  
  /**
    * The sheet to duplicate. If the source sheet is of DATA_SOURCE type, its backing DataSource is also duplicated and associated with the new copy of the sheet. No data execution is
    * triggered, the grid data of this sheet is also copied over but only available after the batch request completes.
    */
  var sourceSheetId: js.UndefOr[Double] = js.undefined
}
object DuplicateSheetRequest {
  
  inline def apply(): DuplicateSheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateSheetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DuplicateSheetRequest] (val x: Self) extends AnyVal {
    
    inline def setInsertSheetIndex(value: Double): Self = StObject.set(x, "insertSheetIndex", value.asInstanceOf[js.Any])
    
    inline def setInsertSheetIndexUndefined: Self = StObject.set(x, "insertSheetIndex", js.undefined)
    
    inline def setNewSheetId(value: Double): Self = StObject.set(x, "newSheetId", value.asInstanceOf[js.Any])
    
    inline def setNewSheetIdUndefined: Self = StObject.set(x, "newSheetId", js.undefined)
    
    inline def setNewSheetName(value: String): Self = StObject.set(x, "newSheetName", value.asInstanceOf[js.Any])
    
    inline def setNewSheetNameUndefined: Self = StObject.set(x, "newSheetName", js.undefined)
    
    inline def setSourceSheetId(value: Double): Self = StObject.set(x, "sourceSheetId", value.asInstanceOf[js.Any])
    
    inline def setSourceSheetIdUndefined: Self = StObject.set(x, "sourceSheetId", js.undefined)
  }
}
