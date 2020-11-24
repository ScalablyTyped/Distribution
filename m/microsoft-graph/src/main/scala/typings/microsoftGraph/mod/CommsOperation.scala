package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommsOperation extends Entity {
  
  // Unique Client Context string. Max limit is 256 chars.
  var clientContext: js.UndefOr[NullableOption[String]] = js.native
  
  // The result information. Read-only.
  var resultInfo: js.UndefOr[NullableOption[ResultInfo]] = js.native
  
  // Possible values are: notStarted, running, completed, failed. Read-only.
  var status: js.UndefOr[OperationStatus] = js.native
}
object CommsOperation {
  
  @scala.inline
  def apply(): CommsOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommsOperation]
  }
  
  @scala.inline
  implicit class CommsOperationOps[Self <: CommsOperation] (val x: Self) extends AnyVal {
    
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
    def setClientContext(value: NullableOption[String]): Self = this.set("clientContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientContext: Self = this.set("clientContext", js.undefined)
    
    @scala.inline
    def setClientContextNull: Self = this.set("clientContext", null)
    
    @scala.inline
    def setResultInfo(value: NullableOption[ResultInfo]): Self = this.set("resultInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultInfo: Self = this.set("resultInfo", js.undefined)
    
    @scala.inline
    def setResultInfoNull: Self = this.set("resultInfo", null)
    
    @scala.inline
    def setStatus(value: OperationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
