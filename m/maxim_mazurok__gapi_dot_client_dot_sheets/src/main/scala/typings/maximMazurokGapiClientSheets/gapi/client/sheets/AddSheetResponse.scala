package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddSheetResponse extends StObject {
  
  /** The properties of the newly added sheet. */
  var properties: js.UndefOr[SheetProperties] = js.undefined
}
object AddSheetResponse {
  
  inline def apply(): AddSheetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSheetResponse]
  }
  
  extension [Self <: AddSheetResponse](x: Self) {
    
    inline def setProperties(value: SheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
