package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolExecutionStep extends StObject {
  
  /** A Tool execution. - In response: present if set by create/update request - In create/update request: optional */
  var toolExecution: js.UndefOr[ToolExecution] = js.native
}
object ToolExecutionStep {
  
  @scala.inline
  def apply(): ToolExecutionStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolExecutionStep]
  }
  
  @scala.inline
  implicit class ToolExecutionStepMutableBuilder[Self <: ToolExecutionStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToolExecution(value: ToolExecution): Self = StObject.set(x, "toolExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolExecutionUndefined: Self = StObject.set(x, "toolExecution", js.undefined)
  }
}
