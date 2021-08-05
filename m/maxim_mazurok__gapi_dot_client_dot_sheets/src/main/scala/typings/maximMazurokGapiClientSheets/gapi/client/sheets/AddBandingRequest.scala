package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddBandingRequest extends StObject {
  
  /** The banded range to add. The bandedRangeId field is optional; if one is not set, an id will be randomly generated. (It is an error to specify the ID of a range that already exists.) */
  var bandedRange: js.UndefOr[BandedRange] = js.undefined
}
object AddBandingRequest {
  
  inline def apply(): AddBandingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddBandingRequest]
  }
  
  extension [Self <: AddBandingRequest](x: Self) {
    
    inline def setBandedRange(value: BandedRange): Self = StObject.set(x, "bandedRange", value.asInstanceOf[js.Any])
    
    inline def setBandedRangeUndefined: Self = StObject.set(x, "bandedRange", js.undefined)
  }
}
