package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionResponse extends StObject {
  
  /**
    * The return value of the script function. The type matches the object type returned in Apps Script. Functions called using the Apps Script API cannot return Apps Script-specific
    * objects (such as a `Document` or a `Calendar`); they can only return primitive types such as a `string`, `number`, `array`, `object`, or `boolean`.
    */
  var result: js.UndefOr[Any] = js.undefined
}
object ExecutionResponse {
  
  inline def apply(): ExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionResponse]
  }
  
  extension [Self <: ExecutionResponse](x: Self) {
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
