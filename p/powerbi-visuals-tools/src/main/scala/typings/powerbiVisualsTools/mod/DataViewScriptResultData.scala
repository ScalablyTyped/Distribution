package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewScriptResultData extends StObject {
  
  var payloadBase64: String
}
object DataViewScriptResultData {
  
  inline def apply(payloadBase64: String): DataViewScriptResultData = {
    val __obj = js.Dynamic.literal(payloadBase64 = payloadBase64.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewScriptResultData]
  }
  
  extension [Self <: DataViewScriptResultData](x: Self) {
    
    inline def setPayloadBase64(value: String): Self = StObject.set(x, "payloadBase64", value.asInstanceOf[js.Any])
  }
}
