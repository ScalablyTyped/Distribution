package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchClearValuesRequest extends StObject {
  
  /** The ranges to clear, in [A1 notation or R1C1 notation](/sheets/api/guides/concepts#cell). */
  var ranges: js.UndefOr[js.Array[String]] = js.undefined
}
object BatchClearValuesRequest {
  
  inline def apply(): BatchClearValuesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchClearValuesRequest]
  }
  
  extension [Self <: BatchClearValuesRequest](x: Self) {
    
    inline def setRanges(value: js.Array[String]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: String*): Self = StObject.set(x, "ranges", js.Array(value*))
  }
}
