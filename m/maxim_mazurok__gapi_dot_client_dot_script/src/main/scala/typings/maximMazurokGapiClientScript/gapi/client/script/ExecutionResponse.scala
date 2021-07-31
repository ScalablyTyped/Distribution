package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionResponse extends StObject {
  
  /**
    * The return value of the script function. The type matches the object type returned in Apps Script. Functions called using the Apps Script API cannot return Apps Script-specific
    * objects (such as a `Document` or a `Calendar`); they can only return primitive types such as a `string`, `number`, `array`, `object`, or `boolean`.
    */
  var result: js.UndefOr[js.Any] = js.undefined
}
object ExecutionResponse {
  
  @scala.inline
  def apply(): ExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionResponse]
  }
  
  @scala.inline
  implicit class ExecutionResponseMutableBuilder[Self <: ExecutionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
