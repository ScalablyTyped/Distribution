package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopySheetToAnotherSpreadsheetRequest extends StObject {
  
  /** The ID of the spreadsheet to copy the sheet to. */
  var destinationSpreadsheetId: js.UndefOr[String] = js.undefined
}
object CopySheetToAnotherSpreadsheetRequest {
  
  @scala.inline
  def apply(): CopySheetToAnotherSpreadsheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopySheetToAnotherSpreadsheetRequest]
  }
  
  @scala.inline
  implicit class CopySheetToAnotherSpreadsheetRequestMutableBuilder[Self <: CopySheetToAnotherSpreadsheetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationSpreadsheetId(value: String): Self = StObject.set(x, "destinationSpreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationSpreadsheetIdUndefined: Self = StObject.set(x, "destinationSpreadsheetId", js.undefined)
  }
}
