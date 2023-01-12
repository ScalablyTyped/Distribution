package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddBandingResponse extends StObject {
  
  /** The banded range that was added. */
  var bandedRange: js.UndefOr[BandedRange] = js.undefined
}
object AddBandingResponse {
  
  inline def apply(): AddBandingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddBandingResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddBandingResponse] (val x: Self) extends AnyVal {
    
    inline def setBandedRange(value: BandedRange): Self = StObject.set(x, "bandedRange", value.asInstanceOf[js.Any])
    
    inline def setBandedRangeUndefined: Self = StObject.set(x, "bandedRange", js.undefined)
  }
}
