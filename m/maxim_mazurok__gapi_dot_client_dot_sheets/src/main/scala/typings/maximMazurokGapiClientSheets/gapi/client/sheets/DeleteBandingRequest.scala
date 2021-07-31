package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBandingRequest extends StObject {
  
  /** The ID of the banded range to delete. */
  var bandedRangeId: js.UndefOr[Double] = js.undefined
}
object DeleteBandingRequest {
  
  @scala.inline
  def apply(): DeleteBandingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBandingRequest]
  }
  
  @scala.inline
  implicit class DeleteBandingRequestMutableBuilder[Self <: DeleteBandingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandedRangeId(value: Double): Self = StObject.set(x, "bandedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandedRangeIdUndefined: Self = StObject.set(x, "bandedRangeId", js.undefined)
  }
}
