package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RandomizeRangeRequest extends StObject {
  
  /** The range to randomize. */
  var range: js.UndefOr[GridRange] = js.undefined
}
object RandomizeRangeRequest {
  
  inline def apply(): RandomizeRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomizeRangeRequest]
  }
  
  extension [Self <: RandomizeRangeRequest](x: Self) {
    
    inline def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
