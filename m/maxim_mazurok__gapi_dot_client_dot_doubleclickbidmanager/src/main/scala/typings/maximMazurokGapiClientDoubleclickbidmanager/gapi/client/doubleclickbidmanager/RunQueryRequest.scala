package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunQueryRequest extends StObject {
  
  /** Report data range used to generate the report. If unspecified, the original parent query's data range is used. */
  var dataRange: js.UndefOr[DataRange] = js.undefined
}
object RunQueryRequest {
  
  inline def apply(): RunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunQueryRequest]
  }
  
  extension [Self <: RunQueryRequest](x: Self) {
    
    inline def setDataRange(value: DataRange): Self = StObject.set(x, "dataRange", value.asInstanceOf[js.Any])
    
    inline def setDataRangeUndefined: Self = StObject.set(x, "dataRange", js.undefined)
  }
}
