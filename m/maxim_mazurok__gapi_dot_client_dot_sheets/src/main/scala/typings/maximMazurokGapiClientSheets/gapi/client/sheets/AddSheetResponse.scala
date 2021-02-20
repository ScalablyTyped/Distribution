package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSheetResponse extends StObject {
  
  /** The properties of the newly added sheet. */
  var properties: js.UndefOr[SheetProperties] = js.native
}
object AddSheetResponse {
  
  @scala.inline
  def apply(): AddSheetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSheetResponse]
  }
  
  @scala.inline
  implicit class AddSheetResponseMutableBuilder[Self <: AddSheetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: SheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
