package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddProtectedRangeResponse extends StObject {
  
  /** The newly added protected range. */
  var protectedRange: js.UndefOr[ProtectedRange] = js.undefined
}
object AddProtectedRangeResponse {
  
  @scala.inline
  def apply(): AddProtectedRangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddProtectedRangeResponse]
  }
  
  @scala.inline
  implicit class AddProtectedRangeResponseMutableBuilder[Self <: AddProtectedRangeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtectedRange(value: ProtectedRange): Self = StObject.set(x, "protectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedRangeUndefined: Self = StObject.set(x, "protectedRange", js.undefined)
  }
}
