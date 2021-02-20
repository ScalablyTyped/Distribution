package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddBandingRequest extends StObject {
  
  /** The banded range to add. The bandedRangeId field is optional; if one is not set, an id will be randomly generated. (It is an error to specify the ID of a range that already exists.) */
  var bandedRange: js.UndefOr[BandedRange] = js.native
}
object AddBandingRequest {
  
  @scala.inline
  def apply(): AddBandingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddBandingRequest]
  }
  
  @scala.inline
  implicit class AddBandingRequestMutableBuilder[Self <: AddBandingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandedRange(value: BandedRange): Self = StObject.set(x, "bandedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandedRangeUndefined: Self = StObject.set(x, "bandedRange", js.undefined)
  }
}
