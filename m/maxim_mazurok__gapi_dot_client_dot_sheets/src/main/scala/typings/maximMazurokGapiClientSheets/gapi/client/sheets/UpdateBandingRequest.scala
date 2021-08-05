package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBandingRequest extends StObject {
  
  /** The banded range to update with the new properties. */
  var bandedRange: js.UndefOr[BandedRange] = js.undefined
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `bandedRange` is implied and should not be specified. A single `"*"` can be used as short-hand for
    * listing every field.
    */
  var fields: js.UndefOr[String] = js.undefined
}
object UpdateBandingRequest {
  
  inline def apply(): UpdateBandingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBandingRequest]
  }
  
  extension [Self <: UpdateBandingRequest](x: Self) {
    
    inline def setBandedRange(value: BandedRange): Self = StObject.set(x, "bandedRange", value.asInstanceOf[js.Any])
    
    inline def setBandedRangeUndefined: Self = StObject.set(x, "bandedRange", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
