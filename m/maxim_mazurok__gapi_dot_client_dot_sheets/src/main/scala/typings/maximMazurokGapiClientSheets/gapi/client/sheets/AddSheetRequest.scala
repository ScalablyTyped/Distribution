package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSheetRequest extends StObject {
  
  /**
    * The properties the new sheet should have. All properties are optional. The sheetId field is optional; if one is not set, an id will be randomly generated. (It is an error to specify
    * the ID of a sheet that already exists.)
    */
  var properties: js.UndefOr[SheetProperties] = js.native
}
object AddSheetRequest {
  
  @scala.inline
  def apply(): AddSheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSheetRequest]
  }
  
  @scala.inline
  implicit class AddSheetRequestMutableBuilder[Self <: AddSheetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: SheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
