package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteStreamResponse extends StObject {
  
  /** The result of the execution. */
  var result: js.UndefOr[ScriptExecutionResult] = js.native
}
object ExecuteStreamResponse {
  
  @scala.inline
  def apply(): ExecuteStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteStreamResponse]
  }
  
  @scala.inline
  implicit class ExecuteStreamResponseMutableBuilder[Self <: ExecuteStreamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: ScriptExecutionResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
