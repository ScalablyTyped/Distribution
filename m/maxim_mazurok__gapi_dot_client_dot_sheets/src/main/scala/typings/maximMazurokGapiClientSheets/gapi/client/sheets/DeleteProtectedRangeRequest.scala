package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProtectedRangeRequest extends StObject {
  
  /** The ID of the protected range to delete. */
  var protectedRangeId: js.UndefOr[Double] = js.undefined
}
object DeleteProtectedRangeRequest {
  
  @scala.inline
  def apply(): DeleteProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProtectedRangeRequest]
  }
  
  @scala.inline
  implicit class DeleteProtectedRangeRequestMutableBuilder[Self <: DeleteProtectedRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtectedRangeId(value: Double): Self = StObject.set(x, "protectedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedRangeIdUndefined: Self = StObject.set(x, "protectedRangeId", js.undefined)
  }
}
