package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSheetRequest extends StObject {
  
  /** The ID of the sheet to delete. If the sheet is of DATA_SOURCE type, the associated DataSource is also deleted. */
  var sheetId: js.UndefOr[Double] = js.undefined
}
object DeleteSheetRequest {
  
  inline def apply(): DeleteSheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSheetRequest]
  }
  
  extension [Self <: DeleteSheetRequest](x: Self) {
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
