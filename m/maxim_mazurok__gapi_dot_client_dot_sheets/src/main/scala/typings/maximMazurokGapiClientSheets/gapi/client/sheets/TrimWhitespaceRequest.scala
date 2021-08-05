package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrimWhitespaceRequest extends StObject {
  
  /** The range whose cells to trim. */
  var range: js.UndefOr[GridRange] = js.undefined
}
object TrimWhitespaceRequest {
  
  inline def apply(): TrimWhitespaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrimWhitespaceRequest]
  }
  
  extension [Self <: TrimWhitespaceRequest](x: Self) {
    
    inline def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
