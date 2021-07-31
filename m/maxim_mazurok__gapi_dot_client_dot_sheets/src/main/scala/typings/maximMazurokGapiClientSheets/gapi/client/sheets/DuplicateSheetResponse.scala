package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DuplicateSheetResponse extends StObject {
  
  /** The properties of the duplicate sheet. */
  var properties: js.UndefOr[SheetProperties] = js.undefined
}
object DuplicateSheetResponse {
  
  @scala.inline
  def apply(): DuplicateSheetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateSheetResponse]
  }
  
  @scala.inline
  implicit class DuplicateSheetResponseMutableBuilder[Self <: DuplicateSheetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: SheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
