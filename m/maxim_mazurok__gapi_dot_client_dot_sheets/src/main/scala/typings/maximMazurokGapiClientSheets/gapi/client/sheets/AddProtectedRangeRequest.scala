package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddProtectedRangeRequest extends StObject {
  
  /**
    * The protected range to be added. The protectedRangeId field is optional; if one is not set, an id will be randomly generated. (It is an error to specify the ID of a range that
    * already exists.)
    */
  var protectedRange: js.UndefOr[ProtectedRange] = js.undefined
}
object AddProtectedRangeRequest {
  
  @scala.inline
  def apply(): AddProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddProtectedRangeRequest]
  }
  
  @scala.inline
  implicit class AddProtectedRangeRequestMutableBuilder[Self <: AddProtectedRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtectedRange(value: ProtectedRange): Self = StObject.set(x, "protectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedRangeUndefined: Self = StObject.set(x, "protectedRange", js.undefined)
  }
}
