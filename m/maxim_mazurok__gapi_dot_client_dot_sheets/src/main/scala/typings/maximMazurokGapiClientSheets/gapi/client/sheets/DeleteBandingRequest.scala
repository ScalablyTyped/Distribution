package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBandingRequest extends StObject {
  
  /** The ID of the banded range to delete. */
  var bandedRangeId: js.UndefOr[Double] = js.undefined
}
object DeleteBandingRequest {
  
  inline def apply(): DeleteBandingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBandingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBandingRequest] (val x: Self) extends AnyVal {
    
    inline def setBandedRangeId(value: Double): Self = StObject.set(x, "bandedRangeId", value.asInstanceOf[js.Any])
    
    inline def setBandedRangeIdUndefined: Self = StObject.set(x, "bandedRangeId", js.undefined)
  }
}
