package typings.maximMazurokGapiClientScript.gapi.client.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptExecutionResult extends js.Object {
  
  /** The returned value of the execution. */
  var returnValue: js.UndefOr[Value] = js.native
}
object ScriptExecutionResult {
  
  @scala.inline
  def apply(): ScriptExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptExecutionResult]
  }
  
  @scala.inline
  implicit class ScriptExecutionResultOps[Self <: ScriptExecutionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReturnValue(value: Value): Self = this.set("returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnValue: Self = this.set("returnValue", js.undefined)
  }
}
